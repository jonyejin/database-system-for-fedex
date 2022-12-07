package com.example.dataclass;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Payment implements DataClass{
	private String card_number;
	private String customer_id;
	private String card_type;
	private String cvc;
	private String expiration_year;
	private String expiration_month;
	
	public Payment(){

	}
	
	public Payment(String card_number, String customer_id, String card_type, String cvc, String expiration_year,
			String expiration_month) {
		super();
		this.card_number = card_number;
		this.customer_id = customer_id;
		this.card_type = card_type;
		this.cvc = cvc;
		this.expiration_year = expiration_year;
		this.expiration_month = expiration_month;
	}
	
	public String getCard_number() {
		return card_number;
	}
	public void setCard_number(String card_number) {
		this.card_number = card_number;
	}
	public String getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}
	public String getCard_type() {
		return card_type;
	}
	public void setCard_type(String card_type) {
		this.card_type = card_type;
	}
	public String getCvc() {
		return cvc;
	}
	public void setCvc(String cvc) {
		this.cvc = cvc;
	}
	public String getExpiration_year() {
		return expiration_year;
	}
	public void setExpiration_year(String expiration_year) {
		this.expiration_year = expiration_year;
	}
	public String getExpiration_month() {
		return expiration_month;
	}
	public void setExpiration_month(String expiration_month) {
		this.expiration_month = expiration_month;
	}
	@Override
	public String toString() {
		return "Payment [card_number=" + card_number + ", customer_id=" + customer_id + ", card_type=" + card_type
				+ ", cvc=" + cvc + ", expiration_year=" + expiration_year + ", expiration_month=" + expiration_month
				+ "]";
	}

	@Override
	public void SelectTuple(ResultSet rs) {
		// TODO Auto-generated method stub
		try {
			card_number = rs.getString("card_number");
			customer_id = rs.getString("customer_id");
			card_type = rs.getString("card_type");
			cvc = rs.getString("cvc");
			expiration_year = rs.getString("expiration_year");
			expiration_month = rs.getString("expiration_month");
			System.out.println(toString());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
