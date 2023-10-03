package n1exercici1;

public class Main {

	public static void main(String[] args) {

		System.out.println(Instrumento.contador);

		Viento flauta = new Viento("Flauta", 30);

		System.out.println(Instrumento.contador);

		flauta.tocar();
		
		
		// también se puede hacer así:

		// Viento flauta = new Viento("Flauta", 30);

		// System.out.println(Instrumento.contador);

		// flauta.tocar();
		
	}

}