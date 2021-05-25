package consultorioDental;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VentanaEmergente1 extends MetodosDiseño implements ActionListener 
{
	public static void main(String[]args) 
	{
		VentanaEmergente1 vE1 = new VentanaEmergente1();
		vE1.crearVE1();
	}
	
	void crearVE1()
	{
		JFrame fVE1 = new JFrame("Consultorio Dental/Advertencia");
		Container con = new Container();
		con = fVE1.getContentPane();
		GridBagConstraints c = new GridBagConstraints();
		con.setLayout(new GridBagLayout());
		
		JLabel lbAdvertencia = new JLabel("El usuario y/o contraseña es incorrecto");
		adjustComponents(c, 0, 0, 1, 1, 1.0, 0.0, GridBagConstraints.SOUTH);
		con.add(lbAdvertencia,c);
		
		JButton btnReintentar  = new JButton("Reintentar");
		adjustButton(btnReintentar, c, con, 0, 1, 1, 1, 1.0, 0.0, GridBagConstraints.CENTER);
		btnReintentar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				fVE1.setVisible(false);
			}
		});
		
		fVE1.setSize(400,200); 
		fVE1.setTitle("Consultorio Dental: Advertencia");
		fVE1.setResizable(false);
		fVE1.setVisible(true);
		fVE1.setDefaultCloseOperation(EXIT_ON_CLOSE);
		fVE1.setBackground(Color.white);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		
	}
}