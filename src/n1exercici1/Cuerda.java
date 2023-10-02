package n1exercici1;

public class Cuerda extends Instrumento {

	int id;

	public Cuerda(String nombre, int precio) {
		super(nombre, precio);
		id = contador++;
	}

	@Override
	public void tocar() {
		System.out.println("Està sonant un instrument de corda");
	}

}