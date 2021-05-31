package main;

import negocio.PersonaNegocio;
import negocioImpl.PersonaNegocioImpl;
import presentacion.controlador.Controlador;
import presentacion.vista.Principal;

public class principal {

	public static void main(String[] args) {
		
		
		Principal vista = new Principal();
		PersonaNegocio negocio = new PersonaNegocioImpl();
		Controlador controlador = new Controlador(vista,negocio);
		controlador.inicializar();
	}


}
