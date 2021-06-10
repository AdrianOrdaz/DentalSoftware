package consultorioDental;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import javax.swing.JScrollPane;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JTable;
import javax.swing.JScrollBar;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

import consultorioDental.MetodosDiseņo.MyTableCellRenderer;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.border.LineBorder;

public class Dentistas extends MetodosDiseņo implements ActionListener{
	
	JFrame fD;
	JButton btnAgregar;
	JButton btnEliminar;
	JButton btnActualizar;
	JTable tbDentistas;
	String valor;
	DefaultTableModel dtm;
	private Connection conexion = null;
    private Statement comando = null;
    private ResultSet resultados = null;
	public static void main(String[] args) 
	{
		Dentistas den = new Dentistas();
		den.crearfD();
	}

	private void leerDatos() throws ClassNotFoundException, SQLException {
        String usuario = "root";
        String password = "";
        String instruccion = "SELECT * FROM dentistas";

        Class.forName("com.mysql.jdbc.Driver");
        conexion = DriverManager.getConnection("jdbc:mysql://localhost/consultorio" + "?" + "user=" + usuario + "&" + "password=" + password + "");
        comando = conexion.createStatement();
        resultados = comando.executeQuery(instruccion);
    }
	private void cerrar() throws SQLException {
		conexion.close();
    } 
	
	protected JFrame crearfD() 
	{
		fD = new JFrame("Consultorio Dental/Dentistas");
		Container con = new Container();
		con = fD.getContentPane();
		GridBagConstraints c = new GridBagConstraints();
		con.setLayout(new GridBagLayout());

		JLabel lbDentistas = new JLabel("Dentistas");
		lbDentistas.setFont (new Font("Open Sans",Font.PLAIN,40));
		adjustComponents(c, 0, 0, 5, 1, 1.0, 1.0, GridBagConstraints.NORTH);
		con.add(lbDentistas,c);
		
		Object [] nomColumnas = {"ID", "Nombre", "Estudios","Telefono","Horario","Sueldo","Email","Direccion"};
		dtm = new DefaultTableModel(null,nomColumnas);
		tbDentistas= new JTable(dtm);
	    TableColumnModel tcm = tbDentistas.getColumnModel();
	    TableColumn col = new TableColumn(0,8,new MyTableCellRenderer(),null);
	    tcm.addColumn(col);
	    tcm.moveColumn(tcm.getColumnCount() - 1, 0);
	    tbDentistas.setFillsViewportHeight(true);
	    JScrollPane scrollPane = new JScrollPane(tbDentistas);
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.insets = new Insets(0,2,0,0);
		
		int id;
		float sueldo;
        String nombre,cel,horario,mail,dir,est;
	    try {
            this.leerDatos();
            while(resultados.next() == true) {
                id = resultados.getInt("id_den");
                nombre = resultados.getString("nom_den");
                cel = resultados.getString("tel_den");
                mail = resultados.getString("mail_den");
                sueldo = resultados.getFloat("sldo_den");
                horario = resultados.getString("hor_den");
                dir = resultados.getString("dir_den");
                est = resultados.getString("est_den");
                dtm.addRow( new Object[] {id, nombre,est,cel,horario,sueldo,mail,dir} );                
            }
            this.cerrar();
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Error de lectura de BD\n\n");
            e.printStackTrace();
        }
		adjustComponents(gbc_scrollPane,0,1,5,1,1.0,1.0,GridBagConstraints.CENTER);
		con.add(scrollPane, gbc_scrollPane);
		
		
		btnAgregar = new JButton("Agregar");
		c.insets = new Insets(0,100,0,0);
		adjustButton(btnAgregar, c, con, 0, 2, 1, 1, 1.0, 1.0, GridBagConstraints.WEST);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setEnabled(false);
		adjustButton(btnEliminar, c, con, 0, 2, 1, 1, 0.0, 1.0, GridBagConstraints.CENTER);
		
		btnActualizar = new JButton("Actualizar");
		btnActualizar.setEnabled(false);
		adjustButton(btnActualizar, c, con, 0, 2, 1, 1, 0.0, 0.0, GridBagConstraints.EAST);
		
		c.insets = new Insets(0,0,0,0);
		buttonHome(fD,true,c,con,4,2,1,1,0.0,1.0,GridBagConstraints.CENTER);
		
		btnAgregar.addActionListener(this);
		btnEliminar.addActionListener(this);
		btnActualizar.addActionListener(this);
		
		tbDentistas.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				btnActualizar.setEnabled(isEnabled());
				btnEliminar.setEnabled(isEnabled());
				JTable table =(JTable) e.getSource();
				valor = "" + table.getValueAt(table.getSelectedRow(), 1);
			}
		});
		
		fD.pack();
		fD.setExtendedState(JFrame.MAXIMIZED_BOTH);
		fD.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fD.setVisible(true);
		con.setBackground(Color.WHITE);
		return fD;
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		switch(e.getActionCommand()) 
		{
			case "Agregar":
				AgregarDentista vAD = new AgregarDentista();
				vAD.crearfAD();
				fD.setVisible(false);
			break;
			case "Eliminar":
				dtm = (DefaultTableModel) tbDentistas.getModel();
				dtm.removeRow(tbDentistas.getSelectedRow());
				borrarFila("dentistas", "id_den", valor);
			break;
			case "Actualizar":
				int id = (int) tbDentistas.getModel().getValueAt(tbDentistas.getSelectedRow(), 0);
				String idS = ""+id;
				String nombre = (String) tbDentistas.getModel().getValueAt(tbDentistas.getSelectedRow(), 1);
				String est = (String) tbDentistas.getModel().getValueAt(tbDentistas.getSelectedRow(), 2);
				String tel =  (String) tbDentistas.getModel().getValueAt(tbDentistas.getSelectedRow(), 3);
				String mail = (String) tbDentistas.getModel().getValueAt(tbDentistas.getSelectedRow(), 6);
				String hor = (String) tbDentistas.getModel().getValueAt(tbDentistas.getSelectedRow(), 4);
				Object sldo = tbDentistas.getModel().getValueAt(tbDentistas.getSelectedRow(), 5);
				String dir = (String) tbDentistas.getModel().getValueAt(tbDentistas.getSelectedRow(), 7);
				
				modificarBD("dentistas", "nom_den", "id_den", idS, nombre);
				modificarBD("dentistas", "est_den", "id_den", idS, est);
				modificarBD("dentistas", "tel_den", "id_den", idS, tel);
				modificarBD("dentistas", "hor_den", "id_den", idS, hor);
				modificarBD("dentistas", "mail_den", "id_den", idS, mail);
				modificarBD("dentistas", "sldo_den", "id_den", idS, sldo+"");
				modificarBD("dentistas", "dir_den", "id_den", idS, dir);
			break;
        }
		
	}

}
