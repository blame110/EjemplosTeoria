package Tema3;

public class Triangulo {

	/*
	 * Forma de definir variables miembro [private | protected | public] [static]
	 * [final] [transient] [volatile] <tipo> <nombreAtributo>;
	 */

	// Los miembros privados no se pueden acceder desde fuera de la misma clase
	private int base;

	// Los miembros publicos pueden accederse desde cualquier parte
	public int altura;

	// Los miembros protegidos se pueden acceder desde las clases
	// del mismo paquete y sus descendientes

	public final static double PI = 3.14159;

	public static int cantidad;

	// Constructor, se le llama cuando creamos un objeto y utilizamos new
	// Triangulo()
	public Triangulo() {
		base = 1;
		altura = 1;
		cantidad++;
	}

	/**
	 * Este constructor crea un triangulo a partir dela base y la altura
	 * 
	 * @param valorBase   Introduce la Base del Triangulo
	 * @param valorAltura Introduce la Altura del Triangulo
	 */
	public Triangulo(int base, int altura) {
		this.base = base;
		this.altura = altura;
		cantidad++;
	}

	// La funcion o metodo getbase devuelve el valor
	// de la variable miembro base utilizando return
	public int getBase() {
		return base;
	}

	public void setBase(int valorBase) {
		base = valorBase;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int calcularArea() {
		return base * altura / 2;
	}

	public double calcularPerimetro() {
		// Variable locales
		// Ejemplo de como no llamar a las variables locales

		double perimetro;

		perimetro = this.base + this.altura + Math.sqrt(this.base * this.base + this.altura * this.altura);

		return perimetro;
	}

	@Override
	public String toString() {
		return "Triangulo [base=" + base + ", altura=" + altura + ", pi=" + PI + "]";
	}

}
