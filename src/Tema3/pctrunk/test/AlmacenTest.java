/**
 * 
 */
package Tema3.pctrunk.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import Tema3.pctrunk.Almacenes;
import Tema3.pctrunk.Producto;

/**
 * @author pablo
 *
 */
class AlmacenTest {

	public static Almacenes madrid;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {

		madrid = new Almacenes();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	/**
	 * Test method for {@link Tema3.pctrunk.Almacenes#loadProducts()}.
	 */
	@Test
	void testCargarProductos() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link Tema3.pctrunk.Almacenes#generarProductos(int)}.
	 */
	@Test
	@DisplayName("Testeo de Generar Productos")
	void testGenerarProductos() {

		//Ejemplo de como abortar la prueba si el s.o. es linux
		Assumptions.assumeFalse(System.getProperty("os.name").contains("Linux"));

		//Ponemos 10 productos
		int cantidad = 10;

		madrid.productos = madrid.generarProductos(cantidad);

		assertEquals(cantidad, madrid.productos.length, "La cantidad de productos generados debe de concidir");

		for (int i = 0; i < cantidad; i++) {
			assertEquals(Producto.class, madrid.productos[i].getClass(), "La clase debe ser producto");

		}

	}

	/**
	 * Test method for {@link Tema3.pctrunk.Almacenes#calcularPrecios(Tema3.pctrunk.Producto[])}.
	 */
	@Test
	void testCalcularPrecios() {
		fail("Not yet implemented");
	}

}
