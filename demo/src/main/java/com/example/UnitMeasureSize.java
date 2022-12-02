package com.example;

public class UnitMeasureSize {
	private int unit_measure_weight_type;

	public UnitMeasureSize(int unit_measure_weight_type) {
		super();
		this.unit_measure_weight_type = unit_measure_weight_type;
	}
	
	public int getUnit_measure_weight_type() {
		return unit_measure_weight_type;
	}
	public void setUnit_measure_weight_type(int unit_measure_weight_type) {
		this.unit_measure_weight_type = unit_measure_weight_type;
	}

	@Override
	public String toString() {
		return "UnitMeasureSize [unit_measure_weight_type=" + unit_measure_weight_type + "]";
	}
}
