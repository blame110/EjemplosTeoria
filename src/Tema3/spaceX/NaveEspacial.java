package Tema3.spaceX;

import java.util.Arrays;

/**
 * MIEMBROS
 * 
 * int numMaxMotores int numMaxArmas motoresInstalados ArmasInstaladas
 * 
 * 
 * nombre String privado Energía int privado AceleraciónActual int privado
 * PesoVacio int publico Ancho int publico Alto int publico CargaMáxima int
 * publico CargaLibre int publico MaxTripulantes int publico PotenciaAtaque int
 * privado posicion int[] publico Escudo int publico Municion int[] tendra tres
 * tipos de munición, dependiendo de si es laser, plasma o cañon Integridad
 * int nombreAla String
 * 
 * tipoNave int //de los valores de universo
 * 
 * 
 * ClaseNave EXPLORACION, GUERRA, COMERCIAL, PASAJEROS Motor motores[] Arma
 * Armas[]
 * 
 * 
 * METODOS
 * 
 * Crear metodos get y set para todas las variables miembro Excepto el nombre
 * que solo tiene get
 * 
 * Crear 3 Constructores El primero vacio, generará los valores, incluido el
 * nombre, aleatoriamente El segundo recibirá sólo el nombre, el resto
 * aleatorio La última recibirá todas las variables de tipo básico
 * 
 * int montarArma(arma arma1) Comprueba que el arma a montar sea compatible ->
 * TipoNave coincida Comprueba que pueda con el peso, es decir que la carga
 * libre sea mayor que el peso del motor, y resta el peso a la cargalibre
 * Comprueba que la potencia de disparo de todas las armas y el consumo de
 * energía de los motores no sea superior a la energía de la nave, en caso de
 * superarlo por un 150% no permitirá su instalación, sí es superior al 100%
 * advertirá que no podrá disparar y acelerar a toda potencia. Asignará el
 * arma al array de armas de la nave.
 * 
 * devolverá 0 si se pudo montar y -1 en caso contrario
 * 
 * int montarMotor(Motor motor1) Comprueba que pueda con el peso y actualiza la
 * CargaLibre. Comprueba que la potencia de la nave sea suficiente. Asignará el
 * arma al array de armas de la nave.
 * 
 * devolverá 0 si se pudo montar y -1 en caso contrario
 * 
 *
 * int potenciaDisparo() Calcula la potencia de disparo de todas las armas de la
 * nave
 * 
 * int potenciaMotorMaxima() Calcula la potencia de motor máxima
 * 
 *
 *
 * @version 1
 * 
 * 
 */
public class NaveEspacial {

	// MIEMBROS
	private String nombre;
	private int Energia;
	private int AceleracionActual;
	public int pesoVacio;
	public int Ancho;
	public int Alto;
	public int CargaMaxima;
	public int CargaLibre;
	public int MaxTripulantes;
	private int PotenciaAtaque;
	public int Escudo;
	public int Integridad;
	public String nombreAla;
	public int tipoNave;
	public String claseNave;

	// POSICIONES [X][Y][Z]
	public int[] posicion = new int[Universo.NUM_COORDENADAS];

	// MUNICION, DE LOS 3 TIPOS DE ARMAS QUE HAY [LASER][CAÑON][PLASMA]
	public int[] Municion = new int[3];

	// Conjunto de motores
	public Motor motores[];

	// Conjunto de armAs
	public Arma Armas[];

	// VARIABLES NECESARIAS PARA METODOS
	public int numMaxMotores;
	public int numMaxArmas;
	public int motoresInstalados;
	public int ArmasInstaladas;

	// Contructor VACIO
	/**
	 * CONSTRUCTOR PARA GENERAR NAVEESPACIAL
	 * 
	 * 
	 */

