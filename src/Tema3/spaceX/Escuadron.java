package Tema3.spaceX;

import java.util.Arrays;


/**
 * MIEMBROS DE LA CLASE
 * 
 * nombre String privado numNaves int publico posicion int[] publico
 * NaveEspacial naves[] publico
 * 
 * METODOS
 * 
 * Crear los metodos get y set para todos, el nombre sÃģlo tendrÃĄ get
 * 
 * Crear tres constructores, uno no recibe nada, otro sÃģlo el nombre el Ãšltimo
 * las tres variables
 * 
 * Se utilizara el metodo de generarnombre de las utilidades para el nombre del
 * ala El nÃšmero de naves serÃĄ aleatorio entre 1 y 20 y la posicion entre
 * -TAMANO_UNIVERSO Y TAMANO_UNIVERSO
 * 
 * int anadirNave(NaveEspacial) AÃąadirÃĄ la nave al array de naves espaciales y
 * incrementara el nÃšmero de naves. ComprobarÃĄ que hay espacio en el ala y que
 * no esta llena, devuelve 0 si todo va bien y -1 si hay fallo Le pondrÃĄ a la
 * nave el nombre del ala
 * 
 * naveEspacial masPoderosa() DevolverÃĄ la nave mÃĄs poderosa del ala
 *
 *
 * 
 * @version 1
 * 
 * 
 * 
 */
public class Escuadron {
	// MIEMBROS
	private String nombre;
	public int numNaves;
	// MAX NAVES
	private int numMaximoNaves;
	// POSICION [X][Y][Z]
	public int[] posicion = new int[Universo.NUM_COORDENADAS];
	// TAMAŅO DEL ARRAY = MAX NAVES
	public NaveEspacial naves[];

	// CONSTRUCTOR VACIO
	/**
	 * CONSTRUCTOR PARA GENERAR ALA
	 * 
	 * 
	 */
	Escuadron() {

		this.nombre = Utilidades.nombreAleatorio(Utilidades.TIPO_ALA);
		this.numNaves = (int) (Math.random() * 20 + 1);

		// POSICIONES
		this.posicion[0] = (int) (Math.random() * ((Universo.TAMANO_UNIVERSO + 1) - (-Universo.TAMANO_UNIVERSO)))
				+ (-Universo.TAMANO_UNIVERSO);
		this.posicion[1] = (int) (Math.random() * ((Universo.TAMANO_UNIVERSO + 1) - (-Universo.TAMANO_UNIVERSO)))
				+ (-Universo.TAMANO_UNIVERSO);
		this.posicion[2] = (int) (Math.random() * ((Universo.TAMANO_UNIVERSO + 1) - (-Universo.TAMANO_UNIVERSO)))
				+ (-Universo.TAMANO_UNIVERSO);

		this.numMaximoNaves = (int) (Math.random() * numNaves + Universo.NUM_MAXIMO_NAVES);

		// ARRAY Naves
		// this.naves = new NaveEspacial[numMaximoNaves];

		// GENERAMOS NAVES SEGUN EL NUMERO DE NAVES
		this.naves = this.generarNaves(numNaves, this.numMaximoNaves);
	}

	// CONSTRUCTOR PASAMOS NOMBRE
	/**
	 * CONSTRUCTOR CON NOMBRE ESPECIFICO PARA GENERAR ALA
	 * 
	 * @param nombre Nombre del ala tipo String
	 * 
	 */
	Escuadron(String nombre) {

		this.nombre = nombre;
		this.numNaves = (int) (Math.random() * 20 + 1);

		// POSICIONES
		this.posicion[0] = (int) (Math.random() * ((Universo.TAMANO_UNIVERSO + 1) - (-Universo.TAMANO_UNIVERSO)))
				+ (-Universo.TAMANO_UNIVERSO);
		this.posicion[1] = (int) (Math.random() * ((Universo.TAMANO_UNIVERSO + 1) - (-Universo.TAMANO_UNIVERSO)))
				+ (-Universo.TAMANO_UNIVERSO);
		this.posicion[2] = (int) (Math.random() * ((Universo.TAMANO_UNIVERSO + 1) - (-Universo.TAMANO_UNIVERSO)))
				+ (-Universo.TAMANO_UNIVERSO);

		this.numMaximoNaves = (int) (Math.random() * numNaves + Universo.NUM_MAXIMO_NAVES);

		// ARRAY Naves
		// this.naves = new NaveEspacial[numMaximoNaves];

		// GENERAMOS NAVES SEGUN EL NUMERO DE NAVES
		this.naves = this.generarNaves(numNaves, this.numMaximoNaves);
	}

