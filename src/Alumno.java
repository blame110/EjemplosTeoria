
public class Alumno {

	private int edad;
	private String nombre;
	private String clase;
	public int notaMates;

	public Alumno(int edad, String nombre, String clase) {
		super();
		this.edad = edad;
		this.nombre = nombre;
		this.clase = clase;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getClase() {
		return clase;
	}

	public void setClase(String clase) {
		this.clase = clase;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
