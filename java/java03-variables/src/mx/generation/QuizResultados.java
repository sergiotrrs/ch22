package mx.generation;

public class QuizResultados {
	
	public static void main(String[] args) {
		boolean X = true;
		boolean Y = false;
		boolean Z = true;
		
		System.out.println("(X && Y) || (X && Z) = "+ ( (X && Y) || (X && Z) ));
		System.out.println("X || Y && Z = "+ ( X || Y && Z ));
		System.out.println("X || Y || X && !Z && !Y = "+ ( X || Y || X && !Z && !Y ));
		System.out.println("(X || !Y)&& (!X || Z) = "+ ( (X || !Y)&& (!X || Z) ));
		System.out.println("!(X || Y) && Z = "+ ( !(X || Y) && Z  ));
		System.out.println("!X || !Y || Z && X && !Y = "+ ( !X || !Y || Z && X && !Y ));
		
		int a = 8;
		int b= 3;
		int c= -5;
		
		System.out.println(" a + b + c = "+ ( a + b + c ));
		System.out.println("a * b / c = "+ ( a * b / c ));
		System.out.println("(a * c) % b  = "+ ( (a * c) % b ));
		System.out.println("2 * b + 3 * (a - c) = "+ ( 2 * b + 3 * (a - c) ));
		System.out.println("a * (b / c) = "+ ( a * (b / c) ));
		System.out.println("a * (c % b) = "+ ( a * (c % b) ));
		System.out.println("a - b - c * 2 = "+ ( a - b - c * 2 ));
	
		
	
		
	}

}
