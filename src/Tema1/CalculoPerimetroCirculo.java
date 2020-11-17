package Tema1;
import java.util.Scanner;

public class CalculoPerimetroCirculo {

	public static void main(String[] args) {

		// Programa que nos lee el radio de una
		// Circunferencia y nos muestra el perímetro
		// utilizando double
		double radio;
		double pi = 3.14159;
		double perimetro;

		System.out.println("Introduce el radio");
		Scanner teclado = new Scanner(System.in);
		radio = teclado.nextDouble();

		perimetro = 2 * pi * radio;

		System.out.print("El perimetro es :" + perimetro + " \nQue pase un buen dia");

		teclado.close();

	}

}
