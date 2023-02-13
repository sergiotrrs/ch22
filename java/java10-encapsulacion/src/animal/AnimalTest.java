package animal;

import java.util.ArrayList;
import java.util.List;

import mascota.Mascota;


public class AnimalTest {

	public static void main(String[] args) {
		Animal solovino = new Canino("Solovino", "gua gua");
		Animal michu = new Felino("Michu", "miauu", 18);
		
		System.out.println( solovino.emitirSonido() );
		System.out.println( michu.emitirSonido() );
		
		// No debería poder instanciar la clase Animal
		// ya que es muy genérica.
		// Animal noSeQueTipoEs = new Animal("?", "?"); // Qué tipo de animal?, qué nombre le ponemos?
		
		System.out.println( solovino.aniosAproxDeVida() );
		System.out.println( solovino.pesoEnKgAprox() );
		System.out.println( michu.pesoEnKgAprox() );
		
		Animal chiquitin = new Perro("Chiquitin", "gua guuuua gua guuuua");
		
		List<Animal> animales = new ArrayList<>();
		animales.add(solovino); // Canino
		animales.add(michu); // Felino
		animales.add(chiquitin); // Perro
		animales.add( new Felino("Momo", "Mauuuuughhhh", 10) ); // Felino
		
		System.out.println("\n=== Aplicar el polimorfismo === ");
		//animales.forEach( animal -> System.out.println(reproducirSonido(animal) ) );
		for (Animal animal : animales)
			System.out.println( reproducirSonido(animal) );
		
		// Se puede referencias de una clase padre o interfaz
		Mascota kraken = new Perro("Kraken", "Guuuauuu");
		Mascota ChiquitinPeluche = new PerroPeluche();
		List <Mascota> mascotas = new ArrayList<>();
		
		
	}
	
	static String reproducirSonido( Animal animal  ) {
		// El polimorfismo de aplica en tiempo de ejecución.
		return "Play: " + animal.emitirSonido();
	}

}
