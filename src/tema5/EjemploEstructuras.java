package tema5;

import java.util.ArrayList;

public class EjemploEstructuras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ArrayList

		//Para crear el arrayList hay que llamar al constructor
		ArrayList<String> nombres = new ArrayList<String>();

		nombres2.

		//Añadir elementos al ArrayList con add

				nombres.add("Jaime");
		nombres.add("Salvador");
		nombres.add("Daniel");
		nombres.add("Francisco J.");
		nombres.add("Jaime");
		nombres.add("Salvadore");
		nombres.add("Daniel");
		nombres.add("Francisco J.");

		//Con set modificamos el valor de una posicion
		nombres.set(2, "Alberto");

		//Eliminamos una posicion con remove
		nombres.remove(2);

		//Accedemos a los elementos del arrayList de forma directa con get
		String alumno = nombres.get(2);

		System.out.println("El agraciado es: " + alumno);

		System.out.println("La posicion de salvadores es: " + nombres.indexOf("Salvadore"));

	}

}
