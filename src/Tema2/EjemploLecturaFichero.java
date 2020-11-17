package Tema2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class EjemploLecturaFichero {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {

			FileReader fichero = new FileReader("palabras.txt");
			BufferedReader br = null;

			br = new BufferedReader(fichero);

			// Lectura del fichero
			String linea;
			while ((linea = br.readLine()) != null)
				System.out.println(linea);

		} catch (FileNotFoundException e) {
			System.out.print("No se encontro el fichero");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.print("Error de lectura");
			e.printStackTrace();
		}

	}

}
