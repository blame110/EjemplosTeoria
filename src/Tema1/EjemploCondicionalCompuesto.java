package Tema1;
import java.util.Scanner;

public class EjemploCondicionalCompuesto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int edad;

		Scanner teclado = new Scanner(System.in);

		System.out.print("Escribe tu edad: ");
		edad = teclado.nextInt();

		// Sentencia condicional compuesta
		// Evalua una condición
		if (edad == 18) {
			// Este código sólo lo ejecuta si la condición es cierta
			// En este caso si el contenido de la variable edad es mayor o igual a 18
			System.out.println("Eres mayor de edad");
		} else {
			// Este código lo ejecuta si la condición del if es falsa
			System.out.println("Todavía te falta un poco!");
		}

		System.out.println("Siempre sale este mensaje");

		teclado.close();
	}

}
