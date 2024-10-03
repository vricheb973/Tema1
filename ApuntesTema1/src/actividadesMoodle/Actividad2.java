package actividadesMoodle;

import java.util.Scanner;

public class Actividad2 {

	public static void main(String[] args) {

		/*
		 * Un frutero necesita calcular los beneficios anuales que obtiene de la venta de 
		 * manzanas y peras. Por este motivo es necesario diseñar una aplicación que 
		 * solicite las ventas (en kg) de cada semestre para cada fruta. 
		 * La aplicación mostrará el importe total sabiendo que el precio del kilo de 
		 * manzanas está fijado en 2,35 € y el kilo de peras en 1,95 €.
		 */
		
		Scanner s = new Scanner(System.in);

		System.out.println("Kilos de peras (Semestre 1): ");
		int peras1 = s.nextInt();
		
		System.out.println("Kilos de peras (Semestre 2): ");
		int peras2 = s.nextInt();

		System.out.println("Kilos de manzanas (Semestre 1): ");
		int manzanas1 = s.nextInt();
		
		System.out.println("Kilos de manzanas (Semestre 2): ");
		int manzanas2 = s.nextInt();
		
		double total = (peras1 + peras2) * 1.95 + (manzanas1 + manzanas2) * 2.35; 
		
		System.out.printf("El total anual es %.2f € \n", total);

	}

}
