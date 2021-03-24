package com.juaracoding.helloworld;

import java.util.Scanner;

public class GroupingUnggas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Masukan Nama Binatang ");
		
		String jawab = scan.next().toLowerCase();
		
		switch(jawab) {
		
		case "kelinci":
		case "kucing":
		case "kuda":
			System.out.println(jawab + " adalah mamalia");
			break;
			
		case "kadal":
		case "ulang":
		case "cicak":
			System.out.println(jawab + " adalah reptil");
			break;
			
		case "burung":
		case "bebek":
		case "ayam":
			System.out.println(jawab + " adalah aves/unggas");
			break;
			
		default:
			System.out.println("Buwung apa tu man ?");
			break;
		
		}
		
	}

}
