package com.juaracoding.bangunruang;

abstract class BangunRuang {

	private double 	panjang,
					lebar,
					tinggi;
	
	public BangunRuang() {
		
	}
	
	public double hitungLuas() {
		return 0.0;
	}
	
	public double hitungKeliling() {
		return 0.0;
	}
	
	public void showLuas() {
		System.out.println("Nilai Luas Adalah " + hitungLuas());
	}

	public double getPanjang() {
		return panjang;
	}

	public void setPanjang(double panjang) {
		this.panjang = panjang;
	}

	public double getLebar() {
		return lebar;
	}

	public void setLebar(double lebar) {
		this.lebar = lebar;
	}

	public double getTinggi() {
		return tinggi;
	}

	public void setTinggi(double tinggi) {
		this.tinggi = tinggi;
	}
}
