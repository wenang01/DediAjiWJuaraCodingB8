package com.juaracoding.ujian1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		MenggambarDenganJava mdj = new MenggambarDenganJava("");
		System.out.println("Masukan Jumlah Dimensi : ");
		int dimens = sc.nextInt();
		mdj.setDimensi(dimens);
		
//		mdj.gambarKotak();
//		mdj.gambarSegitiga();
//		mdj.gambarSegitigaTerbalik();
//		mdj.gambarSelangSeling();
//		mdj.gambarCampur();
		mdj.gabungGambar();

	}

}
