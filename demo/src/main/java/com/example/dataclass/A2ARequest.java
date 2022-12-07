package com.example.dataclass;

import java.sql.ResultSet;
import java.sql.SQLException;

public class A2ARequest implements DataClass {
	private String a2a_id;
	private String whole_request_id;
	private String worker_id;
	private String plate_number;
	private int is_done;
	private int departure;
	private int arrival;
	private String done_time_stamp;

	public A2ARequest(){
		
	}
	
	public A2ARequest(String a2a_id, String whole_request_id, String worker_id, String plate_number, int is_done,
			int departure, int arrival, String done_time_stamp) {
		super();
		this.a2a_id = a2a_id;
		this.whole_request_id = whole_request_id;
		this.worker_id = worker_id;
		this.plate_number = plate_number;
		this.is_done = is_done;
		this.departure = departure;
		this.arrival = arrival;
		this.done_time_stamp = done_time_stamp;
	}
	
	public String getA2a_id() {
		return a2a_id;
	}
	public void setA2a_id(String a2a_id) {
		this.a2a_id = a2a_id;
	}
	public String getWhole_request_id() {
		return whole_request_id;
	}
	public void setWhole_request_id(String whole_request_id) {
		this.whole_request_id = whole_request_id;
	}
	public String getWorker_id() {
		return worker_id;
	}
	public void setWorker_id(String worker_id) {
		this.worker_id = worker_id;
	}
	public String getPlate_number() {
		return plate_number;
	}
	public void setPlate_number(String plate_number) {
		this.plate_number = plate_number;
	}
	public int getIs_done() {
		return is_done;
	}
	public void setIs_done(int is_done) {
		this.is_done = is_done;
	}
	public int getDeparture() {
		return departure;
	}
	public void setDeparture(int departure) {
		this.departure = departure;
	}
	public int getArrival() {
		return arrival;
	}
	public void setArrival(int arrival) {
		this.arrival = arrival;
	}
	public String getDone_time_stamp() {
		return done_time_stamp;
	}
	public void setDone_time_stamp(String done_time_stamp) {
		this.done_time_stamp = done_time_stamp;
	}
	
	@Override
	public String toString() {
		return "A2ARequest [a2a_id=" + a2a_id + ", whole_request_id=" + whole_request_id + ", worker_id=" + worker_id
				+ ", plate_number=" + plate_number + ", is_done=" + is_done + ", departure=" + departure + ", arrival="
				+ arrival + ", done_time_stamp=" + done_time_stamp + "]";
	}

	@Override
	public void SelectTuple(ResultSet rs) {
		// TODO Auto-generated method stub
		try {
			while(rs.next()) {
				this.a2a_id = rs.getString("a2a_id");
				this.whole_request_id = rs.getString("whole_request_id");
				this.worker_id = rs.getString("worker_id");
				this.plate_number = rs.getString("plate_number");
				this.is_done = rs.getInt("is_done");
				this.departure = rs.getInt("departure");
				this.arrival = rs.getInt("arrival");
				this.done_time_stamp = rs.getString("done_time_stamp");
				System.out.println(toString());
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
