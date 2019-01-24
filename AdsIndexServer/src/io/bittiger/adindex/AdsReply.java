// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SelectAds.proto

package io.bittiger.adindex;

/**
 * <pre>
 * The response message containing the greetings
 * </pre>
 *
 * Protobuf type {@code adindex.AdsReply}
 */
public  final class AdsReply extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:adindex.AdsReply)
    AdsReplyOrBuilder {
  // Use AdsReply.newBuilder() to construct.
  private AdsReply(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AdsReply() {
    ad_ = java.util.Collections.emptyList();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private AdsReply(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              ad_ = new java.util.ArrayList<Ad>();
              mutable_bitField0_ |= 0x00000001;
            }
            ad_.add(
                input.readMessage(Ad.parser(), extensionRegistry));
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        ad_ = java.util.Collections.unmodifiableList(ad_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.bittiger.adindex.SearchAds.internal_static_adindex_AdsReply_descriptor;
  }

  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.bittiger.adindex.SearchAds.internal_static_adindex_AdsReply_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            AdsReply.class, Builder.class);
  }

  public static final int AD_FIELD_NUMBER = 1;
  private java.util.List<Ad> ad_;
  /**
   * <code>repeated .adindex.Ad ad = 1;</code>
   */
  public java.util.List<Ad> getAdList() {
    return ad_;
  }
  /**
   * <code>repeated .adindex.Ad ad = 1;</code>
   */
  public java.util.List<? extends AdOrBuilder>
      getAdOrBuilderList() {
    return ad_;
  }
  /**
   * <code>repeated .adindex.Ad ad = 1;</code>
   */
  public int getAdCount() {
    return ad_.size();
  }
  /**
   * <code>repeated .adindex.Ad ad = 1;</code>
   */
  public Ad getAd(int index) {
    return ad_.get(index);
  }
  /**
   * <code>repeated .adindex.Ad ad = 1;</code>
   */
  public AdOrBuilder getAdOrBuilder(
      int index) {
    return ad_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < ad_.size(); i++) {
      output.writeMessage(1, ad_.get(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < ad_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, ad_.get(i));
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof AdsReply)) {
      return super.equals(obj);
    }
    AdsReply other = (AdsReply) obj;

    boolean result = true;
    result = result && getAdList()
        .equals(other.getAdList());
    return result;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getAdCount() > 0) {
      hash = (37 * hash) + AD_FIELD_NUMBER;
      hash = (53 * hash) + getAdList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static AdsReply parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static AdsReply parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static AdsReply parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static AdsReply parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static AdsReply parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static AdsReply parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static AdsReply parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static AdsReply parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static AdsReply parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static AdsReply parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static AdsReply parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static AdsReply parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(AdsReply prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * The response message containing the greetings
   * </pre>
   *
   * Protobuf type {@code adindex.AdsReply}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:adindex.AdsReply)
      io.bittiger.adindex.AdsReplyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.bittiger.adindex.SearchAds.internal_static_adindex_AdsReply_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.bittiger.adindex.SearchAds.internal_static_adindex_AdsReply_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              AdsReply.class, Builder.class);
    }

    // Construct using io.bittiger.adindex.AdsReply.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getAdFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (adBuilder_ == null) {
        ad_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        adBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.bittiger.adindex.SearchAds.internal_static_adindex_AdsReply_descriptor;
    }

    public AdsReply getDefaultInstanceForType() {
      return AdsReply.getDefaultInstance();
    }

    public AdsReply build() {
      AdsReply result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public AdsReply buildPartial() {
      AdsReply result = new AdsReply(this);
      int from_bitField0_ = bitField0_;
      if (adBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          ad_ = java.util.Collections.unmodifiableList(ad_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.ad_ = ad_;
      } else {
        result.ad_ = adBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof AdsReply) {
        return mergeFrom((AdsReply)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(AdsReply other) {
      if (other == AdsReply.getDefaultInstance()) return this;
      if (adBuilder_ == null) {
        if (!other.ad_.isEmpty()) {
          if (ad_.isEmpty()) {
            ad_ = other.ad_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAdIsMutable();
            ad_.addAll(other.ad_);
          }
          onChanged();
        }
      } else {
        if (!other.ad_.isEmpty()) {
          if (adBuilder_.isEmpty()) {
            adBuilder_.dispose();
            adBuilder_ = null;
            ad_ = other.ad_;
            bitField0_ = (bitField0_ & ~0x00000001);
            adBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getAdFieldBuilder() : null;
          } else {
            adBuilder_.addAllMessages(other.ad_);
          }
        }
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      AdsReply parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (AdsReply) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<Ad> ad_ =
      java.util.Collections.emptyList();
    private void ensureAdIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        ad_ = new java.util.ArrayList<Ad>(ad_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        Ad, Ad.Builder, AdOrBuilder> adBuilder_;

    /**
     * <code>repeated .adindex.Ad ad = 1;</code>
     */
    public java.util.List<Ad> getAdList() {
      if (adBuilder_ == null) {
        return java.util.Collections.unmodifiableList(ad_);
      } else {
        return adBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .adindex.Ad ad = 1;</code>
     */
    public int getAdCount() {
      if (adBuilder_ == null) {
        return ad_.size();
      } else {
        return adBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .adindex.Ad ad = 1;</code>
     */
    public Ad getAd(int index) {
      if (adBuilder_ == null) {
        return ad_.get(index);
      } else {
        return adBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .adindex.Ad ad = 1;</code>
     */
    public Builder setAd(
        int index, Ad value) {
      if (adBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAdIsMutable();
        ad_.set(index, value);
        onChanged();
      } else {
        adBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .adindex.Ad ad = 1;</code>
     */
    public Builder setAd(
        int index, Ad.Builder builderForValue) {
      if (adBuilder_ == null) {
        ensureAdIsMutable();
        ad_.set(index, builderForValue.build());
        onChanged();
      } else {
        adBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .adindex.Ad ad = 1;</code>
     */
    public Builder addAd(Ad value) {
      if (adBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAdIsMutable();
        ad_.add(value);
        onChanged();
      } else {
        adBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .adindex.Ad ad = 1;</code>
     */
    public Builder addAd(
        int index, Ad value) {
      if (adBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAdIsMutable();
        ad_.add(index, value);
        onChanged();
      } else {
        adBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .adindex.Ad ad = 1;</code>
     */
    public Builder addAd(
        Ad.Builder builderForValue) {
      if (adBuilder_ == null) {
        ensureAdIsMutable();
        ad_.add(builderForValue.build());
        onChanged();
      } else {
        adBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .adindex.Ad ad = 1;</code>
     */
    public Builder addAd(
        int index, Ad.Builder builderForValue) {
      if (adBuilder_ == null) {
        ensureAdIsMutable();
        ad_.add(index, builderForValue.build());
        onChanged();
      } else {
        adBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .adindex.Ad ad = 1;</code>
     */
    public Builder addAllAd(
        Iterable<? extends Ad> values) {
      if (adBuilder_ == null) {
        ensureAdIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, ad_);
        onChanged();
      } else {
        adBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .adindex.Ad ad = 1;</code>
     */
    public Builder clearAd() {
      if (adBuilder_ == null) {
        ad_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        adBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .adindex.Ad ad = 1;</code>
     */
    public Builder removeAd(int index) {
      if (adBuilder_ == null) {
        ensureAdIsMutable();
        ad_.remove(index);
        onChanged();
      } else {
        adBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .adindex.Ad ad = 1;</code>
     */
    public Ad.Builder getAdBuilder(
        int index) {
      return getAdFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .adindex.Ad ad = 1;</code>
     */
    public AdOrBuilder getAdOrBuilder(
        int index) {
      if (adBuilder_ == null) {
        return ad_.get(index);  } else {
        return adBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .adindex.Ad ad = 1;</code>
     */
    public java.util.List<? extends AdOrBuilder>
         getAdOrBuilderList() {
      if (adBuilder_ != null) {
        return adBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(ad_);
      }
    }
    /**
     * <code>repeated .adindex.Ad ad = 1;</code>
     */
    public Ad.Builder addAdBuilder() {
      return getAdFieldBuilder().addBuilder(
          Ad.getDefaultInstance());
    }
    /**
     * <code>repeated .adindex.Ad ad = 1;</code>
     */
    public Ad.Builder addAdBuilder(
        int index) {
      return getAdFieldBuilder().addBuilder(
          index, Ad.getDefaultInstance());
    }
    /**
     * <code>repeated .adindex.Ad ad = 1;</code>
     */
    public java.util.List<Ad.Builder>
         getAdBuilderList() {
      return getAdFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        Ad, Ad.Builder, AdOrBuilder>
        getAdFieldBuilder() {
      if (adBuilder_ == null) {
        adBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            Ad, Ad.Builder, AdOrBuilder>(
                ad_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        ad_ = null;
      }
      return adBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:adindex.AdsReply)
  }

  // @@protoc_insertion_point(class_scope:adindex.AdsReply)
  private static final AdsReply DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new AdsReply();
  }

  public static AdsReply getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AdsReply>
      PARSER = new com.google.protobuf.AbstractParser<AdsReply>() {
    public AdsReply parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new AdsReply(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AdsReply> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<AdsReply> getParserForType() {
    return PARSER;
  }

  public AdsReply getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

