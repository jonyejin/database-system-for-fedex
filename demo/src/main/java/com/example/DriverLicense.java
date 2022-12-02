package com.example;

public class DriverLicense {
	private int license_type;
	private int nation_type;
	
	public DriverLicense(int license_type, int nation_type) {
		super();
		this.license_type = license_type;
		this.nation_type = nation_type;
	}
	public int getLicense_type() {
		return license_type;
	}
	public void setLicense_type(int license_type) {
		this.license_type = license_type;
	}
	public int getNation_type() {
		return nation_type;
	}
	public void setNation_type(int nation_type) {
		this.nation_type = nation_type;
	}
	
	@Override
	public String toString() {
		return "DriverLicense [license_type=" + license_type + ", nation_type=" + nation_type + "]";
	}
}
