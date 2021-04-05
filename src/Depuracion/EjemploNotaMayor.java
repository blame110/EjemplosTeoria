package Depuracion;

import java.util.Scanner;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class EjemploNotaMayor {

	static Logger log = Logger.getLogger(EjemploNotaMayor.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Este programa leera las notas finales de 3 alumnos, mostrará por pantalla la
		 * media y el número de alumno que tiene la nota más alta
		 */

		// Variables
		float nota1, nota2, nota3;
		float media;

		//BasicConfigurator.configure();
		//PropertyConfigurator.configure("log4j.properties");
		
		log.debug("Hemos entrado");

		// Leemos las notas por teclado
		Scanner teclado = new Scanner(System.in);

		System.out.print("Escribe la nota del primer alumno:");
		nota1 = teclado.nextFloat();

		System.out.print("Escribe la nota del segundo alumno:");
		nota2 = teclado.nextFloat();

		System.out.print("Escribe la nota del tercer alumno:");
		nota3 = teclado.nextFloat();

		// Calculamos la media
		media = (nota1 + nota2 + nota3) / 3;
		System.out.println("La nota media es: " + media);

		/*
		 * Para saber que nota es la mayor, comparamos dos notas para saber cual de las
		 * dos es mayor en caso de que la primera nota sea mayor a la segunda, la
		 * comparamos con la tercera En ese caso ya sabriamos con seguridad que es la
		 * mayor de todas
		 */
		if (nota1 > nota2)
			if (nota1 > nota3)
				System.out.println("La nota1, " + nota1 + " es la mayor");
			else
				System.out.println("La nota3, " + nota3 + " es la mayor");
		else if (nota2 > nota3)
			System.out.println("La nota2, " + nota2 + " es la mayor");
		else
			System.out.println("La nota3, " + nota3 + " es la mayor");

	}

}
