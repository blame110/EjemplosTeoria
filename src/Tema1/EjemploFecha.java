package Tema1;
import java.util.Date;

public class EjemploFecha {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// Ejemplo para ver como almacenar fechas en
		// el objeto Date

		int h, m, s;
		Date d4 = new Date();

		h = d4.getHours();
		m = d4.getMinutes();
		s = d4.getSeconds();
		System.out.println(h + ":" + m + ":" + s);

		String cadena = d4.toLocaleString();
		System.out.println(cadena);

		Date d2 = new Date(71, 7, 1);
		System.out.println("Fecha segunda: " + d2);

		Date d3 = new Date("April 3 1993 3:24 PM");
		System.out.println("Fecha tercera: " + d3);

	}

}
