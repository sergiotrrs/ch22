package mascota;

/**
 * Una interfaz es una declaración formal de un
 * contrato, en la cuál los métodos no contiene
 * implementaciones. Es similar a los métodos
 * abstractos.
 * 
 * Una clase puede implementar muchas interfaces,
 * aunque no tengan relación.
 * 
 * Las clases abstractas se recomienda utilizar para
 * objetos que estén estrechamente relacionados, mientras
 * que las interfaces sin más adecuadas para
 * proporcionar funcionalidad común a clases que no
 * estén relacionadas entre si.
 * 
 * Para patrones de diseño se suelen utilizar interfaces.
 *
 */
public interface Mascota {
	
	// Este atributo es de tipo final.
	// final en un atributo, lo hace de tipo constante, no puede cambiar su valor.
	boolean ES_MASCOTA = true;
	
	/**
	 * Los métodos de una interfaz son
	 * de tipo public y abstract.
	 * 
	 * Los atributos, son de tipo final( atributo constante)
	 * 
	 */
	String cuidados();
	
	String alimentos();
	
	double sizeOfMascota(int pesoAprox );

}
