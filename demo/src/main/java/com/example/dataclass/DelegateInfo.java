package com.example.dataclass;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DelegateInfo  implements DataClass{
	private String whole_request_id;
	private String message;
	private String nickname;
	private String cell_phone;
	private String relationship;
	
	public DelegateInfo(String id, String message, String nickname, String cell_phone, String relationship) {
		super();
		this.whole_request_id = id;
		this.message = message;
		this.nickname = nickname;
		this.cell_phone = cell_phone;
		this.relationship = relationship;
	}

	public String getId() {
		return whole_request_id;
	}
	public void setId(String id) {
		this.whole_request_id = id;
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
		return "DelegateInfo [id=" + whole_request_id + ", message=" + message + ", nickname=" + nickname + ", cell_phone="
				+ cell_phone + ", relationship=" + relationship + "]";
	}

	@Override
	public void SelectTuple(ResultSet rs) {
		// TODO Auto-generated method stub
		try {
			while(rs.next()) {
				this.whole_request_id = rs.getString("whole_request_id");
				this.message = rs.getString("message");
				this.nickname = rs.getString("nickname");
				this.cell_phone = rs.getString("cell_phone");
				this.relationship = rs.getString("relationship");

				toString();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
