package n3exercici1;

import java.util.ArrayList;

public class Redactor {

	private String nombre;
	private String dni;
	public static final int SALARIO = 1500;
	private ArrayList<Noticia> noticias = new ArrayList<Noticia>();

	public Redactor(String nombre, String dni) {

		this.nombre = nombre;
		this.dni = dni;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public ArrayList<Noticia> getNoticias() {
		return noticias;
	}

	public void setNoticias(ArrayList<Noticia> noticias) {
		this.noticias = noticias;
	}

	public void agregarNoticia(Noticia noticia) {
		this.noticias.add(noticia);
	}

	public static int getSalario() {
		return SALARIO;
	}

	// falta hacer método para incrementar salario en un futuro.

	@Override
	public String toString() {
		return "Redactor [nombre=" + nombre + ", DNI=" + dni + ", noticias=" + noticias + "]";
	}

}