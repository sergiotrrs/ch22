package animal;

import mascota.Mascota;

//Con implements, implemento funcionalidades que vienen
//en el contrato de la interfaz.

// con final evitamos que otra clase puede heredar de esta clase Perro.
public final class Perro extends Canino implements Mascota  {

	public Perro(String nombre, String sonido) {
		super(nombre, sonido);	
	}

	@Override
	public int aniosAproxDeVida() {
		return 10;
	}

	@Override
	public String cuidados() {		
		return "Bañar, sacar a pasear, dar alimentación y mucho cariño";
	}

	@Override
	public String alimentos() {
		return "Croqueta y agua";
	}

	@Override
	public double sizeOfMascota(int pesoAprox) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

class PerroPeluche implements Mascota{

	@Override
	public String cuidados() {		
		return "Lavar con agua y jabón";
	}

	@Override
	public String alimentos() {
		return "No aplica";
	}

	@Override
	public double sizeOfMascota(int pesoAprox) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
