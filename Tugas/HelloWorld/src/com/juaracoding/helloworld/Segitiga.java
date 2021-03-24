package com.juaracoding.helloworld;

import java.util.Scanner;

public class Segitiga {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Masukan Tinggi Segitiga : ");
		int tinggi = sc.nextInt();
//		System.out.println("Masukan Lebar : ");
//		int lebar = sc.nextInt();
				
//		String dimens = "*";
//		String prima = "!";
//		String not_prima = "*";
		
//		int count = 0;

		int x,y;
		for(x=1; x<=tinggi; x++) {
			
			for(y=1; y<=tinggi; y++) {
//				System.out.print("*");	
				if(y<=x) {
					System.out.print("*");
				}else {
					System.out.print("!");
				}
			}

			System.out.println();
		}

		/*
		for(int x = 0; x < tinggi; x++) {
			int dummyKiri = tinggi - x;
			int dummyKanan = tinggi + x;
			
			for(int y = 0; y <= tinggi * 2; y++) {
				if(y==tinggi) {
					System.out.print("!");
				}else {
					if(y<dummyKiri) {
						System.out.print(" ");
					}else {
						if(y > tinggi && y > dummyKanan) {
							System.out.print(" ");
						}else {
							System.out.print("*");
						}
					}
				}
			}
			System.out.println("");
		}
		*/
	}
}
