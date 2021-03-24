package com.juaracoding.helloworld;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> binatang = new ArrayList<String>();
//		binatang.add("Kucing");
//		binatang.add("Tikus");
//		binatang.add("Ayam");
//		binatang.add("Bebek");
//		binatang.add("Entok");
//		binatang.set(0, "kupu-kupu");
//		System.out.println(binatang);
		
//		for(int i = 0; i < binatang.size(); i++) {
//			System.out.println("Nama - nama binatang : " + binatang.get(i));
//		}
		
//		for(String j : binatang) {
//			System.out.println(j);
//		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Masukan Jumlah Array Binatang : ");
		int n = sc.nextInt();
		System.out.println("Masukan Nama Binatang : ");
		for(int i = 0; i < n; i++) {
			binatang.add(sc.next());
		}
		System.out.println("--------------------------------");
		
		for(int j = 0; j < binatang.size(); j++) {
			System.out.println(binatang.get(j));
		}
	}

}
