package consultorioDental;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AgendarCita extends MetodosDiseño implements ActionListener 
{
	JComboBox<String> jcbPaciente;
	JComboBox<String> jcbDentista;
	JTextField jtFecha;
	JTextField jtHora;
	private Connection conexion = null;
	private Connection conexion2 = null;
    private Statement comando = null;
    private Statement comando2 = null;
    private ResultSet resultados = null;
    private ResultSet resultados2 = null;
	public static void main(String[]args)
	{
		AgendarCita ac = new AgendarCita();
		ac.crearAC();
	}
	
	private void leerDatos() throws ClassNotFoundException, SQLException {
        String usuario = "root";
        String password = "";
        String instruccion = "SELECT * FROM pacientes";
        String instruccion2 = "SELECT * FROM dentistas";

        Class.forName("com.mysql.jdbc.Driver");
        conexion = DriverManager.getConnection("jdbc:mysql://localhost/consultorio" + "?" + "user=" + usuario + "&" + "password=" + password + "");
        conexion2 = DriverManager.getConnection("jdbc:mysql://localhost/consultorio" + "?" + "user=" + usuario + "&" + "password=" + password + "");
        comando = conexion.createStatement();
        comando2 = conexion2.createStatement();
        resultados = comando.executeQuery(instruccion);
        resultados2 = comando2.executeQuery(instruccion2);
    }
	private void cerrar() throws SQLException {
		conexion.close();
		conexion2.close();
    } 
	
	protected void crearAC()
	{
		JFrame fAC = new JFrame("Consultorio Dental/Agendar Cita");
		Container con = new Container();
		con = fAC.getContentPane();
		GridBagConstraints c = new GridBagConstraints();
		con.setLayout(new GridBagLayout());
		
		JLabel lbAgendarCita = new JLabel("Agendar Cita");
		lbAgendarCita.setFont (lbAgendarCita.getFont ().deriveFont (41.0f));
		adjustComponents(c, 1, 0, 3, 1, 1.0, 1.0, GridBagConstraints.CENTER);
		con.add(lbAgendarCita,c);
		
		JLabel lbPaciente = new JLabel("Paciente: ");
		lbPaciente.setFont (lbPaciente.getFont ().deriveFont (21.0f));
		adjustComponents(c, 0, 1, 1, 1, 1.0, 1.0, GridBagConstraints.EAST);
		con.add(lbPaciente,c);
		
		JLabel lbFecha = new JLabel("Fecha: ");
		lbFecha.setFont (lbFecha.getFont ().deriveFont (21.0f));
		adjustComponents(c, 0, 2, 1, 1, 1.0, 1.0, GridBagConstraints.EAST);
		con.add(lbFecha,c);
		
		JLabel lbHora = new JLabel("Hora: ");
		lbHora.setFont (lbHora.getFont ().deriveFont (21.0f));
		adjustComponents(c, 0, 3, 1, 1, 1.0, 1.0, GridBagConstraints.EAST);
		con.add(lbHora,c);
		
		JLabel lbDentista = new JLabel("Dentista: ");
		lbDentista.setFont (lbDentista.getFont ().deriveFont (21.0f));
		adjustComponents(c, 0, 4, 1, 1, 1.0, 1.0, GridBagConstraints.EAST);
		con.add(lbDentista,c);
		
		
		jcbPaciente = new JComboBox<String>();
		jcbPaciente.addItem("Seleccione un paciente");
		try {
            this.leerDatos();
            while(resultados.next() == true) {
            	jcbPaciente.addItem(resultados.getInt("id_pte")+"-"+resultados.getString("nom_pte"));
            }
            this.cerrar();
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Error de lectura de BD\n\n");
            e.printStackTrace();
        }
		adjustComponents(c, 1, 1, 3, 1, 1.0, 0.0, GridBagConstraints.CENTER);
		con.add(jcbPaciente,c);
		
		jtFecha = new JTextField(15);
		adjustTextField(jtFecha, c, con, 1, 2, 3, 1, 1.0, 0.0, GridBagConstraints.CENTER);
		
		jtHora = new JTextField(15);
		adjustTextField(jtHora, c, con, 1, 3, 3, 1, 1.0, 0.0, GridBagConstraints.CENTER);
		
		jcbDentista = new JComboBox<String>();
		jcbDentista.addItem("Seleccione un dentista");
		try {
            this.leerDatos();
            while(resultados2.next() == true) {
            	jcbDentista.addItem(resultados2.getInt("id_den")+"-"+resultados2.getString("nom_den"));
            }
            this.cerrar();
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Error de lectura de BD\n\n");
            e.printStackTrace();
        }
		adjustComponents(c, 1, 4, 3, 1, 1.0, 0.0, GridBagConstraints.CENTER);
		con.add(jcbDentista,c);
		
		JButton btnAgendarCita = new JButton("Agendar Cita");
		GridBagConstraints gbc_btnAgendarCita = new GridBagConstraints();
		adjustButton(btnAgendarCita,gbc_btnAgendarCita,con,3,5,1,1,1.0,00.,GridBagConstraints.CENTER);
		
		GridBagConstraints gbc_btnHome = new GridBagConstraints();
		buttonHome(fAC,true,gbc_btnHome,con,4,6,1,1,1.0,1.0,GridBagConstraints.CENTER);
		
		btnAgendarCita.addActionListener(this);
		
		fAC.pack();
		fAC.setExtendedState(JFrame.MAXIMIZED_BOTH);
		fAC.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fAC.setVisible(true);
		con.setBackground(Color.WHITE);
	}

	public void actionPerformed(ActionEvent e) {
		String idpte = (String) jcbPaciente.getSelectedItem();
		String idden = (String) jcbDentista.getSelectedItem();
		String[] idp = idpte.split("-");
		String[] idd = idden.split("-");
		String id_pte = idp[0];
		String id_den = idd[0];
		subirFilaCol4("citas","pte_cita","den_cita","hr_cita","fecha_cita",
				id_pte,id_den, jtHora.getText(), jtFecha.getText());
		emptyJT(jtHora,jtFecha,new JTextField(),new JTextField(),new JTextField(),new JTextField(),new JTextField(),new JTextField());
		jcbPaciente.setSelectedIndex(0);
		jcbDentista.setSelectedIndex(0);
	}
}