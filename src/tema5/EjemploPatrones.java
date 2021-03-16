package tema5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EjemploPatrones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double numero = (double) 3 / 13;

		String salida = String.format("El numero es %.2f", numero);

		System.out.println(salida);

		//Patron "[0-9]-[a-z]" -- 1-s 6-g

		//Patron dni "[0-9]{8,8}-[a-zA-Z]" -- 
		//Patron telefono fijo "\\(+[0-9]{2,3}\\)[0-9]{9,9}"

		//Definimos el patron
		Pattern p = Pattern.compile("[0-9]{8,8}-[a-zA-Z]");

		String ciudades[];
		String[] ciudades2;

		//Ejemplo de array no regular de dos dimensiones
		//La primera dimension seria los trenes
		//Y en la segunda para cada tren los vagones
		String vagones[][];

		//Quiero 9 trenes
		vagones = new String[9][];

		//Cada tren tiene un numero de vagones distinto
		//Hay que inicializarlos uno a uno
		vagones[0] = new String[5];
		vagones[1] = new String[9];
		vagones[2] = new String[4];
		//..

		//El matcher es la cadena de texto a comparara
		//Con el patron
		Matcher m = p.matcher("23456345-E");

		//matches devuelve true si el patron se cumple
		if (m.matches())
			System.out.println("Si, contiene el patrón");
		else
			System.out.println("No, no contiene el patrón");
	}

}
