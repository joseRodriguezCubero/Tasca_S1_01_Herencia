package n2exercici1;

public class Telefono {

	private String modelo;
	private String marca;

	public Telefono(String modelo, String marca) {
		this.setModelo(modelo);
		this.setMarca(marca);
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void llamar(String numeroTelefono) {
		System.out.println("El telefono esta llamando ");
	}

}
