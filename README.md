# 1 Overview 
 
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

AdID，CampaignID, Keywords, thumbnail, Description, Brand, detail_url, Category, Title

     
# 3 Search Engine

Developed Search Ads workflow which support: Query understanding, Ads selection from inverted index, Ads ranking, Ads filter, Ads pricing, Ads allocation (Java, Jetty, MySQL, MemCached)

