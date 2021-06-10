package consultorioDental;

import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

import consultorioDental.MetodosDiseño.MyTableCellRenderer;

public class Servicios extends MetodosDiseño implements ActionListener {
	String valor;
	JPanel contentPane;
	JTable tbServicios;
	DefaultTableModel dtm;
	private Connection conexion = null;
    private Statement comando = null;
    private ResultSet resultados = null;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Servicios frame = new Servicios();
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
        String instruccion = "SELECT * FROM servicios";

        Class.forName("com.mysql.jdbc.Driver");
        conexion = DriverManager.getConnection("jdbc:mysql://localhost/consultorio" + "?" + "user=" + usuario + "&" + "password=" + password + "");
        comando = conexion.createStatement();
        resultados = comando.executeQuery(instruccion);
    }
	private void cerrar() throws SQLException {
		conexion.close();
    }
	
	protected Servicios() 
	{
		setTitle("Consultorio Dental/Servicios");
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		setContentPane(contentPane);
		contentPane.setLayout(new GridBagLayout());
		
		JLabel lbServicios = new JLabel("Servicios");
		lbServicios.setFont(new Font("Open Sans", Font.PLAIN, 40));
		GridBagConstraints gbc_lbServicios = new GridBagConstraints();
		adjustComponents(gbc_lbServicios,0,0,4,1,1.0,1.0,GridBagConstraints.NORTH);
		contentPane.add(lbServicios, gbc_lbServicios);
		
		String [] nomColumnas = {"ID", "Nombre","Precio"};
		dtm = new DefaultTableModel(null,nomColumnas);
		tbServicios= new JTable(dtm);
	    TableColumnModel tcm = tbServicios.getColumnModel();
	    TableColumn col = new TableColumn(0,0,new MyTableCellRenderer(),null);
	    tcm.addColumn(col);
	    tcm.moveColumn(tcm.getColumnCount() - 1, 0);
	    tbServicios.setFillsViewportHeight(true);
	    JScrollPane scrollPane = new JScrollPane(tbServicios);
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.insets = new Insets(0,2,0,0);
		
		int id;
		float pre;
        String nombre;
	    try {
            this.leerDatos();
            while(resultados.next() == true) {
                id = resultados.getInt("id_serv");
                nombre = resultados.getString("nom_serv");
                pre = resultados.getFloat("cos_serv");
                dtm.addRow( new Object[] {id,nombre,pre} );                
            }
            this.cerrar();
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Error de lectura de BD\n\n");
            e.printStackTrace();
        }
		adjustComponents(gbc_scrollPane,0,1,4,1,1.0,1.0,GridBagConstraints.CENTER);
		contentPane.add(scrollPane, gbc_scrollPane);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setEnabled(false);
		adjustButton(btnEliminar,new GridBagConstraints(),contentPane,2,2,1,1,1.0,1.0,GridBagConstraints.WEST);
		
		JButton btnEditar = new JButton("Actualizar");
		btnEditar.setEnabled(false);
		adjustButton(btnEditar,new GridBagConstraints(),contentPane,1,2,1,1,0.0,1.0,GridBagConstraints.CENTER);
		
		JButton btnAgregar = new JButton("Agregar");
		adjustButton(btnAgregar,new GridBagConstraints(),contentPane,0,2,1,1,0.0,1.0,GridBagConstraints.EAST);
		btnAgregar.addActionListener(this);
		btnEliminar.addActionListener(this);
		btnEditar.addActionListener(this);
		
		tbServicios.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				btnEditar.setEnabled(isEnabled());
				btnEliminar.setEnabled(isEnabled());
				JTable table =(JTable) e.getSource();
				valor = "" + table.getValueAt(table.getSelectedRow(), 1);
			}
		});
		
		buttonHome(this,true,new GridBagConstraints(),contentPane,3,2,1,1,0.0,1.0,GridBagConstraints.CENTER);
	}
	public void actionPerformed(ActionEvent e) {
		switch(e.getActionCommand())
		{
			case "Agregar":
				AgregarServicio as = new AgregarServicio();
				as.setVisible(true);
				this.setVisible(false);
			break;
			case "Eliminar":
				dtm = (DefaultTableModel) tbServicios.getModel();
				dtm.removeRow(tbServicios.getSelectedRow());
				borrarFila("servicios", "id_serv", valor);
			break;
			case "Actualizar":
				int id = (int) tbServicios.getModel().getValueAt(tbServicios.getSelectedRow(), 0);
				String idS = ""+id;
				String nombre = (String) tbServicios.getModel().getValueAt(tbServicios.getSelectedRow(), 1);
				Object pre = tbServicios.getModel().getValueAt(tbServicios.getSelectedRow(), 2);
				modificarBD("servicios", "nom_serv", "id_serv", idS, nombre);
				modificarBD("servicios", "cos_serv", "id_serv", idS, pre+"");
			break;
		}
	} 
}