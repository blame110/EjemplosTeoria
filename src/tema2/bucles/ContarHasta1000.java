package tema2.bucles;

public class ContarHasta1000 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;

		// Version1 contar hasta 1000
		i = 1;
		while (i <= 10) {
			// Codigo
			System.out.println(i);

			// Pasar al siguiente elemento
			i++;
		}

		// Version2 Mostrar pares hasta 1000
		// Inicializamos la i justo antes
		// de empezar el bucle
		i = 1;
		while (i <= 10) {
			// Codigo

			if (i % 2 == 0)
				System.out.println(i);

			// Pasar al siguiente elemento
			i++;
		}

		// Version2.1 Mostrar pares hasta 1000
		// Inicializamos la i justo antes
		// de empezar el bucle
		i = 2;
		while (i <= 10) {
			// Codigo

			System.out.println(i);

			// Pasar al siguiente elemento
			i = i + 2;
		}

	}

}
