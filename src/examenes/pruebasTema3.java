package examenes;

public class pruebasTema3 {

	/*
	 * Deberá crear  1 alumno y  6 objetos de tipo asignaturas que se le asignarán, 
	 * los valores se le pueden asignar o leer directamente por teclado. 
	 * Se sacará por pantalla el alumno la mejor nota de cada alumno  
	 * y si los alumnos han suspendido o aprobado con su nota media. 
	 * La salida será del estilo:
	
	El alumno pedro tiene una mejor nota de 8 en matemáticas y está aprobado con un 6,4 de media.
	
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Creamos un objeto de la clase Alumno llamado israel
		Alumno israel;

		Asignatura lengua = new Asignatura("lengua", 4.3f);
		Asignatura matematicas = new Asignatura("matematicas", 3.3f);
		Asignatura historia = new Asignatura("Historia", 1.3f);
		Asignatura etica = new Asignatura("Etica", 8.3f);
		Asignatura biologia = new Asignatura("Biologia", 8.3f);
		Asignatura geologia = new Asignatura("Geologia", 9.3f);

		Asignatura asignaturas[] = new Asignatura[6];
		asignaturas[0] = lengua;
		asignaturas[1] = matematicas;
		asignaturas[2] = historia;
		asignaturas[3] = etica;
		asignaturas[4] = biologia;
		asignaturas[5] = geologia;

		//Creamos el alumno
		israel = new Alumno("Israel", "Soto", 20, false, asignaturas);

		System.out.println("El alumno " + israel.nombre + " ha sacado una nota media de " + israel.notaMedia());
		System.out.println("El alumno " + israel.nombre + " ha sacado de nota maxima un " + israel.notaMaxima().nota
				+ " en " + israel.notaMaxima().getNombre());

		if (israel.aprobado())
			System.out.println("El alumno ha aprobado");
		else
			System.out.println("El alumno ha suspendido");

	}

}
