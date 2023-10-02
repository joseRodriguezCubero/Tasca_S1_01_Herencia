package n3exercici1;

public class Futbol extends Noticia {

	private String competicion;
	private String club;
	private String jugador;

	public Futbol(String titular, String competicion, String club, String jugador) {
		super(titular);
		this.competicion = competicion;
		this.club = club;
		this.jugador = jugador;
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

	public String getJugador() {
		return jugador;
	}

	public void setJugador(String jugador) {
		this.jugador = jugador;
	}

	@Override
	public double calcularPrecioNoticia() {
		precio = 300;
		if (competicion.equalsIgnoreCase("Liga de Champions")) {
			precio += 100;
		}
		if (club.equalsIgnoreCase("barcelona") || (club.equalsIgnoreCase("madrid"))) {
			precio += 100;
		}
		if (jugador.equalsIgnoreCase("fernando torres") || (jugador.equalsIgnoreCase("bencema"))) {
			precio += 50;
		}
		return precio;
	}

	@Override
	public byte calcularPuntuacionNoticia() {
		puntuacion = 5;
		if (competicion.equalsIgnoreCase("Liga de Champions")) {
			puntuacion += 3;
		}
		if (competicion.equalsIgnoreCase("Liga")) {
			puntuacion += 2;
		}
		if (club.equalsIgnoreCase("barcelona") || (club.equalsIgnoreCase("madrid"))) {
			puntuacion += 1;
		}
		if (jugador.equalsIgnoreCase("fernando torres") || (jugador.equalsIgnoreCase("bencema"))) {
			puntuacion += 1;
		}
		return puntuacion;

	}

}