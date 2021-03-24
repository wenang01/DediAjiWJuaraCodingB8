package com.juaracoding.helloworld;

import java.util.Scanner;

public class Main {
	
//	public Main() {
//		System.out.println("Constructor Main Dijalankan");
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		HelloWorld hello = new HelloWorld();
//		hello.sayHello();
//		hello.getHello();
//		
//		int nilai1 = 1;
//		String nilai2 = "2";
//		String nilai3 = "3";
//		String nilai4 = "3.0";
//		double nilai5 = 5;
//		
//		double hasil = nilai1 + Integer.parseInt(nilai2) + Integer.parseInt(nilai3) + Float.parseFloat(nilai4) + nilai5;
//		
//		System.out.println((int)(hasil));
//		
//		double x = 1+2*3*(10/2+5)/2;
//		System.out.println(x);
		
		/*
		 * bilangan prima merupakan bilangan lebih dari 1,
		 * dan hanya bisa dibagi dengan angka 1 atau bilangan itu sendiri
		 * ex: angka 2 adalah bilangan prima karna hanya bisa dibagi dengan
		 * 		angka 1 dan 2. sedangkan 8 bukanlah bilangan prima karena
		 * bisa dibagi dengan angka 1 dan 8, dan 8 juga bisa dibagi dengan
		 * angka 2 dan 4.
		 * */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("masukan nilai : ");
		int nilai = scan.nextInt();
		
//		int hasil = nilai % 2;
		
		int i, j;
		boolean is_prima = true;
		
		for (i=2; i<=nilai/2; i++) {
			j = nilai % i;
			if(j == 0) {
				is_prima = false;
				break;
			}
		}
		
		if(is_prima && (nilai>0) && nilai != 1) {
			System.out.println(nilai + " adalah bilangan prima");
		}else {
			System.out.println(nilai + " bukan bilangan prima");
		}
		
	}
}
