package examenes;

public class pruebaEscritura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Creamos un array de String para introducir
		//Los datos de las peliculas

		String peliculas[] = new String[4];

		peliculas[0] = "tiburon 1990 3,4 80 pepe S";
		peliculas[1] = "tiburon2 1990 3,4 80 pepe S";
		peliculas[2] = "tiburon3 1990 3,4 80 pepe S";
		peliculas[3] = "tiburonlavenganzadelamuelte 1990 3,4 80 pepe S";

		EscrituraDatos escritura = new EscrituraDatos();

		//escritura.guardarDatos("c:\\pruebas\\escritura.txt");

		//Llamamos a la segunda funcion
		escritura.guardarDatos("c:\\pruebas\\escritura2.txt", peliculas);

	}

}
