package com.juaracoding.bangunruang;

public class Segitiga extends BangunRuang implements BangunDuaDimensi{

	public Segitiga(double panjang, double tinggi) {
		// TODO Auto-generated constructor stub
		this.setPanjang(panjang);
		this.setTinggi(tinggi);
	}
	
	public Segitiga() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double hitungLuas() {
		return (0.5*this.getPanjang()*this.getTinggi());
		
	}
	@Override
	public double hitungKeliling() {
		// TODO Auto-generated method stub
		return 3*this.getPanjang();
	}

	@Override
	public void tampilkanNilai() {
		// TODO Auto-generated method stub
		System.out.println("Nilai luas segitiga adalah " + this.hitungLuas());
		System.out.println("Nilai keliling segitiga adalah " + this.hitungKeliling());
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		for (int i = 0; i < this.getPanjang(); i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	}
	

}
