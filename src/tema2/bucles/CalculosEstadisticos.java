package tema2.bucles;

import java.util.Scanner;

public class CalculosEstadisticos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i;
		int cantidad;
		int num;
		int suma;
		int max;
		int min;
		Scanner teclado = new Scanner(System.in);

		System.out.print("Cuántos números hay que tratar?:");
		cantidad = teclado.nextInt();

		i = 0;
		suma = 0;
		max = -2147483648;
		min = 2147483647;
		while (i < cantidad) {
			// Leemos los números
			System.out.print("Introduce el número " + (i + 1) + ":");
			num = teclado.nextInt();

			// Calculamos el máximo
			// Si el valor leido es mayor que el máximo actual
			// Pasa a ser el nuevo maximo
			if (num > max)
				max = num;

			if (num < min)
				min = num;

			// Vamos añadiendo los números a la variable suma
			suma = suma + num;

			i++;
		}

		System.out.println("La suma de los numeros es " + suma);
		System.out.println("La media de los numeros es " + ((float) suma / cantidad));
		System.out.println("El máximo es " + max);
		System.out.println("El minimo es " + min);

	}

}
