/**
 * 
 */
package creando_exceptions;

/**
 * @author Carlos Alfredo Jesus
 *
 */
public class faltaPuntoException extends RuntimeException {

	/**
	 * 
	 */
	public faltaPuntoException() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Falta punto(.) en el mail";
	}
	
	
}
