package mx.generation;

public class Variables {

	public static void main(String[] args) {
		/**
		 * https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
		 * En Java existen 8 datos primitivos
		 *  - byte: tipo numérico de 8 bits
		 *  - short: tipo numérico de 16bits
		 *  - int: numérico de 32 bits
		 *  - long: numérico de 64 bits
		 *  - float: numérico de punto flotante de 32 bits
		 *  - double: numérico de punto flotante de 64 bits
		 *  - boolean: dato booleano(true, false)
		 *  - char: caracter.
		 */
		
		//Definimos una variable de tipo byte (8 bits)
		byte variableTipoByte = 10;
		System.out.println("byte: " + variableTipoByte);
		System.out.println("Max byte value: " + Byte.MAX_VALUE);
		System.out.println("Min byte value: " + Byte.MIN_VALUE);
		
		//Definimos una variable de tipo short (16 bits)
		short variableTipoShort = 125;
		System.out.println("short: " + variableTipoShort);
		System.out.println("Max short value: " + Short.MAX_VALUE);
		System.out.println("Min short value: " + Short.MIN_VALUE);
		
		//DEfinimos una variable de tipo int (32 bits)
		int variableTipoInt = 1256;
		System.out.println("int: " + variableTipoInt);
		System.out.println("Max int value: " + Integer.MAX_VALUE); //2147483647
		System.out.println("Min int value: " + Integer.MIN_VALUE);
		
		//Definimos una variable de tipo long (64 bits)
		long varibaleTipoLong = 1258;
		System.out.println("long: " + varibaleTipoLong);
		System.out.println("Max long value: " + Long.MAX_VALUE); //9223372036854775807
		System.out.println("Min long value: " + Long.MIN_VALUE);
		
		// Nota: las literales numéricas son de tipo int.
		// eje:  85452, 0,  -26846516
		// Indicando la letra L (de preferencia mayúscula) hacemos
		// las literales numéricas de 64 bits.
		long maxValueLong = 2147483648L;
		
		// Definimos una variable de tipo float (32 bits)
		// Nota: Las literales de punto flotante, son de tipo Double
		// Agregando la F (de preferencia mayúscula) hacemos
		// las literales de tipo float.
		float variableTipoFloat = 25.23F;
		System.out.println("float: " + variableTipoFloat);
		System.out.println("Max float value: " + Float.MAX_VALUE);
		System.out.println("Min float value: " + Float.MIN_VALUE);
		
		// Definimos una variable de tipo double (64 bits)
		double variableTipoDouble = 652.3256;
		System.out.println("double: " + variableTipoDouble);
		System.out.println("Max double value: " + Double.MAX_VALUE );
		System.out.println("Min double value: " + Double.MIN_VALUE );
		System.out.println("Suma 3.1 + 2.2 :" + ((3.1*10+2.2*10)/10));
		
		
		
	}

}
