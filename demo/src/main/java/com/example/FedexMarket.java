package com.example;

public class FedexMarket {
	private String item_code;
	private int unit_measure_size_type;
	private int unit_measure_weight_type;
	private String item_name;
	private int item_price;
	private String item_type;
	private float weight;
	private float width;
	private float height;
	private float depth;
	
	public FedexMarket(String item_code, int unit_measure_size_type, int unit_measure_weight_type, String item_name,
			int item_price, String item_type, float weight, float width, float height, float depth) {
		super();
		this.item_code = item_code;
		this.unit_measure_size_type = unit_measure_size_type;
		this.unit_measure_weight_type = unit_measure_weight_type;
		this.item_name = item_name;
		this.item_price = item_price;
		this.item_type = item_type;
		this.weight = weight;
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	public String getItem_code() {
		return item_code;
	}
	public void setItem_code(String item_code) {
		this.item_code = item_code;
	}
	public int getUnit_measure_size_type() {
		return unit_measure_size_type;
	}
	public void setUnit_measure_size_type(int unit_measure_size_type) {
		this.unit_measure_size_type = unit_measure_size_type;
	}
	public int getUnit_measure_weight_type() {
		return unit_measure_weight_type;
	}
	public void setUnit_measure_weight_type(int unit_measure_weight_type) {
		this.unit_measure_weight_type = unit_measure_weight_type;
	}
	public String getItem_name() {
		return item_name;
	}
	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}
	public int getItem_price() {
		return item_price;
	}
	public void setItem_price(int item_price) {
		this.item_price = item_price;
	}
	public String getItem_type() {
		return item_type;
	}
	public void setItem_type(String item_type) {
		this.item_type = item_type;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public float getWidth() {
		return width;
	}
	public void setWidth(float width) {
		this.width = width;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public float getDepth() {
		return depth;
	}
	public void setDepth(float depth) {
		this.depth = depth;
	}
	@Override
	public String toString() {
		return "FedexMarket [item_code=" + item_code + ", unit_measure_size_type=" + unit_measure_size_type
				+ ", unit_measure_weight_type=" + unit_measure_weight_type + ", item_name=" + item_name
				+ ", item_price=" + item_price + ", item_type=" + item_type + ", weight=" + weight + ", width=" + width
				+ ", height=" + height + ", depth=" + depth + "]";
	}
}
