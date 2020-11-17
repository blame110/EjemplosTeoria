package Tema2;

import java.util.Scanner;

public class TablaMultiplicar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i;
		int j;
		int numTabla;
		Scanner teclado = new Scanner(System.in);

		/*
		 * Tabla del multiplicar del 5
		 */
		/*
		 * i = 1; while (i <= 10) { System.out.println("5 x " + i + " = " + 5 * i); i++;
		 * }
		 */

		// leemos el número para hacer la tabla
		/*
		 * System.out.print("Escribe la tabla de multiplicar del número: "); numTabla =
		 * teclado.nextInt();
		 * 
		 * i = 1; while (i <= 10) {
		 * 
		 * System.out.println(numTabla + " x " + i + " = " + (numTabla * i));
		 * 
		 * i++; }
		 */
		// Mostramos todas las tablas de multiplicar
		// utilizamos la variable j para ir recorriendo
		// todas las tablas, y la variable i para ir del 1 al 10
		// en cada tabla

		j = 1;
		while (j <= 9) {

			// Para cada vez que entre el en bucle
			// Me saca la tabla de multiplicar
			// del valor que tenga j

			System.out.println("\n*******************************");
			System.out.println("******   Tabla del " + j + "   ********");
			System.out.println("*******************************\n");
			i = 1;
			while (i <= 10) {

				System.out.println(j + " x " + i + " = " + (j * i));
				i++;
			}

			j++;
		}

	}

}
