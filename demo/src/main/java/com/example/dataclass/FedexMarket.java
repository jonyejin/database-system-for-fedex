package com.example.dataclass;

import java.sql.ResultSet;
import java.sql.SQLException;

public class FedexMarket  implements DataClass{
	private String item_code;
	private int unit_measure_size_type;
	private int unit_measure_weight_type;
	private String item_name;
	private int item_price;
	private float weight;
	private float width;
	private float height;
	private float depth;
	
	public FedexMarket(String item_code, int unit_measure_size_type, int unit_measure_weight_type, String item_name,
			int item_price, float weight, float width, float height, float depth) {
		super();
		this.item_code = item_code;
		this.unit_measure_size_type = unit_measure_size_type;
		this.unit_measure_weight_type = unit_measure_weight_type;
		this.item_name = item_name;
		this.item_price = item_price;
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
				+ ", item_price=" + item_price + ", weight=" + weight + ", width=" + width
				+ ", height=" + height + ", depth=" + depth + "]";
	}
	@Override
	public void SelectTuple(ResultSet rs) {
		// TODO Auto-generated method stub
		try {
			while(rs.next()) {
				this.item_code = rs.getString("item_code");
				this.unit_measure_size_type = rs.getInt("unit_measure_size_type");
				this.unit_measure_weight_type = rs.getInt("unit_measure_weight_type");
				this.item_name = rs.getString("item_name");
				this.item_price = rs.getInt("item_price");
				this.weight = rs.getFloat("weight");
				this.width = rs.getFloat("width");
				this.height = rs.getFloat("height");
				this.depth = rs.getFloat("depth");
				
				toString();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
