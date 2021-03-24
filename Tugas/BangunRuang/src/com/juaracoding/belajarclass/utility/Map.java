package com.juaracoding.belajarclass.utility;

public class Map {
	
	private int x = 10, 
				y = 13, 
				coordX = 0, 
				coordY = 0;
	
	public int getCoordX() {
		return coordX;
	}

	public void setCoordX(int coordX) {
		this.coordX = coordX;
	}

	public int getCoordY() {
		return coordY;
	}

	public void setCoordY(int coordY) {
		this.coordY = coordY;
	}
	
	public void draw2() {
		
	}
	
	public void draw1() {
		for (int i = 0; i <= x; i++) {
			this.setCoordX(i);
			for (int j = 0; j <= y; j++) {
				this.setCoordY(j);
				if(i == 0 || i == x) {
					//pagar X
					System.out.print("--");
				}else if(j == 0 || j == y) {
					
					if(i == x - 1 && j == y) {
						// pintu keluar
						System.out.print(" ");
					}else {
						//pagar Y
						System.out.print("|");
					}
					
				}
				else {
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}
	}
	
	public void moveControl() {
		
	}
	
}
