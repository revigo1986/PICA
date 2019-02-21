/**
 * CreditCardService_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.creditverifier.services;

public interface CreditCardService_PortType extends java.rmi.Remote {
    public com.creditverifier.services.ChargeCreditCardResponseElement chargeCreditCard(com.creditverifier.services.ChargeCreditCardElement parameters) throws java.rmi.RemoteException, com.creditverifier.services.CreditCardValidationFaultMessage;
    public com.creditverifier.services.VerifyCreditCardResponseElement verifyCreditCard(com.creditverifier.services.VerifyCreditCardElement parameters) throws java.rmi.RemoteException;
}