	NaveEspacial() {

		this.nombre = Utilidades.nombreAleatorio(Utilidades.TIPO_NAVE);
		this.Energia = (int) (Math.random() * 300);
		this.AceleracionActual = (int) (Math.random() * 300);
		this.pesoVacio = (int) (Math.random() * 1000);
		this.Ancho = (int) (Math.random() * 300);
		this.Alto = (int) (Math.random() * 300);
		this.CargaMaxima = (int) (Math.random() * 300);
		this.CargaLibre = (int) (Math.random() * 300);
		this.MaxTripulantes = (int) (Math.random() * 100);
		this.PotenciaAtaque = (int) (Math.random() * 300);

		// POSICIONES
		this.posicion[0] = (int) (Math.random() * ((Universo.TAMANO_UNIVERSO + 1) - (-Universo.TAMANO_UNIVERSO)))
				+ (-Universo.TAMANO_UNIVERSO);
		this.posicion[1] = (int) (Math.random() * ((Universo.TAMANO_UNIVERSO + 1) - (-Universo.TAMANO_UNIVERSO)))
				+ (-Universo.TAMANO_UNIVERSO);
		this.posicion[2] = (int) (Math.random() * ((Universo.TAMANO_UNIVERSO + 1) - (-Universo.TAMANO_UNIVERSO)))
				+ (-Universo.TAMANO_UNIVERSO);

		this.Escudo = (int) (Math.random() * 300);

		// MUNICION
		this.Municion[0] = Universo.ARMA_CANON;
		this.Municion[1] = Universo.ARMA_LASER;
		this.Municion[2] = Universo.ARMA_PLASMA;

		this.Integridad = (int) (Math.random() * 300);
		this.nombreAla = Utilidades.nombreAleatorio(Utilidades.TIPO_ALA);
		this.tipoNave = (int) (Math.random() * 4 + 1);

		// SERA ALEATORIA LA CLASE DE LA NAVE
		int aleatorio = (int) (Math.random() * 4 + 1);
		switch (aleatorio) {
		case 1:
			this.claseNave = "EXPLORACION";
			break;
		case 2:
			this.claseNave = "GUERRA";
			break;
		case 3:
			this.claseNave = "COMERCIAL";
			break;
		case 4:
			this.claseNave = "PASAJEROS";
			break;
		default:
			this.claseNave = "PASAJEROS";
		}

		this.numMaxMotores = (int) (Math.random() * 2 + 1);
		this.numMaxArmas = (int) (Math.random() * 2 + 1);
		// ARRAY MOTORES
		this.motores = new Motor[numMaxMotores];

		// ARRAY ARMAS
		this.Armas = new Arma[numMaxArmas];

	}// END CONSTRUCTOR VACIO

	/**
	 * CONSTRUCTOR CON NOMBRE ESPECIFICO PARA GENERAR NAVEESPACIAL
	 * 
	 * @param nombre Nombre de la nave tipo String
	 * 
	 */
	// CONSTRUCTOR CON NOMBRE ESPECIFICO
	NaveEspacial(String nombre) {

		// NOMBRE ESPECIFICO
		this.nombre = nombre;

		this.Energia = (int) (Math.random() * 300);
		this.AceleracionActual = (int) (Math.random() * 300);
		this.pesoVacio = (int) (Math.random() * 1000);
		this.Ancho = (int) (Math.random() * 300);
		this.Alto = (int) (Math.random() * 300);
		this.CargaMaxima = (int) (Math.random() * 300);
		this.CargaLibre = (int) (Math.random() * 300);
		this.MaxTripulantes = (int) (Math.random() * 100);
		this.PotenciaAtaque = (int) (Math.random() * 300);

		// POSICIONES
		this.posicion[0] = (int) (Math.random() * ((Universo.TAMANO_UNIVERSO + 1) - (-Universo.TAMANO_UNIVERSO)))
				+ (-Universo.TAMANO_UNIVERSO);
		;
		this.posicion[1] = (int) (Math.random() * ((Universo.TAMANO_UNIVERSO + 1) - (-Universo.TAMANO_UNIVERSO)))
				+ (-Universo.TAMANO_UNIVERSO);
		this.posicion[2] = (int) (Math.random() * ((Universo.TAMANO_UNIVERSO + 1) - (-Universo.TAMANO_UNIVERSO)))
				+ (-Universo.TAMANO_UNIVERSO);

		this.Escudo = (int) (Math.random() * 300);

		// MUNICION
		this.Municion[0] = Universo.ARMA_CANON;
		this.Municion[1] = Universo.ARMA_LASER;
		this.Municion[2] = Universo.ARMA_PLASMA;

		this.Integridad = (int) (Math.random() * 300);
		this.nombreAla = Utilidades.nombreAleatorio(Utilidades.TIPO_ALA);
		this.tipoNave = (int) (Math.random() * 4 + 1);

		// CLASE ALEATORIA
		int aleatorio = (int) (Math.random() * 4 + 1);
		switch (aleatorio) {
		case 1:
			this.claseNave = "EXPLORACION";
			break;
		case 2:
			this.claseNave = "GUERRA";
			break;
		case 3:
			this.claseNave = "COMERCIAL";
			break;
		case 4:
			this.claseNave = "PASAJEROS";
			break;
		default:
			this.claseNave = "PASAJEROS";
		}

		this.numMaxMotores = (int) (Math.random() * 2 + 1);
		this.numMaxArmas = (int) (Math.random() * 2 + 1);
		// ARRAY MOTORES
		this.motores = new Motor[numMaxMotores];

		// ARRAY ARMAS
		this.Armas = new Arma[numMaxArmas];

	}// END CONSTRUCTOR CON NOMBRE ESPECIFICO

