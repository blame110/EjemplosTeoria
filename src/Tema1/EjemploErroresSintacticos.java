package Tema1;

//Para poder utilizar la clase Scanner tenemos que importarla
import java.util.Scanner;

public class EjemploErroresSintacticos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Comentario de una linea
		
		/*Comentarios
		 * de
		 * varias
		 * lineas
		 */
		
		/**Comentario Javadoc
		 * Genera documentación automaticamente
		 */
		
		
		//Vamos a crear un programa que calcule
		/*El area de un triangulo, pero con errores 
		 *Sintácticos
		 */
		
		//Definimos las variables base y altura
		//de tipo entero
		int base;
		int altura;
		int superficie;
		
		//Leemos las variables base y altura
		//Desde Teclado
		System.out.println("Introduce la base:");
		
		//Creamos un objeto de la clase Scanner
		//y leemos un numero entero que asignamos a base
		Scanner teclado = new Scanner(System.in);
		base = teclado.nextInt();
		
		System.out.println("Introduce la altura:");
		altura = teclado.nextInt();
		
		//Calculamos la superficie 
		//Y la mostramos por pantalla
		superficie = base * altura / 2;
		System.out.println("La superficie del triangulo es: " + superficie);		
		
		
		
		
	}

}
