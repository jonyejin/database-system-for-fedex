package com.example;

public class Area {
	private String area_id;
	
	public Area(String area_id) {
		super();
		this.area_id = area_id;
	}

	public String getArea_id() {
		return area_id;
	}
	public void setArea_id(String area_id) {
		this.area_id = area_id;
	}

	@Override
	public String toString() {
		return "Area [area_id=" + area_id + "]";
	}

	
}
