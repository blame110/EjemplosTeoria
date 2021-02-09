package Tema3.pctrunk;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

public class Almacen {

	Producto productos[];
	String Localidad;
	int codPostal;

	public static int NUM_PRODUCTOS = 10;
	public final String RUTA_FICHERO = "c:\\pruebas\\productos.txt";

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

	public int salvarProductos() {
		try {

			//FileWriter es similar a File, permite escribir al final del fichero sin borrar
			FileWriter fw = new FileWriter(this.RUTA_FICHERO, true);

			//Printwriter es el objeto que permite escribir sobre el fichero de texto
			PrintWriter out = new PrintWriter(fw);
			out.println();

			//Recorremos el bucle de productos
			for (int i = 0; i < this.productos.length; i++) {

				if (productos[i] != null) {

					String linea = "";
					linea = linea.concat(productos[i].getNombre());
					linea = linea.concat(" ");
					linea = linea.concat(productos[i].getDescripcion());
					linea = linea.concat(" ");
					//Necesitamos convertir la cantidad de int a String ya que concat sólo admite String
					linea = linea.concat(Integer.toString(productos[i].getCantidad()));
					linea = linea.concat(" ");
					linea = linea.concat(Double.toString(productos[i].getPrecio()));
					linea = linea.concat(" ");
					linea = linea.concat(Integer.toString(productos[i].getCategoria().id));

					//Si estamos leyendo el último producto del array no pasamos escribimos linea en blanco
					if (i != this.productos.length - 1)
						out.println(linea);
					else
						out.print(linea);
				}

			}
			//Cerramos el flujo de datos
			fw.close();
			return 0;
		} catch (IOException ex) {
			ex.printStackTrace();
			return -1;
		}

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
