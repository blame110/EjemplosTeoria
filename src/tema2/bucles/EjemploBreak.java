package tema2.bucles;

import java.util.Scanner;

public class EjemploBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// El programa lee una cadena de texto
		// Y un car�cter, y nos devuelve la primera
		// Posicion de dicho caracter en la cadena

		String texto;
		char car;
		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduce una cadena: ");
		texto = teclado.nextLine();

		System.out.print("Introduce el car�cter a buscar: ");
		car = teclado.next().charAt(0);

		for (int i = 0; i <= texto.length() - 1; i++) {

			System.out.println("Caracter " + texto.charAt(i));

			// Continue salta directamente a la siguiente
			// iteracion del bucle
			if (i >= 5)
				continue;

			// Break hace que se salga del bucle for y no busque mas
			if (car == texto.charAt(i)) {
				System.out.println("Se ha encontrado " + car + " en la posicion " + (i + 1));
				break;

			}

		}

	}
}
