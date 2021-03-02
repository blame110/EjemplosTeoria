package examenes;

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
public class Alumnov2 {

	public String nombre;
	public String apellidos;
	public int edad;
	private boolean repetidor;

	Asignatura asignatura1;
	Asignatura asignatura2;
	Asignatura asignatura3;
	Asignatura asignatura4;
	Asignatura asignatura5;
	Asignatura asignatura6;

	public Alumnov2(Asignatura asignatura6) {
		super();
		this.asignatura6 = asignatura6;
	}

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

	public Alumnov2() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Alumnov2(String nombre, String apellidos, int edad, boolean repetidor, Asignatura asignatura1,
			Asignatura asignatura2, Asignatura asignatura3, Asignatura asignatura4, Asignatura asignatura5,
			Asignatura asignatura6) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.repetidor = repetidor;
		this.asignatura1 = asignatura1;
		this.asignatura2 = asignatura2;
		this.asignatura3 = asignatura3;
		this.asignatura4 = asignatura4;
		this.asignatura5 = asignatura5;
		this.asignatura6 = asignatura6;
	}

	public Alumnov2(String nombre, boolean repetidor) {
		super();
		this.nombre = nombre;
		this.apellidos = "";
		this.edad = 0;
		this.repetidor = repetidor;
		this.asignatura1 = new Asignatura("Lengua");
		this.asignatura2 = new Asignatura("Sociales");
		this.asignatura3 = new Asignatura("Matematicas");
		this.asignatura4 = new Asignatura("EdFisica");
		this.asignatura5 = new Asignatura("Quimica");
		this.asignatura6 = new Asignatura("Etica");
	}

	float notaMedia() {

		return (asignatura1.nota + asignatura2.nota + asignatura3.nota + asignatura4.nota + asignatura5.nota
				+ asignatura6.nota) / 6;

	}

	Asignatura notaMaxima() {

		if (asignatura1.nota > asignatura2.nota && asignatura1.nota > asignatura3.nota
				&& asignatura1.nota > asignatura4.nota && asignatura1.nota > asignatura5.nota
				&& asignatura1.nota > asignatura6.nota)
			return asignatura1;
		else if (asignatura2.nota > asignatura3.nota && asignatura2.nota > asignatura4.nota
				&& asignatura2.nota > asignatura5.nota && asignatura2.nota > asignatura6.nota)
			return asignatura2;
		else if (asignatura3.nota > asignatura4.nota && asignatura3.nota > asignatura5.nota
				&& asignatura3.nota > asignatura6.nota)
			return asignatura3;
		else if (asignatura4.nota > asignatura5.nota && asignatura4.nota > asignatura6.nota)
			return asignatura4;
		else if (asignatura5.nota > asignatura6.nota)
			return asignatura5;
		else
			return asignatura6;

	}

	boolean aprobado() {
		if (notaMedia() > 5.0f) {
			int suspensos = 0;

			if (asignatura1.getNombre().equalsIgnoreCase("lengua") && asignatura1.nota < 5.0f)
				suspensos++;

			if (asignatura2.getNombre().equalsIgnoreCase("lengua") && asignatura2.nota < 5.0f)
				suspensos++;

			if (asignatura3.getNombre().equalsIgnoreCase("lengua") && asignatura3.nota < 5.0f)
				suspensos++;

			if (asignatura4.getNombre().equalsIgnoreCase("lengua") && asignatura4.nota < 5.0f)
				suspensos++;

			if (asignatura5.getNombre().equalsIgnoreCase("lengua") && asignatura5.nota < 5.0f)
				suspensos++;

			if (asignatura6.getNombre().equalsIgnoreCase("lengua") && asignatura6.nota < 5.0f)
				suspensos++;

			if (asignatura1.getNombre().equalsIgnoreCase("matematicas") && asignatura1.nota < 5.0f)
				suspensos++;

			if (asignatura2.getNombre().equalsIgnoreCase("matematicas") && asignatura2.nota < 5.0f)
				suspensos++;

			if (asignatura3.getNombre().equalsIgnoreCase("matematicas") && asignatura3.nota < 5.0f)
				suspensos++;

			if (asignatura4.getNombre().equalsIgnoreCase("matematicas") && asignatura4.nota < 5.0f)
				suspensos++;

			if (asignatura5.getNombre().equalsIgnoreCase("matematicas") && asignatura5.nota < 5.0f)
				suspensos++;

			if (asignatura6.getNombre().equalsIgnoreCase("matematicas") && asignatura6.nota < 5.0f)
				suspensos++;

			//Si se ha suspendido lengua y matematicas, suspensos valdrá 2
			//entonces la funcion aprobado deberá devolver false
			if (suspensos >= 2)
				return false;
			else
				return true;
		} else
			return false;
	}

}
