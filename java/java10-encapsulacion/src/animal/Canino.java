package animal;
// Para conocer si estamos aplicando adecuadamente la herencia
// podríamos preguntarnis con "is-a" (es un).
public class Canino extends Animal {
	
	public Canino (String nombre, String sonido) {
		super(nombre, sonido);
	}
	
	@Override
	public String emitirSonido() {
		return "Soy un canino, me llamo " + super.getNombre() +
				"\n y hago " + super.getSonido();
	}

	@Override
	public int aniosAproxDeVida() {
		return 12;
	}
	
	@Override
	public double pesoEnKgAprox() {
		return 20;
	}

}

