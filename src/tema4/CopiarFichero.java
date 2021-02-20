package tema4;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopiarFichero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			copiarFichero("C:\\pruebas\\sidnegro.jpg", "C:\\pruebas\\sidcopia3.jpg");
		}
		//Controlamos el error de Entrada Salida
		catch (IOException e) {
			e.printStackTrace();
		}

	}

	/**
	 * @param fOrigen  ruta del fichero origen
	 * @param fDestino ruta del fichero destino
	 * @return -1 Si ha habido un error y 0 si ha copiado el fichero bien
	 */
	public static int copiarFichero(String fOrigen, String fDestino) throws IOException {
		//Creamos un objeto de tipo File que representa al fichero real 
		//de nuestro directorio
		File ficheroLectura = new File(fOrigen);

		File ficheroEscritura = new File(fDestino);

		//Creamos un FileInputStream para poder leer del fichero y un output para escribir
		FileInputStream fLec = new FileInputStream(ficheroLectura);

		FileOutputStream fEsc = new FileOutputStream(ficheroEscritura);

		//Creamos un array de bytes para marcar el tamaño del buffer
		//de lectura
		byte tamano[] = new byte[25];

		//El BufferedInputStream hace que la lectura sea por buffer
		BufferedInputStream bs = new BufferedInputStream(fLec);
		BufferedOutputStream bo = new BufferedOutputStream(fEsc);

		//Leemos la primera vez
		int leidos = bs.read(tamano);

		//Vamos leyendo del fichero enel array tamano de 25 en 25 bytes
		//Que es el tamaño de nuestro buffer
		//Cuando se acabe el fichero no podrá leer mas y devuelve -1 y entonces acaba el bucle
		while (leidos != -1) {

			//Escribirmos el array de bytes en el fichero de salida
			bo.write(tamano);

			//Leemos la siguiente vez
			leidos = bs.read(tamano);

		}
		//Importante, cerrar los Stream una vez finalizada la E/S

		fLec.close();
		fEsc.close();

		return 0;

	}

}
