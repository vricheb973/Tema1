package apuntes;

import java.util.Scanner;

public class Ejemplo2 {
	
	public static void main(String [] args) {
		
		Scanner sca = new Scanner(System.in);
		
		//Recogemos un entero y lo mostramos
		System.out.println("Dime un número entero: ");
		int entero = sca.nextInt();
		
		System.out.println("El número entero es: " + entero);
		
		//Recogemos un real y lo mostramos
		System.out.println("Dime un número decimal: ");
		double decimal = sca.nextDouble();
		
		System.out.println("El número decimal es: " + decimal);

		//Recogemos una palabra y la mostramos
		System.out.println("Dime una palabra: ");
		String palabra = sca.next();
		
		System.out.println("La palabra es: " + palabra);
	}
	
	
	
	
	
	
	
	
	
}
