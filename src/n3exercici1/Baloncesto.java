package n3exercici1;

public class Baloncesto extends Noticia {
	private String competicion;
	private String club;

	public Baloncesto(String titular, String competicion, String club) {
		super(titular);
		this.competicion = competicion;
		this.club = club;
	}

	public String getCompeticion() {
		return competicion;
	}

	public void setCompeticion(String competicion) {
		this.competicion = competicion;
	}

	public String getClub() {
		return club;
	}

	public void setClub(String club) {
		this.club = club;
	}

	@Override
	public double calcularPrecioNoticia() {
		precio = 250;
		if (competicion.equalsIgnoreCase("euroliga")) {
			precio += 75;
		}
		if (club.equalsIgnoreCase("barcelona") || (club.equalsIgnoreCase("madrid"))) {
			precio += 75;
		}
		return precio;
	}

	@Override
	public byte calcularPuntuacionNoticia() {
		puntuacion = 4;
		if (competicion.equalsIgnoreCase("euroliga")) {
			puntuacion += 3;
		}
		if (competicion.equalsIgnoreCase("acb")) {
			puntuacion += 2;
		}
		if (club.equalsIgnoreCase("barcelona") || (club.equalsIgnoreCase("madrid"))) {
			puntuacion += 1;
		}

		return puntuacion;
	}

}