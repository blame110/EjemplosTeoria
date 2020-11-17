package Tema1;
import java.util.Scanner;

public class EjemploCadena {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Ejemplo que utiliza la función length() y la función concat
		 */

		String cadena1;
		String cadena2;

		Scanner teclado = new Scanner(System.in);

		System.out.print("Escribe un texto:");
		cadena1 = teclado.nextLine();

		// La función length devuelve la longitud de la cadena
		System.out.println("La longitud de la cadena 1 es: " + cadena1.length());

		cadena2 = " El contenido de la cadena 1 es : ";

		System.out.println(cadena2.concat(cadena1));

		teclado.close();

	}

}
