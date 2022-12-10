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
package org.apache.airavata.model.messaging.event;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)")
public class ProcessSubmitEvent implements org.apache.thrift.TBase<ProcessSubmitEvent, ProcessSubmitEvent._Fields>, java.io.Serializable, Cloneable, Comparable<ProcessSubmitEvent> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ProcessSubmitEvent");

  private static final org.apache.thrift.protocol.TField PROCESS_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("processId", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField GATEWAY_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("gatewayId", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField EXPERIMENT_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("experimentId", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField TOKEN_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("tokenId", org.apache.thrift.protocol.TType.STRING, (short)4);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new ProcessSubmitEventStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new ProcessSubmitEventTupleSchemeFactory();

  private java.lang.String processId; // required
  private java.lang.String gatewayId; // required
  private java.lang.String experimentId; // required
  private java.lang.String tokenId; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    PROCESS_ID((short)1, "processId"),
    GATEWAY_ID((short)2, "gatewayId"),
    EXPERIMENT_ID((short)3, "experimentId"),
    TOKEN_ID((short)4, "tokenId");

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
        case 1: // PROCESS_ID
          return PROCESS_ID;
        case 2: // GATEWAY_ID
          return GATEWAY_ID;
        case 3: // EXPERIMENT_ID
          return EXPERIMENT_ID;
        case 4: // TOKEN_ID
          return TOKEN_ID;
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
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PROCESS_ID, new org.apache.thrift.meta_data.FieldMetaData("processId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.GATEWAY_ID, new org.apache.thrift.meta_data.FieldMetaData("gatewayId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.EXPERIMENT_ID, new org.apache.thrift.meta_data.FieldMetaData("experimentId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TOKEN_ID, new org.apache.thrift.meta_data.FieldMetaData("tokenId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ProcessSubmitEvent.class, metaDataMap);
  }

  public ProcessSubmitEvent() {
  }

  public ProcessSubmitEvent(
    java.lang.String processId,
    java.lang.String gatewayId,
    java.lang.String experimentId,
    java.lang.String tokenId)
  {
    this();
    this.processId = processId;
    this.gatewayId = gatewayId;
    this.experimentId = experimentId;
    this.tokenId = tokenId;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ProcessSubmitEvent(ProcessSubmitEvent other) {
    if (other.isSetProcessId()) {
      this.processId = other.processId;
    }
    if (other.isSetGatewayId()) {
      this.gatewayId = other.gatewayId;
    }
    if (other.isSetExperimentId()) {
      this.experimentId = other.experimentId;
    }
    if (other.isSetTokenId()) {
      this.tokenId = other.tokenId;
    }
  }

  public ProcessSubmitEvent deepCopy() {
    return new ProcessSubmitEvent(this);
  }

  @Override
  public void clear() {
    this.processId = null;
    this.gatewayId = null;
    this.experimentId = null;
    this.tokenId = null;
  }

  public java.lang.String getProcessId() {
    return this.processId;
  }

  public void setProcessId(java.lang.String processId) {
    this.processId = processId;
  }

  public void unsetProcessId() {
    this.processId = null;
  }

  /** Returns true if field processId is set (has been assigned a value) and false otherwise */
  public boolean isSetProcessId() {
    return this.processId != null;
  }

  public void setProcessIdIsSet(boolean value) {
    if (!value) {
      this.processId = null;
    }
  }

  public java.lang.String getGatewayId() {
    return this.gatewayId;
  }

  public void setGatewayId(java.lang.String gatewayId) {
    this.gatewayId = gatewayId;
  }

  public void unsetGatewayId() {
    this.gatewayId = null;
  }

  /** Returns true if field gatewayId is set (has been assigned a value) and false otherwise */
  public boolean isSetGatewayId() {
    return this.gatewayId != null;
  }

  public void setGatewayIdIsSet(boolean value) {
    if (!value) {
      this.gatewayId = null;
    }
  }

  public java.lang.String getExperimentId() {
    return this.experimentId;
  }

  public void setExperimentId(java.lang.String experimentId) {
    this.experimentId = experimentId;
  }

  public void unsetExperimentId() {
    this.experimentId = null;
  }

  /** Returns true if field experimentId is set (has been assigned a value) and false otherwise */
  public boolean isSetExperimentId() {
    return this.experimentId != null;
  }

  public void setExperimentIdIsSet(boolean value) {
    if (!value) {
      this.experimentId = null;
    }
  }

  public java.lang.String getTokenId() {
    return this.tokenId;
  }

  public void setTokenId(java.lang.String tokenId) {
    this.tokenId = tokenId;
  }

  public void unsetTokenId() {
    this.tokenId = null;
  }

  /** Returns true if field tokenId is set (has been assigned a value) and false otherwise */
  public boolean isSetTokenId() {
    return this.tokenId != null;
  }

  public void setTokenIdIsSet(boolean value) {
    if (!value) {
      this.tokenId = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case PROCESS_ID:
      if (value == null) {
        unsetProcessId();
      } else {
        setProcessId((java.lang.String)value);
      }
      break;

    case GATEWAY_ID:
      if (value == null) {
        unsetGatewayId();
      } else {
        setGatewayId((java.lang.String)value);
      }
      break;

    case EXPERIMENT_ID:
      if (value == null) {
        unsetExperimentId();
      } else {
        setExperimentId((java.lang.String)value);
      }
      break;

    case TOKEN_ID:
      if (value == null) {
        unsetTokenId();
      } else {
        setTokenId((java.lang.String)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case PROCESS_ID:
      return getProcessId();

    case GATEWAY_ID:
      return getGatewayId();

    case EXPERIMENT_ID:
      return getExperimentId();

    case TOKEN_ID:
      return getTokenId();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case PROCESS_ID:
      return isSetProcessId();
    case GATEWAY_ID:
      return isSetGatewayId();
    case EXPERIMENT_ID:
      return isSetExperimentId();
    case TOKEN_ID:
      return isSetTokenId();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof ProcessSubmitEvent)
      return this.equals((ProcessSubmitEvent)that);
    return false;
  }

  public boolean equals(ProcessSubmitEvent that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_processId = true && this.isSetProcessId();
    boolean that_present_processId = true && that.isSetProcessId();
    if (this_present_processId || that_present_processId) {
      if (!(this_present_processId && that_present_processId))
        return false;
      if (!this.processId.equals(that.processId))
        return false;
    }

    boolean this_present_gatewayId = true && this.isSetGatewayId();
    boolean that_present_gatewayId = true && that.isSetGatewayId();
    if (this_present_gatewayId || that_present_gatewayId) {
      if (!(this_present_gatewayId && that_present_gatewayId))
        return false;
      if (!this.gatewayId.equals(that.gatewayId))
        return false;
    }

    boolean this_present_experimentId = true && this.isSetExperimentId();
    boolean that_present_experimentId = true && that.isSetExperimentId();
    if (this_present_experimentId || that_present_experimentId) {
      if (!(this_present_experimentId && that_present_experimentId))
        return false;
      if (!this.experimentId.equals(that.experimentId))
        return false;
    }

    boolean this_present_tokenId = true && this.isSetTokenId();
    boolean that_present_tokenId = true && that.isSetTokenId();
    if (this_present_tokenId || that_present_tokenId) {
      if (!(this_present_tokenId && that_present_tokenId))
        return false;
      if (!this.tokenId.equals(that.tokenId))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetProcessId()) ? 131071 : 524287);
    if (isSetProcessId())
      hashCode = hashCode * 8191 + processId.hashCode();

    hashCode = hashCode * 8191 + ((isSetGatewayId()) ? 131071 : 524287);
    if (isSetGatewayId())
      hashCode = hashCode * 8191 + gatewayId.hashCode();

    hashCode = hashCode * 8191 + ((isSetExperimentId()) ? 131071 : 524287);
    if (isSetExperimentId())
      hashCode = hashCode * 8191 + experimentId.hashCode();

    hashCode = hashCode * 8191 + ((isSetTokenId()) ? 131071 : 524287);
    if (isSetTokenId())
      hashCode = hashCode * 8191 + tokenId.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(ProcessSubmitEvent other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetProcessId()).compareTo(other.isSetProcessId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetProcessId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.processId, other.processId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetGatewayId()).compareTo(other.isSetGatewayId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGatewayId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.gatewayId, other.gatewayId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetExperimentId()).compareTo(other.isSetExperimentId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetExperimentId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.experimentId, other.experimentId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetTokenId()).compareTo(other.isSetTokenId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTokenId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tokenId, other.tokenId);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("ProcessSubmitEvent(");
    boolean first = true;

    sb.append("processId:");
    if (this.processId == null) {
      sb.append("null");
    } else {
      sb.append(this.processId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("gatewayId:");
    if (this.gatewayId == null) {
      sb.append("null");
    } else {
      sb.append(this.gatewayId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("experimentId:");
    if (this.experimentId == null) {
      sb.append("null");
    } else {
      sb.append(this.experimentId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("tokenId:");
    if (this.tokenId == null) {
      sb.append("null");
    } else {
      sb.append(this.tokenId);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetProcessId()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'processId' is unset! Struct:" + toString());
    }

    if (!isSetGatewayId()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'gatewayId' is unset! Struct:" + toString());
    }

    if (!isSetExperimentId()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'experimentId' is unset! Struct:" + toString());
    }

    if (!isSetTokenId()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'tokenId' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ProcessSubmitEventStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ProcessSubmitEventStandardScheme getScheme() {
      return new ProcessSubmitEventStandardScheme();
    }
  }

  private static class ProcessSubmitEventStandardScheme extends org.apache.thrift.scheme.StandardScheme<ProcessSubmitEvent> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ProcessSubmitEvent struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PROCESS_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.processId = iprot.readString();
              struct.setProcessIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // GATEWAY_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.gatewayId = iprot.readString();
              struct.setGatewayIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // EXPERIMENT_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.experimentId = iprot.readString();
              struct.setExperimentIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // TOKEN_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.tokenId = iprot.readString();
              struct.setTokenIdIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, ProcessSubmitEvent struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.processId != null) {
        oprot.writeFieldBegin(PROCESS_ID_FIELD_DESC);
        oprot.writeString(struct.processId);
        oprot.writeFieldEnd();
      }
      if (struct.gatewayId != null) {
        oprot.writeFieldBegin(GATEWAY_ID_FIELD_DESC);
        oprot.writeString(struct.gatewayId);
        oprot.writeFieldEnd();
      }
      if (struct.experimentId != null) {
        oprot.writeFieldBegin(EXPERIMENT_ID_FIELD_DESC);
        oprot.writeString(struct.experimentId);
        oprot.writeFieldEnd();
      }
      if (struct.tokenId != null) {
        oprot.writeFieldBegin(TOKEN_ID_FIELD_DESC);
        oprot.writeString(struct.tokenId);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ProcessSubmitEventTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ProcessSubmitEventTupleScheme getScheme() {
      return new ProcessSubmitEventTupleScheme();
    }
  }

  private static class ProcessSubmitEventTupleScheme extends org.apache.thrift.scheme.TupleScheme<ProcessSubmitEvent> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ProcessSubmitEvent struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeString(struct.processId);
      oprot.writeString(struct.gatewayId);
      oprot.writeString(struct.experimentId);
      oprot.writeString(struct.tokenId);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ProcessSubmitEvent struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.processId = iprot.readString();
      struct.setProcessIdIsSet(true);
      struct.gatewayId = iprot.readString();
      struct.setGatewayIdIsSet(true);
      struct.experimentId = iprot.readString();
      struct.setExperimentIdIsSet(true);
      struct.tokenId = iprot.readString();
      struct.setTokenIdIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

