package com.example;

public class PickUp {
	private String id;
	private int is_delegate;
	private int is_untact;
	private String message;
	
	public PickUp(String id, int is_delegate, int is_untact, String message) {
		super();
		this.id = id;
		this.is_delegate = is_delegate;
		this.is_untact = is_untact;
		this.message = message;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getIs_delegate() {
		return is_delegate;
	}
	public void setIs_delegate(int is_delegate) {
		this.is_delegate = is_delegate;
	}
	public int getIs_untact() {
		return is_untact;
	}
	public void setIs_untact(int is_untact) {
		this.is_untact = is_untact;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	@Override
	public String toString() {
		return "PickUp [id=" + id + ", is_delegate=" + is_delegate + ", is_untact=" + is_untact + ", message=" + message
				+ "]";
	}
}
