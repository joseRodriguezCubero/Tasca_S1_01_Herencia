package n1exercici2;

public class Main {

	public static void main(String[] args) {
		/*
		 * Crea una classe "Cotxe" amb els atributs: marca, model i potència. La marca
		 * ha de ser estàtic final, el model estàtic i la potència final. Demostra la
		 * diferència entre els tres. N’hi ha algun que es pugui inicialitzar al
		 * constructor de la classe?
		 * 
		 * Afegeix dos mètodes a la classe "Cotxe". Un mètode estàtic anomenat frenar()
		 * i un altre no estàtic anomenat accelerar(). El mètode accelerar ha de mostrar
		 * per consola: “El vehicle està accelerant” i el mètode frenar() ha de mostrar:
		 * “El vehicle està frenant”.
		 * 
		 * Demostra com invocar el mètode estàtic i el no estàtic des del main() de la
		 * classe principal.
		 */

		Coche clio = new Coche(200);
		/*
		 * Sólo se puede inicicializar el atributo final POTENCIA la primera vez que se
		 * carga la clase, al no estar definido en la clase. Si en la clase le damos un
		 * valor inicial este no podrá ser cambiado al ser "final". El resto de
		 * atributos al ser estáticos pertenecen a la clase y no al objeto instanciado.
		 */

		clio.acelerar();// el método acelerar se puede invocar desde la clase instanciada.

		Coche.frenar();/*
						 * el método frenar se puede invocar desde la clase Coche. Sin necesidad de
						 * instanciar ningún objeto.
						 */
	}

}