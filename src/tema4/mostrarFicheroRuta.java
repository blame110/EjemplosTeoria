package tema4;

import java.io.File;

public class mostrarFicheroRuta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File ruta = new File("c:\\pruebas");

		//Leo los directorios y ficheros de la ruta
		String directorio[] = ruta.list();

		//Muestro por pantalla los directorios
		for (String linea : directorio) {
			System.out.println(linea);
		}
	}

}
