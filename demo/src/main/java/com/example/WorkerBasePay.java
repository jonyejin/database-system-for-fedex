package com.example;

public class WorkerBasePay {
	private int seniority;
	private int plus_amount;
	
	public WorkerBasePay(int seniority, int plus_amount) {
		super();
		this.seniority = seniority;
		this.plus_amount = plus_amount;
	}
	public int getSeniority() {
		return seniority;
	}
	public void setSeniority(int seniority) {
		this.seniority = seniority;
	}
	public int getPlus_amount() {
		return plus_amount;
	}
	public void setPlus_amount(int plus_amount) {
		this.plus_amount = plus_amount;
	}
	@Override
	public String toString() {
		return "WorkerBasePay [seniority=" + seniority + ", plus_amount=" + plus_amount + "]";
	}
}
