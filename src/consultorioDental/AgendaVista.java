package consultorioDental;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;

import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JCheckBox;

import java.awt.Insets;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JScrollBar;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

import consultorioDental.MetodosDiseño.MyTableCellRenderer;

public class AgendaVista extends MetodosDiseño implements ActionListener {
	
	JButton btnEliminar;
	JTable tbAgenda;
	DefaultTableModel dtm;
	private Connection conexion = null;
    private Statement comando = null;
    private ResultSet resultados = null;
	public static void main(String[] args) 
	{
		AgendaVista av = new AgendaVista();
		av.crearfA();
	}
	
	private void leerDatos() throws ClassNotFoundException, SQLException {
        String usuario = "root";
        String password = "";
        String instruccion = "SELECT * FROM citas";

        Class.forName("com.mysql.jdbc.Driver");
        conexion = DriverManager.getConnection("jdbc:mysql://localhost/consultorio" + "?" + "user=" + usuario + "&" + "password=" + password + "");
        comando = conexion.createStatement();
        resultados = comando.executeQuery(instruccion);
    }
	private void cerrar() throws SQLException {
		conexion.close();
    } 
	
	protected void crearfA() 
	{
		JFrame fAgenda = new JFrame("Consultorio Dental/Agenda");
		Container con = new Container();
		con = fAgenda.getContentPane();
		GridBagConstraints c = new GridBagConstraints();
		con.setLayout(new GridBagLayout());
		
		JLabel lbAgenda = new JLabel("Agenda");
		lbAgenda.setFont (new Font("Open Sans",Font.CENTER_BASELINE, 40));
		adjustComponents(c, 0, 0, 4, 1, 1.0, 1.0, GridBagConstraints.NORTH);
		con.add(lbAgenda,c);
		
		/*String [] nomColumnas = {"ID Cita", "Paciente", "Dentista", "Fecha", "Hora","Asistio"};
		dtm = new DefaultTableModel(null,nomColumnas);
		dtm.setColumnIdentifiers(nomColumnas);
		tbAgenda = new JTable(dtm);
		TableColumnModel tcm = tbAgenda.getColumnModel();
	    TableColumn col = new TableColumn(0,8,new MyTableCellRenderer(),null);
	    tcm.addColumn(col);
	    tcm.moveColumn(tcm.getColumnCount() - 1, 0);
	    tbAgenda.setFillsViewportHeight(true);
		JScrollPane scrollPane = new JScrollPane(tbAgenda);
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.insets = new Insets(0, 2, 5, 0);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		
		int id;
        String pte,den,hr,date;
	    try {
            this.leerDatos();
            while(resultados.next() == true) {
                id = resultados.getInt("id_cita");
                pte = resultados.getString("pte_cita");
                den = resultados.getString("den_cita");
                date = resultados.getString("fecha_cita");
                hr = resultados.getString("hr_cita");
                dtm.addRow( new Object[] {id,pte,den,date,hr} );
            }
            this.cerrar();
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Error de lectura de BD\n\n");
            e.printStackTrace();
        }
		adjustComponents(gbc_scrollPane,0,2,4,1,0.0,0.0,GridBagConstraints.CENTER);
		fAgenda.getContentPane().add(scrollPane, gbc_scrollPane);*/
		
		JTable table = new JTable(new JTableModel()); 
        JScrollPane scrollPane = new JScrollPane(table);
        table.setFillsViewportHeight(true); 

        TableCellRenderer buttonRenderer = new JTableButtonRenderer();
        table.getColumn("Button1").setCellRenderer(buttonRenderer);
        table.getColumn("Button2").setCellRenderer(buttonRenderer);
        GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.insets = new Insets(0, 2, 5, 0);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
        adjustComponents(gbc_scrollPane,0,2,4,1,0.0,0.0,GridBagConstraints.CENTER);
		fAgenda.getContentPane().add(scrollPane, gbc_scrollPane);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setEnabled(false);
		adjustButton(btnEditar,c,con,0,3,1,1,1.0,1.0,GridBagConstraints.CENTER);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setEnabled(false);
		adjustButton(btnEliminar, c, con, 1, 3, 1, 1, 0.0, 1.0, GridBagConstraints.CENTER);
		btnEliminar.addActionListener(this);
		
		buttonHome(fAgenda,true,c,con,3,3,1,1,0.0,1.0,GridBagConstraints.CENTER);
		
		fAgenda.pack();
		fAgenda.setExtendedState(JFrame.MAXIMIZED_BOTH);
		fAgenda.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fAgenda.setVisible(true);
		con.setBackground(Color.WHITE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
