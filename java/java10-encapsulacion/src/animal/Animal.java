package animal;

// Las clases abstractas no se pueden instanciar.
public abstract class Animal {
	String nombre;
	String sonido;
	
	public Animal(String nombre, String sonido) {
		super();
		this.nombre = nombre;
		this.sonido = sonido;
	}
	
	public String emitirSonido() {
		return "soy un " + this.nombre + 
				"\n y hago " + this.sonido;
	}
	
	// Método abstracto.
	// No tienen cuerpo(funcionalidad), terminan con punto y coma.
	// Debido a que la clase padre no ha definido el comportamiento
	// la clase hija es quién implementará el comportamiento, es responsable
	// de la implementación (al menos que la clase sea abstracta).
	// Si existe un método abstracto, la clase también debe ser abstracta.
	public abstract int aniosAproxDeVida();

	public abstract double pesoEnKgAprox();
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSonido() {
		return sonido;
	}

	public void setSonido(String sonido) {
		this.sonido = sonido;
	}
	
	
	
}
