package actividadesMoodle;

import java.util.Scanner;

public class Actividad1 {

	public static void main(String[] args) {

		/*
		 * Un alumno desea saber cual será su calificación final en la materia de Programación. 
		 * Dicha calificación se compone de los siguientes porcentajes:
		 * - 55% del promedio de sus tres calificaciones parciales.
		 * - 30% de la calificación del examen final.
		 * - 15% de la calificación de un trabajo final.
		 */
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Nota del primer parcial: ");
		double parcial1 = s.nextDouble();
	
		System.out.println("Nota del segundo parcial: ");
		double parcial2 = s.nextDouble();
		
		System.out.println("Nota del tercera parcial: ");
		double parcial3 = s.nextDouble();
		
		System.out.println("Nota del examen final: ");
		double examen = s.nextDouble();
		
		System.out.println("Nota del trabajo final: ");
		double trabajo = s.nextDouble();
		
		double mediaParciales = (parcial1 + parcial2 + parcial3) / 3;
		
		double notaFinal = mediaParciales * 0.55 + examen * 0.3 + trabajo * 0.15;
		
		System.out.printf("La calificación final es %.3f \n", notaFinal);

	}

}
