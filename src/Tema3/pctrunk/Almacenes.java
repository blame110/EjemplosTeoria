package Tema3.pctrunk;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.StringTokenizer;

public class Almacenes {

	public Producto productos[];
	String Localidad;
	int codPostal;

	public static int NUM_PRODUCTOS = 10;
	public final String RUTA_FICHERO = "c:\\pruebas\\productos.txt";

	public Almacenes() {
		this.Localidad = "Generica";
		this.codPostal = 00000;
		this.productos = this.generarProductos(this.NUM_PRODUCTOS);
	}

	public Almacenes(Producto[] productos, String localidad, int codPostal) {
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
					//Necesitamos convertir la cantidad de int a String ya que concat sÃ³lo admite String
					linea = linea.concat(Integer.toString(productos[i].getCantidad()));
					linea = linea.concat(" ");
					linea = linea.concat(Double.toString(productos[i].getPrecio()));
					linea = linea.concat(" ");
					linea = linea.concat(Integer.toString(productos[i].getCategoria().id));

					//Si estamos leyendo el Ãºltimo producto del array no pasamos escribimos linea en blanco
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

	void estadisticas() {

		ArrayList<Producto> prods = new ArrayList<Producto>();
		Collections.addAll(prods, productos);

		Iterator itr = prods.iterator();

		Producto ejemplo = (Producto) itr.next();

		int numAcesorios = 0;

		if (ejemplo.getCategoria().getNombre().equalsIgnoreCase("Accesorios"))
			numAcesorios++;
	}

	public int cargarProductosDB()
	{
		Statement stmt;
        ResultSet res;
        Connection con;
        
        String url = "jdbc:mysql://localhost:3306/almacenes?serverTimezone=UTC&useUnicode=true&characterEncoding=utf8&useSSL=false";  
        String name = "com.mysql.cj.jdbc.Driver";  
        String user = "root";  
        String password = "toor";
        
        
         try {// Cargue la clase de controlador de base de datos
                	 Class.forName(name);
      		         System.out.println ("El controlador de la base de datos se cargó correctamente");
      	  }catch(ClassNotFoundException e){
      		  e.printStackTrace();
      	  }
      	  try {
      		           con = DriverManager.getConnection (url, user, password); // Obtenga el objeto de conexión de la base de datos accediendo a la URL de la base de datos
      		           System.out.println ("Conexión de base de datos exitosa");
      		           
      		       stmt = con.createStatement();
      		       res = stmt.executeQuery("SELECT * FROM productos");
      		       
      		       while (res.next()) {
      		    	  String nombre = res.getString("nombre");
      		    	  System.out.println(nombre);
      		    	}
      		       
      		       
      		       
      		           
      	  }catch(SQLException e) {
      		  e.printStackTrace();
      	  }
      	            // Devuelve un objeto Connection como lo requiere el método
        
	
	return 0;
	}
	
	public int loadProducts() {

		try {

			//Abrimos el fichero con file
			File arch = new File(this.RUTA_FICHERO);
			//Utilizamos FileReader y BufferedReader para poder leer linea a linea en modo texto
			FileReader fr = new FileReader(arch);
			BufferedReader br = new BufferedReader(fr);
			
			//leemos la primera linea fuera del bucle
			String linea = br.readLine();
			int numLineas=0;
			
			while (linea!=null) {
				numLineas++;
				//leemos una linea del fichero
				linea = br.readLine();
				
			}
			
			//Inicializamos el array de productos al tamaño de
			//las lineas del fichero
			productos = new Producto[numLineas];
			
			//Cerramos y abrimos el fichero para que vuelva al principio
			br.close();
			fr = new FileReader(arch);
			br = new BufferedReader(fr);
			
			for (int i=0;i<numLineas;i++) {
				
				//Pasamos a la siguiente posicion del array y leemos la siguiente linea
				linea = br.readLine();
				
				//Para cada linea tenemos que extraer todos los campos del producto
				//Utilizamos un StringTokenizer para separarlos
				StringTokenizer tokens = new StringTokenizer(linea);

				//Creamos un producto para cargar los datos de la linea del fichero
				Producto prod = new Producto();

				//El primero es el nombre
				prod.setNombre(tokens.nextToken());

				//El segundo token es la descripcion
				prod.setDescripcion(tokens.nextToken());

				//El Tercer token es la cantidad
				prod.setCantidad(Integer.valueOf(tokens.nextToken()));

				//El Tercer token es el precio
				prod.setPrecio(Double.valueOf(tokens.nextToken()));

				//Para la categoria creamos un objeto de tipo categoria y le asignamos el id leyendolo del fichero
				Categoria cat = new Categoria();
				cat.id = Integer.valueOf(tokens.nextToken());
				prod.setCategoria(cat);

				//Guardamos el producto en el array de productos del almacen
				this.productos[i] = prod;
				
				
				
			}

			//for (int i = 0; i < 10; i++)
			//	System.out.println(this.productos[i].toString());

			br.close();
			return 0;

		} catch (IOException ex) {
			ex.printStackTrace();
			return -1;
		}

	}

	/**
	 * La funciÃ³n general un numero de productos aleatorios
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
	 * Funcion que devuelve la suma de los precios de todos los Ã§
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
