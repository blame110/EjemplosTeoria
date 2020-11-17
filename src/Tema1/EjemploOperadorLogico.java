package Tema1;
import java.util.Scanner;

public class EjemploOperadorLogico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String cadena1;
		String cadena2;		
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Escribe una letra:");
		cadena1 = teclado.nextLine();
		
		System.out.print("Escribe otra letra:");
		cadena2 = teclado.nextLine();
		
		
		//El operador logicon ^ devolverá cierto sólo
		//si UNA y solo UNA de las condiciones es cierta
		if (cadena1.equals("A") ^ cadena2.contentEquals("B"))
			System.out.println("Es cierta sólo una condicion");
	
		
		teclado.close();
	}

}
