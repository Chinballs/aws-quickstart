/**
 * EnumCompareResults.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.trendmicro.webserviceclient.generated;

public class EnumCompareResults implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected EnumCompareResults(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _LESS_THAN = "LESS_THAN";
    public static final java.lang.String _EQUAL_TO = "EQUAL_TO";
    public static final java.lang.String _GREATER_THAN = "GREATER_THAN";
    public static final java.lang.String _INCOMPATABLE = "INCOMPATABLE";
    public static final EnumCompareResults LESS_THAN = new EnumCompareResults(_LESS_THAN);
    public static final EnumCompareResults EQUAL_TO = new EnumCompareResults(_EQUAL_TO);
    public static final EnumCompareResults GREATER_THAN = new EnumCompareResults(_GREATER_THAN);
    public static final EnumCompareResults INCOMPATABLE = new EnumCompareResults(_INCOMPATABLE);
    public java.lang.String getValue() { return _value_;}
    public static EnumCompareResults fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        EnumCompareResults enumeration = (EnumCompareResults)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static EnumCompareResults fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EnumCompareResults.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:Manager", "EnumCompareResults"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
