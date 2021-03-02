package examenes;

/*
 * Clase Asignatura

Variables Miembro

String nombre / Privado solo se puede leer no escribir (no tiene método set)
float nota publico

Métodos/Funciones

Constructor que recibe el nombre y deja la nota a 0
Constructor que recibe las dos variables
Métodos get y set de las variables miembro (nombre solo get)
*/

public class Asignatura {

	private String nombre;
	public float nota;

	public Asignatura(String nombre) {
		super();
		this.nombre = nombre;
		this.nota = 0;
	}

	public Asignatura(String nombre, float nota) {
		super();
		this.nombre = nombre;
		this.nota = nota;
	}

	public String getNombre() {
		return nombre;
	}

	public float getNota() {
		return nota;
	}

	public void setNota(float nota) {
		this.nota = nota;
	}

}
