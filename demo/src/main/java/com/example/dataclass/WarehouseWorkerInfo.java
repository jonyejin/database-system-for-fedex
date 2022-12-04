package com.example.dataclass;

public class WarehouseWorkerInfo {
	private String worker_id;
	private String warehouse_id;
		
	public WarehouseWorkerInfo(String worker_id, String warehouse_id) {
		super();
		this.worker_id = worker_id;
		this.warehouse_id = warehouse_id;
	}
	
	public String getWorker_id() {
		return worker_id;
	}
	public void setWorker_id(String worker_id) {
		this.worker_id = worker_id;
	}
	public String getWarehouse_id() {
		return warehouse_id;
	}
	public void setWarehouse_id(String warehouse_id) {
		this.warehouse_id = warehouse_id;
	}
	
	@Override
	public String toString() {
		return "WarehouseWorkerInfo [worker_id=" + worker_id + ", warehouse_id=" + warehouse_id + "]";
	}
}
