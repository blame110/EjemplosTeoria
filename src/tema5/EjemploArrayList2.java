package tema5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class EjemploArrayList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Creamos un objeto arraylist de Strings
		ArrayList<String> list = new ArrayList<String>();//Creating arraylist  

		ArrayList<Integer> listaNumeros = new ArrayList<Integer>();

		String fin = "S";
		Scanner teclado = new Scanner(System.in);

		while (fin.equalsIgnoreCase("S")) {
			System.out.println("Introduce un número:");
			//Leemos el numero
			int num = teclado.nextInt();
			//Lo insertamos en el ArrayList
			listaNumeros.add(num);

			System.out.println("¿Quieres Continuar (S/N):");
			//Leemos el numero
			fin = teclado.next();
		}

		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int media = 0;

		//Cerramos el teclado
		teclado.close();
		//Para recorrer el arrayList de numeros 
		//Necesitamos un Iterator

		Iterator<Integer> iter = listaNumeros.iterator();

		while (iter.hasNext()) {
			int numero = iter.next();
			media = media + numero;

			if (numero > max)
				max = numero;

			if (numero < min)
				min = numero;
		}

		System.out.println("El máximo de los números es:" + max);
		System.out.println("El mínimo de los números es:" + min);
		System.out.println("La media de los números es:" + media / listaNumeros.size());

		//Con add añadimos un elemento al arraylist, no hace falta
		//Definir el tamaño previamente como en los arrays normales
		list.add("Ravi");//Adding object in arraylist  
		list.add("Vijay");
		list.add("Ravi");
		list.add("Ajay");

		//La funcion contains busca el elemento en el arrayList y nos devuelve
		//True si esta entre los elementos
		boolean estaNombre = list.contains("Ravdi");

		if (estaNombre)
			System.out.println("El nombre esta en el ArrayList");

		//Para recorrer los arrayList, utilizamos la funcion iterator que nos
		//Devuelve un Iterator con el cual recorrer los elementos
		Iterator<String> itr = list.iterator();

		System.out.println("Tercer String: " + list.get(3));

		//Mientras haya mas elementos vamos sacando y mostrando por pantalla
		//Los elementos del ArrayList con next()
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		//Ejemplo de la Collecion Vector
		Vector<String> v = new Vector<String>();

		v.add("Ayush");
		v.add("Amit");
		v.add("Ashish");
		v.add("Garima");

		//Podemos recorrer los ArrayList y los Vectores
		//Con un for al igual que vimos con un array normal
		for (String nombre : v) {
			System.out.println(nombre);
		}

	}

}
