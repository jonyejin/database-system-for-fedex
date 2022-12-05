package com.example.dataclass;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerOrganization  implements DataClass{
	private String name;
	private String customer_id;
	private String phone;
	
	public CustomerOrganization(String name, String customer_id, String phone) {
		super();
		this.name = name;
		this.customer_id = customer_id;
		this.phone = phone;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "CustomerOrganization [name=" + name + ", customer_id=" + customer_id + ", phone=" + phone + "]";
	}

	@Override
	public void SelectTuple(ResultSet rs) {
		try {
			while(rs.next()) {
				this.name = rs.getString("name");
				this.customer_id = rs.getString("customer_id");
				this.phone = rs.getString("phone");
				toString();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
