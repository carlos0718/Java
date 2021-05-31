package presentacion.vista;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class Principal extends JFrame {

	private JMenuBar menuBar;
	private JMenu mnPersonas;;
	private JMenuItem mntmAgregar;
	private JMenuItem mntmModificar;
	private JMenuItem mntmEliminar;
	private JMenuItem mntmListar;

	private static final long serialVersionUID = 1L;

	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 680, 413);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnPersonas = new JMenu("Personas");
		menuBar.add(mnPersonas);
		
		mntmAgregar = new JMenuItem("Agregar");
		mnPersonas.add(mntmAgregar);
		
		mntmModificar = new JMenuItem("Modificar");
		mnPersonas.add(mntmModificar);
		
		mntmEliminar = new JMenuItem("Eliminar");
		mnPersonas.add(mntmEliminar);
		
		mntmListar = new JMenuItem("Listar");
		mnPersonas.add(mntmListar);
	}


	public JMenu getMnPersonas() {
		return mnPersonas;
	}

	public void setMnPersonas(JMenu mnPersonas) {
		this.mnPersonas = mnPersonas;
	}

	public JMenuItem getMntmAgregar() {
		return mntmAgregar;
	}

	public void setMntmAgregar(JMenuItem mntmAgregar) {
		this.mntmAgregar = mntmAgregar;
	}


	public JMenuItem getMntmEliminar() {
		return mntmEliminar;
	}


	public void setMntmEliminar(JMenuItem mntmEliminar) {
		this.mntmEliminar = mntmEliminar;
	}
	
	
	/**
	 * @return the mntmModificar
	 */
	public JMenuItem getMntmModificar() {
		return mntmModificar;
	}


	/**
	 * @param mntmModificar the mntmModificar to set
	 */
	public void setMntmModificar(JMenuItem mntmModificar) {
		this.mntmModificar = mntmModificar;
	}

}
