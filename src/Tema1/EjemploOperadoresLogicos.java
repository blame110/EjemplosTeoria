package Tema1;

public class EjemploOperadoresLogicos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("operador &&");
		System.out.println(" cierto && cierto: " + (true&&true));
		System.out.println(" cierto && falso: " + (true&&false));
		System.out.println(" falso && falso: " + (false&&false));

		System.out.println("operador ||");
		System.out.println(" cierto || cierto: " + (true||true));
		System.out.println(" cierto || falso: " + (true||false));
		System.out.println(" falso || falso: " + (false||false));
	
		System.out.println("operador ^");
		System.out.println(" cierto ^ cierto: " + (true^true));
		System.out.println(" cierto ^ falso: " + (true^false));
		System.out.println(" falso ^ falso: " + (false^false));
		
		System.out.println("operador ! !verdadero:" + !true);
		
		
	}

}
