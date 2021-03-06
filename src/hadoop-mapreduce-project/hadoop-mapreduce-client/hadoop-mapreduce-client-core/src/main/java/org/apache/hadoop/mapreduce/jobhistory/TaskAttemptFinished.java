/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.apache.hadoop.mapreduce.jobhistory;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class TaskAttemptFinished extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"TaskAttemptFinished\",\"namespace\":\"org.apache.hadoop.mapreduce.jobhistory\",\"fields\":[{\"name\":\"taskid\",\"type\":\"string\"},{\"name\":\"attemptId\",\"type\":\"string\"},{\"name\":\"taskType\",\"type\":\"string\"},{\"name\":\"taskStatus\",\"type\":\"string\"},{\"name\":\"finishTime\",\"type\":\"long\"},{\"name\":\"rackname\",\"type\":\"string\"},{\"name\":\"hostname\",\"type\":\"string\"},{\"name\":\"state\",\"type\":\"string\"},{\"name\":\"counters\",\"type\":{\"type\":\"record\",\"name\":\"JhCounters\",\"fields\":[{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"groups\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"JhCounterGroup\",\"fields\":[{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"displayName\",\"type\":\"string\"},{\"name\":\"counts\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"JhCounter\",\"fields\":[{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"displayName\",\"type\":\"string\"},{\"name\":\"value\",\"type\":\"long\"}]}}}]}}}]}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence taskid;
  @Deprecated public java.lang.CharSequence attemptId;
  @Deprecated public java.lang.CharSequence taskType;
  @Deprecated public java.lang.CharSequence taskStatus;
  @Deprecated public long finishTime;
  @Deprecated public java.lang.CharSequence rackname;
  @Deprecated public java.lang.CharSequence hostname;
  @Deprecated public java.lang.CharSequence state;
  @Deprecated public org.apache.hadoop.mapreduce.jobhistory.JhCounters counters;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public TaskAttemptFinished() {}

  /**
   * All-args constructor.
   */
  public TaskAttemptFinished(java.lang.CharSequence taskid, java.lang.CharSequence attemptId, java.lang.CharSequence taskType, java.lang.CharSequence taskStatus, java.lang.Long finishTime, java.lang.CharSequence rackname, java.lang.CharSequence hostname, java.lang.CharSequence state, org.apache.hadoop.mapreduce.jobhistory.JhCounters counters) {
    this.taskid = taskid;
    this.attemptId = attemptId;
    this.taskType = taskType;
    this.taskStatus = taskStatus;
    this.finishTime = finishTime;
    this.rackname = rackname;
    this.hostname = hostname;
    this.state = state;
    this.counters = counters;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return taskid;
    case 1: return attemptId;
    case 2: return taskType;
    case 3: return taskStatus;
    case 4: return finishTime;
    case 5: return rackname;
    case 6: return hostname;
    case 7: return state;
    case 8: return counters;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: taskid = (java.lang.CharSequence)value$; break;
    case 1: attemptId = (java.lang.CharSequence)value$; break;
    case 2: taskType = (java.lang.CharSequence)value$; break;
    case 3: taskStatus = (java.lang.CharSequence)value$; break;
    case 4: finishTime = (java.lang.Long)value$; break;
    case 5: rackname = (java.lang.CharSequence)value$; break;
    case 6: hostname = (java.lang.CharSequence)value$; break;
    case 7: state = (java.lang.CharSequence)value$; break;
    case 8: counters = (org.apache.hadoop.mapreduce.jobhistory.JhCounters)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'taskid' field.
   */
  public java.lang.CharSequence getTaskid() {
    return taskid;
  }

  /**
   * Sets the value of the 'taskid' field.
   * @param value the value to set.
   */
  public void setTaskid(java.lang.CharSequence value) {
    this.taskid = value;
  }

  /**
   * Gets the value of the 'attemptId' field.
   */
  public java.lang.CharSequence getAttemptId() {
    return attemptId;
  }

  /**
   * Sets the value of the 'attemptId' field.
   * @param value the value to set.
   */
  public void setAttemptId(java.lang.CharSequence value) {
    this.attemptId = value;
  }

  /**
   * Gets the value of the 'taskType' field.
   */
  public java.lang.CharSequence getTaskType() {
    return taskType;
  }

  /**
   * Sets the value of the 'taskType' field.
   * @param value the value to set.
   */
  public void setTaskType(java.lang.CharSequence value) {
    this.taskType = value;
  }

  /**
   * Gets the value of the 'taskStatus' field.
   */
  public java.lang.CharSequence getTaskStatus() {
    return taskStatus;
  }

  /**
   * Sets the value of the 'taskStatus' field.
   * @param value the value to set.
   */
  public void setTaskStatus(java.lang.CharSequence value) {
    this.taskStatus = value;
  }

  /**
   * Gets the value of the 'finishTime' field.
   */
  public java.lang.Long getFinishTime() {
    return finishTime;
  }

  /**
   * Sets the value of the 'finishTime' field.
   * @param value the value to set.
   */
  public void setFinishTime(java.lang.Long value) {
    this.finishTime = value;
  }

  /**
   * Gets the value of the 'rackname' field.
   */
  public java.lang.CharSequence getRackname() {
    return rackname;
  }

  /**
   * Sets the value of the 'rackname' field.
   * @param value the value to set.
   */
  public void setRackname(java.lang.CharSequence value) {
    this.rackname = value;
  }

  /**
   * Gets the value of the 'hostname' field.
   */
  public java.lang.CharSequence getHostname() {
    return hostname;
  }

  /**
   * Sets the value of the 'hostname' field.
   * @param value the value to set.
   */
  public void setHostname(java.lang.CharSequence value) {
    this.hostname = value;
  }

  /**
   * Gets the value of the 'state' field.
   */
  public java.lang.CharSequence getState() {
    return state;
  }

  /**
   * Sets the value of the 'state' field.
   * @param value the value to set.
   */
  public void setState(java.lang.CharSequence value) {
    this.state = value;
  }

  /**
   * Gets the value of the 'counters' field.
   */
  public org.apache.hadoop.mapreduce.jobhistory.JhCounters getCounters() {
    return counters;
  }

  /**
   * Sets the value of the 'counters' field.
   * @param value the value to set.
   */
  public void setCounters(org.apache.hadoop.mapreduce.jobhistory.JhCounters value) {
    this.counters = value;
  }

  /** Creates a new TaskAttemptFinished RecordBuilder */
  public static org.apache.hadoop.mapreduce.jobhistory.TaskAttemptFinished.Builder newBuilder() {
    return new org.apache.hadoop.mapreduce.jobhistory.TaskAttemptFinished.Builder();
  }
  
  /** Creates a new TaskAttemptFinished RecordBuilder by copying an existing Builder */
  public static org.apache.hadoop.mapreduce.jobhistory.TaskAttemptFinished.Builder newBuilder(org.apache.hadoop.mapreduce.jobhistory.TaskAttemptFinished.Builder other) {
    return new org.apache.hadoop.mapreduce.jobhistory.TaskAttemptFinished.Builder(other);
  }
  
  /** Creates a new TaskAttemptFinished RecordBuilder by copying an existing TaskAttemptFinished instance */
  public static org.apache.hadoop.mapreduce.jobhistory.TaskAttemptFinished.Builder newBuilder(org.apache.hadoop.mapreduce.jobhistory.TaskAttemptFinished other) {
    return new org.apache.hadoop.mapreduce.jobhistory.TaskAttemptFinished.Builder(other);
  }
  
  /**
   * RecordBuilder for TaskAttemptFinished instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<TaskAttemptFinished>
    implements org.apache.avro.data.RecordBuilder<TaskAttemptFinished> {

    private java.lang.CharSequence taskid;
    private java.lang.CharSequence attemptId;
    private java.lang.CharSequence taskType;
    private java.lang.CharSequence taskStatus;
    private long finishTime;
    private java.lang.CharSequence rackname;
    private java.lang.CharSequence hostname;
    private java.lang.CharSequence state;
    private org.apache.hadoop.mapreduce.jobhistory.JhCounters counters;
    private org.apache.hadoop.mapreduce.jobhistory.JhCounters.Builder countersBuilder;

    /** Creates a new Builder */
    private Builder() {
      super(org.apache.hadoop.mapreduce.jobhistory.TaskAttemptFinished.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.apache.hadoop.mapreduce.jobhistory.TaskAttemptFinished.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.taskid)) {
        this.taskid = data().deepCopy(fields()[0].schema(), other.taskid);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.attemptId)) {
        this.attemptId = data().deepCopy(fields()[1].schema(), other.attemptId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.taskType)) {
        this.taskType = data().deepCopy(fields()[2].schema(), other.taskType);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.taskStatus)) {
        this.taskStatus = data().deepCopy(fields()[3].schema(), other.taskStatus);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.finishTime)) {
        this.finishTime = data().deepCopy(fields()[4].schema(), other.finishTime);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.rackname)) {
        this.rackname = data().deepCopy(fields()[5].schema(), other.rackname);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.hostname)) {
        this.hostname = data().deepCopy(fields()[6].schema(), other.hostname);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.state)) {
        this.state = data().deepCopy(fields()[7].schema(), other.state);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.counters)) {
        this.counters = data().deepCopy(fields()[8].schema(), other.counters);
        fieldSetFlags()[8] = true;
      }
      if (other.hasCountersBuilder()) {
        this.countersBuilder = org.apache.hadoop.mapreduce.jobhistory.JhCounters.newBuilder(other.getCountersBuilder());
      }
    }
    
    /** Creates a Builder by copying an existing TaskAttemptFinished instance */
    private Builder(org.apache.hadoop.mapreduce.jobhistory.TaskAttemptFinished other) {
            super(org.apache.hadoop.mapreduce.jobhistory.TaskAttemptFinished.SCHEMA$);
      if (isValidValue(fields()[0], other.taskid)) {
        this.taskid = data().deepCopy(fields()[0].schema(), other.taskid);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.attemptId)) {
        this.attemptId = data().deepCopy(fields()[1].schema(), other.attemptId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.taskType)) {
        this.taskType = data().deepCopy(fields()[2].schema(), other.taskType);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.taskStatus)) {
        this.taskStatus = data().deepCopy(fields()[3].schema(), other.taskStatus);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.finishTime)) {
        this.finishTime = data().deepCopy(fields()[4].schema(), other.finishTime);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.rackname)) {
        this.rackname = data().deepCopy(fields()[5].schema(), other.rackname);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.hostname)) {
        this.hostname = data().deepCopy(fields()[6].schema(), other.hostname);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.state)) {
        this.state = data().deepCopy(fields()[7].schema(), other.state);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.counters)) {
        this.counters = data().deepCopy(fields()[8].schema(), other.counters);
        fieldSetFlags()[8] = true;
      }
      this.countersBuilder = null;
    }

    /**
      * Gets the value of the 'taskid' field.
      */
    public java.lang.CharSequence getTaskid() {
      return taskid;
    }

    /**
      * Sets the value of the 'taskid' field.
      * @param value the value to set.
      */
    public org.apache.hadoop.mapreduce.jobhistory.TaskAttemptFinished.Builder setTaskid(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.taskid = value;
      fieldSetFlags()[0] = true;
      return this; 
    }

    /**
      * Checks whether the 'taskid' field has been set.
      */
    public boolean hasTaskid() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'taskid' field.
      */
    public org.apache.hadoop.mapreduce.jobhistory.TaskAttemptFinished.Builder clearTaskid() {
      taskid = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'attemptId' field.
      */
    public java.lang.CharSequence getAttemptId() {
      return attemptId;
    }

    /**
      * Sets the value of the 'attemptId' field.
      * @param value the value to set.
      */
    public org.apache.hadoop.mapreduce.jobhistory.TaskAttemptFinished.Builder setAttemptId(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.attemptId = value;
      fieldSetFlags()[1] = true;
      return this; 
    }

    /**
      * Checks whether the 'attemptId' field has been set.
      */
    public boolean hasAttemptId() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'attemptId' field.
      */
    public org.apache.hadoop.mapreduce.jobhistory.TaskAttemptFinished.Builder clearAttemptId() {
      attemptId = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'taskType' field.
      */
    public java.lang.CharSequence getTaskType() {
      return taskType;
    }

    /**
      * Sets the value of the 'taskType' field.
      * @param value the value to set.
      */
    public org.apache.hadoop.mapreduce.jobhistory.TaskAttemptFinished.Builder setTaskType(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.taskType = value;
      fieldSetFlags()[2] = true;
      return this; 
    }

    /**
      * Checks whether the 'taskType' field has been set.
      */
    public boolean hasTaskType() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'taskType' field.
      */
    public org.apache.hadoop.mapreduce.jobhistory.TaskAttemptFinished.Builder clearTaskType() {
      taskType = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'taskStatus' field.
      */
    public java.lang.CharSequence getTaskStatus() {
      return taskStatus;
    }

    /**
      * Sets the value of the 'taskStatus' field.
      * @param value the value to set.
      */
    public org.apache.hadoop.mapreduce.jobhistory.TaskAttemptFinished.Builder setTaskStatus(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.taskStatus = value;
      fieldSetFlags()[3] = true;
      return this; 
    }

    /**
      * Checks whether the 'taskStatus' field has been set.
      */
    public boolean hasTaskStatus() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'taskStatus' field.
      */
    public org.apache.hadoop.mapreduce.jobhistory.TaskAttemptFinished.Builder clearTaskStatus() {
      taskStatus = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'finishTime' field.
      */
    public java.lang.Long getFinishTime() {
      return finishTime;
    }

    /**
      * Sets the value of the 'finishTime' field.
      * @param value the value to set.
      */
    public org.apache.hadoop.mapreduce.jobhistory.TaskAttemptFinished.Builder setFinishTime(long value) {
      validate(fields()[4], value);
      this.finishTime = value;
      fieldSetFlags()[4] = true;
      return this; 
    }

    /**
      * Checks whether the 'finishTime' field has been set.
      */
    public boolean hasFinishTime() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'finishTime' field.
      */
    public org.apache.hadoop.mapreduce.jobhistory.TaskAttemptFinished.Builder clearFinishTime() {
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'rackname' field.
      */
    public java.lang.CharSequence getRackname() {
      return rackname;
    }

    /**
      * Sets the value of the 'rackname' field.
      * @param value the value to set.
      */
    public org.apache.hadoop.mapreduce.jobhistory.TaskAttemptFinished.Builder setRackname(java.lang.CharSequence value) {
      validate(fields()[5], value);
      this.rackname = value;
      fieldSetFlags()[5] = true;
      return this; 
    }

    /**
      * Checks whether the 'rackname' field has been set.
      */
    public boolean hasRackname() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'rackname' field.
      */
    public org.apache.hadoop.mapreduce.jobhistory.TaskAttemptFinished.Builder clearRackname() {
      rackname = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'hostname' field.
      */
    public java.lang.CharSequence getHostname() {
      return hostname;
    }

    /**
      * Sets the value of the 'hostname' field.
      * @param value the value to set.
      */
    public org.apache.hadoop.mapreduce.jobhistory.TaskAttemptFinished.Builder setHostname(java.lang.CharSequence value) {
      validate(fields()[6], value);
      this.hostname = value;
      fieldSetFlags()[6] = true;
      return this; 
    }

    /**
      * Checks whether the 'hostname' field has been set.
      */
    public boolean hasHostname() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'hostname' field.
      */
    public org.apache.hadoop.mapreduce.jobhistory.TaskAttemptFinished.Builder clearHostname() {
      hostname = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
      * Gets the value of the 'state' field.
      */
    public java.lang.CharSequence getState() {
      return state;
    }

    /**
      * Sets the value of the 'state' field.
      * @param value the value to set.
      */
    public org.apache.hadoop.mapreduce.jobhistory.TaskAttemptFinished.Builder setState(java.lang.CharSequence value) {
      validate(fields()[7], value);
      this.state = value;
      fieldSetFlags()[7] = true;
      return this; 
    }

    /**
      * Checks whether the 'state' field has been set.
      */
    public boolean hasState() {
      return fieldSetFlags()[7];
    }


    /**
      * Clears the value of the 'state' field.
      */
    public org.apache.hadoop.mapreduce.jobhistory.TaskAttemptFinished.Builder clearState() {
      state = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /**
      * Gets the value of the 'counters' field.
      */
    public org.apache.hadoop.mapreduce.jobhistory.JhCounters getCounters() {
      return counters;
    }

    /**
      * Sets the value of the 'counters' field.
      * @param value the value to set.
      */
    public org.apache.hadoop.mapreduce.jobhistory.TaskAttemptFinished.Builder setCounters(org.apache.hadoop.mapreduce.jobhistory.JhCounters value) {
      validate(fields()[8], value);
      this.countersBuilder = null;
      this.counters = value;
      fieldSetFlags()[8] = true;
      return this; 
    }

    /**
      * Checks whether the 'counters' field has been set.
      */
    public boolean hasCounters() {
      return fieldSetFlags()[8];
    }

    /**
     * Gets the Builder instance for the 'counters' field and creates one if it doesn't exist yet.
     */
    public org.apache.hadoop.mapreduce.jobhistory.JhCounters.Builder getCountersBuilder() {
      if (countersBuilder == null) {
        if (hasCounters()) {
          setCountersBuilder(org.apache.hadoop.mapreduce.jobhistory.JhCounters.newBuilder(counters));
        } else {
          setCountersBuilder(org.apache.hadoop.mapreduce.jobhistory.JhCounters.newBuilder());
        }
      }
      return countersBuilder;
    }

    /**
     * Sets the Builder instance for the 'counters' field
     */
    public org.apache.hadoop.mapreduce.jobhistory.TaskAttemptFinished.Builder setCountersBuilder(org.apache.hadoop.mapreduce.jobhistory.JhCounters.Builder value) {
      clearCounters();
      countersBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'counters' field has an active Builder instance
     */
    public boolean hasCountersBuilder() {
      return countersBuilder != null;
    }

    /**
      * Clears the value of the 'counters' field.
      */
    public org.apache.hadoop.mapreduce.jobhistory.TaskAttemptFinished.Builder clearCounters() {
      counters = null;
      countersBuilder = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    @Override
    public TaskAttemptFinished build() {
      try {
        TaskAttemptFinished record = new TaskAttemptFinished();
        record.taskid = fieldSetFlags()[0] ? this.taskid : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.attemptId = fieldSetFlags()[1] ? this.attemptId : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.taskType = fieldSetFlags()[2] ? this.taskType : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.taskStatus = fieldSetFlags()[3] ? this.taskStatus : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.finishTime = fieldSetFlags()[4] ? this.finishTime : (java.lang.Long) defaultValue(fields()[4]);
        record.rackname = fieldSetFlags()[5] ? this.rackname : (java.lang.CharSequence) defaultValue(fields()[5]);
        record.hostname = fieldSetFlags()[6] ? this.hostname : (java.lang.CharSequence) defaultValue(fields()[6]);
        record.state = fieldSetFlags()[7] ? this.state : (java.lang.CharSequence) defaultValue(fields()[7]);
        if (countersBuilder != null) {
          record.counters = this.countersBuilder.build();
        } else {
          record.counters = fieldSetFlags()[8] ? this.counters : (org.apache.hadoop.mapreduce.jobhistory.JhCounters) defaultValue(fields()[8]);
        }
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
