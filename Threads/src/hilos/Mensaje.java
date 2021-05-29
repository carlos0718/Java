package hilos;

public class Mensaje  implements Runnable{

	private String texto;
	
	public Mensaje() {
		// TODO Auto-generated constructor stub
	}
	
	public Mensaje(String texto) {
		// TODO Auto-generated constructor stub
		this.texto = texto;
	}
	/**
	 * @return the texto
	 */
	public String getTexto() {
		return texto;
	}
	
	/**
	 * @param texto the texto to set
	 */
	public void setTexto(String texto) {
		this.texto = texto;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			System.out.println(texto+" -> se envia mensaje a la persona: "+i);
		}
	}
	
	
}
