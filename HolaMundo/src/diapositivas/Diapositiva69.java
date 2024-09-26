package diapositivas;

import java.util.Scanner;

public class Diapositiva69 {
	
	public static void main(String[] args) {
		
		Scanner sca = new Scanner(System.in);
		
		System.out.println("Dime un número: ");
		int numero = sca.nextInt();
		
		/*
		 * También vale:
		 *  - boolean esPar = (numero % 2 != 1);
		 *  - boolean esPar = !(numero % 2 != 0);
		 *  - boolean esPar = !(numero % 2 == 1);
		 */
		boolean esPar = (numero % 2 == 0);
		
		System.out.println(esPar);
		
	}

}
