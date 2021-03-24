package com.juaracoding.belajarclass.utility;

import com.juaracoding.bangunruang.BangunDuaDimensi;

public class Animation {

	private BangunDuaDimensi gambar;
	private double coordX = 0;
	
	public Animation(BangunDuaDimensi gambar){
		// TODO Auto-generated constructor stub
		this.setGambar(gambar);
	}
	
	public Animation() {
		// TODO Auto-generated constructor stub
	}
	
	public void kiri() {
		
//		Utility.clearScreen();
		if(this.coordX < 0) {
			this.coordX = 0;
		}else {
			this.coordX--;
		}
		
		for (int i = 0; i < coordX; i++) {
			System.out.print(" ");
		}
//		Utility.delay(100);
		this.gambar.draw();
	
	}
	
	public void kanan() {
		
//		Utility.clearScreen();
		if(this.coordX > 80) {
			this.coordX = 80;
		}else {
			this.coordX++;
		}
		
		for (int i = 0; i < coordX; i++) {
			System.out.print(" ");
		}
//		Utility.delay(100);
		this.gambar.draw();
	}

	public BangunDuaDimensi getGambar() {
		return gambar;
	}

	public void setGambar(BangunDuaDimensi gambar) {
		this.gambar = gambar;
	}
	
}
