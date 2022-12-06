package com.example.dataclass;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UnitMeasureWeight implements DataClass{
	private String unit_measure_weight_type;

	public UnitMeasureWeight(String unit_measure_weight_type) {
		super();
		this.unit_measure_weight_type = unit_measure_weight_type;
	}
	
	public String getUnit_measure_weight_type() {
		return unit_measure_weight_type;
	}
	public void setUnit_measure_weight_type(String unit_measure_weight_type) {
		this.unit_measure_weight_type = unit_measure_weight_type;
	}
	
	@Override
	public String toString() {
		return "UnitMeasureWeight [unit_measure_weight_type=" + unit_measure_weight_type + "]";
	}

	@Override
	public void SelectTuple(ResultSet rs) {
		// TODO Auto-generated method stub
		try{
			unit_measure_weight_type = rs.getString("unit_measure_weight_type");
			toString();
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		
		
	}

}
