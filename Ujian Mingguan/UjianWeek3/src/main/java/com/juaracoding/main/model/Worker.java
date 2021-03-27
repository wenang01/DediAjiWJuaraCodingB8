package com.juaracoding.main.model;

public class Worker {

	private String 	WORKER_ID,
					FIRST_NAME,
					LAST_NAME,
					SALARY,
					JOINING_DATE,
					DEPARTMENT;

	public String getWORKER_ID() {
		return WORKER_ID;
	}

	public void setWORKER_ID(String WORKER_ID) {
		this.WORKER_ID = WORKER_ID;
	}

	public String getFIRST_NAME() {
		return FIRST_NAME;
	}

	public void setFIRST_NAME(String FIRST_NAME) {
		this.FIRST_NAME = FIRST_NAME;
	}

	public String getLAST_NAME() {
		return LAST_NAME;
	}

	public void setLAST_NAME(String LAST_NAME) {
		this.LAST_NAME = LAST_NAME;
	}

	public String getSALARY() {
		return SALARY;
	}

	public void setSALARY(String SALARY) {
		this.SALARY = SALARY;
	}

	public String getJOINING_DATE() {
		return JOINING_DATE;
	}

	public void setJOINING_DATE(String JOINING_DATE) {
		this.JOINING_DATE = JOINING_DATE;
	}

	public String getDEPARTMENT() {
		return DEPARTMENT;
	}

	public void setDEPARTMENT(String DEPARTMENT) {
		this.DEPARTMENT = DEPARTMENT;
	}
	
}
