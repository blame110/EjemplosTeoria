package tema2.bucles;

import java.util.Scanner;

public class EjemploBuscar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Este programa lee una palabra sin espacios y un car�cter. Nos muestra la
		 * primera posici�n en la que aparece El car�cter en la palabra.
		 */

		char letra;
		String palabra;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Escribe una palabra:");
		palabra = teclado.next();

		System.out.println("Escribe una letra:");
		letra = teclado.next().charAt(0);

		// Buscamos entre todas las letras de la palabra
		for (int i = 0; i < palabra.length(); i++) {
			// System.out.println("Letra " + palabra.charAt(i));
			if (letra == palabra.charAt(i)) {
				System.out.println("Se ha encontrado en la poscion " + (i + 1));
				// El break sirve para salir directamente
				// de un bucle
				break;
			}
		}

	}

}
