package hilos;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mensaje m1 = new Mensaje("Este es el mensaje 1");
		Mensaje m2 = new Mensaje("Este es el mensaje 2");
		Mensaje m3 = new Mensaje("Este es el mensaje 3");
		
		Thread hilo1 = new Thread(m1);
		Thread hilo2 = new Thread(m2);
		Thread hilo3 = new Thread(m3);
		
		hilo1.start();
		hilo2.start();
		hilo3.start();
	}

}
