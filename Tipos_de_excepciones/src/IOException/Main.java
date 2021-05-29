/**
 * 
 */
package IOException;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

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
		//Los IOException siempre tienen que estar dentro de un bloque try y catch
		try {
			Image imagen = ImageIO.read(new File("src/imagen.gif"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("No se puedo acceder a la imagen");
		}finally {
			System.out.println("soy finally");
		}
		
		
	}

}
