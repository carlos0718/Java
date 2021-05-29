/**
 * 
 */
package creando_exceptions;

/**
 * @author Carlos Alfredo Jesus
 *
 */
public class faltaArrobaException extends RuntimeException{

	/**
	 * 
	 */
	public faltaArrobaException () {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Falta colocar el Arroba (@)";
	}
	
	

}
