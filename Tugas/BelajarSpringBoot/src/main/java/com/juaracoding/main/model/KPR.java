package com.juaracoding.main.model;

public class KPR {


 private int angsuranke;
 private String tanggal;
 private double totalAngsuran;
 private double angsuranPokok;
 private double angsuranBunga;
 private double sisaPinjam;
 
public KPR() {
	
}
public KPR(int angsuranke, String tanggal, double totalAngsuran, double angsuranPokok, double angsuranBunga,
		double sisaPinjam) {
	super();
	this.angsuranke = angsuranke;
	this.tanggal = tanggal;
	this.totalAngsuran = totalAngsuran;
	this.angsuranPokok = angsuranPokok;
	this.angsuranBunga = angsuranBunga;
	this.sisaPinjam = sisaPinjam;
}
public int getAngsuranke() {
	return angsuranke;
}
public void setAngsuranke(int angsuranke) {
	this.angsuranke = angsuranke;
}
public String getTanggal() {
	return tanggal;
}
public void setTanggal(String tanggal) {
	this.tanggal = tanggal;
}
public double getTotalAngsuran() {
	return totalAngsuran;
}
public void setTotalAngsuran(double totalAngsuran) {
	this.totalAngsuran = totalAngsuran;
}
public double getAngsuranPokok() {
	return angsuranPokok;
}
public void setAngsuranPokok(double angsuranPokok) {
	this.angsuranPokok = angsuranPokok;
}
public double getAngsuranBunga() {
	return angsuranBunga;
}
public void setAngsuranBunga(double angsuranBunga) {
	this.angsuranBunga = angsuranBunga;
}
public double getSisaPinjam() {
	return sisaPinjam;
}
public void setSisaPinjam(double sisaPinjam) {
	this.sisaPinjam = sisaPinjam;
}
 
 
 
}
