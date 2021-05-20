package consultorioDental;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class InicioSesion extends MetodosDiseño implements ActionListener
{

	public static void main(String[]args) 
	{
		InicioSesion vIS = new InicioSesion();
		vIS.crearIS();
	}
	
	private void crearIS()
	{
		
		JFrame fIS = new JFrame("Consultorio Dental/Inicio de Sesion");
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
		
		JTextField jtUsuario = new JTextField(15);
		adjustTextField(jtUsuario, c, con, 1, 1, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.NONE);
		jtUsuario.setPreferredSize(new Dimension(120,35));
		
		JLabel lbPassword = new JLabel("      Contraseña: ");
		lbPassword.setPreferredSize(new Dimension(120,35));
		adjustComponents(c, 1, 2, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER);
		con.add(lbPassword,c);
		
		JPasswordField jtPassword = new JPasswordField(15);
		adjustPasswordField(jtPassword, c, con, 1, 3, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER);
			
		JButton btnAcceder = new JButton("Acceder");
		adjustButton(btnAcceder, c, con, 1, 4, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER);
		
		fIS.setSize(700,400);
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
