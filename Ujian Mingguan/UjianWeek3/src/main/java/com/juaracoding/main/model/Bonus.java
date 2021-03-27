package com.juaracoding.main.model;

public class Bonus {

	private int WORKER_REF_ID;
	private String 	BONUS_DATE,
					BONUS_AMOUNT;
	
	public int getWORKER_REF_ID() {
		return WORKER_REF_ID;
	}
	public void setWORKER_REF_ID(int WORKER_REF_ID) {
		this.WORKER_REF_ID = WORKER_REF_ID;
	}
	public String getBONUS_DATE() {
		return BONUS_DATE;
	}
	public void setBONUS_DATE(String BONUS_DATE) {
		this.BONUS_DATE = BONUS_DATE;
	}
	public String getBONUS_AMOUNT() {
		return BONUS_AMOUNT;
	}
	public void setBONUS_AMOUNT(String BONUS_AMOUNT) {
		this.BONUS_AMOUNT = BONUS_AMOUNT;
	}
	
}
