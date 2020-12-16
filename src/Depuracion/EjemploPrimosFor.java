package Depuracion;

import java.util.Scanner;

public class EjemploPrimosFor {

	public static void main(String[] args) {

		// bucle que recorre con for los 100 primeros números
		/*
		 * int i = 1; while (i <= 100) { System.out.println(i); i++; }
		 * 
		 * // Equivalente en versión for for (int j = 1; j <= 100; j++) {
		 * System.out.println(j); }
		 */
		// Número que leemos de teclado
		int num;
		// La variable es primo tendra true si el numero es primo
		// y false si no es primo, por defecto consideramos que es primo
		// Y en caso de encontrar un divisor lo pondremos a false
		// Ya que un número es primo sólo si es divisible por si
		// mismo y por 1
		boolean esprimo = true;
		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduce un número:");
		num = teclado.nextInt();

		for (int i = 1; i <= num - 1; i++) {

			// Compruebo si hay algun divisor entre 2
			// y el num-1
			// Un numero es divisible por otro si el resto
			// de la division (%) es 0
			if (num % i == 0) {
				esprimo = false;
			}
		}

		if (!esprimo)
			System.out.println("No es primo");
		else
			System.out.println("Es primo");

	}

}
