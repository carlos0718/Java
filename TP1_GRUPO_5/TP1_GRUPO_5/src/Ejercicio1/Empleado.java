package Ejercicio1;

public class Empleado {
	
	//atributos
	private final int id;
	private String nombre;
	private int edad;
	private static int cont=999;
	
	
	//getters y setters
	public int getId() {
		return id;
	}
	/*public void setId(int id) {
		this.id = id;
	}*/
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	//constructor
	
	public  Empleado() {
		cont++;
		id=cont;
		
		this.nombre = "sin nombre";
		this.edad = 99;
		
	}
	
	public  Empleado(int edad, String nombre) {
		
		cont++;
		this.id = cont;
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public static int  devueleProximoId() {
		return cont+1;
	}
	
	public String toString() {
		return "**ID: "+id +"\nNombre:" + nombre + "\nEdad:" + edad;
	}
	
}