	/**
	 * CONSTRUCTOR ENTERO PARA GENERAR NAVEESPACIAL
	 * 
	 * @param nombre            Nombre de la nave tipo String
	 * @param energia           Energia total de la nave tipo int
	 * @param aceleracionActual Aceleracion de la nave tipo int
	 * @param pesoVacio         Peso vacio de la nave tipo int
	 * @param ancho             Ancho de la nave tipo int
	 * @param alto              Alto de la nave tipo int
	 * @param cargaMaxima       Carga Maxima de la nave tipo int
	 * @param cargaLibre        Carga libre de la nave tipo int, debe ser menor que
	 *                          la carga maxima
	 * @param maxTripulantes    Maximos tripulantes permitidos tipo int
	 * @param potenciaAtaque    Potencia total de ataque de la nave tipo int
	 * @param posicion1         Posicion en eje x, tipo int
	 * @param posicion2         Posicion en eje y, tipo int
	 * @param posicion3         Posicion en eje z, tipo int
	 * @param escudo            Escudo de la nace, tipo int
	 * @param municion1         Tipo de municion, Segun las constantes de universo
	 *                          ARMA_LASER = 1; ARMA_PLASMA = 2; ARMA_CANON = 3;
	 * @param municion2         Tipo de municion, Segun las constantes de universo
	 *                          ARMA_LASER = 1; ARMA_PLASMA = 2; ARMA_CANON = 3;
	 * @param municion3         Tipo de municion, Segun las constantes de universo
	 *                          ARMA_LASER = 1; ARMA_PLASMA = 2; ARMA_CANON = 3;
	 * @param integridad        Integridad total de la nave tipo int
	 * @param nombreAla         Nombre del ala donde se encuentra la nave, tipo
	 *                          String
	 * @param tipoNave          Tipo de nave, segun la Universo NAVE_FEDERACION = 1;
	 *                          NAVE_ALIADOS = 2; NAVE_SIGFRID = 3; NAVE_MERCENARIOS
	 *                          = 4;
	 * @param claseNave         CLase de la nave tipo string, a elegir entre:
	 *                          EXPLORACION, GUERRA, COMERCIAL, PASAJEROS
	 * @param numMaxMotores     Numero maximo de motores tipo int
	 * @param numMaxArmas       Numero Maximo de armas tipo int
	 *
	 */
	// CONSTRUCTOR ENTERO
	public NaveEspacial(String nombre, int energia, int aceleracionActual, int pesoVacio, int ancho, int alto,
			int cargaMaxima, int cargaLibre, int maxTripulantes, int potenciaAtaque, int posicion1, int posicion2,
			int posicion3, int escudo, int municion1, int municion2, int municion3, int integridad, String nombreAla,
			int tipoNave, String claseNave, int numMaxMotores, int numMaxArmas) {
		super();
		this.nombre = nombre;
		this.Energia = energia;
		this.AceleracionActual = aceleracionActual;
		this.pesoVacio = pesoVacio;
		this.Ancho = ancho;
		this.Alto = alto;
		this.CargaMaxima = cargaMaxima;
		this.CargaLibre = cargaLibre;
		this.MaxTripulantes = maxTripulantes;
		this.PotenciaAtaque = potenciaAtaque;
		this.posicion[0] = posicion1;
		this.posicion[1] = posicion2;
		this.posicion[2] = posicion3;
		this.Escudo = escudo;
		this.Municion[0] = municion1;
		this.Municion[1] = municion2;
		this.Municion[2] = municion3;
		this.Integridad = integridad;
		this.nombreAla = nombreAla;
		this.tipoNave = tipoNave;
		this.claseNave = claseNave;
		this.numMaxMotores = numMaxMotores;
		this.numMaxArmas = numMaxArmas;

		// ARRAY MOTORES
		this.motores = new Motor[numMaxMotores];

		// ARRAY ARMAS
		this.Armas = new Arma[numMaxArmas];

	}// END CONSTRUCTOR ENTERO

	/**
	 * Comprueba que el arma a montar sea compatible -> TipoNave coincida Comprueba
	 * que pueda con el peso, es decir que la carga libre sea mayor que el peso del
	 * motor, y resta el peso a la cargalibre Comprueba que la potencia de disparo
	 * de todas las armas y el consumo de energía de los motores no sea superior a
	 * la energía de la nave, en caso de superarlo por un 150% no permitirá su
	 * instalación, sí es superior al 100% advertirá que no podrá disparar y
	 * acelerar a toda potencia. Asignará el arma al array de armas de la nave.
	 * 
	 * @param Arma arma1 Se le pasa un objeto tipo Arma
	 * @return devolvera 0 si se pudo montar y -1 en caso contrario
	 */

