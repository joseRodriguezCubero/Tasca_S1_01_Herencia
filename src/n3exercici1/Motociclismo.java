package n3exercici1;

public class Motociclismo extends Noticia {

	private String equipo;

	public Motociclismo(String titular, String equipo) {
		super(titular);
		this.equipo = equipo;
	}

	public String getEquipo() {
		return equipo;
	}

	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}

	@Override
	public double calcularPrecioNoticia() {
		precio = 100;

		if (equipo.equalsIgnoreCase("honda") || (equipo.equalsIgnoreCase("yamaha"))) {
			precio += 50;
		}
		return precio;
	}

	@Override
	public byte calcularPuntuacionNoticia() {
		puntuacion = 3;

		if (equipo.equalsIgnoreCase("honda") || (equipo.equalsIgnoreCase("yamaha"))) {
			puntuacion += 3;
		}
		return puntuacion;
	}

}