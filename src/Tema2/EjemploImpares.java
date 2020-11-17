package Tema2;

import java.util.Scanner;

public class EjemploImpares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Este programa leera un n�mero y nos mostrara todos los n�meros impares desde
		 * 1 hasta dicho n�mero
		 */

		int num;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce un n�mero:");
		num = teclado.nextInt();

		// Version 1 comprobando los numeros
		for (int i = 1; i <= num; i++) {

			if (i % 2 != 0) {
				System.out.println(i);
			}

		}

		// Version 2 solo los impares
		for (int i = 1; i <= num; i = i + 2) {

			System.out.println(i);

		}

		// Version 1 comprobando los numeros
		for (int i = 1; i <= num; i++) {

			// Si es par nos saltamos el print
			if (i % 2 == 0)
				// Continue salta a la siguiente iteracion del bucle
				continue;

			System.out.println(i);
		}

		// Versi�n 1 comprobando si son impares

	}

}