	// METODO MONTAR ARMA
	public int montarArma(Arma arma1) {
		// comprobamos si el arma es compatible
		int tipoArma = arma1.TipoArma;
		int tipoNave = arma1.tipoNave;
		int pesoArma = arma1.peso;
		int potenciaTotalArmas = this.potenciaDisparo();
		int consumoTotalMotores = this.potenciaMotorMaxima();

		// COMPRUEBA QUE NO SUPERE EL MAXIMO DE ARMAS INSTALADAS;
		if (this.numMaxArmas == this.ArmasInstaladas) {
			System.out.println("ERROR...No caben mas armas");
			return -1;
		}
		// COMPROBADOR DE COMPATIBILIDAD DE ARMA CON TIPO DE NAVE
		if (this.tipoNave != arma1.tipoNave) {
			System.out.println("ERROR...No coincide con el tipo de nave indicado");
			return -1;
		} // END CONTROLADOR DE COMPATIBILIDAD

		// COMPROBADOR DE PESO
		if (this.CargaLibre < pesoArma) {
			System.out.println("ERROR. El arma peso mas que la carga libre de su nave, no puede montarse.");
			return -1;
		} // END COMPROBADOR DE PESO

		// COMPROBADOR DE ENERGIA
		if ((potenciaTotalArmas + consumoTotalMotores + arma1.getPotenciaDisparo()) > (this.Energia * 1.5)) {

			System.out
					.println("ERROR. No puedo montar este arma debido a que supera el consumo de energia de la Nave.");
			return -1;

		} else if ((potenciaTotalArmas + consumoTotalMotores + arma1.getPotenciaDisparo()) > (this.Energia)) {

			System.out.println("Instalada, pero no podrá disparar, ni acelerar a toda potencia.");

		} // END COMPROBADOR DE ENERGIA

		// METEMOS EL ARMA DENTRO DEL ARRAY DE ARMAS
		this.Armas[this.ArmasInstaladas] = arma1;
		this.ArmasInstaladas++;

		this.CargaLibre = this.CargaLibre - pesoArma;

		// RETORNAMOS 0 EN CASO DE QUE TODO HAYA IDO BIEN
		return 0;

	}// END METODO MONTAR ARMA

	/**
	 * Comprueba que el motor se puede montar
	 * 
	 * @param Motor motor1 Se le pasa un objeto tipo Motor
	 * @return devolvera 0 si se pudo montar y -1 en caso contrario
	 */
	// METODO MONTAR MOTOR
	public int montarMotor(Motor motor1) {

		int pesoMotor = motor1.getPeso();
		int potenciaMotor = motor1.getPotencia();
		int potenciaTotalArmas = this.potenciaDisparo();
		int consumoTotalMotores = this.potenciaMotorMaxima();

		// COMPRUEBA QUE NO SUPERA EL MAXIMO DE MOTORES INSTALADOS
		if (this.numMaxMotores == this.motoresInstalados)
			return -1;
		// COMPROBADOR DE PESO
		if (pesoMotor > this.CargaLibre) {
			System.out.println("ERROR. No puedo montar este Motor, porque supera el peso limite.");
			return -1;
		}

		// COMPROBADOR DE ENERGIA
		if ((potenciaTotalArmas + consumoTotalMotores + potenciaMotor) > (this.Energia * 1.5)) {

			System.out
					.println("ERROR. No puedo montar este motor debido a que supera el consumo de energia de la Nave.");
			return -1;

		} else if ((potenciaTotalArmas + consumoTotalMotores + potenciaMotor) > (this.Energia)) {

			System.out.println("Instalado, pero no podrá disparar, ni acelerar a toda potencia.");

		} // END COMPROBADOR DE ENERGIA

		// AÑADIMOS EL MOTOR AL ARRAY DE MOTORES

		this.motores[this.motoresInstalados] = motor1;
		this.motoresInstalados++;
		this.CargaLibre = this.CargaLibre - pesoMotor;

		System.out.println("Motor instalado con exito.");

		return 0;
	}

