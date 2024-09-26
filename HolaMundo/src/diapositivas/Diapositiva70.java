package diapositivas;

import java.util.Scanner;

public class Diapositiva70 {
	
	public static void main(String[] args) {
		
		Scanner sca = new Scanner(System.in);
		
		System.out.println("¿Cuántos años tienes?");
		int edad = sca.nextInt();
		
		boolean edadLaboral = (edad >= 16) && (edad < 67);

		System.out.println(edadLaboral);
		
	}

}
