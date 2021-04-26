package Tema3.spaceX;

/**
 * MIEMBROS
 * 
 * potencia int privado consumoEnergia int privado peso int privado turbo int
 * privado
 * 
 * METODOS
 * 
 * Construir get y set para todas las variables miembro y dos constructores, uno
 * vacio y otro con todos los datos
 * 
 *
 * 
 * @version 1
 * 
 * 
 */
public class Motor {
	private int potencia;
	private int consumoEnergia;
	private int peso;
	private int turbo;

	// CONSTRUCTORES
	/**
	 * CONSTRUCTOR PARA GENERAR MOTOR
	 * 
	 * 
	 */
	Motor() {
		this.potencia = 200;
		this.consumoEnergia = 50;
		this.peso = 100;
		this.turbo = 2;
	}

	/**
	 * CONSTRUCTOR ENTERO PARA GENERAR MOTOR
	 * 
	 * @param potencia       tipo int, Potencia del motor
	 * @param consumoEnergia tipo int, consumo de energia
	 * @param peso           tipo int, peso del motor
	 * @param turbo          tipo int, turbo del motor
	 * 
	 */
	Motor(int potencia, int consumoEnergia, int peso, int turbo) {
		this.potencia = potencia;
		this.consumoEnergia = consumoEnergia;
		this.peso = peso;
		this.turbo = turbo;

	}

	// GETTERS AND SETTERS
	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public int getConsumoEnergia() {
		return consumoEnergia;
	}

	public void setConsumoEnergia(int consumoEnergia) {
		this.consumoEnergia = consumoEnergia;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public int getTurbo() {
		return turbo;
	}

	public void setTurbo(int turbo) {
		this.turbo = turbo;
	}


	@Override
	public String toString() {
		return "Motor [potencia=" + potencia + ", consumoEnergia=" + consumoEnergia + ", peso=" + peso + ", turbo="
				+ turbo + "]";
	}

}