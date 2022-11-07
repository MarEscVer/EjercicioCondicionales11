package unico;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		String res1;
		String res2;
		String res3;
		int contador = 0;
		
		System.out.println("Pregunta 1");
		System.out.println("A - opción");
		System.out.println("B - opción");
		res1 = teclado.nextLine();
		if (res1.equalsIgnoreCase("B")) {
			contador += 1;
		}
		
		System.out.println("Pregunta 2");
		System.out.println("A - opción");
		System.out.println("B - opción");
		res2 = teclado.nextLine();
		if (res2.equalsIgnoreCase("A")) {
			contador += 1;
		}
		
		System.out.println("Pregunta 3");
		System.out.println("A - opción");
		System.out.println("B - opción");
		res3 = teclado.nextLine();
		if (res3.equalsIgnoreCase("A")) {
			contador += 1;
		}
		
		System.out.println("La calificación final es: " + contador);
	}
}