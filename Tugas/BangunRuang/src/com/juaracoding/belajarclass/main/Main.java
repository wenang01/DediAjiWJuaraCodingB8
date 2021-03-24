package com.juaracoding.belajarclass.main;

import com.juaracoding.bangunruang.Kotak;
import com.juaracoding.bangunruang.Segitiga;
import com.juaracoding.belajarclass.utility.Map;
import com.juaracoding.binatang.Kucing;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kotak kotak = new Kotak();
		kotak.setPanjang(2.0);
//		System.out.println(kotak.hitungLuas());
//		System.out.println(kotak.hitungKeliling());
//		System.out.println(kotak.hitungLuas());
//		kotak.tampilkanNilai();
		Segitiga segitiga = new Segitiga(10.0,3.0);
//		System.out.println(kotak2.hitungLuas());
//		System.out.println(kotak.hitungKeliling());
//		segitiga.tampilkanNilai();
		Kucing kucing = new Kucing();
		/*
		List<BangunDuaDimensi> listBangun = new ArrayList<BangunDuaDimensi>();
		listBangun.add(kotak);
		listBangun.add(segitiga);
		listBangun.add(kucing);

		
		for(int i = 0; i < listBangun.size(); i++) {
			
			Utility.clearScreen();
//			listBangun.get(i).tampilkanNilai();	
			listBangun.get(i).draw();
			Utility.delay(100);
			
		}
		*/
		/*
		Animation anim = new Animation(kucing);
		for (int i = 0; i < 10; i++) {
			Utility.clearScreen();
			anim.kanan();
			Utility.delay(100);
		}
		for (int i = 0; i < 5; i++) {
			Utility.clearScreen();
			anim.kiri();
			Utility.delay(100);
		}
		*/
		
		Map map = new Map();
		map.draw2();
		
	}

}
