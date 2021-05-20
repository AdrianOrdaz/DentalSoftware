package consultorioDental;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class vistaAgendarCita extends metodosDiseño implements ActionListener 
{
	public static void main(String[]args)
	{
		vistaAgendarCita vAC = new vistaAgendarCita();
		vAC.crearAC();
	}
	
	private void crearAC()
	{
		JFrame fAC = new JFrame("Consultorio Dental/Agendar Cita");
		Container con = new Container();
		con = fAC.getContentPane();
		GridBagConstraints c = new GridBagConstraints();
		con.setLayout(new GridBagLayout());
		
		//(X,Y,ancho,alto,anchoy,anchox)
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
		
		JTextField jtPaciente = new JTextField(15);
		adjustTextField(jtPaciente, c, con, 1, 1, 3, 1, 1.0, 0.0,GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL);
		
		JTextField jtFecha = new JTextField(15);
		adjustTextField(jtFecha, c, con, 1, 2, 3, 1, 1.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL);
		
		JTextField jtHora = new JTextField(15);
		adjustTextField(jtHora, c, con, 1, 3, 3, 1, 1.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL);
		
		JTextField jtDentista = new JTextField(15);
		adjustTextField(jtDentista, c, con, 1, 4, 3, 1, 1.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL);
		
		JButton btnAgendarCita = new JButton("Agendar Cita");
		GridBagConstraints gbc_btnAgendarCita = new GridBagConstraints();
		gbc_btnAgendarCita.gridx = 3;
		gbc_btnAgendarCita.gridy = 5;
		gbc_btnAgendarCita.gridwidth = 1;
		gbc_btnAgendarCita.gridheight = 1;
		gbc_btnAgendarCita.weighty = 1.0;
		gbc_btnAgendarCita.fill = GridBagConstraints.NONE;
		fAC.getContentPane().add(btnAgendarCita, gbc_btnAgendarCita);
		
		//buttonHome(c, con, 3, 6, 1, 1, 0.0, 1.0, GridBagConstraints.CENTER);
		
		JButton btnHome = new JButton("'Home'");
		GridBagConstraints gbc_btnHome = new GridBagConstraints();
		gbc_btnHome.gridx = 4;
		gbc_btnHome.gridy = 6;
		gbc_btnHome.gridwidth = 1;
		gbc_btnHome.gridheight = 1;
		gbc_btnHome.weighty = 1.0;
		gbc_btnHome.weightx = 1.0;
		gbc_btnHome.fill = GridBagConstraints.NONE;
		fAC.getContentPane().add(btnHome, gbc_btnHome);
		
		jtPaciente.setEditable(true);
		jtFecha.setEditable(true);
		jtHora.setEditable(true);
		jtDentista.setEditable(true);
		
		fAC.pack();
		fAC.setExtendedState(JFrame.MAXIMIZED_BOTH);
		fAC.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fAC.setVisible(true);
		con.setBackground(Color.WHITE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
