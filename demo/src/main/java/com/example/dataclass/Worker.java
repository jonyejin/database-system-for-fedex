package com.example.dataclass;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Worker implements DataClass{
	private String worker_id;
	private String area_id;
	private String first_name;
	private String middle_name;
	private String last_name;
	private String house_phone;
	private String cell_phone;
	private String doe;

	public Worker(String worker_id, String area_id, String first_name, String middle_name, String last_name,
			String house_phone, String cell_phone, String doe) {
		super();
		this.worker_id = worker_id;
		this.area_id = area_id;
		this.first_name = first_name;
		this.middle_name = middle_name;
		this.last_name = last_name;
		this.house_phone = house_phone;
		this.cell_phone = cell_phone;
		this.doe = doe;
	}
	
	public String getWorker_id() {
		return worker_id;
	}
	public void setWorker_id(String worker_id) {
		this.worker_id = worker_id;
	}
	public String getArea_id() {
		return area_id;
	}
	public void setArea_id(String area_id) {
		this.area_id = area_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getMiddle_name() {
		return middle_name;
	}
	public void setMiddle_name(String middle_name) {
		this.middle_name = middle_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getHouse_phone() {
		return house_phone;
	}
	public void setHouse_phone(String house_phone) {
		this.house_phone = house_phone;
	}
	public String getCell_phone() {
		return cell_phone;
	}
	public void setCell_phone(String cell_phone) {
		this.cell_phone = cell_phone;
	}
	public String getDoe() {
		return doe;
	}
	public void setDoe(String doe) {
		this.doe = doe;
	}
	@Override
	public String toString() {
		return "Worker [worker_id=" + worker_id + ", area_id=" + area_id + ", first_name=" + first_name
				+ ", middle_name=" + middle_name + ", last_name=" + last_name + ", house_phone=" + house_phone
				+ ", cell_phone=" + cell_phone + ", doe=" + doe + "]";
	}

	@Override
	public void SelectTuple(ResultSet rs) {
		// TODO Auto-generated method stub
		try{
			worker_id = rs.getString("worker_id");
			area_id = rs.getString("area_id");
			first_name = rs.getString("first_name");
			middle_name = rs.getString("middle_name");
			last_name = rs.getString("last_name");
			house_phone = rs.getString("house_phone");
			cell_phone = rs.getString("cell_phone");
			doe = rs.getString("doe");
			toString();
		}
		catch(SQLException e){
			e.printStackTrace();
		}
	}
}
