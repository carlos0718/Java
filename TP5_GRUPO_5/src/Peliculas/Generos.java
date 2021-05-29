package Peliculas;

public class Generos {

	private String Nombre;
	

	public Generos() {
		
	}

	public Generos(String nombre) {
		super();
		Nombre = nombre;
	}
	
	
	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	

	@Override
	public String toString() {
		return Nombre;
	}
	
}
