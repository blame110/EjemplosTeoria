package Tema3.spaceX;

//hecho
/**
 * VARIABLES MIEMBRO
 * 
 * nombre String privado PotenciaDisparo int privado TipoArma int //De universo
 * Peso int tipoNave int //De los valores de universo
 * 
 * METODOS
 * 
 * Construir get y set para todas las variables miembro y dos constructores, uno
 * vacio y otro con todos los datos
 * 
 * @version 1
 * 
 * 
 *
 */
public class Arma {
	// MIEMBROS
	private String nombre;
	private int PotenciaDisparo;
	public int TipoArma;
	public int peso;
	public int tipoNave;

	// Constructores

	/**
	 * CONSTRUCTOR VACIO PARA GENERAR ARMA
	 * 
	 * 
	 */
	Arma() {
		this.nombre = Utilidades.nombreAleatorio(Utilidades.TIPO_ARMA);
		this.PotenciaDisparo = 10;
		this.TipoArma = Universo.ARMA_LASER;
		this.peso = 500;
		this.tipoNave = Universo.NAVE_MERCENARIOS;
	}

	/**
	 * CONSTRUCTOR ENTERO PARA GENERAR ARMA
	 * 
	 * @param nombre          tipo String, nombre de arma
	 * @param PotenciaDisparo tipo int, potencia del arma
	 * @param TipoArma        tipo int, tipo de arma segun universo: ARMA_LASER = 1;
	 *                        ARMA_PLASMA = 2; ARMA_CANON = 3;
	 * @param peso            tipo int, peso del arma
	 * @param tipoNave        tipo int, tipo de nave segun universo: NAVE_FEDERACION
	 *                        = 1; NAVE_ALIADOS = 2; NAVE_SIGFRID = 3;
	 *                        NAVE_MERCENARIOS = 4;
	 * 
	 */
	Arma(String nombre, int PotenciaDisparo, int TipoArma, int peso, int tipoNave) {

		this.nombre = nombre;
		this.PotenciaDisparo = PotenciaDisparo;
		this.TipoArma = TipoArma;
		this.peso = peso;
		this.tipoNave = tipoNave;

	}

	// Getters and setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPotenciaDisparo() {
		return PotenciaDisparo;
	}

	public void setPotenciaDisparo(int potenciaDisparo) {
		PotenciaDisparo = potenciaDisparo;
	}

	public int getTipoArma() {
		return TipoArma;
	}

	public void setTipoArma(int tipoArma) {
		TipoArma = tipoArma;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public int getTipoNave() {
		return tipoNave;
	}

	public void setTipoNave(int tipoNave) {
		this.tipoNave = tipoNave;
	}

	@Override
	public String toString() {
		return "Arma [nombre=" + nombre + ", PotenciaDisparo=" + PotenciaDisparo + ", TipoArma=" + TipoArma + ", peso="
				+ peso + ", tipoNave=" + tipoNave + "]";
	}

}