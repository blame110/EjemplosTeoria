package Tema1;
import java.util.Scanner;

public class EjemploCondicionalSimple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int edad;

		Scanner teclado = new Scanner(System.in);

		System.out.print("Escribe tu edad: ");
		edad = teclado.nextInt();

		if (edad >= 18) {
			System.out.println("Eres mayor de edad");
		}

		teclado.close();

	}

}
