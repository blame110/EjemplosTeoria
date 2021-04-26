package Tema1;

import java.util.Scanner;

import com.google.gson.Gson;

public class CalculoPerimetroCirculo {

	public static void main(String[] args) {

		// Programa que nos lee el radio de una
		// Circunferencia y nos muestra el perímetro
		// utilizando double

		Gson hola;
		double radio;
		double pi = 3.14159;
		double perimetro;
		int integer;

		System.out.println("Introduce el radio");
		Scanner teclado = new Scanner(System.in);
		radio = teclado.nextDouble();

		calcularadio(radio, pi);

		teclado.close();

	}

	private static void calcularadio(double radio, double pi) {
		double perimetro;
		perimetro = 2 * pi * radio;

		System.out.print("El perimetro es :" + perimetro + " \nQue pase un buen dia");
	}

}
