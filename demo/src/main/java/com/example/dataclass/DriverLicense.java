package com.example.dataclass;

public class DriverLicense {
	private String license_type;
	private String nation_type;
	
	public DriverLicense(String license_type, String nation_type) {
		super();
		this.license_type = license_type;
		this.nation_type = nation_type;
	}
	public String getLicense_type() {
		return license_type;
	}
	public void setLicense_type(String license_type) {
		this.license_type = license_type;
	}
	public String getNation_type() {
		return nation_type;
	}
	public void setNation_type(String nation_type) {
		this.nation_type = nation_type;
	}
	
	@Override
	public String toString() {
		return "DriverLicense [license_type=" + license_type + ", nation_type=" + nation_type + "]";
	}
}
