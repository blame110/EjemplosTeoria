package Tema1;
import java.util.Scanner;

public class ConversionCadenaNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Programa que lee un número como String y lo
		// convierte a int utilizando parseInt
		String lectura = "";
		int numero = 0;
		float decimal = 0.0f;

		Scanner teclado = new Scanner(System.in);

		System.out.print("Leemos un número: ");
		lectura = teclado.nextLine();

		System.out.println("Hemos leido: " + lectura);

		numero = Integer.parseInt(lectura);

		System.out.println("El número por 10 es: " + numero * 10);

		teclado.close();
	}

}
