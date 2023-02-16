package ej01herencia;

class Animal{
	{ System.out.print("/"); }	
	public Animal() { System.out.print( "13"); }	
}

class Canino extends Animal{	
	static { System.out.print("visita www."); }
	public Canino() { System.out.print("7"); }
	
	{ System.out.print("4"); }
	static { System.out.print( "multisoft"); }
}

public class Perro extends Canino {

	public static void main(String[] args) {
		System.out.print(".se");
		new Perro();
		System.out.print("11");
	}
}
