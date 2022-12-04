package com.example.dataclass;

public class Vehicle {
	private String plate_number;
	private String nation_type;
	private String type;
	private int width;
	private int height;
	private int depth;

	public Vehicle(String plate_number, String nation_type, String type, int width, int height, int depth) {
		super();
		this.plate_number = plate_number;
		this.nation_type = nation_type;
		this.type = type;
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	
	public String getPlate_number() {
		return plate_number;
	}
	public void setPlate_number(String plate_number) {
		this.plate_number = plate_number;
	}
	public String getNation_type() {
		return nation_type;
	}
	public void setNation_type(String nation_type) {
		this.nation_type = nation_type;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getDepth() {
		return depth;
	}
	public void setDepth(int depth) {
		this.depth = depth;
	}
	
	@Override
	public String toString() {
		return "Vehicle [plate_number=" + plate_number + ", nation_type=" + nation_type + ", type=" + type + ", width="
				+ width + ", height=" + height + ", depth=" + depth + "]";
	}
}
