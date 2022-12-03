package com.example;

public class BoardAnswer {
	private String complaint_id;
	private String cs_worker_id;
	private String title;
	private String body;
	
	public BoardAnswer(String complaint_id, String cs_worker_id, String title, String body) {
		super();
		this.complaint_id = complaint_id;
		this.cs_worker_id = cs_worker_id;
		this.title = title;
		this.body = body;
	}
	
	public String getComplaint_id() {
		return complaint_id;
	}
	public void setComplaint_id(String complaint_id) {
		this.complaint_id = complaint_id;
	}
	public String getCs_worker_id() {
		return cs_worker_id;
	}
	public void setCs_worker_id(String cs_worker_id) {
		this.cs_worker_id = cs_worker_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	
	@Override
	public String toString() {
		return "CustomerServiceAnswer [complaint_id=" + complaint_id + ", cs_worker_id=" + cs_worker_id + ", title="
				+ title + ", body=" + body + "]";
	}
}
