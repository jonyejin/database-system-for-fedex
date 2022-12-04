package com.example.dataclass;

public class Warehouse {
	private String warehouse_id;
	private String warehouse_area;
	private String warehouse_name;
	
	public Warehouse(String warehouse_id, String warehouse_area, String warehouse_name) {
		super();
		this.warehouse_id = warehouse_id;
		this.warehouse_area = warehouse_area;
		this.warehouse_name = warehouse_name;
	}
	
	public String getWarehouse_id() {
		return warehouse_id;
	}
	public void setWarehouse_id(String warehouse_id) {
		this.warehouse_id = warehouse_id;
	}
	public String getWarehouse_area() {
		return warehouse_area;
	}
	public void setWarehouse_area(String warehouse_area) {
		this.warehouse_area = warehouse_area;
	}
	public String getWarehouse_name() {
		return warehouse_name;
	}
	public void setWarehouse_name(String warehouse_name) {
		this.warehouse_name = warehouse_name;
	}
	
	@Override
	public String toString() {
		return "Warehouse [warehouse_id=" + warehouse_id + ", warehouse_area=" + warehouse_area + ", warehouse_name="
				+ warehouse_name + "]";
	}

}
