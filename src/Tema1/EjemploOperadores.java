package Tema1;
import java.util.Scanner;

public class EjemploOperadores {

	public static void main(String[] args) {

		// Ejemplo de operadores ++ += etc..

		int numero = 2;
		int numero2 = 4;
		Scanner teclado = new Scanner(System.in);

		// numero = numero + 2;
		numero += 2;

		// numero = numero * 5;
		numero *= 5;

		// numero = numero + 1
		numero++;

		// En este caso numero vale 4 porque primero
		// se hace la asignacion antes de incrementar
		// numero2
		numero = numero2++;

		System.out.println("Numero es " + numero);

		// En este caso primero se le suma 1 a numero2
		// Y despues se asigna a numero el resultado
		numero = ++numero2;

		System.out.println("Numero es " + numero);
		System.out.println("Numero2 es " + numero2);

		System.out.print("Introduce un número: ");
		numero = teclado.nextInt();

		// El operador ! cambia el resultado de una condicion
		// Si es verdadero lo pasa a falso y al contrario
		if (!(numero >= 5))
			System.out.println("Estas Suspenso!");

		// El operador condicional es una versión reducida
		// de la estructura if, devolviendo un valor u otro
		// dependiendo de si la condicion es cierta o falsa
		System.out.println("El numero es par " + (numero % 2 == 0 ? "verdadero" : "falso"));

		// El operador % nos devuelve el resto de la division
		// entera, se utiliza mucho para comprobar si un número
		// Es divisible por otro
		if (numero % 2 == 0) {
			System.out.println("Es par");
		} else {
			System.out.println("Es impar");
		}

		if (numero % 5 == 0) {
			System.out.println("Es múltiplo de 5");
		} else {
			System.out.println("No es múltiplo de 5");
		}

	}

}
