package presentacion.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;

import entidad.Persona;
import negocio.PersonaNegocio;
import presentacion.vista.Principal;
import presentacion.vista.PanelAgregar;
import presentacion.vista.PanelEliminar;
import presentacion.vista.PanelModificar;


public class Controlador implements ActionListener {

	private Principal principal;
	private PersonaNegocio pNEGOCIO;
	private PanelAgregar panelADD;
	private PanelEliminar panelEliminar;
	private PanelModificar panelModificar;
	private ArrayList<Persona> listaPersonas;
	private static DefaultListModel<Persona>listModel;

	public Controlador(Principal vista,PersonaNegocio pNEGOCIO)
	{		
		//instancias del constructor
		this.principal = vista;	
		this.pNEGOCIO = pNEGOCIO;
		//instancias de los paneles
		this.panelADD = new PanelAgregar();
		this.panelEliminar = new PanelEliminar();
		this.panelModificar = new PanelModificar();
		//Evento panel principal
		this.principal.getMntmAgregar().addActionListener(j->EClick_MenuAgregarP(j));
		this.principal.getMntmEliminar().addActionListener(j->EClick_MenuEliminarP(j));
		this.principal.getMntmModificar().addActionListener(a->EClick_MenuModificarP(a));
		//// EVENTOS PANEL AGREGAR	
		this.panelADD.getBtnAceptar().addActionListener(e->EClick_AgregarP(e));
		///EVENTO PANEL MODIFICAR 
		this.panelModificar.getJlist().addListSelectionListener(e->EvtClick_Modificar(e));
		this.panelModificar.getBtnModificar().addActionListener(e->EvtClick_ModifcarRegistro(e));
		///EVENTOS PANEL ELIMINAR
		this.panelEliminar.getBtnEliminar().addActionListener(e->EventoClickBoton_EliminarPersona_PanelEliminar(e));
	}


	/************************* EVENTOS DE AGREGAR*******************************************/
	public void  EClick_MenuAgregarP(ActionEvent j)
	{		
		principal.getContentPane().removeAll();
		principal.getContentPane().add(panelADD);
		principal.getContentPane().repaint();
		principal.getContentPane().revalidate();

		System.out.println("dentro del evento");
	}

	public void EClick_AgregarP(ActionEvent e) 
	{
		Persona PersonaADD = new Persona(panelADD.getTextFieldDni().getText(),panelADD.getTextFieldNombre().getText(),panelADD.getTextFieldApellido().getText());

		int resultado = pNEGOCIO.insert(PersonaADD);

		if(resultado==1) JOptionPane.showMessageDialog(panelADD, "DNI REPETIDO");
		if(resultado==2) {
			JOptionPane.showMessageDialog(panelADD, "REGISTRO AGREGADO");

			panelADD.getTextFieldApellido().setText("");
			panelADD.getTextFieldDni().setText("");
			panelADD.getTextFieldNombre().setText("");
		}
		if(resultado==0) JOptionPane.showMessageDialog(panelADD, "CAMPOS VACIOS");
		if(resultado==3) JOptionPane.showMessageDialog(panelADD, "ERROR AL AGREGAR");	 

	}
	/*********************************** FIN DE EVENTOS AGREGAR ************************/
	
	/************************* EVENTOS DE ELIMINAR *******************************************/

	public void  EventoClickBoton_EliminarPersona_PanelEliminar(ActionEvent e) {
		// TODO Auto-generated method stub
		boolean estado=false;
		Persona persona = new Persona();
		if(this.panelEliminar.getList().getSelectedValue()==null)
		{
			this.panelEliminar.mostrarMensaje("No hay personas cargadas en la lista");
		}else
		{
		persona=this.panelEliminar.getList().getSelectedValue();
		estado = pNEGOCIO.delete(persona);
		if(estado)
		{
			this.panelEliminar.mostrarMensaje("Persona eliminada con exito");
		}else
		{
			this.panelEliminar.mostrarMensaje("No se pudo borrar la persona seleccionada");
		}

		this.refrescarLista();
		}
	}

	public void  EClick_MenuEliminarP(ActionEvent j) {
		principal.getContentPane().removeAll();
		listModel = new DefaultListModel<Persona>();
		this.refrescarLista();
		panelEliminar.setDefaultListModel(listModel);
		principal.getContentPane().add(panelEliminar);
		principal.getContentPane().repaint();
		principal.getContentPane().revalidate();

	}
	/*********************************** FIN DE EVENTOS ELIMINAR ************************/
	private void refrescarLista()
	{
		listModel.clear();
		this.listaPersonas = (ArrayList<Persona>) pNEGOCIO.readAll();
		 for(Persona val : listaPersonas)
			 listModel.addElement(val);
		this.panelEliminar.setDefaultListModel(listModel);
		this.panelModificar.setDefaultListModel(listModel);
	}

	public void inicializar()
	{
		this.principal.setVisible(true);;
	}
	
	 /************************* EVENTOS DE MODIFICAR********************************************/
	 
	public void  EClick_MenuModificarP(ActionEvent a)
	{		
		principal.getContentPane().removeAll();
		listModel = new DefaultListModel<Persona>();
		this.refrescarLista();
		panelModificar.setDefaultListModel(listModel);
		principal.getContentPane().add(panelModificar);
		principal.getContentPane().repaint();
		principal.getContentPane().revalidate();
		
		
		System.out.println("dentro del modificar");
	}
	
	public void EvtClick_Modificar(ListSelectionEvent e) {

		String dni = panelModificar.getJlist().getSelectedValue().getDni();
		System.out.println("dni="+ dni);
		panelModificar.getTextDni().setText(dni);
		String nombre =  panelModificar.getJlist().getSelectedValue().getNombre();
		System.out.println("nombre="+nombre);
		panelModificar.getTextNombre().setText(nombre);
		String apellido = panelModificar.getJlist().getSelectedValue().getApellido();
		System.out.println("apellido="+apellido);
		panelModificar.getTextApellido().setText(apellido);
	}
	
	public void EvtClick_ModifcarRegistro(ActionEvent e) {
		listModel = new DefaultListModel<Persona>();
		Persona PersonaModificar = new Persona(panelModificar.getTextDni().getText(),panelModificar.getTextNombre().getText(),panelModificar.getTextApellido().getText());

		int resultado = pNEGOCIO.update(PersonaModificar);

		if(resultado==1) {
			JOptionPane.showMessageDialog(panelModificar, "REGISTRO ACTUALIZADO");		
		}	 
		EClick_MenuModificarP(e);
		
		
	}
	/***********************************FIN DE EVENTOS MODIFICAR************************/
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
