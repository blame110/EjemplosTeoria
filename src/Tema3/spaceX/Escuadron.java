package Tema3.spaceX;

/**
 * @version 1
 * 
 *          MIEMBROS DE LA CLASE
 * 
 *          nombre String privado
 *          numNaves int publico
 *          numMaximo int
 *          posicion int[] publico
 *          NaveEspacial naves[] publico
 * 
 *          METODOS
 * 
 *          Crear los métodos get y set para todos, el nombre sólo tendrá get
 * 
 *          Crear tres constructores, uno no recibe nada, otro sólo el nombre
 *          el último todas variables
 * 
 *          Se utilizará el metodo de generarnombre de las utilidades para el nombre del ala
 *          El número de naves será aleatorio entre 1 y 20 y la posicion entre -TAMANO_UNIVERSO Y TAMANO_UNIVERSO
 * 
 *          int anadirNave(NaveEspacial nave)
 *          Añadirá la nave al array de naves espaciales y incrementara
 *          el número de naves.
 *          Comprobará que hay espacio en el ala y que no esta llena, devuelve 0 si todo va bien y -1 si hay fallo
 *          Le pondrá a la nave el nombre del ala
 * 
 *          naveEspacial masPoderosa()
 *          Devolverá la nave más poderosa del ala
 *
 *          int eliminarNave(naveEspacial)
 *          //Futuro
 */
public class Escuadron {

	public String nombre;
	public int posicion[];
	public NaveEspacial naves[];

	public Escuadron() {

		this.nombre = Utilidades.generarNombre(Utilidades.TIPO_ALA);

		for (int i = 0; i < 10; i++) {
			NaveEspacial nueva = new NaveEspacial();
		}
	}
}
