package n2exercici1;

public class Smartphone extends Telefono implements Camara, Reloj {

	
	

	public Smartphone(String marca, String modelo) {
		super(marca, modelo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void alarma() {
		System.out.println("Está sonando la alarma.");
		
	}

	@Override
	public void fotografiar() {
		System.out.println("Se está haciendo una foto.");
		
	}

	
}
