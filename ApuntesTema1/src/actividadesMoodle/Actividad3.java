package actividadesMoodle;

import java.util.Scanner;

public class Actividad3 {

	public static void main(String[] args) {

		/*
		 * Diseñar un algoritmo que nos diga el dinero que tenemos (en euros y céntimos) 
		 * después de pedirnos cuantas monedas tenemos de 2e, 1e, 50 céntimos, 20 
		 * céntimos o 10 céntimos).
		 */
		
		Scanner s = new Scanner(System.in);

		System.out.println("Monedas de 2 euros:  ");
		int dosEuros = s.nextInt();
		
		System.out.println("Monedas de 1 euro:  ");
		int unEuro = s.nextInt();
		
		System.out.println("Monedas de 50 céntimos:  ");
		int cincuenta = s.nextInt();
		
		System.out.println("Monedas de 20 céntimos:  ");
		int veinte = s.nextInt();
		
		System.out.println("Monedas de 10 céntimos:  ");
		int diez = s.nextInt();
		
		int totalCentimos = dosEuros * 200 + unEuro * 100 + cincuenta * 50 + veinte * 20 + diez * 10;
		
		int euros = totalCentimos / 100;
		int centimosRestantes = totalCentimos % 100;
		
		System.out.printf("Tienes %d euros y %d céntimos \n", euros, centimosRestantes);

	}

}
