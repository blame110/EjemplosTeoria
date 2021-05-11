package Tema3.pctrunk.test;

import Tema3.pctrunk.Almacenes;
import Tema3.pctrunk.Producto;

public class prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Almacenes almacen = new Almacenes();
		Producto tecladoMars = new Producto();
		Producto ratonMars = new Producto();
		Producto alfombrillaMars = new Producto();

		tecladoMars.setPrecio(10);
		tecladoMars.setCantidad(5);

		ratonMars.setPrecio(5);
		ratonMars.setCantidad(6);

		alfombrillaMars.setPrecio(3);
		alfombrillaMars.setCantidad(10);

		//Lista con los productos creados
		Producto lista[] = { tecladoMars, ratonMars, alfombrillaMars };

		//lista2 genera 10 productos aleatorios
		Producto lista2[] = new Producto[10];
		for (int i = 0; i < 10; i++) {
			lista2[i] = new Producto();

		}

		//almacen.salvarProductos();
		almacen.loadProducts();

	}

}
