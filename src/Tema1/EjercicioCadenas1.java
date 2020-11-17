package Tema1;
import java.util.Scanner;

public class EjercicioCadenas1 {

	
	/**
	 * El programa validará el login del usuario
	 * Tendra una constante denominada password de 10 caracteres
	 * Leera el nombre del usuario y comprobará que el password 
	 * es correcto, diferenciando mayusculas de minusculas
	 * Si falla le mostrara los primeros 3 caracteres del password
	 * para darle una pista y le dejará un último intento
	 * si falla la segunda vez le mostrará un mensaje diciendole
	 * Que su usuario ha sido bloqueado
	 * 
	 * El programa comprobará que la longitud de la contraseña 
	 * Introducida sea de 10 caracteres
	 * 
	 * @param args cadena con los parametros
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final String passw = "1234567890";
		String usuario;
		String password;
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.print("Usuario: ");
		usuario = teclado.nextLine();

		System.out.print("Contraseña: ");
		password = teclado.nextLine();
		
		if (password.length()!=10)
		{
			System.out.println("La longitud de la contraseña debe ser 10");
		}
		else
		{
		
			if (password.equals(passw))
			{
				System.out.println("Te has logado Correctamente");
			}
			else
			{
				System.out.print("Te recuerdo que tu contraseña empieza por ");
				System.out.println(passw.substring(0,3));

				System.out.print("Contraseña: ");
				password = teclado.nextLine();

				if (password.equals(passw))
				{
					System.out.println("Te has logado Correctamente");
				}
				else
				{
					System.out.println("Estas Bloqueado");
				}
			}
		}
			
		
		teclado.close();
	}
	

}
