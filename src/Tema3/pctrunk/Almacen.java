package Tema3.pctrunk;

import java.util.Arrays;

public class Almacen {

	Producto productos[];
	String Localidad;
	int codPostal;

	public static int NUM_PRODUCTOS = 10;

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

	/**
	 * Funcion que devuelve la suma de los precios de todos los ç
	 * productos que se les pasen
	 */
	public double calcularPrecios(Producto prod[]) {

		double precioTotal = 0.0;

		//Si el array esta vacio usamos el array de productos del almacen
		if (prod.length == 0) {
			prod = this.productos;
		}

		//Recorremos todos los productos del array y sumamos
		//al precio total su precio por la cantidad de productos
		for (int i = 0; i < prod.length; i++) {
			precioTotal += prod[i].getPrecio() * prod[i].getCantidad();
		}

		//Devolvemos la suma total de precios
		return precioTotal;

	}

}
