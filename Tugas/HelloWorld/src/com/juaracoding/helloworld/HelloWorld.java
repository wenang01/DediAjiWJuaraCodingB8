package com.juaracoding.helloworld;

public class HelloWorld {

	private String wording = "Hai hai...";
	
	public HelloWorld() {
		System.out.println("Constructor Dijalankan");
	}
	
	public void sayHello() {
		System.out.println("hello apa kabar ?");
	}
	
	public String getHello() {
		return wording;
	}
	
	public static void HelloDunia(String nama) {
		System.out.println("Hello Apa Kabar Dunia, dari " + nama);
	}
	
}
