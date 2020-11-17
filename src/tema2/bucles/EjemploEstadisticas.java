package tema2.bucles;

import java.util.Scanner;

public class EjemploEstadisticas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * El programa leera los datos de alumnos en particular el nombre, la edad y la
		 * nota media Leera alumnos hasta que diga que no hay mas alumnos Calculará el
		 * número de alumnos mayores de edad y su porcentaje El numero de suspensos y su
		 * porcentaje Y la edad media
		 */

		char masAlumnos = 's';
		Scanner teclado = new Scanner(System.in);
		String nombre = "";
		int edad;
		int notaMedia;
		int mayoresEdad = 0;
		// numAlumnado contabilizará los alumnos leidos
		int numAlumnado = 0;
		int suspensos = 0;
		int sumaEdad = 0;

		do {
			// Leemos los datos
			System.out.print("Nombre: ");
			nombre = teclado.next();

			System.out.print("Edad: ");
			edad = teclado.nextInt();

			System.out.print("Nota Media:");
			notaMedia = teclado.nextInt();

			// Un alumno mas leido
			numAlumnado++;

			// Incrementamos los mayores de edad si es mayor de 18
			if (edad >= 18)
				mayoresEdad++;

			if (notaMedia < 5)
				suspensos++;

			// Incrementamos sumaEdad con la edad
			// del alumno actual
			sumaEdad = sumaEdad + edad;

			// Le preguntamos si hay mas alumnos
			System.out.print("Hay mas alumnos(s/n)?");
			masAlumnos = teclado.next().charAt(0);

		} while (masAlumnos == 's' || masAlumnos == 'S');

		// Mostramos los resultados
		System.out.println("Hay " + mayoresEdad + " alumnos mayores de edad");
		System.out.println("El " + (mayoresEdad * 100 / numAlumnado) + "% de los alumnos son mayores de edad");

		System.out.println("Hay " + suspensos + " alumnos suspensos");
		System.out
				.println("El " + (suspensos * 100 / numAlumnado) + "% de los alumnos tienen menos de 5 de nota media");

		System.out.println("La edad media es: " + sumaEdad / numAlumnado);

	}

}
