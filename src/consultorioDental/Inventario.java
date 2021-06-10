package consultorioDental;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

import consultorioDental.MetodosDiseño.MyTableCellRenderer;

import javax.swing.JScrollBar;

public class Inventario extends MetodosDiseño implements ActionListener{
	JFrame fInv;
	JButton btnEliminar;
	JButton btnEditar;
	JTable tbInventario;
	DefaultTableModel dtm;
	String valor;
	private Connection conexion = null;
    private Statement comando = null;
    private ResultSet resultados = null;
	public static void main(String[] args) 
	{
		Inventario vInv = new Inventario();
		vInv.crearInv();
	}

	private void leerDatos() throws ClassNotFoundException, SQLException {
        String usuario = "root";
        String password = "";
        String instruccion = "SELECT * FROM medicamentos";

        Class.forName("com.mysql.jdbc.Driver");
        conexion = DriverManager.getConnection("jdbc:mysql://localhost/consultorio" + "?" + "user=" + usuario + "&" + "password=" + password + "");
        comando = conexion.createStatement();
        resultados = comando.executeQuery(instruccion);
    }
	private void cerrar() throws SQLException {
		conexion.close();
    } 

	protected JFrame crearInv() 
	{
		fInv = new JFrame("Consultorio Dental/Inventario");
		Container con = new Container();
		con = fInv.getContentPane();
		GridBagConstraints c = new GridBagConstraints();
		con.setLayout(new GridBagLayout());
		
		JLabel lbInventario = new JLabel("Inventario");
		lbInventario.setFont(new Font("Open Sans", Font.PLAIN, 40));
		adjustComponents(c, 0, 0, 5, 1, 1.0, 1.0, GridBagConstraints.NORTH);
		con.add(lbInventario,c);
		
		String [] nomColumnas = {"ID", "Nombre", "Descripcion", "Precio"};
		dtm = new DefaultTableModel(null,nomColumnas);
		tbInventario= new JTable(dtm);
	    TableColumnModel tcm = tbInventario.getColumnModel();
	    TableColumn col = new TableColumn(0,0,new MyTableCellRenderer(),null);
	    tcm.addColumn(col);
	    tcm.moveColumn(tcm.getColumnCount() - 1, 0);
	    tbInventario.setFillsViewportHeight(true);
	    JScrollPane scrollPane = new JScrollPane(tbInventario);
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.insets = new Insets(0,2,0,0);
		
		int id;
		float pre;
        String nombre,tipo;
	    try {
            this.leerDatos();
            while(resultados.next() == true) {
                id = resultados.getInt("id_med");
                nombre = resultados.getString("nom_med");
                tipo = resultados.getString("tipo_med");
                pre = resultados.getFloat("pre_med");
                dtm.addRow( new Object[] {id, nombre,tipo,pre} );                
            }
            this.cerrar();
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Error de lectura de BD\n\n");
            e.printStackTrace();
        }
		adjustComponents(gbc_scrollPane,0,1,4,1,1.0,1.0,GridBagConstraints.CENTER);
		con.add(scrollPane, gbc_scrollPane);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setEnabled(false);
		adjustButton(btnEliminar, c, con, 0, 4, 1, 1, 0.0, 1.0, GridBagConstraints.CENTER);
		btnEliminar.addActionListener(this);
		
		btnEditar = new JButton("Actualizar");
		btnEditar.setEnabled(false);
		adjustButton(btnEditar, c, con, 1, 4, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER);
		btnEditar.addActionListener(this);
		
		buttonHome(fInv,true,new GridBagConstraints(),con,3,4,1,1,1.0,1.0,GridBagConstraints.CENTER);
		
		tbInventario.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				btnEditar.setEnabled(isEnabled());
				btnEliminar.setEnabled(isEnabled());
				JTable table =(JTable) e.getSource();
				valor = "" + table.getValueAt(table.getSelectedRow(), 1);
			}
		});
		
		fInv.pack();
		fInv.setExtendedState(JFrame.MAXIMIZED_BOTH);
		fInv.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fInv.setVisible(true);
		con.setBackground(Color.WHITE);
		return fInv;
	}

	public void actionPerformed(ActionEvent e) {
		switch(e.getActionCommand())
		{
			case "Eliminar":
				dtm = (DefaultTableModel) tbInventario.getModel();
				dtm.removeRow(tbInventario.getSelectedRow());
				borrarFila("medicamentos", "id_med", valor);
			break;
			case "Actualizar":
				int id = (int) tbInventario.getModel().getValueAt(tbInventario.getSelectedRow(), 0);
				String idS = ""+id;
				String nombre = (String) tbInventario.getModel().getValueAt(tbInventario.getSelectedRow(), 1);
				String tipo = (String) tbInventario.getModel().getValueAt(tbInventario.getSelectedRow(), 2);
				Object pre = tbInventario.getModel().getValueAt(tbInventario.getSelectedRow(), 3);
				modificarBD("medicamentos", "nom_med", "id_med", idS, nombre);
				modificarBD("medicamentos", "tipo_med", "id_med", idS, tipo);
				modificarBD("medicamentos", "pre_med", "id_med", idS, pre+"");
			break;
		}
	}

}
