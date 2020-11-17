package tema2.bucles;

import java.util.Scanner;

public class CalculadoraBucle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * El programa lee dos numeros y realiza calculos sobre ellos, cuando acaba
		 * pregunta si se desea realizar otro calculo, debe de seguir realizando
		 * calculos mientras la respuesta sea 's' o 'S'
		 * 
		 * String teclado.next().charAt(0) System.in.read()
		 * 
		 * .charAt(0)
		 */
		Scanner teclado = new Scanner(System.in);
		char car = 'S';

		do {
			// Codigo de la calculdora

			System.out.println("¿Quieres hacer otra operación (s/n)?");
			car = teclado.next().charAt(0);

		} while (car == 's' || car == 'S');

	}

}
