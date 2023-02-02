package mx.generation;

public class DatosInmutables {

	public static void main(String[] args) {
		// datos inmutable: Que no cambia su valor
		
		String nombre = "Pax";
		//nombre = "Juan";
		String participante = "Pax";
		String personaCh22 = new String("Pax");
		
		if( nombre == participante) {
			System.out.println("CEO de CH22");
		}
		if( nombre == personaCh22) {
			System.out.println("CEO de Generation");
		}
		if( nombre.equals(personaCh22)  ) {
			System.out.println("CEO del mundo");
		}
				
		
		System.out.println("Mi " + "mejor " + "amigo " + "se llama " + nombre);

		// garbage collector -> recolector de basura
		// va a eliminar los objetos que no sean utilizados.
	}

}
