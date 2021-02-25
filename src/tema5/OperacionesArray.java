package tema5;

public class OperacionesArray {

	public int minimo(int numeros[]) {
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

		return minimo;
	}

}
