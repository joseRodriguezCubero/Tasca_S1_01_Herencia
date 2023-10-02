package n1exercici1;

public class Viento extends Instrumento {
	int id;

	public Viento(String nombre, int precio) {
		super(nombre, precio);
		id = contador++;
	}

	public int getId() {
		return id;
	}

	@Override
	public void tocar() {
		System.out.println("Està sonant un instrument de vent");
	}

}