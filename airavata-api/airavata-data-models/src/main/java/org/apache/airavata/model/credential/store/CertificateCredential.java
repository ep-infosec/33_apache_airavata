/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.airavata.model.credential.store;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)")
public class CertificateCredential implements org.apache.thrift.TBase<CertificateCredential, CertificateCredential._Fields>, java.io.Serializable, Cloneable, Comparable<CertificateCredential> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("CertificateCredential");

  private static final org.apache.thrift.protocol.TField COMMUNITY_USER_FIELD_DESC = new org.apache.thrift.protocol.TField("communityUser", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField X509_CERT_FIELD_DESC = new org.apache.thrift.protocol.TField("x509Cert", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField NOT_AFTER_FIELD_DESC = new org.apache.thrift.protocol.TField("notAfter", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField PRIVATE_KEY_FIELD_DESC = new org.apache.thrift.protocol.TField("privateKey", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField LIFE_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("lifeTime", org.apache.thrift.protocol.TType.I64, (short)5);
  private static final org.apache.thrift.protocol.TField NOT_BEFORE_FIELD_DESC = new org.apache.thrift.protocol.TField("notBefore", org.apache.thrift.protocol.TType.STRING, (short)6);
  private static final org.apache.thrift.protocol.TField PERSISTED_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("persistedTime", org.apache.thrift.protocol.TType.I64, (short)7);
  private static final org.apache.thrift.protocol.TField TOKEN_FIELD_DESC = new org.apache.thrift.protocol.TField("token", org.apache.thrift.protocol.TType.STRING, (short)8);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new CertificateCredentialStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new CertificateCredentialTupleSchemeFactory();

  private CommunityUser communityUser; // required
  private java.lang.String x509Cert; // required
  private java.lang.String notAfter; // optional
  private java.lang.String privateKey; // optional
  private long lifeTime; // optional
  private java.lang.String notBefore; // optional
  private long persistedTime; // optional
  private java.lang.String token; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    COMMUNITY_USER((short)1, "communityUser"),
    X509_CERT((short)2, "x509Cert"),
    NOT_AFTER((short)3, "notAfter"),
    PRIVATE_KEY((short)4, "privateKey"),
    LIFE_TIME((short)5, "lifeTime"),
    NOT_BEFORE((short)6, "notBefore"),
    PERSISTED_TIME((short)7, "persistedTime"),
    TOKEN((short)8, "token");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // COMMUNITY_USER
          return COMMUNITY_USER;
        case 2: // X509_CERT
          return X509_CERT;
        case 3: // NOT_AFTER
          return NOT_AFTER;
        case 4: // PRIVATE_KEY
          return PRIVATE_KEY;
        case 5: // LIFE_TIME
          return LIFE_TIME;
        case 6: // NOT_BEFORE
          return NOT_BEFORE;
        case 7: // PERSISTED_TIME
          return PERSISTED_TIME;
        case 8: // TOKEN
          return TOKEN;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __LIFETIME_ISSET_ID = 0;
  private static final int __PERSISTEDTIME_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.NOT_AFTER,_Fields.PRIVATE_KEY,_Fields.LIFE_TIME,_Fields.NOT_BEFORE,_Fields.PERSISTED_TIME,_Fields.TOKEN};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.COMMUNITY_USER, new org.apache.thrift.meta_data.FieldMetaData("communityUser", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, CommunityUser.class)));
    tmpMap.put(_Fields.X509_CERT, new org.apache.thrift.meta_data.FieldMetaData("x509Cert", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.NOT_AFTER, new org.apache.thrift.meta_data.FieldMetaData("notAfter", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PRIVATE_KEY, new org.apache.thrift.meta_data.FieldMetaData("privateKey", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.LIFE_TIME, new org.apache.thrift.meta_data.FieldMetaData("lifeTime", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.NOT_BEFORE, new org.apache.thrift.meta_data.FieldMetaData("notBefore", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PERSISTED_TIME, new org.apache.thrift.meta_data.FieldMetaData("persistedTime", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.TOKEN, new org.apache.thrift.meta_data.FieldMetaData("token", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(CertificateCredential.class, metaDataMap);
  }

  public CertificateCredential() {
  }

  public CertificateCredential(
    CommunityUser communityUser,
    java.lang.String x509Cert)
  {
    this();
    this.communityUser = communityUser;
    this.x509Cert = x509Cert;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CertificateCredential(CertificateCredential other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetCommunityUser()) {
      this.communityUser = new CommunityUser(other.communityUser);
    }
    if (other.isSetX509Cert()) {
      this.x509Cert = other.x509Cert;
    }
    if (other.isSetNotAfter()) {
      this.notAfter = other.notAfter;
    }
    if (other.isSetPrivateKey()) {
      this.privateKey = other.privateKey;
    }
    this.lifeTime = other.lifeTime;
    if (other.isSetNotBefore()) {
      this.notBefore = other.notBefore;
    }
    this.persistedTime = other.persistedTime;
    if (other.isSetToken()) {
      this.token = other.token;
    }
  }

  public CertificateCredential deepCopy() {
    return new CertificateCredential(this);
  }

  @Override
  public void clear() {
    this.communityUser = null;
    this.x509Cert = null;
    this.notAfter = null;
    this.privateKey = null;
    setLifeTimeIsSet(false);
    this.lifeTime = 0;
    this.notBefore = null;
    setPersistedTimeIsSet(false);
    this.persistedTime = 0;
    this.token = null;
  }

  public CommunityUser getCommunityUser() {
    return this.communityUser;
  }

  public void setCommunityUser(CommunityUser communityUser) {
    this.communityUser = communityUser;
  }

  public void unsetCommunityUser() {
    this.communityUser = null;
  }

  /** Returns true if field communityUser is set (has been assigned a value) and false otherwise */
  public boolean isSetCommunityUser() {
    return this.communityUser != null;
  }

  public void setCommunityUserIsSet(boolean value) {
    if (!value) {
      this.communityUser = null;
    }
  }

  public java.lang.String getX509Cert() {
    return this.x509Cert;
  }

  public void setX509Cert(java.lang.String x509Cert) {
    this.x509Cert = x509Cert;
  }

  public void unsetX509Cert() {
    this.x509Cert = null;
  }

  /** Returns true if field x509Cert is set (has been assigned a value) and false otherwise */
  public boolean isSetX509Cert() {
    return this.x509Cert != null;
  }

  public void setX509CertIsSet(boolean value) {
    if (!value) {
      this.x509Cert = null;
    }
  }

  public java.lang.String getNotAfter() {
    return this.notAfter;
  }

  public void setNotAfter(java.lang.String notAfter) {
    this.notAfter = notAfter;
  }

  public void unsetNotAfter() {
    this.notAfter = null;
  }

  /** Returns true if field notAfter is set (has been assigned a value) and false otherwise */
  public boolean isSetNotAfter() {
    return this.notAfter != null;
  }

  public void setNotAfterIsSet(boolean value) {
    if (!value) {
      this.notAfter = null;
    }
  }

  public java.lang.String getPrivateKey() {
    return this.privateKey;
  }

  public void setPrivateKey(java.lang.String privateKey) {
    this.privateKey = privateKey;
  }

  public void unsetPrivateKey() {
    this.privateKey = null;
  }

  /** Returns true if field privateKey is set (has been assigned a value) and false otherwise */
  public boolean isSetPrivateKey() {
    return this.privateKey != null;
  }

  public void setPrivateKeyIsSet(boolean value) {
    if (!value) {
      this.privateKey = null;
    }
  }

  public long getLifeTime() {
    return this.lifeTime;
  }

  public void setLifeTime(long lifeTime) {
    this.lifeTime = lifeTime;
    setLifeTimeIsSet(true);
  }

  public void unsetLifeTime() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __LIFETIME_ISSET_ID);
  }

  /** Returns true if field lifeTime is set (has been assigned a value) and false otherwise */
  public boolean isSetLifeTime() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __LIFETIME_ISSET_ID);
  }

  public void setLifeTimeIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __LIFETIME_ISSET_ID, value);
  }

  public java.lang.String getNotBefore() {
    return this.notBefore;
  }

  public void setNotBefore(java.lang.String notBefore) {
    this.notBefore = notBefore;
  }

  public void unsetNotBefore() {
    this.notBefore = null;
  }

  /** Returns true if field notBefore is set (has been assigned a value) and false otherwise */
  public boolean isSetNotBefore() {
    return this.notBefore != null;
  }

  public void setNotBeforeIsSet(boolean value) {
    if (!value) {
      this.notBefore = null;
    }
  }

  public long getPersistedTime() {
    return this.persistedTime;
  }

  public void setPersistedTime(long persistedTime) {
    this.persistedTime = persistedTime;
    setPersistedTimeIsSet(true);
  }

  public void unsetPersistedTime() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __PERSISTEDTIME_ISSET_ID);
  }

  /** Returns true if field persistedTime is set (has been assigned a value) and false otherwise */
  public boolean isSetPersistedTime() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __PERSISTEDTIME_ISSET_ID);
  }

  public void setPersistedTimeIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __PERSISTEDTIME_ISSET_ID, value);
  }

  public java.lang.String getToken() {
    return this.token;
  }

  public void setToken(java.lang.String token) {
    this.token = token;
  }

  public void unsetToken() {
    this.token = null;
  }

  /** Returns true if field token is set (has been assigned a value) and false otherwise */
  public boolean isSetToken() {
    return this.token != null;
  }

  public void setTokenIsSet(boolean value) {
    if (!value) {
      this.token = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case COMMUNITY_USER:
      if (value == null) {
        unsetCommunityUser();
      } else {
        setCommunityUser((CommunityUser)value);
      }
      break;

    case X509_CERT:
      if (value == null) {
        unsetX509Cert();
      } else {
        setX509Cert((java.lang.String)value);
      }
      break;

    case NOT_AFTER:
      if (value == null) {
        unsetNotAfter();
      } else {
        setNotAfter((java.lang.String)value);
      }
      break;

    case PRIVATE_KEY:
      if (value == null) {
        unsetPrivateKey();
      } else {
        setPrivateKey((java.lang.String)value);
      }
      break;

    case LIFE_TIME:
      if (value == null) {
        unsetLifeTime();
      } else {
        setLifeTime((java.lang.Long)value);
      }
      break;

    case NOT_BEFORE:
      if (value == null) {
        unsetNotBefore();
      } else {
        setNotBefore((java.lang.String)value);
      }
      break;

    case PERSISTED_TIME:
      if (value == null) {
        unsetPersistedTime();
      } else {
        setPersistedTime((java.lang.Long)value);
      }
      break;

    case TOKEN:
      if (value == null) {
        unsetToken();
      } else {
        setToken((java.lang.String)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case COMMUNITY_USER:
      return getCommunityUser();

    case X509_CERT:
      return getX509Cert();

    case NOT_AFTER:
      return getNotAfter();

    case PRIVATE_KEY:
      return getPrivateKey();

    case LIFE_TIME:
      return getLifeTime();

    case NOT_BEFORE:
      return getNotBefore();

    case PERSISTED_TIME:
      return getPersistedTime();

    case TOKEN:
      return getToken();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case COMMUNITY_USER:
      return isSetCommunityUser();
    case X509_CERT:
      return isSetX509Cert();
    case NOT_AFTER:
      return isSetNotAfter();
    case PRIVATE_KEY:
      return isSetPrivateKey();
    case LIFE_TIME:
      return isSetLifeTime();
    case NOT_BEFORE:
      return isSetNotBefore();
    case PERSISTED_TIME:
      return isSetPersistedTime();
    case TOKEN:
      return isSetToken();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof CertificateCredential)
      return this.equals((CertificateCredential)that);
    return false;
  }

  public boolean equals(CertificateCredential that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_communityUser = true && this.isSetCommunityUser();
    boolean that_present_communityUser = true && that.isSetCommunityUser();
    if (this_present_communityUser || that_present_communityUser) {
      if (!(this_present_communityUser && that_present_communityUser))
        return false;
      if (!this.communityUser.equals(that.communityUser))
        return false;
    }

    boolean this_present_x509Cert = true && this.isSetX509Cert();
    boolean that_present_x509Cert = true && that.isSetX509Cert();
    if (this_present_x509Cert || that_present_x509Cert) {
      if (!(this_present_x509Cert && that_present_x509Cert))
        return false;
      if (!this.x509Cert.equals(that.x509Cert))
        return false;
    }

    boolean this_present_notAfter = true && this.isSetNotAfter();
    boolean that_present_notAfter = true && that.isSetNotAfter();
    if (this_present_notAfter || that_present_notAfter) {
      if (!(this_present_notAfter && that_present_notAfter))
        return false;
      if (!this.notAfter.equals(that.notAfter))
        return false;
    }

    boolean this_present_privateKey = true && this.isSetPrivateKey();
    boolean that_present_privateKey = true && that.isSetPrivateKey();
    if (this_present_privateKey || that_present_privateKey) {
      if (!(this_present_privateKey && that_present_privateKey))
        return false;
      if (!this.privateKey.equals(that.privateKey))
        return false;
    }

    boolean this_present_lifeTime = true && this.isSetLifeTime();
    boolean that_present_lifeTime = true && that.isSetLifeTime();
    if (this_present_lifeTime || that_present_lifeTime) {
      if (!(this_present_lifeTime && that_present_lifeTime))
        return false;
      if (this.lifeTime != that.lifeTime)
        return false;
    }

    boolean this_present_notBefore = true && this.isSetNotBefore();
    boolean that_present_notBefore = true && that.isSetNotBefore();
    if (this_present_notBefore || that_present_notBefore) {
      if (!(this_present_notBefore && that_present_notBefore))
        return false;
      if (!this.notBefore.equals(that.notBefore))
        return false;
    }

    boolean this_present_persistedTime = true && this.isSetPersistedTime();
    boolean that_present_persistedTime = true && that.isSetPersistedTime();
    if (this_present_persistedTime || that_present_persistedTime) {
      if (!(this_present_persistedTime && that_present_persistedTime))
        return false;
      if (this.persistedTime != that.persistedTime)
        return false;
    }

    boolean this_present_token = true && this.isSetToken();
    boolean that_present_token = true && that.isSetToken();
    if (this_present_token || that_present_token) {
      if (!(this_present_token && that_present_token))
        return false;
      if (!this.token.equals(that.token))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetCommunityUser()) ? 131071 : 524287);
    if (isSetCommunityUser())
      hashCode = hashCode * 8191 + communityUser.hashCode();

    hashCode = hashCode * 8191 + ((isSetX509Cert()) ? 131071 : 524287);
    if (isSetX509Cert())
      hashCode = hashCode * 8191 + x509Cert.hashCode();

    hashCode = hashCode * 8191 + ((isSetNotAfter()) ? 131071 : 524287);
    if (isSetNotAfter())
      hashCode = hashCode * 8191 + notAfter.hashCode();

    hashCode = hashCode * 8191 + ((isSetPrivateKey()) ? 131071 : 524287);
    if (isSetPrivateKey())
      hashCode = hashCode * 8191 + privateKey.hashCode();

    hashCode = hashCode * 8191 + ((isSetLifeTime()) ? 131071 : 524287);
    if (isSetLifeTime())
      hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(lifeTime);

    hashCode = hashCode * 8191 + ((isSetNotBefore()) ? 131071 : 524287);
    if (isSetNotBefore())
      hashCode = hashCode * 8191 + notBefore.hashCode();

    hashCode = hashCode * 8191 + ((isSetPersistedTime()) ? 131071 : 524287);
    if (isSetPersistedTime())
      hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(persistedTime);

    hashCode = hashCode * 8191 + ((isSetToken()) ? 131071 : 524287);
    if (isSetToken())
      hashCode = hashCode * 8191 + token.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(CertificateCredential other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetCommunityUser()).compareTo(other.isSetCommunityUser());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCommunityUser()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.communityUser, other.communityUser);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetX509Cert()).compareTo(other.isSetX509Cert());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetX509Cert()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.x509Cert, other.x509Cert);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetNotAfter()).compareTo(other.isSetNotAfter());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNotAfter()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.notAfter, other.notAfter);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetPrivateKey()).compareTo(other.isSetPrivateKey());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPrivateKey()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.privateKey, other.privateKey);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetLifeTime()).compareTo(other.isSetLifeTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLifeTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.lifeTime, other.lifeTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetNotBefore()).compareTo(other.isSetNotBefore());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNotBefore()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.notBefore, other.notBefore);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetPersistedTime()).compareTo(other.isSetPersistedTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPersistedTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.persistedTime, other.persistedTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetToken()).compareTo(other.isSetToken());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetToken()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.token, other.token);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("CertificateCredential(");
    boolean first = true;

    sb.append("communityUser:");
    if (this.communityUser == null) {
      sb.append("null");
    } else {
      sb.append(this.communityUser);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("x509Cert:");
    if (this.x509Cert == null) {
      sb.append("null");
    } else {
      sb.append(this.x509Cert);
    }
    first = false;
    if (isSetNotAfter()) {
      if (!first) sb.append(", ");
      sb.append("notAfter:");
      if (this.notAfter == null) {
        sb.append("null");
      } else {
        sb.append(this.notAfter);
      }
      first = false;
    }
    if (isSetPrivateKey()) {
      if (!first) sb.append(", ");
      sb.append("privateKey:");
      if (this.privateKey == null) {
        sb.append("null");
      } else {
        sb.append(this.privateKey);
      }
      first = false;
    }
    if (isSetLifeTime()) {
      if (!first) sb.append(", ");
      sb.append("lifeTime:");
      sb.append(this.lifeTime);
      first = false;
    }
    if (isSetNotBefore()) {
      if (!first) sb.append(", ");
      sb.append("notBefore:");
      if (this.notBefore == null) {
        sb.append("null");
      } else {
        sb.append(this.notBefore);
      }
      first = false;
    }
    if (isSetPersistedTime()) {
      if (!first) sb.append(", ");
      sb.append("persistedTime:");
      sb.append(this.persistedTime);
      first = false;
    }
    if (isSetToken()) {
      if (!first) sb.append(", ");
      sb.append("token:");
      if (this.token == null) {
        sb.append("null");
      } else {
        sb.append(this.token);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetCommunityUser()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'communityUser' is unset! Struct:" + toString());
    }

    if (!isSetX509Cert()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'x509Cert' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
    if (communityUser != null) {
      communityUser.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class CertificateCredentialStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public CertificateCredentialStandardScheme getScheme() {
      return new CertificateCredentialStandardScheme();
    }
  }

  private static class CertificateCredentialStandardScheme extends org.apache.thrift.scheme.StandardScheme<CertificateCredential> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, CertificateCredential struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // COMMUNITY_USER
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.communityUser = new CommunityUser();
              struct.communityUser.read(iprot);
              struct.setCommunityUserIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // X509_CERT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.x509Cert = iprot.readString();
              struct.setX509CertIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // NOT_AFTER
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.notAfter = iprot.readString();
              struct.setNotAfterIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // PRIVATE_KEY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.privateKey = iprot.readString();
              struct.setPrivateKeyIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // LIFE_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.lifeTime = iprot.readI64();
              struct.setLifeTimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // NOT_BEFORE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.notBefore = iprot.readString();
              struct.setNotBeforeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // PERSISTED_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.persistedTime = iprot.readI64();
              struct.setPersistedTimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 8: // TOKEN
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.token = iprot.readString();
              struct.setTokenIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, CertificateCredential struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.communityUser != null) {
        oprot.writeFieldBegin(COMMUNITY_USER_FIELD_DESC);
        struct.communityUser.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.x509Cert != null) {
        oprot.writeFieldBegin(X509_CERT_FIELD_DESC);
        oprot.writeString(struct.x509Cert);
        oprot.writeFieldEnd();
      }
      if (struct.notAfter != null) {
        if (struct.isSetNotAfter()) {
          oprot.writeFieldBegin(NOT_AFTER_FIELD_DESC);
          oprot.writeString(struct.notAfter);
          oprot.writeFieldEnd();
        }
      }
      if (struct.privateKey != null) {
        if (struct.isSetPrivateKey()) {
          oprot.writeFieldBegin(PRIVATE_KEY_FIELD_DESC);
          oprot.writeString(struct.privateKey);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetLifeTime()) {
        oprot.writeFieldBegin(LIFE_TIME_FIELD_DESC);
        oprot.writeI64(struct.lifeTime);
        oprot.writeFieldEnd();
      }
      if (struct.notBefore != null) {
        if (struct.isSetNotBefore()) {
          oprot.writeFieldBegin(NOT_BEFORE_FIELD_DESC);
          oprot.writeString(struct.notBefore);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetPersistedTime()) {
        oprot.writeFieldBegin(PERSISTED_TIME_FIELD_DESC);
        oprot.writeI64(struct.persistedTime);
        oprot.writeFieldEnd();
      }
      if (struct.token != null) {
        if (struct.isSetToken()) {
          oprot.writeFieldBegin(TOKEN_FIELD_DESC);
          oprot.writeString(struct.token);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CertificateCredentialTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public CertificateCredentialTupleScheme getScheme() {
      return new CertificateCredentialTupleScheme();
    }
  }

  private static class CertificateCredentialTupleScheme extends org.apache.thrift.scheme.TupleScheme<CertificateCredential> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, CertificateCredential struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.communityUser.write(oprot);
      oprot.writeString(struct.x509Cert);
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetNotAfter()) {
        optionals.set(0);
      }
      if (struct.isSetPrivateKey()) {
        optionals.set(1);
      }
      if (struct.isSetLifeTime()) {
        optionals.set(2);
      }
      if (struct.isSetNotBefore()) {
        optionals.set(3);
      }
      if (struct.isSetPersistedTime()) {
        optionals.set(4);
      }
      if (struct.isSetToken()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetNotAfter()) {
        oprot.writeString(struct.notAfter);
      }
      if (struct.isSetPrivateKey()) {
        oprot.writeString(struct.privateKey);
      }
      if (struct.isSetLifeTime()) {
        oprot.writeI64(struct.lifeTime);
      }
      if (struct.isSetNotBefore()) {
        oprot.writeString(struct.notBefore);
      }
      if (struct.isSetPersistedTime()) {
        oprot.writeI64(struct.persistedTime);
      }
      if (struct.isSetToken()) {
        oprot.writeString(struct.token);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, CertificateCredential struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.communityUser = new CommunityUser();
      struct.communityUser.read(iprot);
      struct.setCommunityUserIsSet(true);
      struct.x509Cert = iprot.readString();
      struct.setX509CertIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        struct.notAfter = iprot.readString();
        struct.setNotAfterIsSet(true);
      }
      if (incoming.get(1)) {
        struct.privateKey = iprot.readString();
        struct.setPrivateKeyIsSet(true);
      }
      if (incoming.get(2)) {
        struct.lifeTime = iprot.readI64();
        struct.setLifeTimeIsSet(true);
      }
      if (incoming.get(3)) {
        struct.notBefore = iprot.readString();
        struct.setNotBeforeIsSet(true);
      }
      if (incoming.get(4)) {
        struct.persistedTime = iprot.readI64();
        struct.setPersistedTimeIsSet(true);
      }
      if (incoming.get(5)) {
        struct.token = iprot.readString();
        struct.setTokenIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
