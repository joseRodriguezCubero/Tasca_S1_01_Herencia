package n3exercici1;

public abstract class Noticia {
	protected String titular;
	private String texto;
	protected byte puntuacion;
	protected double precio;

	public Noticia(String titular) {
		this.titular = titular;
		this.texto = "";
		this.puntuacion = 0;
		this.precio = 0;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public abstract double calcularPrecioNoticia();

	public abstract byte calcularPuntuacionNoticia();

}