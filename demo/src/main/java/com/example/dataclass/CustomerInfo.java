package com.example.dataclass;

public class CustomerInfo {
	private String customer_id;
	private String first_name;
	private String middle_name;
	private String last_name;
	private String house_phone;
	private String cell_phone;
	
	public CustomerInfo(String customer_id, String first_name, String middle_name, String last_name, String house_phone,
			String cell_phone) {
		super();
		this.customer_id = customer_id;
		this.first_name = first_name;
		this.middle_name = middle_name;
		this.last_name = last_name;
		this.house_phone = house_phone;
		this.cell_phone = cell_phone;
	}
	

	public String getCustomerId() {
		return customer_id;
	}

	public void setCustomerId(String customerId) {
		this.customer_id = customerId;
	}

	public String getFirstName() {
		return first_name;
	}

	public void setFirstName(String firstName) {
		this.first_name = firstName;
	}

	public String getMiddleName() {
		return middle_name;
	}

	public void setMiddleName(String middleName) {
		this.middle_name = middleName;
	}

	public String getLastName() {
		return last_name;
	}

	public void setLastName(String lastName) {
		this.last_name = lastName;
	}

	public String getHousePhone() {
		return house_phone;
	}

	public void setHousePhone(String housePhone) {
		this.house_phone = housePhone;
	}

	public String getCellPhone() {
		return cell_phone;
	}

	public void setCellPhone(String cellPhone) {
		this.cell_phone = cellPhone;
	}
	
	@Override
	public String toString() {
		return "CustomerInfo [customer_id=" + customer_id + ", first_name=" + first_name + ", middle_name="
				+ middle_name + ", last_name=" + last_name + ", house_phone=" + house_phone + ", cell_phone="
				+ cell_phone + "]";
	}
}
