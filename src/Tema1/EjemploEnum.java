package Tema1;

public class EjemploEnum {

	// Tipo de dato enumerado enum, es una coleccion de valores
	public enum meses {
		Enero, Febrero, Marzo, Abril, Mayo, Junio, Julio, Agosto, Septiembre, Octubre, Noviembre, Diciembre
	};

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		meses mesNavidad = meses.Diciembre;
		meses mesVerano = meses.Julio;

		System.out.println("El mes de \"navidad\" es: " + mesNavidad + "\n y el mes de verano es " + mesVerano);

	}

}
