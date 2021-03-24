package com.juaracoding.helloworld;

import java.util.Scanner;

public class DimensiPrima {

	static int 	panjang,
				lebar,
				nilai;
					
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Masukan panjang : ");
		panjang = sc.nextInt();
		System.out.println("Masukan Lebar : ");
		lebar = sc.nextInt();
		nilai = panjang * lebar;
		
		int i, j;
		boolean is_prima = true;
		
		for (i=2; i<=nilai/2; i++) {
			j = nilai % i;
			if(j == 0) {
				is_prima = false;
				break;
			}
		}
	}
}
