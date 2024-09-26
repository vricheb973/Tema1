package actividades;

import java.util.Scanner;

public class Actividad2 {
	
	public static void main(String[] args) {
		
		Scanner sca = new Scanner(System.in);
	
		System.out.println("Dime la base del rectángulo: ");
		int base = sca.nextInt();
		
		System.out.println("Dime la altura del rectágulo: ");
		int altura = sca.nextInt();
		
		int perimetro = 2 * (base+altura);
		int area = (base * altura);
		
		System.out.println("El perímetro es " + perimetro + " y el área es " + area);
		
	}

}
