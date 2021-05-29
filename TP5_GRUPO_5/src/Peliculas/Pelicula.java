package Peliculas;

public class Pelicula implements Comparable<Pelicula>{

	public static int ID;
	
	private String Nombre;
	
	private Generos generos = new Generos();
	
	
	public Pelicula() {
		cont ++;
		ID = cont;
		
	}
	private int cont = 0;
	public Pelicula(String nombre, Generos generos) {
		super();
		Nombre = nombre;
		this.generos = generos;
	}

	public int getID() {
		return ID;
	}
	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public Generos getGeneros() {
		return generos;
	}

	public void setGeneros(Generos generos) {
		this.generos = generos;
	}
	
	@Override
	public String toString() {
		return "Nombre: "+getNombre()+"- Género: "+getGeneros()+"- ID: " + getID();
	}
//	public String toString() {
//		return getNombre();
//	}

	@Override
	public int compareTo(Pelicula o) {
		return(this.getNombre().compareTo(o.getNombre()));
	}

	
}
