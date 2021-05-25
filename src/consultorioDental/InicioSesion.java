package consultorioDental;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class InicioSesion extends MetodosDiseño implements ActionListener
{
	JFrame fIS;
	JTextField jtUsuario;
	JTextField jtPassword;
	String usuario = "root";
    String password = "";
    ConexionBaseDatos_phpMyAdmin conexion = new ConexionBaseDatos_phpMyAdmin();
    String instruccion = "SELECT nom_admin, contr_admin FROM admin WHERE 1";
    Connection cn = null;
	Statement stm = null;
	ResultSet rs = null;
	public static void main(String[]args) 
	{
		InicioSesion vIS = new InicioSesion();
		vIS.crearIS();
	}
	protected void crearIS()
	{
		fIS = new JFrame("Inicio de Sesion");
		Container con = new Container();
		con = fIS.getContentPane();
		GridBagConstraints c = new GridBagConstraints();
		con.setLayout(new GridBagLayout());
		
		JLabel lbLogo = new JLabel();
		ImageIcon logo = new ImageIcon("src/img/logo.png");
		lbLogo.setIcon(logo);
		c.gridx = 0;
		c.gridy = 0;
		c.gridwidth = 1;
		c.gridheight = 5;
		c.weightx = 1.0;
		con.add(lbLogo,c);
		c.weightx = 0.0;
		
		//(X,Y,ancho,alto,anchoy,achox)
		JLabel lbUsuario = new JLabel("         Usuario: ");
		lbUsuario.setPreferredSize(new Dimension(120,35));
		adjustComponents(c, 1, 0, 1, 1, 0.0, 1.0, GridBagConstraints.CENTER);
		con.add(lbUsuario,c);
		
		jtUsuario = new JTextField(15);
		adjustTextField(jtUsuario, c, con, 1, 1, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER);
		jtUsuario.setPreferredSize(new Dimension(120,35));
		
		JLabel lbPassword = new JLabel("      Contraseña: ");
		lbPassword.setPreferredSize(new Dimension(120,35));
		adjustComponents(c, 1, 2, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER);
		con.add(lbPassword,c);
		
		jtPassword = new JPasswordField(15);
		jtPassword.setPreferredSize(new Dimension(168,35));
		adjustComponents(c, 1, 3, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER);
		con.add(jtPassword,c);
			
		JButton btnAcceder = new JButton("Acceder");
		adjustButton(btnAcceder, c, con, 1, 4, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER);
		btnAcceder.addActionListener(this);
		
		fIS.setSize(700,400);
		fIS.setTitle("Consultorio Dental: Inicio de Sesion");
		fIS.setResizable(false);
		fIS.setVisible(true);
		fIS.setDefaultCloseOperation(EXIT_ON_CLOSE);
		fIS.setLocationRelativeTo(null);
		Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
	     int height = pantalla.height;
	     int width = pantalla.width;
	     setSize(width/2, height/2);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			cn = conexion.conectar();
	
			stm = cn.createStatement();
			String execute = "SELECT nom_admin, contr_admin FROM admin";
			rs = stm.executeQuery(execute);
			if (rs.next())
			{
				if(jtUsuario.getText() ==  rs.getString("nom_admin") && jtPassword.getText() == rs.getString("contr_admin")) {
					System.out.print("Hola");
					MenuAdmin ma = new MenuAdmin();
					ma.crearMenuAdmin();
					fIS.setVisible(false);
				}  
			}
			
		}catch (SQLException e1) {
			e1.printStackTrace();
		} finally {
			try {
				if(rs!=null && stm!=null && cn!=null)
				{
					rs.close();
					stm.close();
					cn.close();
				}
			}catch (Exception e2) {
				e2.printStackTrace();
			} 
		}
		
	}
}
