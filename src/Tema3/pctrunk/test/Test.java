/**
 * 
 */
package Tema3.pctrunk.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

import Tema3.pctrunk.Almacen;
import Tema3.pctrunk.Producto;

/**
 * @author pablo
 *
 */
public class Test {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@org.junit.Test
	public void test() {
		Almacen almacen = new Almacen();
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

			//Comprobamos que se ha creado comprobando que es de clase producto
			assertEquals(Producto.class, lista2[i].getClass());
		}

		Producto lista3[] = new Producto[10];

		//Comprobamos que la suma es la adecuada
		assertEquals(110, almacen.calcularPrecios(lista), 0);

		assertEquals(0, almacen.calcularPrecios(lista2), 0);

		assertEquals(0, almacen.calcularPrecios(lista3), 0);

	}

}
