package animal;

public class Felino extends Animal {
	int horasSuenio;
	
	public Felino (String nombre, String sonido, int horasSuenio) {
		super(nombre, sonido);
		this.horasSuenio = horasSuenio;
	}
	
	// final en un método, evito que este pueda sor sobreescrito
	// por alguna clase hija.
	@Override	
	public final String emitirSonido() {
		return "Soy un felino, me llamo " + super.getNombre() +
				"\n y hago " + super.getSonido() +
				"\n y duermo aproximadamente " + this.getHorasSuenio() + "h."
				;
	}

	public int getHorasSuenio() {
		return horasSuenio;
	}

	public void setHorasSuenio(int horasSuenio) {
		this.horasSuenio = horasSuenio;
	}

	@Override
	public int aniosAproxDeVida() {		
		return 15;
	}
	
	@Override
	public double pesoEnKgAprox() {
		return 4.5;
	}
	

}
