package com.juaracoding.belajarclass.utility;

import java.io.IOException;

public class Utility {
	
	public static void clearScreen() {
		try {
			
			if (System.getProperty("os.name").contains("Windows"))
				new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
			else
				Runtime.getRuntime().exec("clear");
			
		} catch (IOException | InterruptedException ex) {
			// TODO: handle exception
		}
	}
	
	public static void delay(long milisecond) {
		try {
			Thread.sleep(milisecond);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
