package n1exercici2;

public class Coche {

	private static final String MARCA = "Renault";
	private static String modelo = "Clio";
	private final double POTENCIA;

	public Coche() {
		super();
		double pOTENCIA = 220;
		POTENCIA = pOTENCIA;
	}

	public static void frenar() {
		System.out.println("el vehiculo está frenando");
	}

	public void acelerar() {
		System.out.println("El vehiculo está acelerando");
	}

	public static String getModelo() {
		return modelo;
	}

	public static void setModelo(String modelo) {
		Coche.modelo = modelo;
	}

	public static String getMarca() {
		return MARCA;
	}

	public double getPOTENCIA() {
		return POTENCIA;
	}

	@Override
	public String toString() {
		return "Coche [POTENCIA=" + POTENCIA + "]";
	}
}
