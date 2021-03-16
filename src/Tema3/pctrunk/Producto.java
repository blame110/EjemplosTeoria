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
	public static String generarNombre() {

		String nombre = "";

		//Generamos la longitud del nombre de forma aleatoria
		int longitud = (int) (Math.random() * 6 + 3);

		//Generamos longitud caracteres y los vamos añadiendo a la cadena
		for (int i = 0; i < longitud; i++) {

			//Generamos un número aleatorio menor de 91
			int aleatorio = (int) (Math.random() * (24)) + 65;

			//Convertimos el número ascii en caracter
			char car = (char) aleatorio;

			//Convertimos el caracter generado a String
			//y lo añadimos al final del nombre
			nombre = nombre.concat(String.valueOf(car));

		}

		//Devolvemos el nombre completo
		return nombre;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", precio=" + precio + ", descripcion=" + descripcion + ", cantidad="
				+ cantidad + ", categoria=" + categoria + "]";
	}

}
