package holamundo;

import java.util.Scanner;

public class Diapositiva63 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Dime la primera nota: ");
		int nota1 = scan.nextInt();
		
		System.out.println("Dime la segunda nota: ");
		int nota2 = scan.nextInt();
		
		double media = (nota1 + nota2) / (double) 2;
		
		System.out.println("La nota media es: " + media);
	}

}
