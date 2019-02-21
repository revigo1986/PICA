package com.persistencia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class CreditCardDAO {
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
    public CreditCardDAO(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
    }
	
	public CreditCardDAO() {
		// TODO Auto-generated constructor stub
	}

	public CreditCard getCreditCardById(String creditCardNumber) {
		String sql = "SELECT TYPE, MOUNT, PK_CARD_NUMBER FROM CREDIT_CARD WHERE PK_CARD_NUMBER = ?";
		RowMapper<CreditCard> rowMapper = new BeanPropertyRowMapper<CreditCard>(CreditCard.class);
		String c = creditCardNumber;
		CreditCard creditCard = jdbcTemplate.queryForObject(sql, rowMapper, creditCardNumber);
		return creditCard;
	}
}
