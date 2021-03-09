package tema5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OperacionesArray {

	public static int minimo(int numeros[]) {
		int minimo = Integer.MAX_VALUE;

		//Una forma de recorrer un array de elementos es la siguiente
		// Definimos como una variable del tipo de elementos del array
		//y despues ponemos : y el nombre del array de elementos a recorrer
		//Cada vez que entra en el bucle la variable ira pasando a tener
		//El valor de la siguiente posicion en el array

		for (int num : numeros) {
			if (num < minimo)
				minimo = num;

		}

		//Este bucle es equivalente al anterior
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] < minimo)
				minimo = numeros[i];

		}

		return minimo;
	}

	void ArraysMultiples() {

		final int BARCO = 1;
		final int AGUA = 2;
		final int DISPARO = 3;

		//Para crear arrays de mas de una dimension, simplemente
		//es poner mas[] en la declaracion

		//Mapa de puntos en 2D
		int barcos[][];

		//Nombres de los vagones de los trenes
		String trenes[][];

		//Las coordenadas del mapa estaran entre 0 y 8
		barcos = new int[8][8];

		//Cada tren tiene un tamaño de vagones distino
		//Para definir estos tamaños primero se define el tamaño
		//De la primera dimension, la segunda la dejamos vacia
		trenes = new String[10][];

		//Luego para cada tren vamos definiendo el tamaño
		//de la segunda dimension
		trenes[0] = new String[3];
		trenes[1] = new String[7];
		trenes[2] = new String[2];
		trenes[3] = new String[5];
		trenes[4] = new String[6];
		trenes[5] = new String[8];
		trenes[6] = new String[5];
		trenes[6] = new String[3];
		trenes[8] = new String[5];
		trenes[9] = new String[2];

		//Inicializacion de las posiciones de los barcos a agua
		for (int i = 0; i < barcos.length; i++) {
			for (int j = 0; i < barcos[i].length; j++) {
				barcos[i][j] = AGUA;
			}
		}

		//uno de 4
		barcos[1][1] = BARCO;
		barcos[1][2] = BARCO;
		barcos[1][3] = BARCO;
		barcos[1][4] = BARCO;

	}

	public static void main(String args[]) {

		String direccion = "calle manzanilla 14, 34123, Sevilla;";

		String cp = direccion.substring(21, 26);

		String localizacion = direccion.substring(28);

		int numeros[][];

		numeros = new int[10][20];

		//La longitud de la primera dimension
		//es directamente sobre la variable
		System.out.println("Longitud primera dimension " + numeros.length);
		System.out.println("Longitud segunda dimension " + numeros[2].length);

		Double numero;
		numero = (double) 345 / 7;

		//System.out.println(numero);

		//System.out.printf("el numero es %.2f, el cp es %s", numero, cp);

		//System.out.println("El cp es:" + cp + " y la ciudad " + localizacion);

		//Indexof busca un string dentro de otro y nos devuelve
		//La posición donde lo ha encontrado, sino lo encuentra
		//devuelve 0
		//System.out.println(direccion.indexOf(cp));

		direccion = direccion.replace(cp, "11111");

		//System.out.println(direccion);

		//Ejemplo de patron de dni, 
		//8 posiciones númericas y una letra
		Pattern p = Pattern.compile("[0-9]{8,8}[a-zA-Z]");
		Matcher m = p.matcher("10011111s");
		if (m.matches())
			System.out.println("Si, contiene el patrón");
		else
			System.out.println("No, no contiene el patrón");
	}

}
