/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.apache.hadoop.mapreduce.jobhistory;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class JhCounter extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"JhCounter\",\"namespace\":\"org.apache.hadoop.mapreduce.jobhistory\",\"fields\":[{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"displayName\",\"type\":\"string\"},{\"name\":\"value\",\"type\":\"long\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence name;
  @Deprecated public java.lang.CharSequence displayName;
  @Deprecated public long value;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public JhCounter() {}

  /**
   * All-args constructor.
   */
  public JhCounter(java.lang.CharSequence name, java.lang.CharSequence displayName, java.lang.Long value) {
    this.name = name;
    this.displayName = displayName;
    this.value = value;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return name;
    case 1: return displayName;
    case 2: return value;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: name = (java.lang.CharSequence)value$; break;
    case 1: displayName = (java.lang.CharSequence)value$; break;
    case 2: value = (java.lang.Long)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'name' field.
   */
  public java.lang.CharSequence getName() {
    return name;
  }

  /**
   * Sets the value of the 'name' field.
   * @param value the value to set.
   */
  public void setName(java.lang.CharSequence value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'displayName' field.
   */
  public java.lang.CharSequence getDisplayName() {
    return displayName;
  }

  /**
   * Sets the value of the 'displayName' field.
   * @param value the value to set.
   */
  public void setDisplayName(java.lang.CharSequence value) {
    this.displayName = value;
  }

  /**
   * Gets the value of the 'value' field.
   */
  public java.lang.Long getValue() {
    return value;
  }

  /**
   * Sets the value of the 'value' field.
   * @param value the value to set.
   */
  public void setValue(java.lang.Long value) {
    this.value = value;
  }

  /** Creates a new JhCounter RecordBuilder */
  public static org.apache.hadoop.mapreduce.jobhistory.JhCounter.Builder newBuilder() {
    return new org.apache.hadoop.mapreduce.jobhistory.JhCounter.Builder();
  }
  
  /** Creates a new JhCounter RecordBuilder by copying an existing Builder */
  public static org.apache.hadoop.mapreduce.jobhistory.JhCounter.Builder newBuilder(org.apache.hadoop.mapreduce.jobhistory.JhCounter.Builder other) {
    return new org.apache.hadoop.mapreduce.jobhistory.JhCounter.Builder(other);
  }
  
  /** Creates a new JhCounter RecordBuilder by copying an existing JhCounter instance */
  public static org.apache.hadoop.mapreduce.jobhistory.JhCounter.Builder newBuilder(org.apache.hadoop.mapreduce.jobhistory.JhCounter other) {
    return new org.apache.hadoop.mapreduce.jobhistory.JhCounter.Builder(other);
  }
  
  /**
   * RecordBuilder for JhCounter instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<JhCounter>
    implements org.apache.avro.data.RecordBuilder<JhCounter> {

    private java.lang.CharSequence name;
    private java.lang.CharSequence displayName;
    private long value;

    /** Creates a new Builder */
    private Builder() {
      super(org.apache.hadoop.mapreduce.jobhistory.JhCounter.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.apache.hadoop.mapreduce.jobhistory.JhCounter.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.displayName)) {
        this.displayName = data().deepCopy(fields()[1].schema(), other.displayName);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.value)) {
        this.value = data().deepCopy(fields()[2].schema(), other.value);
        fieldSetFlags()[2] = true;
      }
    }
    
    /** Creates a Builder by copying an existing JhCounter instance */
    private Builder(org.apache.hadoop.mapreduce.jobhistory.JhCounter other) {
            super(org.apache.hadoop.mapreduce.jobhistory.JhCounter.SCHEMA$);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.displayName)) {
        this.displayName = data().deepCopy(fields()[1].schema(), other.displayName);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.value)) {
        this.value = data().deepCopy(fields()[2].schema(), other.value);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'name' field.
      */
    public java.lang.CharSequence getName() {
      return name;
    }

    /**
      * Sets the value of the 'name' field.
      * @param value the value to set.
      */
    public org.apache.hadoop.mapreduce.jobhistory.JhCounter.Builder setName(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.name = value;
      fieldSetFlags()[0] = true;
      return this; 
    }

    /**
      * Checks whether the 'name' field has been set.
      */
    public boolean hasName() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'name' field.
      */
    public org.apache.hadoop.mapreduce.jobhistory.JhCounter.Builder clearName() {
      name = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'displayName' field.
      */
    public java.lang.CharSequence getDisplayName() {
      return displayName;
    }

    /**
      * Sets the value of the 'displayName' field.
      * @param value the value to set.
      */
    public org.apache.hadoop.mapreduce.jobhistory.JhCounter.Builder setDisplayName(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.displayName = value;
      fieldSetFlags()[1] = true;
      return this; 
    }

    /**
      * Checks whether the 'displayName' field has been set.
      */
    public boolean hasDisplayName() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'displayName' field.
      */
    public org.apache.hadoop.mapreduce.jobhistory.JhCounter.Builder clearDisplayName() {
      displayName = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'value' field.
      */
    public java.lang.Long getValue() {
      return value;
    }

    /**
      * Sets the value of the 'value' field.
      * @param value the value to set.
      */
    public org.apache.hadoop.mapreduce.jobhistory.JhCounter.Builder setValue(long value) {
      validate(fields()[2], value);
      this.value = value;
      fieldSetFlags()[2] = true;
      return this; 
    }

    /**
      * Checks whether the 'value' field has been set.
      */
    public boolean hasValue() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'value' field.
      */
    public org.apache.hadoop.mapreduce.jobhistory.JhCounter.Builder clearValue() {
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    public JhCounter build() {
      try {
        JhCounter record = new JhCounter();
        record.name = fieldSetFlags()[0] ? this.name : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.displayName = fieldSetFlags()[1] ? this.displayName : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.value = fieldSetFlags()[2] ? this.value : (java.lang.Long) defaultValue(fields()[2]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
