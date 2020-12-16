package Tema3;

public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Definimos un objeto de la clase Triangulo, denominado miTri

		Triangulo miTri;
		System.out.println("Cantidad de Triangulos:" + Triangulo.cantidad);

		// Para poder utilizar un objeto hay que llamar al Constructor con new
		miTri = new Triangulo();
		Triangulo miTri1 = new Triangulo();
		Triangulo miTri2 = new Triangulo();

		System.out.println("Cantidad de Triangulos:" + Triangulo.cantidad);

		Triangulo tri1 = new Triangulo(4, 7);

		Triangulo tri2 = new Triangulo();

		System.out.println("Cantidad de Triangulos:" + Triangulo.cantidad);

		miTri.altura = 3;

		miTri.setBase(8);

		System.out.println("La base es " + miTri.getBase() + " La altura es " + miTri.altura);

		System.out.println("El area es " + miTri.calcularArea());

		System.out.println("El perimetro es " + miTri.calcularPerimetro());

		System.out.println(miTri.toString());

		System.out.println(tri1.toString());
	}

}
