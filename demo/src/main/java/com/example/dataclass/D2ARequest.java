package com.example.dataclass;

import java.sql.ResultSet;
import java.sql.SQLException;

public class D2ARequest  implements DataClass{
	private String customer_id;
	private String whole_request_id;
	private String worker_id;
	private String plate_number;
	private String warehouse_id;
	private int from_d;
	private int is_done;
	private String done_time_stamp;
	
	public D2ARequest(String customer_id, String whole_request_id, String worker_id, String plate_number,
			String warehouse_id, int from_d, int is_done, String done_time_stamp) {
		super();
		this.customer_id = customer_id;
		this.whole_request_id = whole_request_id;
		this.worker_id = worker_id;
		this.plate_number = plate_number;
		this.warehouse_id = warehouse_id;
		this.from_d = from_d;
		this.is_done = is_done;
		this.done_time_stamp = done_time_stamp;
	}
	
	public String getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
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
	public String getWarehouse_id() {
		return warehouse_id;
	}
	public void setWarehouse_id(String warehouse_id) {
		this.warehouse_id = warehouse_id;
	}
	public int getFrom_d() {
		return from_d;
	}
	public void setFrom_d(int from_d) {
		this.from_d = from_d;
	}
	public int getIs_done() {
		return is_done;
	}
	public void setIs_done(int is_done) {
		this.is_done = is_done;
	}
	public String getDone_time_stamp() {
		return done_time_stamp;
	}
	public void setDone_time_stamp(String done_time_stamp) {
		this.done_time_stamp = done_time_stamp;
	}
	
	@Override
	public String toString() {
		return "D2ARequest [customer_id=" + customer_id + ", whole_request_id=" + whole_request_id + ", worker_id="
				+ worker_id + ", plate_number=" + plate_number + ", warehouse_id=" + warehouse_id + ", from_d=" + from_d
				+ ", is_done=" + is_done + ", done_time_stamp=" + done_time_stamp + "]";
	}

	@Override
	public void SelectTuple(ResultSet rs) {
		// TODO Auto-generated method stub
		try {
			while(rs.next()) {
				this.customer_id = rs.getString("customer_id");
				this.whole_request_id = rs.getString("whole_request_id");
				this.worker_id = rs.getString("worker_id");
				this.plate_number = rs.getString("plate_number");
				this.warehouse_id = rs.getString("warehouse_id");
				this.from_d = rs.getInt("from_d");
				this.from_d = rs.getInt("from_d");
				this.done_time_stamp = rs.getString("done_time_stamp");
				toString();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
