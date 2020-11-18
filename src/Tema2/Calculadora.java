package Tema2;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i <= 10; i++) {

			System.out.println("\nTabla de Multiplicacion del " + i + "\n");

			for (int j = 1; j <= 10; j++) {
				System.out.println(i + " x " + j + " = " + i * j);
			}
		}

	}

}
