package consultorioDental;

import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ventanaEmergente1 extends metDiseño implements ActionListener 
{
	public static void main(String[]args) 
	{
		crearVE1();
	}
	
	private static void crearVE1()
	{
		ventanaEmergente1 fVE1 = new ventanaEmergente1();
		Container con = new Container();
		con = fVE1.getContentPane();
		GridBagConstraints c = new GridBagConstraints();
		con.setLayout(new GridBagLayout());
		
		JLabel lbAdvertencia = new JLabel("El usuario y/o contraseña es incorrecto");
		adjustLabel(lbAdvertencia, c, con, 0, 0, 1, 1, 1.0, 0.0, GridBagConstraints.SOUTH);
		
		JButton btnReintentar  = new JButton("Reintentar");
		adjustButton(btnReintentar, c, con, 0, 1, 1, 1, 1.0, 0.0, GridBagConstraints.CENTER,GridBagConstraints.NONE);
		
		fVE1.setSize(400,200); 
		fVE1.setTitle("Consultorio Dental: Advertencia");
		fVE1.setResizable(false);
		fVE1.setVisible(true);
		fVE1.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
