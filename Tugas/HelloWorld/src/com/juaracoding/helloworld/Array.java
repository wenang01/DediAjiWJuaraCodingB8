package com.juaracoding.helloworld;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][] data = {
				{"dedi", "bekasi"},
				{"aji", "jakarta"},
				{"wenang", "bogor"}
		};
		
			for(int i = 0; i<data.length; i++) {
				System.out.println("Nama : " + data[i][0]);
				System.out.println("Domisisli : " + data[i][1]);
				System.out.println("-------------------------");
			}
			System.out.println();
		
	}

}
