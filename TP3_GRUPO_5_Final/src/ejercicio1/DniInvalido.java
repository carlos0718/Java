package ejercicio1;

public class DniInvalido extends Exception {

	/**
	 * @author Carlos Alfredo Jesus
	 */
	private static final long serialVersionUID = 1L;

	public DniInvalido() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "El dni es inválido.";
	}

}
