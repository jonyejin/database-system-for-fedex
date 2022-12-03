package com.example;

public class DriverInfo {
	private String worker_id;
	private String vehicle_id;
	private int license_type;
	
	public DriverInfo(String worker_id, String vehicle_id, int license_type) {
		super();
		this.worker_id = worker_id;
		this.vehicle_id = vehicle_id;
		this.license_type = license_type;
	}
	
	public String getWorker_id() {
		return worker_id;
	}
	public void setWorker_id(String worker_id) {
		this.worker_id = worker_id;
	}
	public String getVehicle_id() {
		return vehicle_id;
	}
	public void setVehicle_id(String vehicle_id) {
		this.vehicle_id = vehicle_id;
	}
	public int getLicense_type() {
		return license_type;
	}
	public void setLicense_type(int license_type) {
		this.license_type = license_type;
	}
	@Override
	public String toString() {
		return "DriverInfo [worker_id=" + worker_id + ", vehicle_id=" + vehicle_id + ", license_type=" + license_type
				+ "]";
	}
}
