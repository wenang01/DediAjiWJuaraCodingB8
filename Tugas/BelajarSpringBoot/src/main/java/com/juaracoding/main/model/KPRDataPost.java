package com.juaracoding.main.model;

public class KPRDataPost {
	
	private String dateFrom;
    private int platfond ;
    private double bunga ;
    private int lamaPinjam ;
  
    
    public KPRDataPost() {
    	
    }


	public KPRDataPost(String dateFrom, int platfond, double bunga, int lamaPinjam) {
		super();
		this.dateFrom = dateFrom;
		this.platfond = platfond;
		this.bunga = bunga;
		this.lamaPinjam = lamaPinjam;
	}


	public String getDateFrom() {
		return dateFrom;
	}


	public void setDateFrom(String dateFrom) {
		this.dateFrom = dateFrom;
	}

	public int getPlatfond() {
		return platfond;
	}


	public void setPlatfond(int platfond) {
		this.platfond = platfond;
	}


	public double getBunga() {
		return bunga;
	}


	public void setBunga(double bunga) {
		this.bunga = bunga;
	}
    
	public int getLamaPinjam() {
		return lamaPinjam;
	}


	public void setLamaPinjam(int lamaPinjam) {
		this.lamaPinjam = lamaPinjam;
	}
    
    
	

}
