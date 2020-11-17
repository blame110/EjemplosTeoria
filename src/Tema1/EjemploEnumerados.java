package Tema1;
import java.util.Scanner;

public class EjemploEnumerados {

	public enum tiempo {
		maniana, tarde, puesta, noche
	};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Otro Ejemplo de uso de el tipo de dato enum.
		 */
		tiempo hoy = tiempo.noche;

		int hora;
		Scanner teclado = new Scanner(System.in);

		System.out.print("Qué hora es(1:mañana,2:tarde,3:puesta,4:noche?");
		hora = teclado.nextInt();

		if (hora == 1)
			hoy = tiempo.maniana;

		// Resto por hacer

		System.out.print("\n\n\tHoy estamos por la \"" + hoy);

		teclado.close();
	}

}
