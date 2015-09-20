/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.apache.hadoop.mapreduce.jobhistory;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class JobPriorityChange extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"JobPriorityChange\",\"namespace\":\"org.apache.hadoop.mapreduce.jobhistory\",\"fields\":[{\"name\":\"jobid\",\"type\":\"string\"},{\"name\":\"priority\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence jobid;
  @Deprecated public java.lang.CharSequence priority;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public JobPriorityChange() {}

  /**
   * All-args constructor.
   */
  public JobPriorityChange(java.lang.CharSequence jobid, java.lang.CharSequence priority) {
    this.jobid = jobid;
    this.priority = priority;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return jobid;
    case 1: return priority;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: jobid = (java.lang.CharSequence)value$; break;
    case 1: priority = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'jobid' field.
   */
  public java.lang.CharSequence getJobid() {
    return jobid;
  }

  /**
   * Sets the value of the 'jobid' field.
   * @param value the value to set.
   */
  public void setJobid(java.lang.CharSequence value) {
    this.jobid = value;
  }

  /**
   * Gets the value of the 'priority' field.
   */
  public java.lang.CharSequence getPriority() {
    return priority;
  }

  /**
   * Sets the value of the 'priority' field.
   * @param value the value to set.
   */
  public void setPriority(java.lang.CharSequence value) {
    this.priority = value;
  }

  /** Creates a new JobPriorityChange RecordBuilder */
  public static org.apache.hadoop.mapreduce.jobhistory.JobPriorityChange.Builder newBuilder() {
    return new org.apache.hadoop.mapreduce.jobhistory.JobPriorityChange.Builder();
  }
  
  /** Creates a new JobPriorityChange RecordBuilder by copying an existing Builder */
  public static org.apache.hadoop.mapreduce.jobhistory.JobPriorityChange.Builder newBuilder(org.apache.hadoop.mapreduce.jobhistory.JobPriorityChange.Builder other) {
    return new org.apache.hadoop.mapreduce.jobhistory.JobPriorityChange.Builder(other);
  }
  
  /** Creates a new JobPriorityChange RecordBuilder by copying an existing JobPriorityChange instance */
  public static org.apache.hadoop.mapreduce.jobhistory.JobPriorityChange.Builder newBuilder(org.apache.hadoop.mapreduce.jobhistory.JobPriorityChange other) {
    return new org.apache.hadoop.mapreduce.jobhistory.JobPriorityChange.Builder(other);
  }
  
  /**
   * RecordBuilder for JobPriorityChange instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<JobPriorityChange>
    implements org.apache.avro.data.RecordBuilder<JobPriorityChange> {

    private java.lang.CharSequence jobid;
    private java.lang.CharSequence priority;

    /** Creates a new Builder */
    private Builder() {
      super(org.apache.hadoop.mapreduce.jobhistory.JobPriorityChange.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.apache.hadoop.mapreduce.jobhistory.JobPriorityChange.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.jobid)) {
        this.jobid = data().deepCopy(fields()[0].schema(), other.jobid);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.priority)) {
        this.priority = data().deepCopy(fields()[1].schema(), other.priority);
        fieldSetFlags()[1] = true;
      }
    }
    
    /** Creates a Builder by copying an existing JobPriorityChange instance */
    private Builder(org.apache.hadoop.mapreduce.jobhistory.JobPriorityChange other) {
            super(org.apache.hadoop.mapreduce.jobhistory.JobPriorityChange.SCHEMA$);
      if (isValidValue(fields()[0], other.jobid)) {
        this.jobid = data().deepCopy(fields()[0].schema(), other.jobid);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.priority)) {
        this.priority = data().deepCopy(fields()[1].schema(), other.priority);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'jobid' field.
      */
    public java.lang.CharSequence getJobid() {
      return jobid;
    }

    /**
      * Sets the value of the 'jobid' field.
      * @param value the value to set.
      */
    public org.apache.hadoop.mapreduce.jobhistory.JobPriorityChange.Builder setJobid(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.jobid = value;
      fieldSetFlags()[0] = true;
      return this; 
    }

    /**
      * Checks whether the 'jobid' field has been set.
      */
    public boolean hasJobid() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'jobid' field.
      */
    public org.apache.hadoop.mapreduce.jobhistory.JobPriorityChange.Builder clearJobid() {
      jobid = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'priority' field.
      */
    public java.lang.CharSequence getPriority() {
      return priority;
    }

    /**
      * Sets the value of the 'priority' field.
      * @param value the value to set.
      */
    public org.apache.hadoop.mapreduce.jobhistory.JobPriorityChange.Builder setPriority(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.priority = value;
      fieldSetFlags()[1] = true;
      return this; 
    }

    /**
      * Checks whether the 'priority' field has been set.
      */
    public boolean hasPriority() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'priority' field.
      */
    public org.apache.hadoop.mapreduce.jobhistory.JobPriorityChange.Builder clearPriority() {
      priority = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public JobPriorityChange build() {
      try {
        JobPriorityChange record = new JobPriorityChange();
        record.jobid = fieldSetFlags()[0] ? this.jobid : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.priority = fieldSetFlags()[1] ? this.priority : (java.lang.CharSequence) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
