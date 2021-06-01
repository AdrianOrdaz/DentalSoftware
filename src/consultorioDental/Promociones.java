package consultorioDental;

import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

import consultorioDental.MetodosDiseño.MyTableCellRenderer;

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

public class Promociones extends MetodosDiseño implements ActionListener{
	String valor;
	JPanel contentPane;
	JTable tbPromociones;
	DefaultTableModel dtm;
	private Connection conexion = null;
    private Statement comando = null;
    private ResultSet resultados = null;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Promociones frame = new Promociones();
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
        String instruccion = "SELECT * FROM promociones";

        Class.forName("com.mysql.jdbc.Driver");
        conexion = DriverManager.getConnection("jdbc:mysql://localhost/consultorio" + "?" + "user=" + usuario + "&" + "password=" + password + "");
        comando = conexion.createStatement();
        resultados = comando.executeQuery(instruccion);
    }
	private void cerrar() throws SQLException {
		conexion.close();
    } 
	
	protected Promociones() {
		setTitle("Consultorio Dental/Promociones");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setExtendedState(MAXIMIZED_BOTH);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		setContentPane(contentPane);
		contentPane.setLayout(new GridBagLayout());
		
		JLabel lbPromociones = new JLabel("Promociones");
		lbPromociones.setFont(new Font("Open Sans", Font.PLAIN, 40));
		GridBagConstraints gbc_lbPromociones = new GridBagConstraints();
		adjustComponents(gbc_lbPromociones,0,0,5,1,1.0,1.0,GridBagConstraints.NORTH);
		contentPane.add(lbPromociones, gbc_lbPromociones);
		
		String[] header = {"ID","Servicio","Dias","Terminos","Costo unitario","Nuevo costo","Porcentaje de la promocion","Ahorro"};
	    dtm = new DefaultTableModel(null,header);
	    tbPromociones = new JTable(dtm);
	    TableColumnModel tcm = tbPromociones.getColumnModel();
	    TableColumn col = new TableColumn(0,8,new MyTableCellRenderer(),null);
	    tcm.addColumn(col);
	    tcm.moveColumn(tcm.getColumnCount() - 1, 0);
	    tbPromociones.setFillsViewportHeight(true);
		JScrollPane scrollPane = new JScrollPane(tbPromociones);
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.insets = new Insets(0,2,0,0);
		
		int id,pje;
		float in,junt,ahorro;
        String dias,term,serv;
	    try {
            this.leerDatos();
            while(resultados.next() == true) {
                id = resultados.getInt("id_prom");
                serv = resultados.getString("serv_prom");
                dias = resultados.getString("das_prom");
                term = resultados.getString("term_prom");
                in = resultados.getFloat("indiv_prom");
                junt = resultados.getFloat("junt_prom");
                pje = resultados.getInt("porc_prom");
                ahorro = resultados.getInt("ahorr_prom");
                dtm.addRow( new Object[] {id,serv,dias,term,in,junt,pje,ahorro} );                
            }
            this.cerrar();
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Error de lectura de BD\n\n");
            e.printStackTrace();
        }
		
		adjustComponents(gbc_scrollPane,0,1,5,2,1.0,1.0,GridBagConstraints.NORTH);
		contentPane.add(scrollPane, gbc_scrollPane);
		
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setEnabled(false);
		GridBagConstraints gbc_btnEliminar = new GridBagConstraints();
		adjustButton(btnEliminar,gbc_btnEliminar,contentPane,3,3,1,1,1.0,1.0,GridBagConstraints.CENTER);
		btnEliminar.addActionListener(this);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setEnabled(false);
		GridBagConstraints gbc_btnEditar = new GridBagConstraints();
		adjustButton(btnEditar,gbc_btnEditar,contentPane,2,3,1,1,0.0,1.0,GridBagConstraints.CENTER);
		
		tbPromociones.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				btnEliminar.setEnabled(isEnabled());
				btnEditar.setEnabled(isEnabled());
				JTable table =(JTable) e.getSource();
				valor = "" + table.getValueAt(table.getSelectedRow(), 1);
			}
		});
		
		JButton btnAgregar = new JButton("Agregar");
		GridBagConstraints gbc_btnAgregar = new GridBagConstraints();
		adjustButton(btnAgregar,gbc_btnAgregar,contentPane,1,3,1,1,0.0,1.0,GridBagConstraints.CENTER);
		btnAgregar.addActionListener(this);
		
		buttonHome(this,true,new GridBagConstraints(),contentPane,4,3,1,1,0.0,1.0,GridBagConstraints.CENTER);
	}
	
	public void actionPerformed(ActionEvent e) {
		switch(e.getActionCommand())
		{
			case "Agregar":
				AgregarPromocion ap = new AgregarPromocion();
				ap.setVisible(true);
				this.setVisible(false);
			break;
			case "Eliminar":
				dtm = (DefaultTableModel) tbPromociones.getModel();
				dtm.removeRow(tbPromociones.getSelectedRow());
				borrarFila("promociones", "id_prom", valor);
			break;
				
		}
		
	}

}
