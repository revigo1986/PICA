package com.componentes;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.persistencia.CreditCard;
import com.persistencia.CreditCardDAO;

@RestController
public class ControladorServicio {

	@RequestMapping(path = "/verifyCreditCardElement/{type}/{mount}/{number}", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public CreditCard verifyCreditCardElement(@PathVariable("type") String type, @PathVariable("mount") int mount,
			@PathVariable("number") String number) {
//		return Boolean.TRUE;
		return new CreditCardDAO().getCreditCardById(number);
	}

	@RequestMapping(path = "/chargeCreditCardElement/{type}/{mount}/{number}", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public Boolean chargeCreditCardElement(@PathVariable("type") String type, @PathVariable("mount") int mount,
			@PathVariable("number") String number) {
		return Boolean.TRUE;
	}
	
	@RequestMapping(path = "/payCreditCardElement/{value}/{orderId}/{cardNumber}/{clientId}", method = RequestMethod.POST, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public Boolean payCreditCardElement(@PathVariable("value") String value, @PathVariable("orderId") int orderId,
			@PathVariable("cardNumber") String cardNumber, @PathVariable("clientId") int clientId) {
		return Boolean.TRUE;
	}
}
