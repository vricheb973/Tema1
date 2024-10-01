package apuntes;

import java.time.LocalTime;

public class Ejemplo1 {
	
	public static void main(String[] args) {
		
		int a = 3;
		String nombre = "";
		
		LocalTime ahora = LocalTime.now();
		
		System.out.println(ahora.getHour() + ":" + ahora.getMinute());
		
	}

}