	/**
	 * Calcula la potencia de disparo total entre todas las armas instaladas
	 * 
	 * @return potenciaTotalArmas retorna el total de potencia de disparo entre
	 *         todas las armas instaladas
	 */
	// Calcular potencia de todas las armas de la nave
	public int potenciaDisparo() {

		int potenciaTotalArmas = 0;

		for (int j = 0; j < this.ArmasInstaladas; j++) {

			potenciaTotalArmas = potenciaTotalArmas + Armas[j].getPotenciaDisparo();

		}

		return potenciaTotalArmas;
	}

	/**
	 * Calcula la potencia de motor total entre todos los motores instalados
	 * 
	 * @return consumoTotalMotores retorna el total de potencia de motor entre todos
	 *         los motores instalados
	 */
	// Calcular potencia motor maxima
	public int potenciaMotorMaxima() {

		int consumoTotalMotores = 0;

		for (int i = 0; i < this.motoresInstalados; i++) {

			consumoTotalMotores = consumoTotalMotores + motores[i].getPotencia();
		}

		return consumoTotalMotores;
	}

	// GETTERS AND SETTERS
	public String getNombre() {
		return nombre;
	}

	public int getEnergia() {
		return Energia;
	}

	public void setEnergia(int energia) {
		Energia = energia;
	}

	public int getAceleracionActual() {
		return AceleracionActual;
	}

	public void setAceleracionActual(int aceleracionActual) {
		AceleracionActual = aceleracionActual;
	}

	public int getPesoVacio() {
		return pesoVacio;
	}

	public void setPesoVacio(int pesoVacio) {
		this.pesoVacio = pesoVacio;
	}

	public int getAncho() {
		return Ancho;
	}

	public void setAncho(int ancho) {
		Ancho = ancho;
	}

	public int getAlto() {
		return Alto;
	}

	public void setAlto(int alto) {
		Alto = alto;
	}

	public int getCargaMaxima() {
		return CargaMaxima;
	}

	public void setCargaMaxima(int cargaMaxima) {
		CargaMaxima = cargaMaxima;
	}

	public int getCargaLibre() {
		return CargaLibre;
	}

	public void setCargaLibre(int cargaLibre) {
		CargaLibre = cargaLibre;
	}

	public int getMaxTripulantes() {
		return MaxTripulantes;
	}

	public void setMaxTripulantes(int maxTripulantes) {
		MaxTripulantes = maxTripulantes;
	}

	public int getPotenciaAtaque() {
		return PotenciaAtaque;
	}

	public void setPotenciaAtaque(int potenciaAtaque) {
		PotenciaAtaque = potenciaAtaque;
	}

	public int[] getPosicion() {
		return posicion;
	}

	public void setPosicion(int[] posicion) {
		this.posicion = posicion;
	}

	public int getEscudo() {
		return Escudo;
	}

	public void setEscudo(int escudo) {
		Escudo = escudo;
	}

	public int[] getMunicion() {
		return Municion;
	}

	public void setMunicion(int[] municion) {
		Municion = municion;
	}

	public int getIntegridad() {
		return Integridad;
	}

	public void setIntegridad(int integridad) {
		Integridad = integridad;
	}

	public String getNombreAla() {
		return nombreAla;
	}

	public void setNombreAla(String nombreAla) {
		this.nombreAla = nombreAla;
	}

	public int getTipoNave() {
		return tipoNave;
	}

	public void setTipoNave(int tipoNave) {
		this.tipoNave = tipoNave;
	}

	public String getClaseNave() {
		return claseNave;
	}

	public void setClaseNave(String claseNave) {
		this.claseNave = claseNave;
	}

	public Motor[] getMotores() {
		return motores;
	}

	public void setMotores(Motor[] motores) {
		this.motores = motores;
	}

	public Arma[] getArmas() {
		return Armas;
	}

	public void setArmas(Arma[] armas) {
		Armas = armas;
	}

	// TO STRING
	@Override
	public String toString() {
		return "NaveEspacial [nombre=" + nombre + ", Energia=" + Energia + ", AceleracionActual=" + AceleracionActual
				+ ", pesoVacio=" + pesoVacio + ", Ancho=" + Ancho + ", Alto=" + Alto + ", CargaMaxima=" + CargaMaxima
				+ ", CargaLibre=" + CargaLibre + ", MaxTripulantes=" + MaxTripulantes + ", PotenciaAtaque="
				+ PotenciaAtaque + ", posicion=" + Arrays.toString(posicion) + ", Escudo=" + Escudo + ", Municion="
				+ Arrays.toString(Municion) + ", Integridad=" + Integridad + ", nombreAla=" + nombreAla + ", tipoNave="
				+ tipoNave + ", claseNave=" + claseNave + ", motores=" + Arrays.toString(motores) + ", Armas="
				+ Arrays.toString(Armas) + "]";
	}

}