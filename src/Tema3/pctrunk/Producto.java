package Tema3.pctrunk;

public class Producto {

	private String nombre;
	private double precio;
	private String descripcion;
	private int cantidad;
	private Categoria categoria;

	public Producto() {

		this.nombre = this.generarNombre();
		this.precio = Math.random() * 300;
		this.descripcion = "Generico";
		this.cantidad = 100;
		categoria = new Categoria();

	}

	public Producto(String nombre, double precio, String descripcion, int cantidad, Categoria categoria) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.descripcion = descripcion;
		this.cantidad = cantidad;
		this.categoria = categoria;
	}

	/**
	 * Funcion generarNombre
	 * Devuelve un String con el nombre aleatorio
	 * Generamos caracteres entre 65 y 90 que se corresponden
	 * a las letras en el codigo ascii
	 */
	public String generarNombre() {
		//Generamos un número aleatorio menor de 91
		int aleatorio = (int) (Math.random() * (24)) + 65;

		//Convertimos el número ascii en caracter
		char car = (char) aleatorio;

		return String.valueOf(car);
	}

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", precio=" + precio + ", descripcion=" + descripcion + ", cantidad="
				+ cantidad + ", categoria=" + categoria + "]";
	}

}