	// CONSTRUCTOR CON TODAS LAS VARIABLES
	/**
	 * CONSTRUCTOR CON NOMBRE ESPECIFICO PARA GENERAR ALA
	 * 
	 * @param nombre            Nombre del ala tipo String
	 * @param numNaves          Numero de naves en el Ala tipo int
	 * @param posicion0         Posicion en el universo en eje x
	 * @param posicion1         Posicion en el universo en eje y
	 * @param posicion2         Posicion en el universo en eje z
	 * @param numeroMaximoNaves Maximo numero de naves permitidas en el ala
	 * 
	 */
	public Escuadron(String nombre, int numNaves, int posicion0, int posicion1, int posicion2, int numeroMaximoNaves) {

		super();
		this.nombre = nombre;
		this.numNaves = numNaves;

		// POSICIONES
		this.posicion[0] = posicion0;
		this.posicion[1] = posicion1;
		this.posicion[2] = posicion2;

		this.numMaximoNaves = numeroMaximoNaves;

		// ARRAY Naves
		// naves = new NaveEspacial[this.numMaximoNaves];

		// GENERAMOS SEGUN EL NUMERO DE NAVES
		this.naves = this.generarNaves(numNaves, numeroMaximoNaves);

	}

	// METODO AŅADIR NAVE

	/**
	 * Aņade una nave al Ala
	 * 
	 * @param NaveEspacial nave Objeto tipo NaveEspacial
	 * @return retorna 0 si se aņade con exito, retorna -1 si ocurre un error
	 */
	public int aņadirNave(NaveEspacial nave) {

		// Si la No hay hueco para mas naves, no se crea la nave
		if (this.numNaves >= this.numMaximoNaves) {
			System.out.println("Error, no hay hueco para mas naves en este Ala");
			return -1;
		}

		// Le ponemos el nombre de ala al objeto
		nave.nombreAla = this.nombre;

		// Metemos el objeto dentro del string de objetos naves
		this.naves[this.numNaves] = nave;

		// Sumamos uno al numero de naves
		this.numNaves++;

		// retornamos 0, si todo va bien.
		return 0;
	}

	// METODO GENERAR NAVES ALEATORIAS
	/**
	 * Metodo que genera naves aleatorias tipo NaveEspacial
	 * 
	 * @param cantidad    Numero de naves a generar
	 * @param numMaxNaves Numero maximo de naves del ala
	 * @return navesAleatorias retorna un array lleno de objetos tipo NaveEspacial
	 */
	public NaveEspacial[] generarNaves(int cantidad, int numMaxNaves) {

		// NaveEspacial navesAleatorias[] = new NaveEspacial[cantidad];
		naves = new NaveEspacial[numMaxNaves];
		NaveEspacial temporal;

		for (int i = 0; i < cantidad; i++) {

			temporal = new NaveEspacial();
			temporal.nombreAla = this.nombre;
			naves[i] = temporal;

		}

		return naves;

	}

	// METODO PARA BUSCAR LA NAVE MAS PODEROSA
	/**
	 * Metodo que Comprueba que nave del ala es la mas poderosa
	 * 
	 * @return naves[MasPoder] , retorna el objeto nave mas poderosa del ala
	 */
	public NaveEspacial masPoderosa() {

		int MasPoder = 0;
		int MaxPotenciaAtaque = -2147483648;

		for (int i = 0; i < this.numNaves; i++) {

			if (naves[i].getPotenciaAtaque() > MaxPotenciaAtaque) {

				MaxPotenciaAtaque = naves[i].getPotenciaAtaque();
				MasPoder = i;

			}

		}
		return naves[MasPoder];

	}

	// GETTERS AND SETTERS
	public String getNombre() {
		return nombre;
	}

	public int getNumNaves() {
		return numNaves;
	}

	public void setNumNaves(int numNaves) {
		this.numNaves = numNaves;
	}

	public int[] getPosicion() {
		return posicion;
	}

	public void setPosicion(int[] posicion) {
		this.posicion = posicion;
	}

	public NaveEspacial[] getNaves() {
		return naves;
	}

	public void setNaves(NaveEspacial[] naves) {
		this.naves = naves;
	}

	public int getNumMaximoNaves() {
		return numMaximoNaves;
	}

	public void setNumMaximoNaves(int numMaximoNaves) {
		this.numMaximoNaves = numMaximoNaves;
	}

	// TO STRING
	@Override
	public String toString() {
		return "Ala [nombre=" + nombre + ", numNaves=" + numNaves + ", numMaximoNaves=" + numMaximoNaves + ", posicion="
				+ Arrays.toString(posicion) + ", naves=" + Arrays.toString(naves) + "]";
	}

}