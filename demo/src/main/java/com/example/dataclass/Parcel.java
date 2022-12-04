package com.example.dataclass;

public class Parcel {
	private String parcel_id;
	private String customer_id;
	private int unit_measure_size_type;
	private int unit_measure_weight_type;
	private float weight;
	private float width;
	private float depth;
	private int is_fragile;
	
	public Parcel(String parcel_id, String customer_id, int unit_measure_size_type, int unit_measure_weight_type,
			float weight, float width, float depth, int is_fragile) {
		super();
		this.parcel_id = parcel_id;
		this.customer_id = customer_id;
		this.unit_measure_size_type = unit_measure_size_type;
		this.unit_measure_weight_type = unit_measure_weight_type;
		this.weight = weight;
		this.width = width;
		this.depth = depth;
		this.is_fragile = is_fragile;
	}
	
	public String getParcel_id() {
		return parcel_id;
	}
	public void setParcel_id(String parcel_id) {
		this.parcel_id = parcel_id;
	}
	public String getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
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
	public float getDepth() {
		return depth;
	}
	public void setDepth(float depth) {
		this.depth = depth;
	}
	public int getIs_fragile() {
		return is_fragile;
	}
	public void setIs_fragile(int is_fragile) {
		this.is_fragile = is_fragile;
	}
	
	@Override
	public String toString() {
		return "Parcel [parcel_id=" + parcel_id + ", customer_id=" + customer_id + ", unit_measure_size_type="
				+ unit_measure_size_type + ", unit_measure_weight_type=" + unit_measure_weight_type + ", weight="
				+ weight + ", width=" + width + ", depth=" + depth + ", is_fragile=" + is_fragile + "]";
	}

}
