package Tema3.pctrunk;

public class Categoria {

	public int id;
	private String nombre;
	private String Descripcion;

	Categoria() {
		this.id = (int) (Math.random() * 1000);
		this.nombre = "Generica";
		this.Descripcion = "Generico";
	}

	Categoria(int valorId, String valorNombre, String valorDescripcion) {
		this.id = valorId;
		this.nombre = valorNombre;
		this.Descripcion = valorDescripcion;
	}

	@Override
	public String toString() {
		return "Categoria [id=" + id + ", nombre=" + nombre + ", Descripcion=" + Descripcion + "]";
	}

}
