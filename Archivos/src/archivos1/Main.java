/**
 * 
 */
package archivos1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Carlos Alfredo Jesus
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	//creando funcion para verificar si archivo existe
	public boolean exite(String ruta) {
		File archivo = new File(ruta);
		if(archivo.exists()) {
			return true;
		}
		return false;
	}
	
	////creando funcion para crear archivo
	public boolean crearArchivo(String ruta) {
		FileWriter escritura;
		try {
			escritura = new FileWriter(ruta,true);
			escritura.write("");
			escritura.close();
			return true;
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return false;
	}
}
