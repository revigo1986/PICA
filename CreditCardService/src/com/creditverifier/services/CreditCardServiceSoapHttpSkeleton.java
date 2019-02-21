/**
 * CreditCardServiceSoapHttpSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.creditverifier.services;

public class CreditCardServiceSoapHttpSkeleton implements com.creditverifier.services.CreditCardService_PortType, org.apache.axis.wsdl.Skeleton {
    private com.creditverifier.services.CreditCardService_PortType impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(java.lang.String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.creditverifier.com/", "chargeCreditCardElement"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://services.creditverifier.com/", ">chargeCreditCardElement"), com.creditverifier.services.ChargeCreditCardElement.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("chargeCreditCard", _params, new javax.xml.namespace.QName("http://services.creditverifier.com/", "chargeCreditCardResponseElement"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://services.creditverifier.com/", ">chargeCreditCardResponseElement"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "chargeCreditCard"));
        _oper.setSoapAction("http://services.creditverifier.com//chargeCreditCard");
        _myOperationsList.add(_oper);
        if (_myOperations.get("chargeCreditCard") == null) {
            _myOperations.put("chargeCreditCard", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("chargeCreditCard")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("CreditCardValidationFaultMessage");
        _fault.setQName(new javax.xml.namespace.QName("http://services.creditverifier.com/", "CreditCardValidationFaultMessageElement"));
        _fault.setClassName("com.creditverifier.services.CreditCardValidationFaultMessage");
        _fault.setXmlType(new javax.xml.namespace.QName("http://services.creditverifier.com/", "CreditCardValidationFaultMessage"));
        _oper.addFault(_fault);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.creditverifier.com/", "verifyCreditCardElement"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://services.creditverifier.com/", ">verifyCreditCardElement"), com.creditverifier.services.VerifyCreditCardElement.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("verifyCreditCard", _params, new javax.xml.namespace.QName("http://services.creditverifier.com/", "verifyCreditCardResponseElement"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://services.creditverifier.com/", ">verifyCreditCardResponseElement"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "verifyCreditCard"));
        _oper.setSoapAction("http://services.creditverifier.com//verifyCreditCard");
        _myOperationsList.add(_oper);
        if (_myOperations.get("verifyCreditCard") == null) {
            _myOperations.put("verifyCreditCard", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("verifyCreditCard")).add(_oper);
    }

    public CreditCardServiceSoapHttpSkeleton() {
        this.impl = new com.creditverifier.services.CreditCardServiceSoapHttpImpl();
    }

    public CreditCardServiceSoapHttpSkeleton(com.creditverifier.services.CreditCardService_PortType impl) {
        this.impl = impl;
    }
    public com.creditverifier.services.ChargeCreditCardResponseElement chargeCreditCard(com.creditverifier.services.ChargeCreditCardElement parameters) throws java.rmi.RemoteException, com.creditverifier.services.CreditCardValidationFaultMessage
    {
        com.creditverifier.services.ChargeCreditCardResponseElement ret = impl.chargeCreditCard(parameters);
        return ret;
    }

    public com.creditverifier.services.VerifyCreditCardResponseElement verifyCreditCard(com.creditverifier.services.VerifyCreditCardElement parameters) throws java.rmi.RemoteException
    {
        com.creditverifier.services.VerifyCreditCardResponseElement ret = impl.verifyCreditCard(parameters);
        return ret;
    }

}
