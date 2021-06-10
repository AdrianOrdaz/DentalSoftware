package consultorioDental;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Font;
import java.awt.Insets;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.Color;

public class GestionarUsuario extends MetodosDiseño implements ActionListener {
	String valor;
	JPanel contentPane;
	JTable tbGestionarUsuario;
	DefaultTableModel dtm;
	private Connection conexion = null;
    private Statement comando = null;
    private ResultSet resultados = null;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GestionarUsuario frame = new GestionarUsuario();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	private void leerDatos() throws ClassNotFoundException, SQLException {
        String usuario = "root";
        String password = "";
        String instruccion = "SELECT * FROM admin";

        Class.forName("com.mysql.jdbc.Driver");
        conexion = DriverManager.getConnection("jdbc:mysql://localhost/consultorio" + "?" + "user=" + usuario + "&" + "password=" + password + "");
        comando = conexion.createStatement();
        resultados = comando.executeQuery(instruccion);
    }
	private void cerrar() throws SQLException {
		conexion.close();
    } 
	
	protected GestionarUsuario() {
		setTitle("Gestionar usuario");
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		setContentPane(contentPane);
		contentPane.setLayout(new GridBagLayout());
		
		JLabel lbGestionarUsuario = new JLabel("Gestionar Usuario");
		lbGestionarUsuario.setFont(new Font("Tahoma", Font.PLAIN, 40));
		GridBagConstraints gbc_lbGestionarUsuario = new GridBagConstraints();
		adjustComponents(gbc_lbGestionarUsuario,0,0,5,1,1.0,1.0,GridBagConstraints.NORTH);
		contentPane.add(lbGestionarUsuario, gbc_lbGestionarUsuario);
		
		String[] header = {"ID","Nombre","Contraseña","Horario","Mail","Sueldo","Direccion","Telefono"};
	    dtm = new DefaultTableModel(null,header);
		tbGestionarUsuario= new JTable(dtm);
	    TableColumnModel tcm = tbGestionarUsuario.getColumnModel();
	    TableColumn col = new TableColumn(0,8,new MyTableCellRenderer(),null);
	    tcm.addColumn(col);
	    tcm.moveColumn(tcm.getColumnCount() - 1, 0);
	    tbGestionarUsuario.setFillsViewportHeight(true);
	    JScrollPane scrollPane = new JScrollPane(tbGestionarUsuario);
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.insets = new Insets(0,2,0,0);
		
		int id;
		float sueldo;
        String nombre,con,cel,horario,mail,dir;
	    try {
            this.leerDatos();
            while(resultados.next() == true) {
                id = resultados.getInt("id_usu");
                nombre = resultados.getString("nom_usu");
                cel = resultados.getString("tel_usu");
                mail = resultados.getString("mail_usu");
                sueldo = resultados.getFloat("sldo_usu");
                con = resultados.getString("contr_usu");
                horario = resultados.getString("hor_usu");
                dir = resultados.getString("dir_usu");
                dtm.addRow( new Object[] {id, nombre,con,horario,mail,sueldo,dir,cel} );                
            }
            this.cerrar();
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Error de lectura de BD\n\n");
            e.printStackTrace();
        }
		adjustComponents(gbc_scrollPane,1,1,4,1,1.0,1.0,GridBagConstraints.CENTER);
		contentPane.add(scrollPane, gbc_scrollPane);
		
		buttonHome(this,false,new GridBagConstraints(),contentPane,4,2,1,1,0.0,1.0,GridBagConstraints.CENTER);
		
		JButton btnActualizar = new JButton("Actualizar");
		btnActualizar.setEnabled(false);
		adjustButton(btnActualizar,new GridBagConstraints(),contentPane,2,2,1,1,0.0,1.0,GridBagConstraints.CENTER);
		btnActualizar.addActionListener(this);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setEnabled(false);
		adjustButton(btnEliminar,new GridBagConstraints(),contentPane,3,2,1,1,0.0,1.0,GridBagConstraints.CENTER);
		
		JButton btnAgregar = new JButton("Agregar");
		adjustButton(btnAgregar,new GridBagConstraints(),contentPane,1,2,1,1,1.0,1.0,GridBagConstraints.CENTER);
		btnAgregar.addActionListener(this);
		
		tbGestionarUsuario.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				btnActualizar.setEnabled(isEnabled());
				btnEliminar.setEnabled(isEnabled());
				JTable table =(JTable) e.getSource();
				valor = "" + table.getValueAt(table.getSelectedRow(), 1);
			}
		});
		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setExtendedState(MAXIMIZED_BOTH);
	}
	public void actionPerformed(ActionEvent e) {
		switch(e.getActionCommand())
		{
			case "Agregar":
				AgregarUsuario au = new AgregarUsuario();
				au.setVisible(true);
				this.setVisible(false);
			break;
			case "Eliminar":
				dtm = (DefaultTableModel) tbGestionarUsuario.getModel();
				dtm.removeRow(tbGestionarUsuario.getSelectedRow());
				borrarFila("admin", "id_usu", valor);
			break;
			case "Actualizar":
				int id = (int) tbGestionarUsuario.getModel().getValueAt(tbGestionarUsuario.getSelectedRow(), 0);
				String idS = ""+id;
				String nombre = (String) tbGestionarUsuario.getModel().getValueAt(tbGestionarUsuario.getSelectedRow(), 1);
				String contr = (String) tbGestionarUsuario.getModel().getValueAt(tbGestionarUsuario.getSelectedRow(), 2);
				String hor = (String) tbGestionarUsuario.getModel().getValueAt(tbGestionarUsuario.getSelectedRow(), 3);
				String mail = (String) tbGestionarUsuario.getModel().getValueAt(tbGestionarUsuario.getSelectedRow(), 4);
				Object sldo = tbGestionarUsuario.getModel().getValueAt(tbGestionarUsuario.getSelectedRow(), 5);
				String dir = (String) tbGestionarUsuario.getModel().getValueAt(tbGestionarUsuario.getSelectedRow(), 6);
				String tel = (String) tbGestionarUsuario.getModel().getValueAt(tbGestionarUsuario.getSelectedRow(), 7);
				modificarBD("admin", "nom_usu", "id_usu", idS, nombre);
				modificarBD("admin", "contr_usu", "id_usu", idS, contr);
				modificarBD("admin", "hor_usu", "id_usu", idS, hor);
				modificarBD("admin", "mail_usu", "id_usu", idS, mail);
				modificarBD("admin", "sldo_usu", "id_usu", idS, sldo+"");
				modificarBD("admin", "dir_usu", "id_usu", idS, dir);
				modificarBD("admin", "tel_usu", "id_usu", idS, tel);
			break;
		}
		
	}
}
