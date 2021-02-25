package tema5;

public class EjemploArray1 {

	/**
	 * Esto es un buen javadoc
	 */
	public static void main(String[] args) {
		//Un array se define como cualquier otra variable
		//Pero al final lleva apertura y cierre de corchetes
		int numeros[]; //Si añadimos esto =  {2,3,1,7,5}; automaticamente se asignan los valores

		//Los arrays deben de ser inicializados con el tamaño o longitud del array
		//es necesario pasa hacer espacio en memoria para los valores
		//Se inicializa muy similar a un objeto
		numeros = new int[5];

		//Asignamos valores al array poniendo las posiciones
		numeros[0] = 2;
		numeros[1] = 6;
		numeros[2] = 8;
		numeros[3] = -40000;
		numeros[4] = 22;

		//Para acceder a un elemento del array ponemos dentro de los corchetes 
		//la posicion del elemento al cual queremos acceder, por ejemplo
		//numeros[3], se le puede asignar un valor, por ejemplo  numeros[0]=2;

		//Recorremos el array para calcular el maximo y la media
		int max = Integer.MIN_VALUE;

		int media = 0;
		for (int i = 0; i < numeros.length; i++) {
			//System.out.println("Numero en posicion " + (i + 1) + " " + numeros[i]);

			//Si el número es mayor que nuestro maximo
			//Es el nuevo maximo
			if (numeros[i] > max)
				max = numeros[i];
			//En la media vamos guardando la suma de todos
			media = media + numeros[i];

		}

		media = media / numeros.length;
		//System.out.println("El máximo es " + max);
		//System.out.println("La media es " + media);

		//Prueba de minimo
		OperacionesArray operaciones = new OperacionesArray();

		System.out.println("El minimo es: " + operaciones.minimo(numeros));

	}
}
