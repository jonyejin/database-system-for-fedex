package com.example.dataclass;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerAddress implements DataClass{
	private String address_1;
	private String address_2;
	private String customer_id;
	private String country_region;
	private String town_city;
	private String province_territory;
	private int zip;
	private long pccc;
	private int building_pwd;
	
	public CustomerAddress(String address_1, String address_2, String customer_id, String country_region,
			String town_city, String province_territory, int zip, long pccc, int building_pwd) {
		super();
		this.address_1 = address_1;
		this.address_2 = address_2;
		this.customer_id = customer_id;
		this.country_region = country_region;
		this.town_city = town_city;
		this.province_territory = province_territory;
		this.zip = zip;
		this.pccc = pccc;
		this.building_pwd = building_pwd;
	}
	
	public String getAddress_1() {
		return address_1;
	}
	public void setAddress_1(String address_1) {
		this.address_1 = address_1;
	}
	public String getAddress_2() {
		return address_2;
	}
	public void setAddress_2(String address_2) {
		this.address_2 = address_2;
	}
	public String getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}
	public String getCountry_region() {
		return country_region;
	}
	public void setCountry_region(String country_region) {
		this.country_region = country_region;
	}
	public String getTown_city() {
		return town_city;
	}
	public void setTown_city(String town_city) {
		this.town_city = town_city;
	}
	public String getProvince_territory() {
		return province_territory;
	}
	public void setProvince_territory(String province_territory) {
		this.province_territory = province_territory;
	}
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	public long getPccc() {
		return pccc;
	}
	public void setPccc(long pccc) {
		this.pccc = pccc;
	}
	public int getBuilding_pwd() {
		return building_pwd;
	}
	public void setBuilding_pwd(int building_pwd) {
		this.building_pwd = building_pwd;
	}

	@Override
	public String toString() {
		return "CustomerAddress [address_1=" + address_1 + ", address_2=" + address_2 + ", customer_id=" + customer_id
				+ ", country_region=" + country_region + ", town_city=" + town_city + ", province_territory="
				+ province_territory + ", zip=" + zip + ", pccc=" + pccc + ", building_pwd=" + building_pwd + "]";
	}

	@Override
	public void SelectTuple(ResultSet rs) {
		// TODO Auto-generated method stub
		try {
			while(rs.next()) {
				this.address_1 = rs.getString("address_1");
				this.address_2 = rs.getString("address_2");
				this.customer_id = rs.getString("customer_id");
				this.country_region = rs.getString("country_region");
				this.town_city = rs.getString("town_city");
				this.province_territory = rs.getString("province_territory");
				this.zip = rs.getInt("zip");
				this.pccc = rs.getLong("pccc");
				this.building_pwd = rs.getInt("building_pwd");
				toString();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
