package consultorioDental;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;

public class VistaPacientes extends MenuUsuario{

	public static void main(String[] args) {
		VistaPacientes vp = new VistaPacientes();
		vp.crearGUI();
	}
	protected void crearGUI()
	{
		JFrame fPte = new JFrame("Consultorio Dental/Pacientes");
		Container con = new Container();
		GridBagConstraints c = new GridBagConstraints();
		con = fPte.getContentPane();
		con.setLayout(new GridBagLayout());

		JLabel lbTitulo = new JLabel("PACIENTES");
		//El metodo adjustComponents sirve para acomodar y ajustar cualquier componente en el grid.
		//Checar archivo metodosDise�o
		lbTitulo.setFont(new Font("Open Sans",Font.CENTER_BASELINE, 24));
		adjustComponents(c, 0, 0, 4, 1, 0.0, 1.0, GridBagConstraints.NORTH);
		con.add(lbTitulo,c);
		c.weightx = 0.0;
		
		JTextField jtBuscar = new JTextField();
		jtBuscar.setPreferredSize(new Dimension(259,25));
		adjustComponents(c, 1, 1, 1, 1, 1.0, 0.0, GridBagConstraints.CENTER);
	    con.add(jtBuscar,c);
	    c.weighty = 0.0;
	    JButton btnBuscar = new JButton(new ImageIcon("src/img/lupa.png"));
		btnBuscar.setPreferredSize(new Dimension(22, 23));
		adjustComponents(c, 2, 1, 1, 1, 0.0, 0.0, GridBagConstraints.WEST);
	    con.add(btnBuscar,c);
	    
	    String[] header = {"","ID","Nombre","Historial","Info adicional"};
	    DefaultTableModel dtm = new DefaultTableModel(null,header);
	    JTable tbPacientes = new JTable(dtm);
	    tbPacientes.setFillsViewportHeight(true);
	    tbPacientes.setEnabled(false);
	    JScrollPane jsp = new JScrollPane(tbPacientes);
	    jsp.setVisible(true);
		adjustComponents(c, 0, 2, 4, 1, 1.0, 1.0, GridBagConstraints.NORTH);
	    con.add(jsp,c);
	    c.weightx = 0.0;
	    c.weighty = 0.0;
	    
	    JButton btnAgregar = new JButton("Agregar");
	    adjustButton(btnAgregar, c, con, 0, 3, 1, 1, 1.0, 1.0, GridBagConstraints.ABOVE_BASELINE_TRAILING);
	    
	    JButton btnCrearReceta = new JButton("Crear Receta");
	    adjustButton(btnCrearReceta, c, con, 1, 3, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER);
	    
	    JButton btnEditar = new JButton("Editar");
	    adjustButton(btnEditar, c, con, 2, 3, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER);
	    
	    buttonHome(c, con, 3, 3, 1, 1, 0.0, 1.0, GridBagConstraints.CENTER);
	    
		fPte.pack();
		fPte.setExtendedState(JFrame.MAXIMIZED_BOTH);
		fPte.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fPte.setVisible(true);
		con.setBackground(Color.WHITE);
		//MenuUsuario mu = new MenuUsuario();
		//mu.setVisible(false);
	}
}
