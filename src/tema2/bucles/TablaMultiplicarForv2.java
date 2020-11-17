package tema2.bucles;

import java.util.Scanner;

public class TablaMultiplicarForv2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i;
		int num;
		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduce un número:");
		num = teclado.nextInt();

		for (i = 1; i <= 10; i++) {
			System.out.println(num + " x " + i + " = " + num * i);

		}

	}

}
