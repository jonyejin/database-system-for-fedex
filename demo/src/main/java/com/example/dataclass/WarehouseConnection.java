package com.example.dataclass;

import java.sql.ResultSet;
import java.sql.SQLException;

public class WarehouseConnection implements DataClass{
	private String start_warehouse_area;
	private String dest_warehouse_area;
	private int edge_weight;

	public WarehouseConnection(){
		
	}
	
	public WarehouseConnection(String start_warehouse_area, String dest_warehouse_area, int edge_weight) {
		super();
		this.start_warehouse_area = start_warehouse_area;
		this.dest_warehouse_area = dest_warehouse_area;
		this.edge_weight = edge_weight;
	}
	public String getStart_warehouse_area() {
		return start_warehouse_area;
	}
	public void setStart_warehouse_area(String start_warehouse_area) {
		this.start_warehouse_area = start_warehouse_area;
	}
	public String getDest_warehouse_area() {
		return dest_warehouse_area;
	}
	public void setDest_warehouse_area(String dest_warehouse_area) {
		this.dest_warehouse_area = dest_warehouse_area;
	}
	public int getEdge_weight() {
		return edge_weight;
	}
	public void setEdge_weight(int edge_weight) {
		this.edge_weight = edge_weight;
	}
	
	@Override
	public String toString() {
		return "WarehouseConnection [start_warehouse_area=" + start_warehouse_area + ", dest_warehouse_area="
				+ dest_warehouse_area + ", edge_weight=" + edge_weight + "]";
	}
	@Override
	public void SelectTuple(ResultSet rs) {
		// TODO Auto-generated method stub
		try{
			start_warehouse_area = rs.getString("start_warehouse_area");
			dest_warehouse_area = rs.getString("dest_warehouse_area");
			edge_weight = rs.getInt("edge_weight");
			System.out.println(toString());
		}
		catch(SQLException e){
			e.printStackTrace();
		}
	}
}
