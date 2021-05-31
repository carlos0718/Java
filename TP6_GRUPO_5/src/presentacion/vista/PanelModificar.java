package presentacion.vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;
import entidad.Persona;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;

public class PanelModificar extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textNombre;
	private JTextField textApellido;
	private JTextField textDni;
	private JButton btnModificar;
	private JList<Persona> Jlist;
	private DefaultListModel<Persona>listModel;
	
	/**
	 * Create the panel.
	 */
	public PanelModificar() {
		setLayout(null);
		
		JLabel lblSubtitulo = new JLabel("Seleccione la persona que desea modificar");
		lblSubtitulo.setBounds(58, 11, 368, 14);
		add(lblSubtitulo);
		
		Jlist = new JList<Persona>();
		Jlist.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
			}
		});
		Jlist.setBounds(41, 36, 542, 247);
		add(Jlist);
		
		textNombre = new JTextField();
		textNombre.setBounds(41, 304, 106, 20);
		add(textNombre);
		textNombre.setColumns(10);
		
		textApellido = new JTextField();
		textApellido.setBounds(189, 304, 106, 20);
		add(textApellido);
		textApellido.setColumns(10);
		
		textDni = new JTextField();
		textDni.setBounds(332, 304, 106, 20);
		add(textDni);
		textDni.setEditable(false);
		textDni.setColumns(10);
		
		btnModificar = new JButton("Modificar");
		btnModificar.setBounds(490, 303, 89, 23);
		add(btnModificar);

	}

	/**
	 * @return the textNombre
	 */
	public JTextField getTextNombre() {
		return textNombre;
	}

	/**
	 * @param textNombre the textNombre to set
	 */
	public void setTextNombre(JTextField textNombre) {
		this.textNombre = textNombre;
	}

	/**
	 * @return the textApellido
	 */
	public JTextField getTextApellido() {
		return textApellido;
	}

	/**
	 * @param textApellido the textApellido to set
	 */
	public void setTextApellido(JTextField textApellido) {
		this.textApellido = textApellido;
	}

	/**
	 * @return the textDni
	 */
	public JTextField getTextDni() {
		return textDni;
	}

	/**
	 * @param textDni the textDni to set
	 */
	public void setTextDni(JTextField textDni) {
		this.textDni = textDni;
		
	}

	/**
	 * @return the jlist
	 */
	public JList<Persona> getJlist() {
		return Jlist;
	}

	/**
	 * @param jlist the jlist to set
	 */
	public void setJlist(JList<Persona> jlist) {
		Jlist = jlist;
	}

	/**
	 * @return the btnModificar
	 */
	public JButton getBtnModificar() {
		return btnModificar;
	}

	/**
	 * @param btnModificar the btnModificar to set
	 */
	public void setBtnModificar(JButton btnModificar) {
		this.btnModificar = btnModificar;
	}


	/**
	 * 
	 */
	public void setDefaultListModel(DefaultListModel<Persona> listModel) {
		this.listModel = listModel;
		Jlist.setModel(this.listModel);
		
	}
}
