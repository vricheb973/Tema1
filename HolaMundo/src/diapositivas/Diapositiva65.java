package diapositivas;

import java.util.Scanner;

public class Diapositiva65 {
	
	public static void main(String[] args) {
		
		Scanner sca = new Scanner(System.in);
		
		System.out.println("¿Cuántos años tienes?");
		int edad = sca.nextInt();
		
		boolean esMayor = (edad >= 18);
		
		System.out.println(esMayor);
		
	}

}
