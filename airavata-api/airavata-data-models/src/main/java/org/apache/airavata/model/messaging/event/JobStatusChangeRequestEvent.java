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
public class JobStatusChangeRequestEvent implements org.apache.thrift.TBase<JobStatusChangeRequestEvent, JobStatusChangeRequestEvent._Fields>, java.io.Serializable, Cloneable, Comparable<JobStatusChangeRequestEvent> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("JobStatusChangeRequestEvent");

  private static final org.apache.thrift.protocol.TField STATE_FIELD_DESC = new org.apache.thrift.protocol.TField("state", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField JOB_IDENTITY_FIELD_DESC = new org.apache.thrift.protocol.TField("jobIdentity", org.apache.thrift.protocol.TType.STRUCT, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new JobStatusChangeRequestEventStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new JobStatusChangeRequestEventTupleSchemeFactory();

  private org.apache.airavata.model.status.JobState state; // required
  private JobIdentifier jobIdentity; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see org.apache.airavata.model.status.JobState
     */
    STATE((short)1, "state"),
    JOB_IDENTITY((short)2, "jobIdentity");

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
        case 1: // STATE
          return STATE;
        case 2: // JOB_IDENTITY
          return JOB_IDENTITY;
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
    tmpMap.put(_Fields.STATE, new org.apache.thrift.meta_data.FieldMetaData("state", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, org.apache.airavata.model.status.JobState.class)));
    tmpMap.put(_Fields.JOB_IDENTITY, new org.apache.thrift.meta_data.FieldMetaData("jobIdentity", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, JobIdentifier.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(JobStatusChangeRequestEvent.class, metaDataMap);
  }

  public JobStatusChangeRequestEvent() {
  }

  public JobStatusChangeRequestEvent(
    org.apache.airavata.model.status.JobState state,
    JobIdentifier jobIdentity)
  {
    this();
    this.state = state;
    this.jobIdentity = jobIdentity;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public JobStatusChangeRequestEvent(JobStatusChangeRequestEvent other) {
    if (other.isSetState()) {
      this.state = other.state;
    }
    if (other.isSetJobIdentity()) {
      this.jobIdentity = new JobIdentifier(other.jobIdentity);
    }
  }

  public JobStatusChangeRequestEvent deepCopy() {
    return new JobStatusChangeRequestEvent(this);
  }

  @Override
  public void clear() {
    this.state = null;
    this.jobIdentity = null;
  }

  /**
   * 
   * @see org.apache.airavata.model.status.JobState
   */
  public org.apache.airavata.model.status.JobState getState() {
    return this.state;
  }

  /**
   * 
   * @see org.apache.airavata.model.status.JobState
   */
  public void setState(org.apache.airavata.model.status.JobState state) {
    this.state = state;
  }

  public void unsetState() {
    this.state = null;
  }

  /** Returns true if field state is set (has been assigned a value) and false otherwise */
  public boolean isSetState() {
    return this.state != null;
  }

  public void setStateIsSet(boolean value) {
    if (!value) {
      this.state = null;
    }
  }

  public JobIdentifier getJobIdentity() {
    return this.jobIdentity;
  }

  public void setJobIdentity(JobIdentifier jobIdentity) {
    this.jobIdentity = jobIdentity;
  }

  public void unsetJobIdentity() {
    this.jobIdentity = null;
  }

  /** Returns true if field jobIdentity is set (has been assigned a value) and false otherwise */
  public boolean isSetJobIdentity() {
    return this.jobIdentity != null;
  }

  public void setJobIdentityIsSet(boolean value) {
    if (!value) {
      this.jobIdentity = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case STATE:
      if (value == null) {
        unsetState();
      } else {
        setState((org.apache.airavata.model.status.JobState)value);
      }
      break;

    case JOB_IDENTITY:
      if (value == null) {
        unsetJobIdentity();
      } else {
        setJobIdentity((JobIdentifier)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case STATE:
      return getState();

    case JOB_IDENTITY:
      return getJobIdentity();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case STATE:
      return isSetState();
    case JOB_IDENTITY:
      return isSetJobIdentity();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof JobStatusChangeRequestEvent)
      return this.equals((JobStatusChangeRequestEvent)that);
    return false;
  }

  public boolean equals(JobStatusChangeRequestEvent that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_state = true && this.isSetState();
    boolean that_present_state = true && that.isSetState();
    if (this_present_state || that_present_state) {
      if (!(this_present_state && that_present_state))
        return false;
      if (!this.state.equals(that.state))
        return false;
    }

    boolean this_present_jobIdentity = true && this.isSetJobIdentity();
    boolean that_present_jobIdentity = true && that.isSetJobIdentity();
    if (this_present_jobIdentity || that_present_jobIdentity) {
      if (!(this_present_jobIdentity && that_present_jobIdentity))
        return false;
      if (!this.jobIdentity.equals(that.jobIdentity))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetState()) ? 131071 : 524287);
    if (isSetState())
      hashCode = hashCode * 8191 + state.getValue();

    hashCode = hashCode * 8191 + ((isSetJobIdentity()) ? 131071 : 524287);
    if (isSetJobIdentity())
      hashCode = hashCode * 8191 + jobIdentity.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(JobStatusChangeRequestEvent other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetState()).compareTo(other.isSetState());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetState()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.state, other.state);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetJobIdentity()).compareTo(other.isSetJobIdentity());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetJobIdentity()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.jobIdentity, other.jobIdentity);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("JobStatusChangeRequestEvent(");
    boolean first = true;

    sb.append("state:");
    if (this.state == null) {
      sb.append("null");
    } else {
      sb.append(this.state);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("jobIdentity:");
    if (this.jobIdentity == null) {
      sb.append("null");
    } else {
      sb.append(this.jobIdentity);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetState()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'state' is unset! Struct:" + toString());
    }

    if (!isSetJobIdentity()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'jobIdentity' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
    if (jobIdentity != null) {
      jobIdentity.validate();
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class JobStatusChangeRequestEventStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public JobStatusChangeRequestEventStandardScheme getScheme() {
      return new JobStatusChangeRequestEventStandardScheme();
    }
  }

  private static class JobStatusChangeRequestEventStandardScheme extends org.apache.thrift.scheme.StandardScheme<JobStatusChangeRequestEvent> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, JobStatusChangeRequestEvent struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // STATE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.state = org.apache.airavata.model.status.JobState.findByValue(iprot.readI32());
              struct.setStateIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // JOB_IDENTITY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.jobIdentity = new JobIdentifier();
              struct.jobIdentity.read(iprot);
              struct.setJobIdentityIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, JobStatusChangeRequestEvent struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.state != null) {
        oprot.writeFieldBegin(STATE_FIELD_DESC);
        oprot.writeI32(struct.state.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.jobIdentity != null) {
        oprot.writeFieldBegin(JOB_IDENTITY_FIELD_DESC);
        struct.jobIdentity.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class JobStatusChangeRequestEventTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public JobStatusChangeRequestEventTupleScheme getScheme() {
      return new JobStatusChangeRequestEventTupleScheme();
    }
  }

  private static class JobStatusChangeRequestEventTupleScheme extends org.apache.thrift.scheme.TupleScheme<JobStatusChangeRequestEvent> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, JobStatusChangeRequestEvent struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeI32(struct.state.getValue());
      struct.jobIdentity.write(oprot);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, JobStatusChangeRequestEvent struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.state = org.apache.airavata.model.status.JobState.findByValue(iprot.readI32());
      struct.setStateIsSet(true);
      struct.jobIdentity = new JobIdentifier();
      struct.jobIdentity.read(iprot);
      struct.setJobIdentityIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
