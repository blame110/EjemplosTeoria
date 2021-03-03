package examenes;

public class pruebaLectura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//LecturaDatos.leerDatos("C:\\pruebas\\lectura.txt");

		//Defino un array de String para recoger lo que devuelve la funcion
		//leerDatos Arrat
		String lectura[];

		lectura = LecturaDatos.leerDatosArray("C:\\pruebas\\lectura.txt");

		for (int i = 0; i < lectura.length; i++) {
			System.out.println("Linea" + (i + 1) + ": " + lectura[i]);
		}

	}

}
