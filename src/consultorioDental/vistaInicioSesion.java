package consultorioDental;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class vistaInicioSesion extends metDiseño implements ActionListener
{

	public static void main(String[]args) 
	{
		crearIS();
	}
	
	private static void crearIS()
	{
		vistaInicioSesion fIS = new vistaInicioSesion();
		Container con = new Container();
		con = fIS.getContentPane();
		GridBagConstraints c = new GridBagConstraints();
		con.setLayout(new GridBagLayout());

		ImageIcon logo = new ImageIcon("src/logo.png");
		JLabel lbLogo = new JLabel();
		lbLogo.setIcon(logo);
		c.gridx = 0;
		c.gridy = 1;
		c.gridwidth = 1; 
		c.gridheight = 5;
		c.weightx = 2.0;
		con.add(lbLogo,c);
		c.weightx = 0.0;
		
		//(X,Y,ancho,alto,anchoy,anchox)
		JLabel lbUsuario = new JLabel("Usuario: ");
		lbUsuario.setPreferredSize(new Dimension(120,35));
		adjustLabel(lbUsuario, c, con, 1, 1, 1, 1, 1.0, 2.0, GridBagConstraints.CENTER);
		
		JTextField jtUsuario = new JTextField(15);
		adjustTextField(jtUsuario, c, con, 1, 2, 1, 1, 0.0, 2.0, GridBagConstraints.NORTH,GridBagConstraints.NONE);
		jtUsuario.setPreferredSize(new Dimension(120,35));
		
		JLabel lbPassword = new JLabel("Contraseña: ");
		lbPassword.setPreferredSize(new Dimension(120,35));
		adjustLabel(lbPassword, c, con, 1, 3, 1, 1, 0.0, 2.0, GridBagConstraints.CENTER);
		
		JPasswordField jtPassword = new JPasswordField(15);
		adjustPasswordField(jtPassword, c, con, 1, 4, 1, 1, 1.0, 2.0, GridBagConstraints.NORTH);
		
		
		JButton btnAcceder  = new JButton("Acceder");
		adjustButton(btnAcceder, c, con, 1, 5, 1, 1, 1.0, 2.0, GridBagConstraints.NORTH,GridBagConstraints.NONE);

		fIS.setSize(500,300);
		fIS.setTitle("Consultorio Dental: Inicio de Sesion");
		fIS.setResizable(false);
		fIS.setVisible(true);
		fIS.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
