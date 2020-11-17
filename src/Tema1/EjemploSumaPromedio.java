package Tema1;

import java.util.Scanner;


public class EjemploSumaPromedio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int suma;
		float promedio;
		int num1, num2, num3, num4;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduce el número1: ");
		num1 = teclado.nextInt();
		
		System.out.print("Introduce el número2: ");
		num2 = teclado.nextInt();
		
		System.out.print("Introduce el número3: ");
		num3 = teclado.nextInt();
		
		System.out.print("Introduce el número4: ");
		num4 = teclado.nextInt();
		
		suma= num1+num2+num3+num4;
		promedio = (float)suma/4;
		
		System.out.println("La suma es :" + suma);
		System.out.println("el promedio es :" + promedio);
		
		
		
		
		
		
		
		
	}

}
