# 1 Overview 
 
● Designed and developed web crawler which crawled thousands product data from Amazon (Java, JSoup, Proxy)

● Developed Search Ads workflow which support: Query understanding, Ads selection from inverted index, Ads ranking, Ads filter, Ads pricing(Java, Jetty, MySQL, MemCached)

● Predict click probability with features generated from simulated search log (Python, SparkMLlib)

● Implemented Query rewrite with word2vector algorithm (Python, SparkMLlib)

# 2 Web Crawler
In the begining of the project, we designed and developed an Asynchronous web crawler which crawled thousands product data from Amazon (Java, JSoup, Proxy)
![Image text](https://github.com/PeterPei666/SearchAds/blob/2117a90aac73e98f4ed8220bd8661d2f2c58c556/img/Web%20Crawler.png)

### 2.1Two ways to avoid anti-crawler:

(1) Sproof Headers: Keeps on rotating http headers such as User Agent/ Accept/ Accept-Encoding
(2 )Use around 20 Proxies: Keeps on using different proxies between different queries.

### 2.2 Parse the crawled HTML pages(Jsoup):

Jsoup is the tool we use to do the web crawling. JSoup is a Java library for working with real-world HTML. It provides a very convenient API for extracting and manipulating data, using the best of DOM, CSS, and jquery-like methods

We mainly use two kinds of ways to parse the HTML pages: **DOM** and **Selector**.


### 2.3 Message Queue for asynchronous communications protocol(RabbitMQ):

In this project, we use Rabbit Queue to implement asynchronous communication.The feeder send feeds into message queue and the crawler consume feeds from queue to execute the actual crawling.

### 2.4 Simple Language Processing to retrieve keywords(Lucene):

we use Lucene lib to do the tokenization of the product info.

### 2.5 store the crwaled information in Json File

More than 10,000 Ad data.

AdID，CampaignID, Keywords, thumbnail, Description, Brand, detail_url, Category, Title

     
# 3 Search Engine

Developed Search Ads workflow which support: Query understanding, Ads selection from inverted index, Ads ranking, Ads filter, Ads pricing.(Java, Jetty, MySQL, MemCached)
![Image text](https://github.com/PeterPei666/SearchAds/blob/master/img/Ads_Engine.png)

### 3.1 Web Engine - Jetty

### 3.2 Database

1. Forward Index database: MySQL:
```sql
CREATE TABLE `ad` (
  `adId` int(11) NOT NULL,
  `campaignId` int(11) DEFAULT NULL,
  `keyWords` varchar(1024) DEFAULT NULL,
  `bidPrice` double DEFAULT NULL,
  `price` double DEFAULT NULL,
  `thumbnail` mediumtext,
  `description` mediumtext,
  `brand` varchar(100) DEFAULT NULL,
  `detail_url` mediumtext,
  `category` varchar(1024) DEFAULT NULL,
  `title` varchar(2048) DEFAULT NULL,
  PRIMARY KEY (`adId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

```

2. inverted Index database - Memcached

key - keywords of ads

value: HashMap<Long, SortedSet<Integer>> (key : id of ads, value : the position of query in the keywords)
 
### 3.3 Distributed System - gRPC
We can set up multiple index servers and multiple memcached to simulate distributed system.
```
 java -jar AdsIndexServer.jar 50051 127.0.0.1 11212 11220  11221 127.0.0.1:3306 searchads root password 11218
```
![Image text](https://github.com/PeterPei666/SearchAds/blob/master/img/gRPC.png)
 
### 3.4 Query Understanding

find the current query's synonmy to rewrite the input query

(1)How to find synonmy:  train a word2vec model in Spark
![Image text](https://github.com/PeterPei666/SearchAds/blob/master/img/word2vec.png)

`generate Taining data`: 

extract title, query, category from web crwaled log, then use a library call nltk to clean the data.
The input data is like: query title query, category title category. Then use those data to train a word2vec model to find all the synomies for each word.

(2)Offline rewrite :  1. generate rewrite for historical query and store in memcached 2.lookup in key value store for each query in Ads Server

Online rewrite: generate rewrite for query in Ads Server

### 3.5 Ad ranking and pricing

**Rank score** = quality Score * bid

**Quality Score** = d * pClick+ (1 - d) * relevance Score, 0< d < 1

**relevance Score** = TF-IDF Score = IDF score * TF score * fieldNorms = log(numDocs / (docFreq + 1)) * sqrt(tf) * (1/sqrt(length))

How to find probility of click(pClick)?: logisticRegression

(1)generate training data from click log:

generate fake click log by reverse engineering

Feature Matrix

| Feature Key       | Feature Value    |
| ------------- |:-------------:|
| User IP     | Click count, impression|
| User DeviceId    | Click count, impression    | 
| Ad Id  | Click count, impression    | 
| QueryClassification_+_AdClassification | Click count, impression     |
| Query_+_CampaignId| Click count, impression      |
| Query_+_AdId | Click count, impression      |
| Percentage of matched terms in Ads | Click count, impression      |

(2)Ad Pricing:

**Cost per click (CPC)**
= (next quality score/current quality score) * next bid price + 0.01 = next rank score / current quality score + 0.01






