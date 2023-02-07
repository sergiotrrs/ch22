package mx.generation;

public class FizzBuzz {

	public static void main(String[] args) {
		/**
		 * FizzBuzz is a fun game mostly played in elementary school. 
		 * The rules are simple: when your turn arrives, 
		 * you say the next number. 
		 * However, if that number is a 
		 * multiple of 3, you should say the word “fizz” 
		 *  (preferably with a French accent) instead. 
		 * If the number is a multiple of 5, you should say “buzz.”
		 * And if it is a multiple of both, you should say “fizzbuzz.”
		 * 
		 * 1-20
		 */
		String phrase;
		for (int i=1; i<=20; i++) {
			phrase = "";
			if (i%3 == 0) phrase = "Fizz";
			if (i%5 == 0) phrase += "Buzz";
		System.out.println(i + " " + phrase);
		}


	}

}
