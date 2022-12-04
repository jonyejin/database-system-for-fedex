package com.example.dataclass;

public class UnitMeasureWeight {
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

}
