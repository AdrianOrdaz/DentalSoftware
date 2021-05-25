package consultorioDental;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.*;

import javax.swing.*;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

public class Pacientes extends MetodosDiseño implements ActionListener{
	JFrame fPte;
	JButton btnCrearReceta;
	JButton btnEditar;
	String valor = null;
	private Connection conexion = null;
    private Statement comando = null;
    private ResultSet resultados = null;
	public static void main(String[] args) {
		Pacientes vp = new Pacientes();
		vp.crearGUI();
	}
	private void leerDatos() throws ClassNotFoundException, SQLException {
        String usuario = "root";
        String password = "";
        String instruccion = "SELECT * FROM pacientes";

        Class.forName("com.mysql.jdbc.Driver");
        conexion = DriverManager.getConnection("jdbc:mysql://localhost/consultorio" + "?" + "user=" + usuario + "&" + "password=" + password + "");
        comando = conexion.createStatement();
        resultados = comando.executeQuery(instruccion);
    }
	private void cerrar() throws SQLException {
		conexion.close();
    } 
	protected JFrame crearGUI()
	{
		fPte = new JFrame("Consultorio Dental/Pacientes");
		Container con = new Container();
		GridBagConstraints c = new GridBagConstraints();
		con = fPte.getContentPane();
		con.setLayout(new GridBagLayout());

		JLabel lbTitulo = new JLabel("PACIENTES");
		//El metodo adjustComponents sirve para acomodar y ajustar cualquier componente en el grid.
		//Checar archivo metodosDiseño
		lbTitulo.setFont(new Font("Open Sans",Font.CENTER_BASELINE, 24));
		adjustComponents(c, 0, 0, 4, 1, 1.0, 1.0, GridBagConstraints.NORTH);
		con.add(lbTitulo,c);
	    
	    String[] header = {"ID","Nombre","Historial","Info adicional"};
	    DefaultTableModel dtm = new DefaultTableModel(null,header);
	    JTable tbPacientes = new JTable(dtm);
	    MyTableCellRenderer mtcr = new MyTableCellRenderer();
	    TableColumnModel tcm = tbPacientes.getColumnModel();
	    TableColumn col = new TableColumn(0,8,mtcr,null);
	    tcm.addColumn(col);
	    tcm.moveColumn(tcm.getColumnCount() - 1, 0);
	    TableColumn col1 = tbPacientes.getColumn("ID");
	    TableColumn col2 = tbPacientes.getColumn("Nombre");
	    TableColumn col3 = tbPacientes.getColumn("Historial");
	    TableColumn col4 = tbPacientes.getColumn("Info adicional");
	    col1.setPreferredWidth(5);
	    col2.setPreferredWidth(250);
	    col3.setPreferredWidth(52);
	    col4.setPreferredWidth(55);
	    
	    tbPacientes.setFillsViewportHeight(true);
	    JScrollPane jsp = new JScrollPane(tbPacientes);
	    jsp.setVisible(true);
		adjustComponents(c, 0, 2, 4, 1, 1.0, 1.0, GridBagConstraints.NORTH);
	    con.add(jsp,c);
	    int id;
        String nombre;
	    try {
            this.leerDatos();
            while(resultados.next() == true) {
                id = resultados.getInt("id_pte");
                nombre = resultados.getString("nom_pte");
                dtm.addRow( new Object[] {id, nombre,"Ver","Ver"} );                
            }
            this.cerrar();
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Error de lectura de BD\n\n");
            e.printStackTrace();
        }
	    tbPacientes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnCrearReceta.setEnabled(isEnabled());
				btnEditar.setEnabled(isEnabled());
				valor = (String) tbPacientes.getModel().getValueAt(tbPacientes.getSelectedRow(), 1);
			}
		});
	    JButton btnAgregar = new JButton("Agregar");
	    adjustButton(btnAgregar, c, con, 0, 3, 1, 1, 1.0, 1.0, GridBagConstraints.ABOVE_BASELINE_TRAILING);
	    btnAgregar.addActionListener(this);
	    
	    btnCrearReceta = new JButton("Crear Receta"); 
	    btnCrearReceta.setEnabled(false);
	    adjustButton(btnCrearReceta, c, con, 1, 3, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER);
	    btnCrearReceta.addActionListener(this);
	    
	    btnEditar = new JButton("Editar");
	    btnEditar.setEnabled(false);
	    adjustButton(btnEditar, c, con, 2, 3, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER);
	    
	    buttonHome(fPte,true, c, con, 3, 3, 1, 1, 0.0, 1.0, GridBagConstraints.CENTER);
	    
		fPte.pack();
		fPte.setExtendedState(JFrame.MAXIMIZED_BOTH);
		fPte.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fPte.setVisible(true);
		con.setBackground(Color.WHITE);
		return fPte;
	}
	public void actionPerformed(ActionEvent e) {
		switch(e.getActionCommand())
		{
			case "Agregar":
				AgregarPaciente vap = new AgregarPaciente();
				vap.crearGUI();
				fPte.setVisible(false);
			break;
			case "Crear Receta":
				Receta vr = new Receta();
				vr.crearGUI();
				fPte.setVisible(false);
			break;
		}
	}
	
}
