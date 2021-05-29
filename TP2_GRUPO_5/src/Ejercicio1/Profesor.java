package Ejercicio1;

public class Profesor extends Empleado implements Comparable<Profesor> {

	///// PUNTO 1

	private String Cargo;
	private int AntiguedadDocente;

	///// PUNTO 2
	/// Setters & Getters

	public String getCargo() {
		return Cargo;
	}

	public void setCargo(String cargo) {
		Cargo = cargo;
	}

	public int getAntiguedadDocente() {
		return AntiguedadDocente;
	}

	public void setAntiguedadDocente(int antiguedadDocente) {
		AntiguedadDocente = antiguedadDocente;
	}

	///// PUNTO 3
	/// Constructores

	public Profesor() {
		super();

		this.Cargo = "Sin cargo";
		this.AntiguedadDocente = 0;
	}

	public Profesor(String Cargo, int AntiguedadDocente) {
		this.Cargo = Cargo;
		this.AntiguedadDocente = AntiguedadDocente;
	}

	public Profesor(String Nombre, int edad, String Cargo, int Antiguedad) {

		super(edad, Nombre);

		this.Cargo = Cargo;
		this.AntiguedadDocente = Antiguedad;
	}
	///// PUNTO 4
	/// ToString

	@Override
	public String toString() {
		return " ID:" + getId() + " Nombre:" + getNombre() + " Edad:" + getEdad() +" años" + " Cargo:" + Cargo + " Antiguedad:"
				+ AntiguedadDocente + " años";
	}

	///// PUNTO 7

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + AntiguedadDocente;
		result = prime * result + ((Cargo == null) ? 0 : Cargo.hashCode());
		return result;
	}

	///// PUNTO 7
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Profesor other = (Profesor) obj;
		if (AntiguedadDocente != other.AntiguedadDocente)
			return false;
		if (Cargo == null) {
			if (other.Cargo != null)
				return false;
		} else if (!Cargo.equals(other.Cargo))
			return false;
		return true;
	}

	@Override
	public int compareTo(Profesor profe) {

		if (profe.getId() == this.getId())
			return 0;

		if (profe.getId() < this.getId()) {
			return 1;
		}
		return -1;
	}

}
