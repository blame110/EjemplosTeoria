package Tema3.pctrunk;

public class prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Producto tecladoMars = new Producto();
		Categoria hardware = new Categoria();
		Categoria software = new Categoria(3, "Software", "Todo tipo de programas oficales");
		Almacen sevilla = new Almacen();

		System.out.println(sevilla);

	}

}
