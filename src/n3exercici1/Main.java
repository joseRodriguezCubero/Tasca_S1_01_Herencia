package n3exercici1;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayList<Redactor> redactores = new ArrayList<Redactor>();

		boolean salir = false;

		do {
			switch (menu()) {
			case 1:
				addRedactor(redactores);
				break;
			case 2:
				deleteRedactor(redactores);
				break;
			case 3:
				addNoticiaRedactor(redactores);
				break;
			case 4:
				deleteNoticia(redactores);
				break;
			case 5:
				mostrarNoticiasRedactor(redactores);
				break;
			case 6:
				calcularPuntuacionNoticia(redactores);
				break;
			case 7:
				calcularPrecioNoticia(redactores);
				break;
			case 0:
				System.out.println("Gracias por utilizar la apliación");
				salir = true;
				break;
			}
		} while (!salir);
	}

	public static byte menu() {

		byte opcion;
		final byte MINIMO = 0;
		final byte MAXIMO = 7;

		do {
			System.out.println("\nMENU PRINCIPAL");
			System.out.println("1. Introducir redactor.");
			System.out.println("2. Eliminar redactor.");
			System.out.println("3. Introducir noticia a un redactor.");
			System.out.println("4. Eliminar noticia."); // tiene que pedir redactor y titular de la noticia.
			System.out.println("5. Mostrar todas las noticias  por redactor.");
			System.out.println("6. Calcular puntuación de la noticia.");
			System.out.println("7. calcular precio noticia."); // seria mas elegante si en el momento de agregar una
																// noticia en la clase se caculara directamente
			System.out.println("0. Sortir de l'aplicació.\n");
			opcion = sc.nextByte();
			sc.nextLine();
			if (opcion < MINIMO || opcion > MAXIMO) {
				System.out.println("Escoja una opción válida");
			}
		} while (opcion < MINIMO || opcion > MAXIMO);
		return opcion;
	}

	public static byte menuNoticias() {

		byte opcion;
		final byte MINIMO = 1;
		final byte MAXIMO = 5;

		do {
			System.out.println("\nTipo de Noticias");
			System.out.println("1. Noticias de Futbol.");
			System.out.println("2. Noticias de Baloncesto.");
			System.out.println("3. noticias de Tenis.");
			System.out.println("4. Noticias de F1.");
			System.out.println("5. Noticias de Motociclismo.");

			opcion = sc.nextByte();
			sc.nextLine();
			if (opcion < MINIMO || opcion > MAXIMO) {
				System.out.println("Escoja una opción válida");
			}
		} while (opcion < MINIMO || opcion > MAXIMO);
		return opcion;
	}

	public static Redactor buscarRedactor(ArrayList<Redactor> redactores, String nombre, String dni) {

		Redactor redactorEncontrado = null;
		int i = 0;

		while (redactorEncontrado == null && i < redactores.size()) {
			if (redactores.get(i).getNombre().equalsIgnoreCase(nombre)
					&& redactores.get(i).getDni().equalsIgnoreCase(dni)) {
				redactorEncontrado = redactores.get(i);
			}
			i++;
		}
		return redactorEncontrado;
	}

	public static void mostrarNoticiasRedactor(ArrayList<Redactor> redactores) {
		String nombre = pideString("Introduzca el nombre del redactor");
		String dni = pideString("Introduzca el dni del redactor");
		Redactor redactorEncontrado = buscarRedactor(redactores, nombre, dni);
		ArrayList<Noticia> noticias = redactorEncontrado.getNoticias();
		for (Noticia i : noticias) {
			System.out.println(i.getTitular());
		}
	}

	public static Noticia buscarNoticia(ArrayList<Redactor> redactores, String nombre, String titular) {

		Noticia noticiaEncontrada = null;
		int i = 0;
		int j = 0;

		while (noticiaEncontrada == null && i < redactores.size()) {
			while (noticiaEncontrada == null && j < redactores.get(i).getNoticias().size()) {

				if (redactores.get(i).getNombre().equalsIgnoreCase(nombre)
						&& redactores.get(i).getNoticias().get(j).getTitular().equals(titular)) {
					noticiaEncontrada = redactores.get(i).getNoticias().get(j);

				}
				j++;
			}
			i++;
		}
		return noticiaEncontrada;
	}

	public static void deleteNoticia(ArrayList<Redactor> redactores) {

		String nombre = pideString("Introduzca el nombre del redactor de la noticia.");
		String titular = pideString("Introduzca el titular de la noticia");
		Noticia noticiaEncontrada = null;
		ArrayList<Noticia> arrayNoticias = new ArrayList<>();
		int i = 0;
		int j = 0;

		while (noticiaEncontrada == null && i < redactores.size()) {
			while (noticiaEncontrada == null && j < redactores.get(i).getNoticias().size()) {

				if (redactores.get(i).getNombre().equalsIgnoreCase(nombre)
						&& redactores.get(i).getNoticias().get(j).getTitular().equals(titular)) {
					noticiaEncontrada = redactores.get(i).getNoticias().get(j);
					arrayNoticias = redactores.get(i).getNoticias();
				}
				j++;
			}
			i++;
		}
		if (noticiaEncontrada == null) {
			System.out.println("La noticia no existe");
		} else {
			System.out.println("La noticia con titular " + titular + ", ha sido eliminada.");
			arrayNoticias.remove(noticiaEncontrada);
		}

	}

	// instancia redactor y lo almacena en ArrayList.
	public static void addRedactor(ArrayList<Redactor> redactores) {

		String nombre = pideString("Introduzca el nombre del redactor");
		String dni = pideString("Introduzca el dni del redactor");
		Redactor redactorEncontrado = buscarRedactor(redactores, nombre, dni);

		if (redactorEncontrado == null) {
			Redactor redactor = new Redactor(nombre.toUpperCase(), dni.toUpperCase());
			redactores.add(redactor);
			System.out.println("Redactor añadido.");
		} else {
			System.out.println("El redactor " + redactorEncontrado.getNombre() + " con dni: "
					+ redactorEncontrado.getDni() + " ya existe en nuestro sistema.");
		}

	}

	public static Noticia buscarNoticiaRedactor(String titular, ArrayList<Noticia> noticias) {

		Noticia noticia = null;
		int i = 0;
		while (i < noticias.size() && noticia == null) {
			if (noticias.get(i).getTitular().equals(titular)) {
				noticia = noticias.get(i);
			}
			i++;
		}

		return noticia;
	}

	public static void addNoticiaRedactor(ArrayList<Redactor> redactores) {

		ArrayList<Noticia> noticias = new ArrayList<Noticia>();
		String nombre = pideString("Introduzca el nombre del redactor");
		String dni = pideString("Introduzca el dni del redactor");
		Redactor redactorEncontrado = buscarRedactor(redactores, nombre, dni);

		if (redactorEncontrado == null) {
			System.out.println("El redactor no se encuentra en nuestra apliación");
		} else {
			String titularNoticia = pideString("Introduzca titular de la noticia.");

			Noticia noticia = buscarNoticiaRedactor(titularNoticia, redactorEncontrado.getNoticias());

			if (noticia == null) {

				switch (menuNoticias()) {
				case 1:
					addNoticiaFutbol(nombre, dni, noticias, titularNoticia, redactorEncontrado, noticia);
					break;
				case 2:
					addNoticiaBaloncesto(nombre, dni, noticias, titularNoticia, redactorEncontrado, noticia);
					break;
				case 3:
					addNoticiaTenis(nombre, dni, noticias, titularNoticia, redactorEncontrado, noticia);
					break;
				case 4:
					addNoticiaF1(nombre, dni, noticias, titularNoticia, redactorEncontrado, noticia);
					break;
				case 5:
					addNoticiaMotociclismo(nombre, dni, noticias, titularNoticia, redactorEncontrado, noticia);
					;
					break;

				}

			} else {
				System.out.println("El redactor " + nombre + " con dni  " + dni
						+ " ya tiene asignada la noticia con titular " + titularNoticia);
			}
		}
	}

	public static void addNoticiaFutbol(String nombre, String dni, ArrayList<Noticia> noticias, String titularNoticia,
			Redactor redactorEncontrado, Noticia noticia) {

		String competicion = pideString("Introduzca una competición.");
		String club = pideString("Introduzca un club.");
		String jugador = pideString("Introduzca un Jugador.");
		Futbol noticiaFutbolNueva = new Futbol(titularNoticia, competicion, club, jugador);
		redactorEncontrado.agregarNoticia(noticiaFutbolNueva);
		System.out.println(
				"Noticia con titular '" + titularNoticia + "' creada en el redactor " + nombre + " con dni " + dni);
	}

	public static void addNoticiaBaloncesto(String nombre, String dni, ArrayList<Noticia> noticias,
			String titularNoticia, Redactor redactorEncontrado, Noticia noticia) {

		String competicion = pideString("Introduzca una competición.");
		System.out.println();
		String club = pideString("Introduzca un club.");
		Baloncesto noticiaBaloncestoNueva = new Baloncesto(titularNoticia, competicion, club);
		redactorEncontrado.agregarNoticia(noticiaBaloncestoNueva);
		System.out.println(
				"Noticia con titular '" + titularNoticia + "' creada en el redactor " + nombre + " con dni " + dni);
	}

	public static void addNoticiaTenis(String nombre, String dni, ArrayList<Noticia> noticias, String titularNoticia,
			Redactor redactorEncontrado, Noticia noticia) {

		String competicion = pideString("Introduzca una competición.");
		String tenista1 = pideString("Introduzca el primer tenista.");
		String tenista2 = pideString("Introduzca el segundo tenista.");
		Tenis noticiaTenisNueva = new Tenis(titularNoticia, competicion);
		noticiaTenisNueva.agregarTenista(tenista1);
		noticiaTenisNueva.agregarTenista(tenista2);
		redactorEncontrado.agregarNoticia(noticiaTenisNueva);
		System.out.println(
				"Noticia con titular '" + titularNoticia + "' creada en el redactor " + nombre + " con dni " + dni);
	}

	public static void addNoticiaF1(String nombre, String dni, ArrayList<Noticia> noticias, String titularNoticia,
			Redactor redactorEncontrado, Noticia noticia) {

		String escuderia = pideString("Introduzca una escuderia.");
		F1 noticiaF1Nueva = new F1(titularNoticia, escuderia);
		redactorEncontrado.agregarNoticia(noticiaF1Nueva);
		System.out.println(
				"Noticia con titular '" + titularNoticia + "' creada en el redactor " + nombre + " con dni " + dni);
	}

	public static void addNoticiaMotociclismo(String nombre, String dni, ArrayList<Noticia> noticias,
			String titularNoticia, Redactor redactorEncontrado, Noticia noticia) {

		String equipo = pideString("Introduzca una equipo.");
		Motociclismo noticiaMotociclismoNueva = new Motociclismo(titularNoticia, equipo);
		redactorEncontrado.agregarNoticia(noticiaMotociclismoNueva);
		System.out.println(
				"Noticia con titular '" + titularNoticia + "' creada en el redactor " + nombre + " con dni " + dni);
	}

	public static void deleteRedactor(ArrayList<Redactor> redactores) {

		ListIterator<Redactor> lt = redactores.listIterator();
		System.out.println("Introduzca el nombre del redactor");
		String nombre = sc.nextLine();
		System.out.println("Introduzca el dni del redactor");
		String dni = sc.nextLine();

		Redactor redactorEncontrado = buscarRedactor(redactores, nombre, dni);

		while (lt.hasNext()) {
			Redactor redactor = lt.next();
			if (redactorEncontrado == null) {
				System.out.println("El redactor no esta en nuestra aplicación.");
			} else if (redactorEncontrado.getNombre().equalsIgnoreCase(redactor.getNombre())
					&& redactorEncontrado.getDni().equalsIgnoreCase(redactor.getDni())) {
				lt.remove();
				System.out.println(
						"El redactor " + nombre + " con DNI:  " + dni + " ha sido eliminado de la aplicación.");
			}

		}

	}

	public static void calcularPuntuacionNoticia(ArrayList<Redactor> redactores) {

		String nombre = pideString("Introduzca el nombre del redactor");
		String titular = pideString("Introduzca el titular de la noticia");
		Noticia noticiaEncontrada = buscarNoticia(redactores, nombre, titular);
		if (noticiaEncontrada == null) {
			System.out.println(
					"La noticia con titular " + titular + " no se encuentra entre las noticias del redactor " + nombre);
		} else {
			byte puntuacion = noticiaEncontrada.calcularPuntuacionNoticia();
			System.out.println("La puntuacion de la noticia con titular: " + titular + " es: " + puntuacion+ " puntos.");
		}

	}

	public static void calcularPrecioNoticia(ArrayList<Redactor> redactores) {
		String nombre = pideString("Introduzca el nombre del redactor");
		String titular = pideString("Introduzca el titular de la noticia");
		Noticia noticiaEncontrada = buscarNoticia(redactores, nombre, titular);
		if (noticiaEncontrada == null) {
			System.out.println(
					"La noticia con titular " + titular + " no se encuentra entre las noticias del redactor " + nombre);
		} else {
			double precio = noticiaEncontrada.calcularPrecioNoticia();
			System.out.println("El precio de la noticia con titular: " + titular + " es: " + precio+ "€");
		}

	}

	public static String pideString(String mensaje) {
		System.out.println(mensaje);
		return sc.nextLine();
	}

	public static int pideInt(String mensaje) {
		System.out.println(mensaje);
		return sc.nextInt();
	}
}