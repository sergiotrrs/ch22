package mx.generation;

import java.util.ArrayList;
import java.util.Date;

public class DateClass {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		System.out.println(date.getTime());
		System.out.println( dateToString(date) + "\tRetiro");
		ArrayList<String> logger = new ArrayList<>();
		
		for (int i = 0; i < 5; i++) {
			//TODO agregar cada evento
		}
		
		
	}
	
	static String dateToString(Date date) {
		int value = 0;
		return String.format("%1$tF \t %<tR", date, value);
		
	}

}
