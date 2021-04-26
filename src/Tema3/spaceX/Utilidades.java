package Tema3.spaceX;


/**
 * @version 1
 * 
 *
 *         Constantes TIPO_NAVE 1 TIPO_PERSONA 2 TIPO_ALA 3 TIPO_ARMA 4
 *
 *         Crear los siguientes metodos
 *
 *         String nombreAleatorio(int tipo) Devuelve un nombre de longitud entre
 *         6-10 Si es una persona devolvera en el string dos palabras de esa
 *         longitud separadas por un espacio Los nombres se crearan añadiendo
 *         carácteres aleatorios a la cadena de caracteres.
 *
 *
 *
 */
public class Utilidades {
	// CONSTANTES
	public static int TIPO_NAVE = 1;
	public static int TIPO_PERSONA = 2;
	public static int TIPO_ALA = 3;
	public static int TIPO_ARMA = 4;

	// METODO

	/**
	 * Genera un nombre aleatorio
	 * 
	 * @param tipo Tipo int, de los valores: TIPO_NAVE = 1; TIPO_PERSONA = 2;
	 *             TIPO_ALA = 3; TIPO_ARMA = 4;
	 * @return retorna el nombre aleatorio generado
	 */
	public static String nombreAleatorio(int tipo) {
		String nombre = "";
		int longitud = (int) (Math.random() * (11 - 6)) + 6;
		;

		for (int i = 0; i < longitud; i++) {
			int aleatorio = (int) (Math.random() * (24)) + 65;
			char car = (char) aleatorio;
			nombre = nombre + car;
		}
		if (tipo == TIPO_PERSONA) {
			nombre = nombre + " ";
			longitud = (int) (Math.random() * (11 - 6)) + 6;
			for (int i = 0; i < longitud; i++) {
				int aleatorio = (int) (Math.random() * (24)) + 65;
				char car = (char) aleatorio;
				nombre = nombre + car;
			}
		}

		return nombre;
	}

}