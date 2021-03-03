package tema5;

public class PruebasArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numeros[] = new int[10];

		numeros[0] = 4;
		numeros[1] = 4;
		numeros[2] = 56;
		numeros[3] = 4;
		numeros[4] = 4;
		numeros[5] = -45;
		numeros[6] = 4;
		numeros[7] = 4;
		numeros[8] = 59;
		numeros[9] = -3;

		System.out.println("El minimo es " + OperacionesArray.minimo(numeros));

	}

}
