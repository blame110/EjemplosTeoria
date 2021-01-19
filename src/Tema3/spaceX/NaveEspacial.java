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
 *          posicion int[] publico
 *          Escudo int publico
 *          Municion int[] tendra tres tipos de munición, dependiendo de si es laser, plasma o cañon
 *          Integridad int
 *          nombreAla String
 * 
 *          tipoNave int //de los valores de universo
 * 
 * 
 *          ClaseNave EXPLORACION, GUERRA, COMERCIAL, PASAJEROS
 *          Motor motores[]
 *          Arma Armas[]
 * 
 * 
 *          METODOS
 * 
 *          Crear metodos get y set para todas las variables miembro
 *          Excepto el nombre que solo tiene get
 * 
 *          Crear 3 Constructores
 *          El primero vacio, generará los valores, incluido el nombre, aleatoriamente
 *          El segundo recibirá sólo el nombre, el resto aleatorio
 *          La última recibirá todas las variables de tipo básico
 * 
 *          int montarArma(arma arma1)
 *          Comprueba que el arma a montar sea compatible -> TipoNave coincida
 *          Comprueba que pueda con el peso, es decir que la carga libre sea mayor que el peso
 *          del motor, y resta el peso a la cargalibre
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
 *          Asignará el arma al array de armas de la nave.
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
 * 
 * 
 * 
 *
 */
public class NaveEspacial {

}
