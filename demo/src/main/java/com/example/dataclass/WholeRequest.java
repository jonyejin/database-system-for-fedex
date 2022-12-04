package com.example.dataclass;

public class WholeRequest {
	private String id;
	private String sender_address_id;
	private String customer_id;
	private String parcel_id;
	private String time_stamp;
	private int departure_area_id;
	private int arrival_area_id;
	private String receiver_address_id;
	private String receiver_id;
	
	public WholeRequest(String id, String sender_address_id, String customer_id, String parcel_id, String time_stamp,
			int departure_area_id, int arrival_area_id, String receiver_address_id, String receiver_id) {
		super();
		this.id = id;
		this.sender_address_id = sender_address_id;
		this.customer_id = customer_id;
		this.parcel_id = parcel_id;
		this.time_stamp = time_stamp;
		this.departure_area_id = departure_area_id;
		this.arrival_area_id = arrival_area_id;
		this.receiver_address_id = receiver_address_id;
		this.receiver_id = receiver_id;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSender_address_id() {
		return sender_address_id;
	}
	public void setSender_address_id(String sender_address_id) {
		this.sender_address_id = sender_address_id;
	}
	public String getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}
	public String getParcel_id() {
		return parcel_id;
	}
	public void setParcel_id(String parcel_id) {
		this.parcel_id = parcel_id;
	}
	public String getTime_stamp() {
		return time_stamp;
	}
	public void setTime_stamp(String time_stamp) {
		this.time_stamp = time_stamp;
	}
	public int getDeparture_area_id() {
		return departure_area_id;
	}
	public void setDeparture_area_id(int departure_area_id) {
		this.departure_area_id = departure_area_id;
	}
	public int getArrival_area_id() {
		return arrival_area_id;
	}
	public void setArrival_area_id(int arrival_area_id) {
		this.arrival_area_id = arrival_area_id;
	}
	public String getReceiver_address_id() {
		return receiver_address_id;
	}
	public void setReceiver_address_id(String receiver_address_id) {
		this.receiver_address_id = receiver_address_id;
	}
	public String getReceiver_id() {
		return receiver_id;
	}
	public void setReceiver_id(String receiver_id) {
		this.receiver_id = receiver_id;
	}
	
	@Override
	public String toString() {
		return "WholeRequest [id=" + id + ", sender_address_id=" + sender_address_id + ", customer_id=" + customer_id
				+ ", parcel_id=" + parcel_id + ", time_stamp=" + time_stamp + ", departure_area_id=" + departure_area_id
				+ ", arrival_area_id=" + arrival_area_id + ", receiver_address_id=" + receiver_address_id
				+ ", receiver_id=" + receiver_id + "]";
	}

}
