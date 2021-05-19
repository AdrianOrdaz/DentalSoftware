package consultorioDental;

import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ventanaEmergente2 extends metDiseño implements ActionListener 
{
	public static void main(String[]args) 
	{
		crearVE2();
	}
	
	private static void crearVE2()
	{
		ventanaEmergente1 fVE2 = new ventanaEmergente1();
		Container con = new Container();
		con = fVE2.getContentPane();
		GridBagConstraints c = new GridBagConstraints();
		con.setLayout(new GridBagLayout());
		
		JLabel lbAdvertencia = new JLabel("Haz llegado al limite de intentos, la aplicacion se cerrara.");
		adjustLabel(lbAdvertencia, c, con, 0, 0, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER);
		
		
		fVE2.setSize(400,200); 
		fVE2.setTitle("Consultorio Dental: Advertencia");
		fVE2.setResizable(false);
		fVE2.setVisible(true);
		fVE2.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
