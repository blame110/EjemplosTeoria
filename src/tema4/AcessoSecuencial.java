package tema4;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class AcessoSecuencial {

	public static void main(String[] args) {
		// Declarar un objeto de tipo archivo
		DataOutputStream archivo = null;
		DataInputStream fich = null;
		String nombre = null;
		int edad = 0;
		int maxEdad = -10;
		String nombreMax = "";
		try {
			/*FileOutputStream fil = new FileOutputStream("c:\\pruebas\\secuencial.dat", true);
			
			// Creando o abriendo para añadir el archivo
			archivo = new DataOutputStream(fil);
			// Escribir el nombre y los apellidos
			archivo.writeUTF("Antonio López Pérez ");
			archivo.writeInt(33);
			archivo.writeUTF("Pedro Piqueras Peñaranda");
			archivo.writeInt(45);
			archivo.writeUTF("José Antonio Ruiz Pérez ");
			archivo.writeInt(51);
			// Cerrar fichero
			archivo.close();
			// Abrir para leer
			*/
			fich = new DataInputStream(new FileInputStream("c:\\pruebas\\secuencial.dat"));

			//Mientras la lectura del String del nombre no nos devuelva
			//null, implica que todavia hay datos en el fichero

			while ((nombre = fich.readUTF()) != null) {

				System.out.println(nombre);
				edad = fich.readInt();
				System.out.println(edad);

				//Calculo del maximo
				//Si la edad leida es mayor que el máximo actual
				//Es la nueva edad maxima
				if (edad > maxEdad) {
					maxEdad = edad;
					nombreMax = nombre;
				}

			}
			fich.close();

		} catch (FileNotFoundException fnfe) {
			/* Archivo no encontrado */ } catch (IOException ioe) {
			/* Error al escribir */ } catch (Exception e) { /* Error de otro tipo*/
			System.out.println(e.getMessage());
		}

		System.out.println(nombreMax + " es el mas viejo y tiene " + maxEdad + " años");

	}

}
