package n1exercici1;

public abstract class Instrumento {

	private String nombre;
	private int precio;
	protected static int contador = 0; // esta en protected para que las clases hijas puedan acceder al atributo.

	public Instrumento(String nombre, int precio) {
		this.nombre = nombre;
		this.precio = precio;
	}

	static {
		contador = 10;
		System.out.println("He iniciado el contador en 10");
	}

	public String getNombre() {
		return nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public abstract void tocar();

	@Override
	public String toString() {
		return "Instrumento [nombre=" + nombre + ", precio=" + precio + "]";
	}

}