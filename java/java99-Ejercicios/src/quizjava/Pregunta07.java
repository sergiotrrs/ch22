package quizjava;

public class Pregunta07 {

 
		  public static void main(String args[]) { 
		    for(byte i =-90; i<120; i+=10){
		    
		    byte b = i;

		    System.out.println("Max value byte: " + Byte.MAX_VALUE *2);
		    System.out.println("b inicial: "+b);		    
		    b += 2 + (2*Byte.MAX_VALUE);
		    System.out.println("b final: "+b);
		    System.out.println();

		    }
		  } 
		

}
