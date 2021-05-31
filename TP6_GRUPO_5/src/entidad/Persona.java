package entidad;

public class Persona {
	
	private String dni;
	private String Apellido;
	private String Nombre;
	
	public Persona() {
		
	}

	public Persona(String dni, String nombre, String apellido) {
		super();
		this.dni = dni;
		this.Apellido = apellido;
		this.Nombre = nombre;
	}

	@Override
	public String toString() {
		return "     "+ "Dni :   " + this.getDni() + "  -  Nombre :  " + this.getNombre() + "  -  Apellido :  " + this.getApellido() + "";
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	
}
