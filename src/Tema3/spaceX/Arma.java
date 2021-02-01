package Tema3.spaceX;

/**
 * @version 1
 * 
 *          VARIABLES MIEMBRO
 * 
 *          nombre String privado
 *          PotenciaDisparo int privado
 *          TipoArma int //De universo
 *          Peso int
 *          tipoNave int //De los valores de universo
 * 
 *          METODOS
 * 
 *          Construir get y set para todas las variables miembro
 *          y dos constructores, uno vacio y otro con todos los datos
 * 
 *
 */
public class Arma {

	private String nombre;
	public int tipoNave;
	public int peso;
	public int potenciaDisparo;
	public int tipoArma;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTipoNave() {
		return tipoNave;
	}

	public void setTipoNave(int tipoNave) {
		this.tipoNave = tipoNave;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public int getPotenciaDisparo() {
		return potenciaDisparo;
	}

	public void setPotenciaDisparo(int potenciaDisparo) {
		this.potenciaDisparo = potenciaDisparo;
	}

	public Arma() {
		this.nombre = "";
		this.peso = 0;
		this.potenciaDisparo = 0;
		this.tipoArma = Universo.ARMA_LASER;
		this.tipoNave = Universo.NAVE_FEDERACION;
	}

	public Arma(String nombreNuevo) {

		this.nombre = nombreNuevo;
		this.peso = 25;
		this.potenciaDisparo = 0;
		this.tipoArma = Universo.ARMA_LASER;
		this.tipoNave = Universo.NAVE_FEDERACION;
	}

	public Arma(String nombre, int tipoNave, int peso, int potenciaDisparo, int tipoArma) {

		this.nombre = nombre;
		this.tipoNave = tipoNave;
		this.peso = peso;
		this.potenciaDisparo = potenciaDisparo;
		this.tipoArma = tipoArma;
	}

	@Override
	public String toString() {
		return "Arma [nombre=" + nombre + ", tipoNave=" + tipoNave + ", peso=" + peso + ", potenciaDisparo="
				+ potenciaDisparo + ", tipoArma=" + tipoArma + "]";
	}

}
