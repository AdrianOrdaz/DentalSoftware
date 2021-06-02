package consultorioDental;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
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
	String valor;
	JButton btnEliminar;
	JTable tbAgenda;
	DefaultTableModel dtm;
	private Connection conexion = null;
    private Statement comando = null;
    private ResultSet resultados = null;
    private Connection conexion2 = null;
    private Statement comando2 = null;
    private ResultSet resultados2 = null;
	public static void main(String[] args) 
	{
		AgendaVista av = new AgendaVista();
		av.crearfA();
	}
	
	private void leerDatos() throws ClassNotFoundException, SQLException {
        String usuario = "root";
        String password = "";
        String instruccion = "SELECT * FROM agenda";
        String instruccion2 = "SELECT pte_agda,den_agda FROM agenda UNION ALL SELECT id_pte,nom_pte FROM pacientes UNION ALL SELECT id_den,nom_den FROM dentistas";

        Class.forName("com.mysql.jdbc.Driver");
        conexion = DriverManager.getConnection("jdbc:mysql://localhost/consultorio" + "?" + "user=" + usuario + "&" + "password=" + password + "");
        comando = conexion.createStatement();
        resultados = comando.executeQuery(instruccion);
        conexion2 = DriverManager.getConnection("jdbc:mysql://localhost/consultorio" + "?" + "user=" + usuario + "&" + "password=" + password + "");
        comando2 = conexion2.createStatement();
        resultados2 = comando2.executeQuery(instruccion2);
    }
	private void cerrar() throws SQLException {
		conexion.close();
		conexion2.close();
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
		
		String [] nomColumnas = {"ID Cita", "Paciente", "Dentista", "Fecha", "Hora","Asistio"};
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
		
		int id,pte,den;
        String hr,date,asta;
	    try {
            this.leerDatos();
            while(resultados.next() == true) {
                id = resultados.getInt("cita_agda");
                pte = resultados.getInt("pte_agda");
                den = resultados.getInt("den_agda");
                date = resultados.getString("fecha_agda");
                hr = resultados.getString("hora_agda");
                asta = resultados.getString("asis_agda");
                dtm.addRow( new Object[] {id,pte,den,date,hr,asta} );
            }
            this.cerrar();
        }catch (SQLException | ClassNotFoundException e) {
            System.out.println("Error de lectura de BD\n\n");
            e.printStackTrace();
        }
	    
	    /*String
	    try {
            this.leerDatos();
            while(resultados2.next() == true) {
                pte = resultados2.getInt("pte_agda");
                den = resultados2.getInt("den_agda");
                if(pte == ) {
                	System.out.println(pte);
                }
            }
            this.cerrar();
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Error de lectura de BD\n\n");
            e.printStackTrace();
        }*/
		
		adjustComponents(gbc_scrollPane,0,2,4,1,0.0,0.0,GridBagConstraints.CENTER);
		fAgenda.getContentPane().add(scrollPane, gbc_scrollPane);
		
		JButton btnConfirmar = new JButton("Confirmar asistencia");
		btnConfirmar.setEnabled(false);
		btnConfirmar.setPreferredSize(new Dimension(170,35));
		adjustComponents(c,0,3,1,1,0.0,0.0,GridBagConstraints.EAST);
		con.add(btnConfirmar, c);
		btnConfirmar.addActionListener(this);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setEnabled(false);
		adjustButton(btnEditar,c,con,0,3,1,1,1.0,1.0,GridBagConstraints.CENTER);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setEnabled(false);
		adjustButton(btnEliminar, c, con, 1, 3, 1, 1, 0.0, 1.0, GridBagConstraints.CENTER);
		btnEliminar.addActionListener(this);
		
		tbAgenda.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				btnConfirmar.setEnabled(isEnabled());
				btnEliminar.setEnabled(isEnabled());
				btnEditar.setEnabled(isEnabled());
				JTable table =(JTable) e.getSource();
				valor = "" + table.getValueAt(table.getSelectedRow(), 1);
			}
		});
		
		buttonHome(fAgenda,true,c,con,3,3,1,1,0.0,1.0,GridBagConstraints.CENTER);
		
		fAgenda.pack();
		fAgenda.setExtendedState(JFrame.MAXIMIZED_BOTH);
		fAgenda.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fAgenda.setVisible(true);
		con.setBackground(Color.WHITE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch(e.getActionCommand()) {
			case "Eliminar":
				dtm = (DefaultTableModel) tbAgenda.getModel();
				dtm.removeRow(tbAgenda.getSelectedRow());
				borrarFila("agenda", "cita_agda", valor);
			break;
			case "Confirmar asistencia":
				for(int i = 0;i<dtm.getColumnCount();i++) {
				    tbAgenda.setValueAt("Si", tbAgenda.getSelectedRow(), 6);
				}
				modificarBD("agenda","asis_agda","cita_agda",valor,"Si");
			break;
		}
		
	}

}
