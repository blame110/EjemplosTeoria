package Tema3;

/*Realizar un programa en java que haga los siguientes cálculos.

Leerá una alineación de fútbol, con x jugadores, para cada jugador se leerán los siguientes campos:

Nombre
Número de dorsal
Posición [D:delantero, C:Centrocampo, L:lateral, P:portero, D:defensa]
Edad
Goles Marcados

Y con dichos datos comprobará los siguiente una vez leídos todos los datos:

Solo hay un portero, en caso de que haya más de uno mostrará una advertencia al final
La media de edad y el nombre del jugador más viejo y el más joven.
El porcentaje de jugadores en cada posición
Comprobar que no haya más de 3 delanteros.
Si hay algún menor de edad mostrará una advertencia
Mostrará el número de goles de los delanteros mayores de edad.*/

import java.util.Scanner;

public class ExamenT2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		int x;// VARIABLE QUE GUARDARA EL TOTAL DE JUGADORES

		System.out.print(" Total de jugadores: ");// PIDE POR PANTALLA EL TOTAL DE JUGADORES
		x = teclado.nextInt();// LOS INTRODUCIMOS POR TECLADO

		int[] jugadores = new int[x];// VECTOR JUGADORES, VECTOR GLOBAL
		String[] nombre = new String[x];// VECTOR PARA NOMBRES
		int[] dorsal = new int[x];// VECTOR PARA DORSALES
		char[] posicion = new char[x];// VECTOR PARA POSICIONES
		int[] edad = new int[x];// VECTOR PARA EDADES
		int[] goles = new int[x];// VECTOR PARA GOLES

		int portero = 0, defensa = 0, centrocampista = 0, delantero = 0, lateral = 0;// VARIABLES PARA CALCULAR EL
																						// PORCENTAJE
		float porPortero = 0, porDefensa = 0, porCentro = 0, porDelantero = 0, porLateral = 0;// DE CADA UNA DE LAS
																								// POSICIONES

		int mayor = -30, menor = 100;// VARIABLES PARA CALCULAR EL MAS MAYOR Y MENOR DE EDAD,
		int posMayor = 0, posMenor = 0;// JUNTO CON SUS POSICIONES
		String nombreMayor = null, nombreMenor = null;

		int sumaEdad = 0;// VARIABLES PARA CALCULAR LA SUMA
		float mediaEdad = 0;// Y LA MEDIA DE LAS EDADES

		int golesEdad = 0;// VARIABLE PARA CALCULAR EL TOTAL DE GOLES DE LOS JUGADORES MAYORES DE EDAD

		for (int i = 0; i < jugadores.length; i++) {// BUCLE REPETITIVO QUE RECORRE TANTAS VECES COMO SE DIGA LOS
													// VECTORES

			System.out.print(" Nombre del jugador " + i + ": ");// PIDE POR PANTALLA EL NOMBRE DE LOS JUGADORES
			nombre[i] = teclado.nextLine();// LOS INTRODUCIMOS POR TECLADO
			teclado.next();// ESTA LINEA ES PARA QUE NO DE FALLO Y SE PUEDA INTRODUCIR EL NOMBRE

			System.out.print(" Dorsal del jugador " + i + ": ");// PIDE POR PANTALLA EL DORSAL DEL JUGADOR
			dorsal[i] = teclado.nextInt();// LO INTRODUCIMOS POR TECLADO

			System.out
					.print(" Posicion del jugador " + i + " (P portero, D defensa, M medio, S delantero, L lateral): ");
			posicion[i] = teclado.next().charAt(0);// PIDE POR PANTALLA LA POSICION Y LA INTRODUCIMOS POR TECLADO

			System.out.print(" Edad del jugador " + i + ": ");// PIDE POR PANTALLA LA EDAD
			edad[i] = teclado.nextInt();// LA INTRODUCIMOS POR TECLADO

			sumaEdad += edad[i];// LA VARIABLE PARA CALCULAR LA MEDIA SE INCREMENTA CON CADA EDAD INTRODUCIDA

			if (edad[i] < 18) {// SI ES MENOR DE EDAD

				System.out.println(" AVISO. Jugador menor de edad ");// MUESTRA POR PANTALLA ESTE AVISO
			}

			System.out.print(" Goles del jugador " + i + ": ");// PIDE POR PANTALLA LOS GOLES
			goles[i] = teclado.nextInt();// Y LOS INTRODUCIMOS POR TECLADO

			if (posicion[i] == 'p' || posicion[i] == 'P') {// BUCLE CONDICION DEPENDE DE LA POSICION PREVIAMENTE PUESTA

				portero++;// EN ESTE CASO, PORTERO SE INCREMENTA EN 1

			} else if (posicion[i] == 'd' || posicion[i] == 'D') {// BUCLE CONDICION DEPENDE DE LA POSICION PREVIAMENTE
																	// PUESTA

				defensa++;// EN ESTE CASO, DEFENSA SE INCREMENTA EN 1

			} else if (posicion[i] == 'm' || posicion[i] == 'M') {// BUCLE CONDICION DEPENDE DE LA POSICION PREVIAMENTE
																	// PUESTA

				centrocampista++;// EN ESTE CASO, CENTROCAMPISTA SE INCREMENTA EN 1

			} else if (posicion[i] == 'S' || posicion[i] == 's') {// BUCLE CONDICION DEPENDE DE LA POSICION PREVIAMENTE
																	// PUESTA

				delantero++;// EN ESTE CASO, DELANTERO SE INCREMENTA EN 1
			}

			else if (posicion[i] == 'L' || posicion[i] == 'l') {// BUCLE CONDICION DEPENDE DE LA POSICION PREVIAMENTE
																	// PUESTA

				lateral++;// EN ESTE CASO, LATERAL SE INCREMENTA EN 1
			}

			if (edad[i] > 18 && posicion[i] == 'S' || posicion[i] == 's') {// SI ES MAYOR DE EDAD Y ES DELANTERO

				golesEdad += goles[i];// GOLESEDAD SE INCREMENTA CON LOS GOLES DE LOS JUGADORES MAYORES DE EDAD
			}

			if (edad[i] > mayor) {// SI HAY ALGUNA EDAD QUE SEA MAYOR

				mayor = edad[i];// MAYOR SE CONVIERTE EN ESA NUEVA EDAD
				posMayor = i;// SE GUARDA LA POSICION
			}

			if (edad[i] < menor) {// SI HAY ALGUNA EDAD QUE SEA MENOR

				menor = edad[i];// MENOR SE CONVIERTE EN ESA EDAD MENOR
				posMenor = i;// SE GUARDA LA POSICION DE ESA EDAD
			}

		} // FIN DE BUCLE FOR

		if (portero > 1) {// SI HAY MAS DE UN PORTERO

			System.out.println(" AVISO. Hay más de un portero en el equipo ");// MUESTRA POR PANTALLA UN AVISO
		}

		if (delantero > 3) {// SI HAY MAS DE 3 DELANTEROS

			System.out.println(" AVISO. Hay más de tres delanteros en el equipo ");// MUESTRA POR PANTALLA UN AVISO
		}

		porPortero = (portero * 100) / x;// CON ESTAS 5 OPERACIONES,
		porDefensa = (defensa * 100) / x;// CALCULAMOS EL PORCENTAJE
		porCentro = (centrocampista * 100) / x;// DE JUGADORES QUE
		porDelantero = (delantero * 100) / x;// OCUPAN ESAS
		porLateral = (lateral * 100) / x;// POSICIONES EN EL EQUIPO

		mediaEdad = sumaEdad / x;// OPERACION QUE NOS CALCULA LA MEDIA DE EDAD EN EL EQUIPO

		System.out.println(" Media de edad: " + mediaEdad);// DEVUELVE POR PANTALLA LA MEDIA DE EDAD
		System.out.println(" Jugador más mayor: " + nombre[posMayor]);// DEVUELVE POR PANTALLA EL JUGADOR MAS MAYOR
		System.out.println(" Jugador más joven: " + nombre[posMenor]);// DEVUELVE POR PANTALLA EL JUGADOR MAS JOVEN
		System.out.println(" Porcentaje de porteros: " + porPortero);// DEVUELVE POR PANTALLA EL PORCENTAJE DE PORTEROS
		System.out.println(" Porcentaje de defensas: " + porDefensa);// DEVUELVE POR PANTALLA EL PORCENTAJE DE DEFENSAS
		System.out.println(" Porcentaje de centrocampistas: " + porCentro);// DEVUELVE POR PANTALLA EL PORCENTAJE DE
																			// CENTEOCAMPISTAS
		System.out.println(" Porcentaje de delanteros: " + porDelantero);// DEVUELVE POR PANTALLA EL PORCENTAJE DE
																			// DELANTEROS
		System.out.println(" Porcentaje de laterales: " + porLateral);// DEVUELVE POR PANTALLA EL PORCENTAJE DE
																		// LATERALES
		System.out.println(" Goles totales de los jugadores mayores de edad: " + golesEdad);// DEVUELVE POR PANTALLA LA
																							// SUMA DE LOS GOLES DE LOS
																							// JUGADORES MAYORES DE EDAD

	}

}
