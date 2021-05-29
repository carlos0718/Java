/**
 * 
 */
package archivos2;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Carlos Alfredo Jesus
 *
 */
public class Archivo2 {
	
	private String ruta;

	/**
	 * 
	 */
	public Archivo2() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the ruta
	 */
	public String getRuta() {
		return ruta;
	}

	/**
	 * @param ruta the ruta to set
	 */
	public void setRuta(String ruta) {
		this.ruta = ruta;
	}
	
	public boolean existe() {
		File archivo = new File(ruta);
		if (archivo.exists()) {
			return true;
		}
		return false;
	}
	
	public boolean crearArchivo() {
		FileWriter escritura;
		try {
			escritura = new FileWriter(ruta, true);
			escritura.write("");
			escritura.close();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return false;
	}
	public void escribe_lineas(String frase) {
		try {
			FileWriter fw = new FileWriter(ruta, true);
			
			for (int i = 0; i < frase.length(); i++) {
				fw.write(frase.charAt(i));
			}
			fw.close();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public void leer_letra_por_letra() {
		FileReader entrada;
		try {
			entrada = new FileReader(ruta);
			int c = entrada.read();//lee el primer caracter.
			while (c != -1) {
				char letra = (char)c;
				System.out.println(letra);
				c = entrada.read();
			}
			entrada.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
}
