package Tema1;

public class EjemploCadenas {

	static int num1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Programa que utiliza varias funciones de cadenas
		 */

		// Declaramos una variable de tipo cadena (String)
		String nombre;
		String cadenaNumero;
		int numero = 10;

		String ejemplo = "Victor Pablo Galvan Florez";

		System.out.println(ejemplo.substring(7, 12));

		num1 = numero;

		nombre = "Victor Pablo Galvan Florez";

		// Para comparar cadenas podemos utilizar el simbolo ==
		// NO CONFUNDIR CON EL OPERADOR DE ASIGNACION =
		if (nombre == "Victor Pablo Galvan Florez") {
			System.out.println("Es igual");
		}

		// Para comparar dos cadenas ignorando mayúsculas y minúsculas
		// Utilizamos la función equalsIgnoreCase que nos devuelve
		// true en caso de ser iguales lo que hará que entre
		// en el bloque del if
		if (nombre.equalsIgnoreCase("ViCtor PaBlo GAlvan FLOREZ")) {
			System.out.println("Es igual TAMBIÉN");
		}

		// Mostramos por pantalla la unión o concatenación
		// De la cadena literal "mi nombre es" y
		// el contenido de la variable nombre
		System.out.println("Mi nombre es: " + nombre);

		// El método length muestra el número de carácteres
		System.out.println("Mi nombre tiene " + nombre.length() + " caracteres");

		nombre = nombre.concat(" hola ");
		System.out.println(nombre.concat(" es precioso"));

		// Utilizamos la función toUpperCase para poner en mayúsculas
		// la cadena de texto
		System.out.println(nombre.toUpperCase());

		// Utilizamos la función subString que nos devolverá
		// Una porción de la cadena inicial
		System.out.println("Mi segundo nombre es: " + nombre.substring(7, 13));

		// Para cambiar el tipo de dato de cadena de número a texto
		// Se utiliza la función valueOf() de la clase String
		cadenaNumero = String.valueOf(numero);
		System.out.println("Valor de la cadenaNumero: " + cadenaNumero);

	}

}
