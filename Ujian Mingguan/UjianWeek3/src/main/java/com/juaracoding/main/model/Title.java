package com.juaracoding.main.model;

public class Title {
	
	private int 	WORKER_REF_ID;
	private String 	WORKER_TITLE,
					AFFECTED_FROM;

	public int getWORKER_REF_ID() {
		return WORKER_REF_ID;
	}

	public void setWORKER_REF_ID(int WORKER_REF_ID) {
		this.WORKER_REF_ID = WORKER_REF_ID;
	}

	public String getWORKER_TITLE() {
		return WORKER_TITLE;
	}

	public void setWORKER_TITLE(String WORKER_TITLE) {
		this.WORKER_TITLE = WORKER_TITLE;
	}

	public String getAFFECTED_FROM() {
		return AFFECTED_FROM;
	}

	public void setAFFECTED_FROM(String AFFECTED_FROM) {
		this.AFFECTED_FROM = AFFECTED_FROM;
	}
	
}
