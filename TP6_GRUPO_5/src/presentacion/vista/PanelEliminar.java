package presentacion.vista;

import javax.swing.JPanel;

import entidad.Persona;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JScrollBar;

public class PanelEliminar extends JPanel {


	private static final long serialVersionUID = 1L;
	private JLabel lblNewLabel;
	private JList<Persona> list;
	private DefaultListModel<Persona>listModel;
	private JButton btnEliminar;
	private JScrollBar scrollBar;
	
	public PanelEliminar() {
		initialize();
	}


	public JLabel getLblNewLabel() {
		return lblNewLabel;
	}

	public void setLblNewLabel(JLabel lblNewLabel) {
		this.lblNewLabel = lblNewLabel;
	}

	public JList<Persona> getList() {
		return list;
	}

	public void setList(JList<Persona> list) {
		this.list = list;
	}

	public JButton getBtnEliminar() {
		return btnEliminar;
	}

	public void setBtnEliminar(JButton btnEliminar) {
		this.btnEliminar = btnEliminar;
	}
	
	
	private void initialize() {
	
		setLayout(null);
		
		lblNewLabel = new JLabel("Eliminar Usuarios");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(27, 16, 122, 14);
		add(lblNewLabel);
		
		listModel =new DefaultListModel<Persona>();
		list = new JList<Persona>();
		list.setBounds(27, 41, 413, 152);
		add(list);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnEliminar.setBounds(169, 204, 98, 23);
		add(btnEliminar);
		
		scrollBar = new JScrollBar();
		scrollBar.setBounds(321, 41, 17, 152);
		add(scrollBar);

	}
	
	public void setDefaultListModel(DefaultListModel<Persona> listModel) {
		this.listModel = listModel;
		list.setModel(this.listModel);
		
	}

	public void mostrarMensaje(String mensaje)
	{
		JOptionPane.showMessageDialog(null, mensaje);
	}
}
