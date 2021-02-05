package tema4;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class EscrituraTextos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {

			Scanner teclado = new Scanner(System.in);

			//Preguntamos el nombre del fichero
			String fichero = "";
			System.out.println("Nombre del fichero a Escribir(sin espacios): ");
			fichero = teclado.nextLine();
			fichero = "C:\\pruebas\\" + fichero;

			//FileWriter es similar a File, permite escribir al final del fichero sin borrar
			FileWriter fw = new FileWriter(fichero, true);

			//Printwriter es el objeto que permite escribir sobre el fichero de texto
			PrintWriter out = new PrintWriter(fw);

			//En linea iremos leyendo los datos 
			String linea = "";

			System.out.println("Introduce lineas y acaba escribiendo en una linea fin\n");

			//Mientras no se escriba fin en una linea seguimos leyendo y copiando en el fichero
			linea = teclado.nextLine();
			while (!linea.equals("fin")) {

				//Escribimos en el fichero
				out.println(linea);

				linea = teclado.nextLine();

			}

			fw.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
