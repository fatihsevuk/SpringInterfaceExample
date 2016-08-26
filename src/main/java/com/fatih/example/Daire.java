package com.fatih.example;

public class Daire implements Sekil{
	
	private Nokta merkez;
	
	
	
	public Nokta getMerkez() {
		return merkez;
	}



	public void setMerkez(Nokta merkez) {
		this.merkez = merkez;
	}



	public void sekilCiz() {
		
		System.out.println("Daire Çizildi");
		
		System.out.println("Merkez kordinatlarý: "+merkez.getX()+" , "+merkez.getY() );
	}
}
