 package Ejercicio1;
import java.util.ArrayList;
import java.util.ListIterator;

public class MainEjercicio1_a {
	
	public static void main(String [] args) {
		
		///// PUNTO 5
					
		ArrayList<Profesor> ListaProfesor = new ArrayList<Profesor>();
		ListaProfesor.add(new Profesor("Angel",35,"Docente",5));
		ListaProfesor.add(new Profesor("Daniel",50,"Ayudante",15));
		ListaProfesor.add(new Profesor("Tamara",31,"Docente",2));
		ListaProfesor.add(new Profesor("Brian",40,"Preceptor",5));
		ListaProfesor.add(new Profesor("Javier",35,"docente",8));
		
		ListIterator<Profesor> It = ListaProfesor.listIterator();
		while(It.hasNext()) {
			Profesor Profesor = It.next();
			
			System.out.println(Profesor);
			
		}
		
	}

}
