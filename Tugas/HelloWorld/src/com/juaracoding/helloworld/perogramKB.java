package com.juaracoding.helloworld;

import java.util.Scanner;

public class perogramKB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Berapakah anak anda ?");
		int anak = scan.nextInt();
		
		if(anak > 1) {
			System.out.println("Apakah sudah mengikuti program KB ? (Y/T)");
			String jawab = scan.next().toUpperCase();
			
			if(jawab.equalsIgnoreCase("Y")){
				System.out.println("Silahkan Control Ke puskesmas terdekat");
			}else {
				System.out.println("Silahkan mengikuti program KB di puskesmas terdekat");
			}
		}else {
			System.out.println("anda belum perlu mengikuti KB");
		}
	}

}
