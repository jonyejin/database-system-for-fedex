package com.example.dataclass;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DriverInfo  implements DataClass{
	private String worker_id;
	private String vehicle_id; //=plate_number
	private String license_type;
	
	public DriverInfo() {}
	public DriverInfo(String worker_id, String vehicle_id, String license_type) {
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
	public String getLicense_type() {
		return license_type;
	}
	public void setLicense_type(String license_type) {
		this.license_type = license_type;
	}
	@Override
	public String toString() {
		return "DriverInfo [worker_id=" + worker_id + ", vehicle_id=" + vehicle_id + ", license_type=" + license_type
				+ "]";
	}

	@Override
	public void SelectTuple(ResultSet rs) {
		// TODO Auto-generated method stub
		try {
			while(rs.next()) {
				this.worker_id = rs.getString("worker_id");
				this.vehicle_id = rs.getString("vehicle_id");
				this.license_type = rs.getString("license_type");
				System.out.println(toString());
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
