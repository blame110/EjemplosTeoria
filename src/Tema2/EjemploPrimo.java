package Tema2;

import java.util.Scanner;

public class EjemploPrimo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Un numero es primo si solo es divisible por 1
		// y por si mismo

		int num;
		boolean esPrimo = true;
		Scanner teclado = new Scanner(System.in);

		System.out.print("Escribe un numero: ");
		num = teclado.nextInt();

		for (int i = 2; i < num; i++) {

			if (num % i == 0) {
				esPrimo = false;
				break;
			}
		}

		// Tanto si es primo como si no lo es, mostramos un mensaje
		if (esPrimo)
			System.out.println("El numero " + num + " es primo.");
		else
			System.out.println("El numero " + num + " no es primo.");

	}

}
