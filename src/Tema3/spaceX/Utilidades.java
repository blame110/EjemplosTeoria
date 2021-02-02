package Tema3.spaceX;

/**
 * @version 1
 * @author pablo
 *
 *         Constantes
 *         TIPO_NAVE 1
 *         TIPO_PERSONA 2
 *         TIPO_ALA 3
 *         TIPO_ARMA 4
 *
 *         Crear los siguientes metodos
 *
 *         String nombreAleatorio(int tipo)
 *         Estatico para poder ser llamado desde cualquier sitio sin crear un objeto
 *         Devuelve un nombre de longitud entre 6-10
 *         Si es una persona devolvera en el string dos palabras de esa longitud separadas
 *         por un espacio
 *         Los nombres se crearan añadiendo carácteres aleatorios a la cadena de caracteres.
 *
 *
 *
 */
public class Utilidades {

	public static final int TIPO_NAVE = 1;
	public static final int TIPO_PERSONA = 2;
	public static final int TIPO_ALA = 3;

	/**
	 * Genera un nombre aleatorio
	 * 
	 * @param tipo tipo de nombre a generar puede ser PERSONA, NAVE, ALA O ARMA
	 * @return
	 */
	public static String nombreAleatorio(int tipo) {

		String nombre = "";

		if (tipo == this.TIPO_PERSONA) {
			//Generamos el nombre con 2 palabras
		} else {
			//Generamos el nombre con una palabra
		}

		return nombre;

	}

}
