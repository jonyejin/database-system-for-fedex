package com.example.dataclass;

public class Nation {
	private int nation_type;

	public Nation(int nation_type) {
		super();
		this.nation_type = nation_type;
	}

	public int getNation_type() {
		return nation_type;
	}
	public void setNation_type(int nation_type) {
		this.nation_type = nation_type;
	}

	@Override
	public String toString() {
		return "Nation [nation_type=" + nation_type + "]";
	}

}
