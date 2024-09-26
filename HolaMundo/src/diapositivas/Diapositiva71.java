package diapositivas;

import java.util.Scanner;

public class Diapositiva71 {
	
	public static void main(String[] args) {
		
		Scanner sca = new Scanner(System.in);

		System.out.println("¿Hay que ir a la biblioteca?");
		boolean biblioteca = sca.nextBoolean();
		
		System.out.println("¿Tienes hechas las tareas?");
		boolean tareas = sca.nextBoolean();

		System.out.println("¿Está lloviendo?");
		boolean lluvia = sca.nextBoolean();
		
		boolean salirALaCalle =  biblioteca || (tareas && !lluvia) ;

		System.out.println(salirALaCalle?"Si":"No");
		
	}

}
