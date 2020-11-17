package Tema1;

public class EjemploAletoriosConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declaramos dos variables, una de tipo entrero y otra float
		int numero;
		float decimal;

		// Generamos un número aleatorio entre 1 y 10 utilizando random()
		// Por defecto random devuelve un valor entre 1 y 0, lo multiplicamos por 10
		// Utilizamos (float) para convertir de double a float
		decimal = (float) Math.random() * 10;

		System.out.println("El numero generado es: " + decimal);

		// Al ser numero entero y decimal float no se puede asignar directamente
		// Hay que hacer una conversión de tipos directa (int)
		numero = (int) decimal;

		System.out.println("El numero generado en entero es: " + numero);

		// En este caso no hace falta convertir el tipo a int
		// Porque la funcion round ya nos devuelve el número en int
		numero = Math.round(decimal);

		System.out.println("El numero generado redondeado es: " + numero);

	}

}
