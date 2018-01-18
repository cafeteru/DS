package model;

public class Monumento {

	private String nombre;
	private String autor;
	private String direccion;

	public Monumento(String name, String author, String address) {
		this.nombre = name;
		this.autor = author;
		this.direccion = address;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDireccion() {
		return direccion;
	}
	
	public String getAutor() {
		return autor;
	}

}
