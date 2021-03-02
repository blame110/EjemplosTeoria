package examenes;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class EscrituraDatos {

	public EscrituraDatos() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int guardarDatos(String fichero) {

		//Variables que leemos
		String nombre = "";
		int anio = 0;
		double puntuacion;
		int duracion = 0;
		String director;
		String vista;
		//En linea concatenamos todos los datos y la ponemos en el fichero
		String linea = "";
		//Continuar lo usaremos para preguntar si quiere
		//Introducir mas datos
		String continuar = "S";
		Scanner teclado = new Scanner(System.in);
		try {
			//FileWriter es similar a File, permite escribir al final del fichero sin borrar
			FileWriter fw = new FileWriter(fichero, true);

			//Printwriter es el objeto que permite escribir sobre el fichero de texto
			PrintWriter out = new PrintWriter(fw);

			while (continuar.equalsIgnoreCase("S")) {
				//Leemos los datos
				System.out.println("Nombre:");
				nombre = teclado.next();

				System.out.println("Año:");
				anio = teclado.nextInt();

				System.out.println("Puntuación:");
				puntuacion = teclado.nextDouble();

				System.out.println("Duración:");
				duracion = teclado.nextInt();

				System.out.println("Director:");
				director = teclado.next();

				System.out.println("Vista(S/N):");
				vista = teclado.next();

				//Concantenamos en el string linea todos los datos en orden
				linea = linea.concat(nombre);
				linea = linea.concat(" ");
				linea = linea.concat(Integer.toString(anio));
				linea = linea.concat(" ");
				linea = linea.concat(Double.toString(puntuacion));
				linea = linea.concat(" ");
				linea = linea.concat(Integer.toString(duracion));
				linea = linea.concat(" ");
				linea = linea.concat(director);
				linea = linea.concat(" ");
				linea = linea.concat(vista);

				//Escribimos la linea en el fichero
				out.println(linea);

				//Preguntamos si quiere introducir mas
				System.out.println("¿Quieres introducir mas peliculas?(S/N):");
				continuar = teclado.next();
			}
			//Cerramos los objetos de escritura
			fw.close();
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
			return -1;
		}

		return 0;
	}

	public int guardarDatos(String fichero, String lineas[]) {

		Scanner teclado = new Scanner(System.in);
		try {
			//FileWriter es similar a File, permite escribir al final del fichero sin borrar
			FileWriter fw = new FileWriter(fichero, true);

			//Printwriter es el objeto que permite escribir sobre el fichero de texto
			PrintWriter out = new PrintWriter(fw);

			for (int i = 0; i < lineas.length; i++) {

				//Escribimos la linea en el fichero
				out.println(lineas[i]);

			}
			//Cerramos los objetos de escritura
			fw.close();
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
			return -1;
		}

		return 0;
	}

}
