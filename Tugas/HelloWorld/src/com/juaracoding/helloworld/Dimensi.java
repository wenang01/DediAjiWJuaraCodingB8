package com.juaracoding.helloworld;

import java.util.Scanner;

public class Dimensi {
	/*
	int nilai,
		panjang,
		lebar;
	
	Scanner sc = new Scanner(System.in);
	
	public Dimensi() {
		//Scanner sc = new Scanner(System.in);
	}
	
	public void setPanjang() {
		System.out.println("Masukan Panjang : ");
		panjang = sc.nextInt();
	}
	
	public int getPanjang() {
		return panjang;
	}

	public void setLebar() {
		System.out.println("Masukan Lebar : ");
		lebar = sc.nextInt();
	}
	
	public int getLebar() {
		return lebar;
	}
	
	public void setNilai() {
		nilai = panjang + lebar;
	}
	
	public int getNilai() {
		return nilai;
	}
	
	public void isPrima() {
	
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
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Masukan Panjang : ");
		int panjang = sc.nextInt();
		System.out.println("Masukan Lebar : ");
		int lebar = sc.nextInt();
				
		String dimens = "*";
		String prima = "!";
		String not_prima = "*";
		
		int count = 0;
	
		int x,y;
		for(x=1; x<=panjang; x++) {

			for(y=1; y<=lebar; y++) {
				count++;
				int countTemp = 0;
				for(int z = 1; z <= count; z++) {
					if(count % z == 0) {
						countTemp++;
					}
				}
				if(countTemp == 2) {
					System.out.print(prima);
				}else {
					System.out.print(dimens);
				}			
			}
			System.out.println();
		}
		
	}

}
