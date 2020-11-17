package Tema1;

public class EjemploPrecedenciaOperadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero = 10;
		String nombre ="pepe";
		int edad = 22;
		
		
		//Con los parentesis forzamos a que se evalue primero el Y (&&)
		//Por lo cual aunque el resultado del && sea falso (el numero no es mayor de 20)
		//El conjunto es verdadero ya que el || es cierto al cumplirse 
		//que la edad es mayor de 18
		if ( edad>18 ||( nombre.equals("pepe") && numero >20))
			System.out.println("entra");
		
		//Con los parentesis forzamos a que se evalue primero el O (||)
		//El resultado del || es cierto ya que las condiciones son ciertas
		//(Con una cierta valdría) pero el conjunto es falso
		//debido a que el número no es mayor de 20 y al ser un &&
		//las dos condiciones tienen que ser obligatoriamente ciertas
		if ( (edad>18 || nombre.equals("pepe")) && numero >20)
			System.out.println("entra2");
		
		
		//Sentencia equivalente a la anterior
		if (numero>20)
			if (edad>18 || nombre.equals("pepe"))
				System.out.println("entra2 alternativa");
			
		
		
		if ( edad>18 || nombre.equals("pepe") && numero >20)
			System.out.println("entra3");
		
	}

}
