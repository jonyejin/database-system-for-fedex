package com.example.dataclass;

public class UnitMeasureSize {
	private String unit_measure_size_type;

	public UnitMeasureSize(String unit_measure_weight_type) {
		super();
		this.unit_measure_size_type = unit_measure_weight_type;
	}
	
	public String getUnit_measure_weight_type() {
		return unit_measure_size_type;
	}
	public void setUnit_measure_weight_type(String unit_measure_weight_type) {
		this.unit_measure_size_type = unit_measure_weight_type;
	}

	@Override
	public String toString() {
		return "UnitMeasureSize [unit_measure_weight_type=" + unit_measure_size_type + "]";
	}
}
