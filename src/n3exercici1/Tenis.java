package n3exercici1;

import java.util.ArrayList;

public class Tenis extends Noticia {

	private String competicion;
	private ArrayList<String> tenistas;

	public Tenis(String titular, String competicion) {
		super(titular);
		this.competicion = competicion;
		this.tenistas = new ArrayList<>();
	}

	public Tenis(String titular) {
		super(titular);

	}

	public String getCompeticion() {
		return competicion;
	}

	public void setCompeticion(String competicion) {
		this.competicion = competicion;
	}

	public ArrayList<String> getTenistas() {
		return tenistas;
	}

	public void setTenistas(ArrayList<String> tenistas) {
		this.tenistas = tenistas;
	}

	public void agregarTenista(String tenista) {
		this.tenistas.add(tenista);
	}

	@Override
	public double calcularPrecioNoticia() {
		precio = 150;

		if ((tenistas.get(0).equalsIgnoreCase("federer")) || (tenistas.get(0).equalsIgnoreCase("nadal"))
				|| (tenistas.get(0).equalsIgnoreCase("djokovic"))) {
			precio += 100;
		}
		if ((tenistas.get(1).equalsIgnoreCase("federer")) || (tenistas.get(1).equalsIgnoreCase("nadal"))
				|| (tenistas.get(1).equalsIgnoreCase("djokovic"))) {
			precio += 100;
		}
		return precio;

	}

	@Override
	public byte calcularPuntuacionNoticia() {
		puntuacion = 4;
		if ((tenistas.get(0).equalsIgnoreCase("federer")) || (tenistas.get(0).equalsIgnoreCase("nadal"))
				|| (tenistas.get(0).equalsIgnoreCase("djokovic"))) {
			puntuacion += 3;
		}
		if ((tenistas.get(1).equalsIgnoreCase("federer")) || (tenistas.get(1).equalsIgnoreCase("nadal"))
				|| (tenistas.get(1).equalsIgnoreCase("djokovic"))) {
			puntuacion += 3;
		}
		return puntuacion;
	}

}