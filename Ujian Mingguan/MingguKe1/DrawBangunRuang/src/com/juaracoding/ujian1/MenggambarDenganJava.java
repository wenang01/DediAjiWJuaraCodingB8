package com.juaracoding.ujian1;

public class MenggambarDenganJava {
	
	private String namaGambar = "";
	private int dimensi = 0;
	
	public MenggambarDenganJava(String gambar) {
		this.namaGambar = gambar;
	}
	
	public int getDimensi() {
		return dimensi;
	}

	public void setDimensi(int dimensi) {
		this.dimensi = dimensi;
	}

	public MenggambarDenganJava gambarKotak(){
		for(int i = 0; i < this.getDimensi(); i++) {
			for(int j = 0; j < this.getDimensi(); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		return this;
	}
	
	public void gambarSegitiga() {
		for(int i = 0; i < this.getDimensi(); i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void gambarSegitigaTerbalik() {
		for(int i = this.getDimensi(); i >= 0; i--) {
			for(int j = i; j >= 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void gambarSelangSeling() {
		
		int count = 0;
		
		int x,y;
		for(x = this.getDimensi(); x >= 0; x--) {

			for(y=x; y > 0; y--) {
				count++;
				int countTemp = 0;
				for(int z = 1; z <= count; z++) {
					if(count % 2 == 0) {
						countTemp++;
					}
				}
				if(countTemp == 0) {
					System.out.print("*");
				}else {
					System.out.print("!");
				}			
			}
			System.out.println();
		}
	}
	
	public void gambarCampur() {

		for(int i=0; i < this.getDimensi(); i++) {
			
			for(int j=0; j <= this.getDimensi(); j++) {

				if(j<=i) {
					System.out.print("*");
				}else {
					System.out.print("#");
				}
			}

			System.out.println();
		}
	}
	
	public void gambarBintang() {
		/*
			
						
			
		 */
	}
	
	public void gabungGambar() {
		
//		this.gambarKotak();
//		this.gambarSegitiga();
		this.gambarCampur();
//		this.gambarSegitigaTerbalik();
		this.gambarSelangSeling();
	
	}

}
