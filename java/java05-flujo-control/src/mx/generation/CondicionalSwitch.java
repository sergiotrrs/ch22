package mx.generation;

import java.util.Scanner;

public class CondicionalSwitch {

	public static void main(String[] args) {
		
		//Comparar números de punto flotante
		//Se debe evitar realizar las operaciones con este tipo de datos
		double tasaInteres = 0.1;
		double interesEstatal = 0.2;
		double interesTotal = (tasaInteres * 100 + interesEstatal * 100) / 100; //0.30
		System.out.println(interesTotal);
		
		if(interesTotal == 0.3)
			System.out.println("Interés está leve");
		else
			System.out.println("Aplicar nuevo intereses");

		/**
		 * Sintaxis de condicional Switch
		 * 
		 * switch(expresión){
		 *  case valor1: instrucciones;
		 *               break;
		 *  case valorN: instrucciones;
		 *               break;
		 *  default: instrucciones;
		 *               break;                           
		 *  }
		 *  
		 *  La expresión debe ser de tipo entero, string o enum.
		 *              
		 */
		
		Scanner leerTeclado = new Scanner( System.in );
		System.out.println("***** Mes en curso ******");
		System.out.print("Introduce el mes en curso (1-12) :");
		 if( leerTeclado.hasNextInt()) {
			 String mesTxt = "";
			 int mesEnCurso = leerTeclado.nextInt();
			 // Switch para encontrar el mes
			 switch(mesEnCurso) {
			 case 1 :
				 mesTxt = "Enero";
				 break;
			 case 2 :
				 mesTxt = "Febrero";
				 break;
			 case 3 :
				 mesTxt = "Marzo";
				 break;
			 case 4 :
				 mesTxt = "Abril";
				 break;
			 case 5 :
				 mesTxt = "Mayo";
				 break;
			 case 6 :
				 mesTxt = "Junio";
				 break;
				 //ToDo agregar los meses 4-11
			 case 12 :
				 mesTxt = "Diciembre";
				 break;
			 default:
				 mesTxt = "mes no existe";
			 }
			 
			System.out.println("Te encuentras en el mes de " + mesTxt);
			
			String estacion = "";
			switch(mesTxt.toLowerCase()) {
			//ToDo dic, enero, feb = Invierto
			case "diciembre" :				
			case "enero" :				
			case "febrero" :
				estacion = "Invierno";
				break;
			case "marzo", "abril", "mayo" :							
				estacion = "primavera";
				break;
			case "junio", "julio", "agosto" :							
				estacion = "verano";
				break;
			case "septiembre", "octubre", "noviembre" :							
				estacion = "otoño";
				break;
			default:
				estacion = "La estación no existe";			
			}
			System.out.println("Y te encuntras en la estación " + estacion);
			 
			 
		 } else {			 
			 System.out.println("Error en el mes introducido, hasta pronto");
		 }
		 leerTeclado.nextLine();
		 leerTeclado.close();
		
		

	}

}
