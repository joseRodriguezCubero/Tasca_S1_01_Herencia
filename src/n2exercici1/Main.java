package n2exercici1;

public class Main {

	public static void main(String[] args) {

		
		Smartphone telefono1 = new Smartphone("Google", "Pixel 5");
		Telefono telefono2 = new Telefono("Nokia","3210");
		
		telefono1.alarma();
		telefono1.fotografiar();
		telefono1.llamar("664011912");
		
		telefono2.llamar("655464216");
	}

}
