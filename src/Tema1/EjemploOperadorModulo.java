package Tema1;
import java.util.Scanner;

public class EjemploOperadorModulo {
         /**
		 * Este programa leera dos números y nos mostrará un mensaje
		 * Si el primer número es divisible por el segundo
		 */
	     public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		//Definimos las variables
		int num1=0, num2;
		int resto;
		Scanner teclado = new Scanner(System.in);
		
		//Estas dos son iguales
		num1 = num1 + 5;
		num1 += 5;
		
		//Estas dos son iguales
		num1++;
		num1 = num1 +1;
		
		//En este caso num2 valdria 3 debido a que primero
		//realiza la asignación y despues incrementa en 1 num1
		num1 = 3;
		num2 = num1++;
		System.out.println("Num2 vale: "+ num2);
		
		//Si ponemos el operador ++ antes, primero se incrementaria 
		//el valor de num1, y despues se asignaría a num2 el valor
		//de num1, que sería 4, ya incrementado
		num1 = 3;
		num2 = ++num1;
		System.out.println("Num2 vale: "+ num2);
		
		
		
		
		//Leemos de teclado los dos números
		System.out.print("Introduce el primer número:");
		num1 = teclado.nextInt();
		
		System.out.print("Introduce el segundo número:");
		num2 = teclado.nextInt();
		
		//Calculamos el módulo de la division de los dos 
		//números y se lo asignamos a la variable resto
		resto = num1%num2;
		
		//Si cumple que el resto es 0 mostramos un mensaje		
		
		if (resto == 0)
		{
			System.out.println(num2 + " es divisor de " + num1);
		}
		
		
		
		teclado.close();
		
		
		
		
	}

}
