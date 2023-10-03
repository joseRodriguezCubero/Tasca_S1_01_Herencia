package n2exercici1;

public class Telefono {

	private String marca;
	private String modelo;
	
	
	
	public Telefono(String marca, String modelo) {
		super();
		this.marca = marca;
		this.modelo = modelo;
	}




	public void llamar(String numTelefono) {
		System.out.println("Se está llamando al numero: "+numTelefono );
	}
	
}
