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
		
		System.out.println("Daire �izildi");
		
		System.out.println("Merkez kordinatlar�: "+merkez.getX()+" , "+merkez.getY() );
	}
}
