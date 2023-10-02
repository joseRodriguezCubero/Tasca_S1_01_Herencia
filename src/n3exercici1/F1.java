package n3exercici1;

public class F1 extends Noticia {
	private String escuderia;

	public F1(String titular, String escuderia) {
		super(titular);
		this.escuderia = escuderia;
	}

	public String getEscuderia() {
		return escuderia;
	}

	public void setEscuderia(String escuderia) {
		this.escuderia = escuderia;
	}

	@Override
	public double calcularPrecioNoticia() {
		precio = 100;

		if (escuderia.equalsIgnoreCase("ferrari") || (escuderia.equalsIgnoreCase("mercedes"))) {
			precio += 50;
		}
		return precio;
	}

	@Override
	public byte calcularPuntuacionNoticia() {
		puntuacion = 4;

		if (escuderia.equalsIgnoreCase("ferrari") || (escuderia.equalsIgnoreCase("mercedes"))) {
			puntuacion += 2;
		}
		return puntuacion;
	}

}