package com.example;

public class DelegateInfo {
	private String id;
	private String message;
	private String nickname;
	private String cell_phone;
	private String relationship;
	public String getId() {
		return id;
	}
	public DelegateInfo(String id, String message, String nickname, String cell_phone, String relationship) {
		super();
		this.id = id;
		this.message = message;
		this.nickname = nickname;
		this.cell_phone = cell_phone;
		this.relationship = relationship;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getCell_phone() {
		return cell_phone;
	}
	public void setCell_phone(String cell_phone) {
		this.cell_phone = cell_phone;
	}
	public String getRelationship() {
		return relationship;
	}
	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}
	@Override
	public String toString() {
		return "DelegateInfo [id=" + id + ", message=" + message + ", nickname=" + nickname + ", cell_phone="
				+ cell_phone + ", relationship=" + relationship + "]";
	}
}
