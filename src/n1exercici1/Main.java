package n1exercici1;

public class Main {

	public static void main(String[] args) {
		/*
		 * En un grup de música hi ha diferents tipus d’instruments musicals. Hi ha
		 * instruments de vent, de corda i de percussió.
		 * 
		 * Tots els instruments tenen com a atributs el seu nom, i el seu preu. A més,
		 * tenen un mètode anomenat tocar(). Aquest, és abstracte a la classe instrument
		 * i, per tant, s’ha d’implementar a les classes filles. Si s’està tocant un
		 * instrument de vent, el mètode ha de mostrar per consola:
		 * "Està sonant un instrument de vent", si s’està tocant un instrument de corda:
		 * “Està sonant un instrument de corda” i si s’està tocant un instrument de
		 * percussió: “Està sonant un instrument de percussió”.
		 * 
		 * 
		 * El procés de càrrega d'una classe només té lloc una vegada. Demostra que la
		 * càrrega pot ser provocada per la creació de la primera instància d'aquesta
		 * classe o per l'accés a un membre estàtic d'aquesta.
		 * 
		 * Cerca informació sobre els blocs d'inicialització i blocs estàtics en Java.
		 */

		System.out.println(Instrumento.contador);

		Viento flauta = new Viento("Flauta", 30);

		System.out.println(Instrumento.contador);

		flauta.tocar();
		/*
		 * cuando instanciamos un Objeto Viento el valor aumenta porque esta ligado a un
		 * incremento definido en la clase Viento. Pero el mensaje
		 * "He iniciado el contador en 10" no se vuelve a repetir
		 */
		// también se puede hacer así:

		// Viento flauta = new Viento("Flauta", 30);

		// System.out.println(Instrumento.contador);

		// flauta.tocar();
		/*
		 * En este caso al instanciar el objeto Viento flauta iniciamos la carga de la
		 * clase y se imprime el mensaje, a continuacion al imprimir la variable
		 * estática vemos que su valor ha aumentado debido a que al llamar al
		 * constructor de la clase Viento incrementa el "Instrumento.contador" al ser
		 * instanciada.
		 */

	}

}