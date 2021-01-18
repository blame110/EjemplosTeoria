package Tema3.pctrunk;

import java.util.Arrays;

public class Almacen {

	Producto productos[];
	String Localidad;
	int codPostal;

	public final static int NUM_PRODUCTOS = 10;

	public Almacen() {
		this.Localidad = "Generica";
		this.codPostal = 00000;
		this.productos = this.generarProductos(this.NUM_PRODUCTOS);
	}

	public Almacen(Producto[] productos, String localidad, int codPostal) {
		super();
		this.productos = productos;
		Localidad = localidad;
		this.codPostal = codPostal;
	}

	/**
	 * La función general un numero de productos aleatorios
	 * y los devuelve en un array de Producto
	 * 
	 * @param cantidad Cantidad de productos a generar
	 * @return Producto[]
	 */
	public Producto[] generarProductos(int cantidad) {

		Producto prodAleatorios[] = new Producto[cantidad];
		Producto temporal;

		for (int i = 0; i < cantidad; i++) {

			temporal = new Producto();
			prodAleatorios[i] = temporal;

		}

		return prodAleatorios;

	}

	@Override
	public String toString() {
		return "Almacen [productos=" + Arrays.toString(productos) + ", Localidad=" + Localidad + ", codPostal="
				+ codPostal + "]";
	}

}
