/**
 * CreditCardServiceSoapHttpImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.creditverifier.services;

public class CreditCardServiceSoapHttpImpl implements com.creditverifier.services.CreditCardService_PortType{
    public com.creditverifier.services.ChargeCreditCardResponseElement chargeCreditCard(com.creditverifier.services.ChargeCreditCardElement parameters) throws java.rmi.RemoteException, com.creditverifier.services.CreditCardValidationFaultMessage {
    	ChargeCreditCardResponseElement charge = new ChargeCreditCardResponseElement();
    	charge.setResult(true);
        return charge;
    }

    public com.creditverifier.services.VerifyCreditCardResponseElement verifyCreditCard(com.creditverifier.services.VerifyCreditCardElement parameters) throws java.rmi.RemoteException {
    	VerifyCreditCardResponseElement verify = new VerifyCreditCardResponseElement();
    	verify.setResult(true);
        return verify;
    }

}
