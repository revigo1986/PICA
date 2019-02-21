/**
 * VerifyCreditCardElement.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.creditverifier.services;

public class VerifyCreditCardElement  implements java.io.Serializable {
    private com.creditverifier.services.types.CreditCard cc;

    public VerifyCreditCardElement() {
    }

    public VerifyCreditCardElement(
           com.creditverifier.services.types.CreditCard cc) {
           this.cc = cc;
    }


    /**
     * Gets the cc value for this VerifyCreditCardElement.
     * 
     * @return cc
     */
    public com.creditverifier.services.types.CreditCard getCc() {
        return cc;
    }


    /**
     * Sets the cc value for this VerifyCreditCardElement.
     * 
     * @param cc
     */
    public void setCc(com.creditverifier.services.types.CreditCard cc) {
        this.cc = cc;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VerifyCreditCardElement)) return false;
        VerifyCreditCardElement other = (VerifyCreditCardElement) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cc==null && other.getCc()==null) || 
             (this.cc!=null &&
              this.cc.equals(other.getCc())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCc() != null) {
            _hashCode += getCc().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VerifyCreditCardElement.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.creditverifier.com/", ">verifyCreditCardElement"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://services.creditverifier.com/", "cc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://services.creditverifier.com/types/", "CreditCard"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
