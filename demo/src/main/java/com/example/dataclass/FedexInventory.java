package com.example.dataclass;

public class FedexInventory {
	private String item_code;
	private String area_id;
	private int count;
	
	public FedexInventory(String item_code, String area_id, int count) {
		super();
		this.item_code = item_code;
		this.area_id = area_id;
		this.count = count;
	}
	
	public String getArea_id() {
		return area_id;
	}
	public void setArea_id(String area_id) {
		this.area_id = area_id;
	}
	public String getItem_code() {
		return item_code;
	}
	public void setItem_code(String item_code) {
		this.item_code = item_code;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	@Override
	public String toString() {
		return "FedexInventory [item_code=" + item_code + ", area_id=" + area_id + ", count="
				+ count + "]";
	}
}
