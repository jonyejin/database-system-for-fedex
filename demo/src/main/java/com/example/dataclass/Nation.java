package com.example.dataclass;

public class Nation {
	private String nation_type;

	public Nation(String nation_type) {
		super();
		this.nation_type = nation_type;
	}

	public String getNation_type() {
		return nation_type;
	}
	public void setNation_type(String nation_type) {
		this.nation_type = nation_type;
	}

	@Override
	public String toString() {
		return "Nation [nation_type=" + nation_type + "]";
	}

}
