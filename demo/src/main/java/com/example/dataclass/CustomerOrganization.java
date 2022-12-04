package com.example.dataclass;

public class CustomerOrganization {
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
}
