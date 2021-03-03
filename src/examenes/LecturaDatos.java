package examenes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class LecturaDatos {

	/*
	 * Leerá del fichero los siguientes datos de una película, el nombre, 
	 * año, puntuación,duración, director, vista. El alumno elegirá el tipo 
	 * de dato adecuado para cada variable.Se proporciona un fichero de ejemplo 
	 * con datos por si se quiere utilizar, o se puede crear uno propio.
	
	Se leerán datos utilizando un bucle y se irán leyendo línea a línea. 
	Los datos van separados por espacios. Se seguirán leyendo datos hasta que 
	no haya más datos en el fichero.
	
	Para cada línea se irá separando cada campo utilizando strinktokenizer, 
	se asignarán los datos a las variables, previa conversión de tipos, y 
	se mostrarán por pantalla en un formato similar al siguiente
	
	Linea 1:
	pelicula: Titanic
	año: 2001
	puntuación:8
	duración: 2
	vista:si
	
	Linea 2:
	….
	
	 */

	public static int leerDatos(String fichero) {

		try {

			//Abrimos el fichero con file
			File arch = new File(fichero);
			//Utilizamos FileReader y BufferedReader para poder leer linea a linea en modo texto
			FileReader fr = new FileReader(arch);
			BufferedReader br = new BufferedReader(fr);

			//Leemos la primera linea del fichero
			String linea = br.readLine();

			int i = 1;
			//Mientras haya lineas en el fichero seguimos leyendo
			while (linea != null) {
				//Separamos los elementos de la linea con StringTokenizer
				StringTokenizer lec = new StringTokenizer(linea);

				System.out.println("Linea " + i + ":");
				System.out.println("Pelicula:" + lec.nextToken());
				System.out.println("año:" + lec.nextToken());
				System.out.println("Puntuacion:" + lec.nextToken());
				System.out.println("Duración:" + lec.nextToken());
				System.out.println("Vista:" + lec.nextToken());

				//Leemos la siguiente linea
				linea = br.readLine();
				i++;
			}

			fr.close();
			return 0;

		} catch (IOException e) {
			e.printStackTrace();
			return -1;
		}

	}

	/*
	 * Función String[] leerDatosArray(String fichero)
	
	Leera del fichero que se introduce cómo parámetro linea a linea 
	y irá guardando lo leído en un array de strings que será lo que devolverá
	
	
	 */

	public static String[] leerDatosArray(String fichero) {

		//En lineas iremos guardando todas las lineas leidas del fichero
		String lineas[];

		try {

			//Abrimos el fichero con file
			File arch = new File(fichero);
			//Utilizamos FileReader y BufferedReader para poder leer linea a linea en modo texto
			FileReader fr = new FileReader(arch);
			BufferedReader br = new BufferedReader(fr);

			//Leemos la primera linea del fichero
			String linea = br.readLine();

			//Primero tenemos que ver cuantas lineas tiene el fichero
			int numLineas = 0;
			//Mientras haya lineas en el fichero seguimos leyendo
			while (linea != null) {

				numLineas++;
				//Leemos la siguiente linea
				linea = br.readLine();

			}

			fr.close();
			fr = new FileReader(arch);
			br = new BufferedReader(fr);

			//Una vez sabemos las lineas que hay en el fichero
			//Definimos el tamaño del array lineas

			lineas = new String[numLineas];

			//Leemos todas las lineas del fichero
			for (int i = 0; i < numLineas; i++) {
				//Leemos la siguiente linea
				linea = br.readLine();
				//Guardo cada linea leida en una posicion del array
				lineas[i] = linea;

			}

			//lineas es un array, un conjunto de muchos datos de tipo String
			//Cada uno de los elementos se accede 
			//utilizando [posicion], en este caso lineas[4], por ejemplo

			fr.close();
			return lineas;

		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

}
