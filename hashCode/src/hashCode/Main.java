package hashCode;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre = "a";
		System.out.println(nombre.hashCode());
		
		Persona x = new Persona();
		x.setNombre("Maria");
		System.out.println(x.hashCode());
		
		Persona y = new Persona();
		y.setNombre("Maria");
		System.out.println(y.hashCode());
	}

}
