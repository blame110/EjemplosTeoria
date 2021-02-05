package tema4;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
//Un Buffer se refiere al tamaño de cada lectura
import java.io.IOException;

public class lecturaBinario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			//Creamos un objeto de tipo File que representa al fichero real 
			//de nuestro directorio
			File fichero = new File("c:\\pruebas\\lectura.txt");

			//Creamos un FileInputStream para poder leer del fichero
			FileInputStream fLec = new FileInputStream(fichero);

			//Creamos un array de bytes para marcar el tamaño del buffer
			//de lectura
			byte tamano[] = new byte[25];

			//El BufferedInputStream hace que la lectura sea por buffer
			BufferedInputStream bs = new BufferedInputStream(fLec);

			//Leemos la primera vez
			int leidos = bs.read(tamano);

			//Vamos leyendo del fichero enel array tamano de 25 en 25 bytes
			//Que es el tamaño de nuestro buffer
			//Cuando se acabe el fichero no podrá leer mas y devuelve -1 y entonces acaba el bucle
			while (leidos != -1) {
				//Para cada lectura de buffer mostramos todos los caracteres
				for (int i = 0; i < leidos; i++) {
					System.out.print((char) tamano[i]);
				}

				//Leemos la siguiente vez
				leidos = bs.read(tamano);

			}
			//Importante, cerrar los Stream una vez finalizada la E/S
			bs.close();
			fLec.close();
		}
		//Controlamos el error de Entrada Salida
		catch (IOException e) {
			e.printStackTrace();
		}

	}

}
