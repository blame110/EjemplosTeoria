package tema2.bucles;

public class EjemploParesContinue {

	public static void main(String[] args) {

		// Bucle que recorre 100 elementos
		// Mostramos los pares
		for (int i = 1; i <= 100; i++) {

			// Si el n�mero es impar ejecutamos continue
			// Que hace que salte a la siguiente repeticion
			// del for sin ejecutar el system.out.println
			if (i % 2 != 0)
				continue;

			System.out.println(i);

		}
	}

}
