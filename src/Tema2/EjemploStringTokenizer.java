package Tema2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;

public class EjemploStringTokenizer {
	public static void main(String[] args) throws java.io.IOException {

		String s1;
		String s2;

		// Cargamos el buffer con el contenido del archivo
		BufferedReader br = new BufferedReader(new FileReader("MyFileReader.txt"));

		// Leemos la primera linea
		s1 = "esta es la frase";
		String buscar = "la";

		System.out.println("La primera linea del archivo es: " + s1);
		System.out.println("La linea tiene " + s1.length() + " caracteres");

		System.out.println();
		System.out.println("Separando la linea en trozos tenemos las siguientes palabras:");

		int numTokens = 0;
		StringTokenizer st = new StringTokenizer(s1);

		// bucle por todas las palabras
		while (st.hasMoreTokens()) {
			s2 = st.nextToken();

			if (s2.equals(buscar)) {
				System.out.println("Se encontro " + buscar);
				break;
			}

			numTokens++;
			System.out.println("    Palabra " + numTokens + " es: " + s2);
		}
	}
}
