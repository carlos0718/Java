package archivos2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Archivo2 archivo = new Archivo2();
		archivo.setRuta("prueba.txt");
		
		if (archivo.existe()) {
			System.out.println("Existe archivo");
		} else {
			System.out.println("No existe archivo...Se está creado archivo nuevo");
			archivo.crearArchivo();
		}
		
		//ESCRITURA
		archivo.escribe_lineas("Bienvenidos a JAVA");
		//LECTURA
		System.out.println("\n A continuación lee la información del archivo letra por letra");
		archivo.leer_letra_por_letra();
	}

}
