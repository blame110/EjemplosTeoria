package Tema3.spaceX;

/**
 * 
 * @version 1
 * 
 *          MIEMBROS
 * 
 *          nombre String privado
 *          Energía int privado
 *          AceleraciónActual int privado
 *          PesoVacio int publico
 *          Ancho int publico
 *          Alto int publico
 *          CargaMáxima int publico
 *          CargaLibre int publico
 *          MaxTripulantes int publico
 *          PotenciaAtaque int privado
 *          posicion int[] publico //Array de enteros de dos cordenadas, posicion[0] seria x y posicion[1] seria y
 *          Escudo int publico
 *          Municion int[] tendra tres tipos de munición, dependiendo de si es laser, plasma o cañon
 *          Integridad int
 *          nombreAla String
 *          public int numMaxMotores;
 *          public int numMaxArmas;
 *          public int motoresInstalados;
 *          public int armasInstaladas;
 * 
 *          tipoNave int //de los valores de universo
 * 
 * 
 *          ClaseNave EXPLORACION, GUERRA, COMERCIAL, PASAJEROS
 *          Motor motores[]
 *          Arma armas[]
 * 
 * 
 * 
 *          METODOS
 * 
 *          Crear metodos get y set para todas las variables miembro
 *          Excepto el nombre que solo tiene get
 * 
 *          Crear 3 Constructores
 *          El primero vacio, generará los valores, incluido el nombre, aleatoriamente
 * 
 *          El segundo recibirá sólo el nombre, el resto aleatorio
 * 
 *          La última recibirá todas las variables de tipo básico
 * 
 *          int montarArma(arma arma1)
 *          Comprueba que el arma a montar sea compatible -> TipoNave coincida
 *          Comprueba que pueda con el peso, es decir que la carga libre sea mayor que el peso
 *          del arma, y resta el peso a la cargalibre
 *          Comprueba que la potencia de disparo de todas las armas y el consumo de energía de
 *          los motores no sea superior a la energía de la nave, en caso de superarlo por un 150%
 *          no permitirá su instalación, sí es superior al 100% advertirá que no podrá disparar y
 *          acelerar a toda potencia.
 *          Asignará el arma al array de armas de la nave.
 * 
 *          devolverá 0 si se pudo montar y -1 en caso contrario
 * 
 *          int montarMotor(Motor motor1)
 *          Comprueba que pueda con el peso y actualiza la CargaLibre.
 *          Comprueba que la potencia de la nave sea suficiente.
 *          Asignará el motor al array de motores de la nave.
 * 
 *          devolverá 0 si se pudo montar y -1 en caso contrario
 * 
 *
 *          int potenciaDisparo()
 *          Calcula la potencia de disparo de todas las armas de la nave
 * 
 *          int potenciaMotorMaxima()
 *          Calcula la potencia de motor máxima
 * 
 *          String tipoNave()
 * 
 * 
 * 
 * 
 * 
 *
 */
public class NaveEspacial {

	public int tipoNave;
	public int cargaLibre;
	public int energia;

	//Array con el conjunto de motores de la nave
	private Motor motores[];

	//Array con el conjunto de armas de la nave
	private Arma armas[];

	public int numMaxMotores;
	public int numMaxArmas;
	public int motoresInstalados;
	public int armasInstaladas;

	public NaveEspacial() {

	}

	public String tipoNave() {

		String cadTipo = "";
		switch (this.tipoNave) {
		case Universo.NAVE_FEDERACION:
			cadTipo = "Nave Federacion";
		}

		return cadTipo;
	}

	/**
	 * Comprueba que el arma a montar sea compatible -> TipoNave coincida
	 * Comprueba que pueda con el peso, es decir que la carga libre sea mayor que el peso
	 * del arma, y resta el peso a la cargalibre
	 * Comprueba que la potencia de disparo de todas las armas y el consumo de energía de
	 * los motores no sea superior a la energía de la nave, en caso de superarlo por un 150%
	 * no permitirá su instalación, sí es superior al 100% advertirá que no podrá disparar y
	 * acelerar a toda potencia.
	 * Asignará el arma al array de armas de la nave.
	 * 
	 * @param arma
	 * @return devolverá 0 si se pudo montar y -1 en caso contrario
	 */

	public int montarArma(Arma arma) {

		//Primero comprobamos que haya hueco para un arma
		if (this.numMaxArmas == this.armasInstaladas)
			return -1;
		else
		//Comprueba que el tipo de nave del arma sea compatible
		if (this.tipoNave != arma.tipoNave)
			return -1;
		else
		//Comprobamos que el peso del arma no supere la carga de la nave
		if (this.cargaLibre <= arma.peso)
			return -1;
		else {

			//Calculamos la energia de todos los motores y las armas
			int energiaTotal = 0;
			for (int i = 0; i < this.motoresInstalados; i++) {
				energiaTotal = energiaTotal + motores[i].getConsumoEnergia();
			}

			for (Arma armatmp : armas) {
				energiaTotal = energiaTotal + armatmp.potenciaDisparo;
			}

			//Energia total con el arma
			energiaTotal = energiaTotal + arma.potenciaDisparo;

			if (energiaTotal / this.energia > 1.5) {
				System.out.println("La nave no tiene energia suficiente para instalar el arma");
				return -1;
			} else {

				if (energiaTotal / this.energia > 1)
					System.out.println(
							"La nave esta al limite de energia, puede que no responda si sobrecarga el nucleo");

				//Instalo el arma añadiendola a la última posición 
				//del array de armas, la última posición coincide con el número de armas instaladas
				//Al ser la primera posición de un array el 0
				this.armas[this.armasInstaladas] = arma;

				//Calculamos la nueva cargaLibre de la nave despues de montar el arma
				this.cargaLibre = this.cargaLibre - arma.peso;

				//Incrementar el numero de armas instaladas
				this.armasInstaladas++;

				return 0;
			}
		}

	}

}
