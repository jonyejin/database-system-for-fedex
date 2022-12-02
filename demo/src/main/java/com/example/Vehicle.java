package com.example;

public class Vehicle {
	private String plate_number;
	private int nation_type;
	private int type;
	private int width;
	private int height;
	private int depth;

	public Vehicle(String plate_number, int nation_type, int type, int width, int height, int depth) {
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
	public int getNation_type() {
		return nation_type;
	}
	public void setNation_type(int nation_type) {
		this.nation_type = nation_type;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
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
