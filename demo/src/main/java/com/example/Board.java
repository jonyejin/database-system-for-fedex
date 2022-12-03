package com.example;

public class Board {
	private String complaint_id;
	private String whole_request_id;
	private int question_type;
	private String title;
	private String body;
	private int is_answered;
	
	public Board(String complaint_id, String whole_request_id, int question_type, String title, String body,
			int is_answered) {
		super();
		this.complaint_id = complaint_id;
		this.whole_request_id = whole_request_id;
		this.question_type = question_type;
		this.title = title;
		this.body = body;
		this.is_answered = is_answered;
	}
	
	public String getComplaint_id() {
		return complaint_id;
	}
	public void setComplaint_id(String complaint_id) {
		this.complaint_id = complaint_id;
	}
	public String getWhole_request_id() {
		return whole_request_id;
	}
	public void setWhole_request_id(String whole_request_id) {
		this.whole_request_id = whole_request_id;
	}
	public int getQuestion_type() {
		return question_type;
	}
	public void setQuestion_type(int question_type) {
		this.question_type = question_type;
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
	public int getIs_answered() {
		return is_answered;
	}
	public void setIs_answered(int is_answered) {
		this.is_answered = is_answered;
	}
	
	@Override
	public String toString() {
		return "CustomerService [complaint_id=" + complaint_id + ", whole_request_id=" + whole_request_id
				+ ", question_type=" + question_type + ", title=" + title + ", body=" + body + ", is_answered="
				+ is_answered + "]";
	}
}
