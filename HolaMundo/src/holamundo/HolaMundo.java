package holamundo;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class HolaMundo {

	public static void main(String[] args) {
		
		/*
		 * Leer un número
		 * Sumarle dos
		 * Mostrar el resultado
		 */
		
		//Estoy declarando la variable a
		int a = 1;
		int b = 2;
		
		//Aquí estoy declarando una constante
		final double NUMERO_PI = 3.1416;
		
		//Aquí estoy mostrando la variable a
		System.out.println("La variable a vale " + a);
		
		a = a + 1;	
		System.out.println("La variable a vale " + a 
				+ "y el número pi es " + NUMERO_PI);	

	}

}
