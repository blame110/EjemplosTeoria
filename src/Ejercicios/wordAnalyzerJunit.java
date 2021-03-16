package Ejercicios;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.RepeatedTest;

class wordAnalyzerJunit {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@RepeatedTest(200)
	void testFirstRepeatedCharacter() {

		WordAnalyzer word = new WordAnalyzer(Tema3.pctrunk.Producto.generarNombre());

		assertEquals('D', word.firstRepeatedCharacter());
	}

}
