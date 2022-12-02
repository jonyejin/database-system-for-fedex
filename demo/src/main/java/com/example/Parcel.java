package com.example;

public class Parcel {
	private String parcel_id;
	private String customer_id;
	private String unit_measure_size_type;
	private String unit_measure_weight_type;
	private String weight;
	private String width;
	private String depth;
	private String is_fragile;
	
	public Parcel(String parcel_id, String customer_id, String unit_measure_size_type, String unit_measure_weight_type,
			String weight, String width, String depth, String is_fragile) {
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
	public String getUnit_measure_size_type() {
		return unit_measure_size_type;
	}
	public void setUnit_measure_size_type(String unit_measure_size_type) {
		this.unit_measure_size_type = unit_measure_size_type;
	}
	public String getUnit_measure_weight_type() {
		return unit_measure_weight_type;
	}
	public void setUnit_measure_weight_type(String unit_measure_weight_type) {
		this.unit_measure_weight_type = unit_measure_weight_type;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getWidth() {
		return width;
	}
	public void setWidth(String width) {
		this.width = width;
	}
	public String getDepth() {
		return depth;
	}
	public void setDepth(String depth) {
		this.depth = depth;
	}
	public String getIs_fragile() {
		return is_fragile;
	}
	public void setIs_fragile(String is_fragile) {
		this.is_fragile = is_fragile;
	}
	
	@Override
	public String toString() {
		return "Parcel [parcel_id=" + parcel_id + ", customer_id=" + customer_id + ", unit_measure_size_type="
				+ unit_measure_size_type + ", unit_measure_weight_type=" + unit_measure_weight_type + ", weight="
				+ weight + ", width=" + width + ", depth=" + depth + ", is_fragile=" + is_fragile + "]";
	}

}
