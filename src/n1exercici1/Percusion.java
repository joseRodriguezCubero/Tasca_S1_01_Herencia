package n1exercici1;

public class Percusion extends Instrumento {

	int id;

	public Percusion(String nombre, int precio) {
		super(nombre, precio);
		id = contador++;
	}

	@Override
	public void tocar() {
		System.out.println("Està sonant un instrument de percussió");
	}

}