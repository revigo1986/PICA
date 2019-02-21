package com.persistencia;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class CreditCardRowMapper implements RowMapper<CreditCard> {
	@Override
	public CreditCard mapRow(ResultSet row, int rowNum) throws SQLException {
		CreditCard creditCard = new CreditCard();
		creditCard.setType(row.getString("TYPE"));
		creditCard.setMount(row.getInt("MOUNT"));
		creditCard.setCardNumber(row.getString("PK_CARD_NUMBER"));
		return creditCard;
	}
}
