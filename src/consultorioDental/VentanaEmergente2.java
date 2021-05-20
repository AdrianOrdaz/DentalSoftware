package consultorioDental;

import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VentanaEmergente2 extends MetodosDiseño implements ActionListener 
{
	public static void main(String[]args) 
	{
		VentanaEmergente2 vE2 = new VentanaEmergente2();
		vE2.crearVE2();
	}
	
	private void crearVE2()
	{
		JFrame fVE2 = new JFrame("Consultorio Dental/Advertencia");
		Container con = new Container();
		con = fVE2.getContentPane();
		GridBagConstraints c = new GridBagConstraints();
		con.setLayout(new GridBagLayout());
		
		JLabel lbAdvertencia = new JLabel("Haz alcanzado el limite de intentos, la ventana se cerrara.");
		adjustComponents(c, 0, 0, 1, 1, 1.0, 0.0, GridBagConstraints.CENTER);
		con.add(lbAdvertencia,c);
		
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
