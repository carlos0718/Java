package ejercicio1;

import java.util.ArrayList;
import java.util.ListIterator;

public class Persona implements Comparable<Persona> {

	private String Nombre;
	private String Apellido;
	private String dni;

	///// Constructor

	public Persona() {
		this.Nombre = "Sin nombre";
		this.Apellido = "Sin apellido";
		this.dni = "00000";
	}

	public Persona(String nombre, String apellido, String dni) {
		this.Nombre = nombre;
		this.Apellido = apellido;
		this.dni = dni;
	}

	///// Metodos

	public boolean VerificarDniInvalido(String text) throws DniInvalido {
		if (text.matches("[0-9]+") && text.length() > 2) {
			return true;
		} else {
			throw new DniInvalido();
		}
	}

	public void MostrarListPersonas(ArrayList<Persona> list) {

		// Archivo a = new Archivo();
		// ArrayList<Persona> List = new ArrayList<Persona>();
		// List = a.CargarArrayList();

		if (list != null) {

			ListIterator<Persona> It = list.listIterator();

			while (It.hasNext()) {

				Persona p = It.next();
				System.out.println(p);

			}
		} else {
			System.out.println("Lista nula");
		}
	}

	///// Getters y setters

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	@Override
	public String toString() {
		return "Persona [Nombre=" + Nombre + ", Apellido=" + Apellido + ", dni=" + dni + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Apellido == null) ? 0 : Apellido.hashCode());
		result = prime * result + ((Nombre == null) ? 0 : Nombre.hashCode());
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (Apellido == null) {
			if (other.Apellido != null)
				return false;
		} else if (!Apellido.equals(other.Apellido))
			return false;
		if (Nombre == null) {
			if (other.Nombre != null)
				return false;
		} else if (!Nombre.equals(other.Nombre))
			return false;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		return true;
	}

	@Override
	public int compareTo(Persona o) {
		if (this.getApellido() == null || o.getApellido() == null) {
			return 0;
		}
		return this.getApellido().compareTo(o.getApellido());
	}
}
