package tema2.bucles;

public class TablaMultiplicarFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * for (int i = 1; i <= 10; i++) { for (int j = 1; j <= 10; j++) {
		 * System.out.println(i + " x " + j + " = " + (j * i)); } } }
		 */
		String cadena = "Hola Caracola";
		int numeros[] = { 2, 3, 1, 2, 3, 4 };

		for (int num : numeros) {
			System.out.println("Numero " + num);
		}

		for (char c : cadena.toCharArray()) {
			System.out.println("Letra " + c);
		}

		for (int i = 0; i < cadena.length(); i++) {
			System.out.println("Letrav2 " + cadena.charAt(i));
		}

	}
}
