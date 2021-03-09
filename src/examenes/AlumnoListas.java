package examenes;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * 
 * Clase Alumno

String nombre público
String apellidos público
int edad público
boolean repetidor privado


De cara a las asignaturas se permiten dos implementaciones, se pueden hacer utilizando un array de asignaturas o se puede crear utilizando muchas variables miembro, en ambos casos, los alumnos tendrán 6 asignaturas, si se implementan como array sería

Asignatura asignaturas[]

Y en caso de ser un conjunto de objetos sería

Asignatura asignatura1
Asignatura asignatura2
…

Métodos/Funciones

Constructor que recibe sólo el nombre y si es repetidor y el resto lo inicializa
Constructor que recibe todos los valores

Get y set de todos los valores excepto de repetidor, en ese caso sólo get

float notaMedia() devuelve la nota media de todas las asignaturas
Asignatura notaMaxima() devuelve la asignatura con nota máxima de todas las asignaturas
boolean aprobado() devuelve true si la nota media es superior a 5 y no ha suspendido lengua y matemáticas a la vez.

 */
public class AlumnoListas {

	public String nombre;
	public String apellidos;
	public int edad;
	private boolean repetidor;

	/*
	 * Ejercicio practico:
	 * 
	 * Modificar el codigo de la clase alumno y llamarla AlumnoLista
	 * de tal forma que ahora tendra 9 asignaturas y se guardaran 
	 * en un ArrayList, hay que modificar todo el código que utilice las
	 * asignaturas.
	 */

	ArrayList<Asignatura> asignaturas;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public boolean isRepetidor() {
		return repetidor;
	}

	public void setRepetidor(boolean repetidor) {
		this.repetidor = repetidor;
	}

	public AlumnoListas(String nombre, String apellidos, int edad, boolean repetidor,
			ArrayList<Asignatura> asignaturas) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.repetidor = repetidor;
		this.asignaturas = asignaturas;
	}

	public ArrayList<Asignatura> getAsignaturas() {
		return asignaturas;
	}

	public void setAsignaturas(ArrayList<Asignatura> asignaturas) {
		this.asignaturas = asignaturas;
	}

	public AlumnoListas(String nombre, boolean repetidor) {
		super();
		this.nombre = nombre;
		this.repetidor = repetidor;
		this.apellidos = "";
		this.edad = 0;
		this.asignaturas = new ArrayList<Asignatura>();
	}

	/**
	 * 
	 * @return nota media
	 */
	//Recorremos el arrayList utilizando un for para cada elemento
	float notaMedia() {
		float notaMedia = 0;

		//Acumulamos en notaMedia las notas de 
		//todas las asignaturas del array
		for (Asignatura asi : asignaturas) {
			notaMedia = notaMedia + asi.getNota();
		}

		//Devolvemos la nota media
		return notaMedia / asignaturas.size();
	}

	//Recorremos el Arraylist utilizando Iterator
	Asignatura notaMaxima() {
		//Inicializamos el maximo al menor posible valor
		float maximo = Float.MIN_VALUE;
		//En esta variable guardaremos la asignatura con 
		//La nota maxima que devolveremos
		Asignatura maximaNota = new Asignatura("Generica");

		//Recuperamos un Iterator para recorrer asignaturas
		Iterator<Asignatura> iter = asignaturas.iterator();
		int posMax = 0;

		while (iter.hasNext()) {
			//En asigTemp vamos leyedo todas las asignaturas 
			//del arrayList utilizando next()
			Asignatura asigTemp = iter.next();

			if (asigTemp.nota > maximo) {
				maximo = asigTemp.nota;
				//maximaNota = asigTemp;
				//Otra forma seria guardar la posicion de la asignatura
				posMax = asignaturas.indexOf(asigTemp);
			}

		}

		//Devolvemos la asignatura con mayor nota
		//return maximaNota;

		//De la otra forma devolveriamos la posicion de posMax
		return asignaturas.get(posMax);

	}

	boolean aprobado() {

		if (notaMedia() >= 5.0f) {
			//Suspensos contabilizara las asignaturas suspendidas
			//sólo contabilizando lengua y matematicas
			int suspensos = 0;
			//Recorremos el array para ver si se ha suspendido lengua
			//y matematicas
			for (int i = 0; i < asignaturas.size(); i++) {

				//Si es lengua y ha suspendido incrementamos los suspensos
				if (asignaturas.get(i).getNombre().equalsIgnoreCase("lengua") && asignaturas.get(i).nota < 5.0f)
					suspensos++;

				//Si es matematicas y ha suspendido incrementamos los suspensos
				if (asignaturas.get(i).getNombre().equalsIgnoreCase("matematicas") && asignaturas.get(i).nota < 5.0f)
					suspensos++;
			}

			//Si ha suspendido lengua y matematicas esta suspenso
			if (suspensos == 2)
				return false;
			else
				return true;

		} else
			return false;
	}

}
