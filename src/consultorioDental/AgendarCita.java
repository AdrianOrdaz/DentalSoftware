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

public class AgendarCita extends MetodosDiseño implements ActionListener 
{
	public static void main(String[]args)
	{
		AgendarCita ac = new AgendarCita();
		ac.crearAC();
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
		
		JTextField jtPaciente = new JTextField(15);
		adjustTextField(jtPaciente, c, con, 1, 1, 3, 1, 1.0, 0.0,GridBagConstraints.CENTER);
		
		JTextField jtFecha = new JTextField(15);
		adjustTextField(jtFecha, c, con, 1, 2, 3, 1, 1.0, 0.0, GridBagConstraints.CENTER);
		
		JTextField jtHora = new JTextField(15);
		adjustTextField(jtHora, c, con, 1, 3, 3, 1, 1.0, 0.0, GridBagConstraints.CENTER);
		
		JTextField jtDentista = new JTextField(15);
		adjustTextField(jtDentista, c, con, 1, 4, 3, 1, 1.0, 0.0, GridBagConstraints.CENTER);
		
		JButton btnAgendarCita = new JButton("Agendar Cita");
		GridBagConstraints gbc_btnAgendarCita = new GridBagConstraints();
		adjustButton(btnAgendarCita,gbc_btnAgendarCita,con,3,5,1,1,1.0,00.,GridBagConstraints.CENTER);
		
		GridBagConstraints gbc_btnHome = new GridBagConstraints();
		buttonHome(fAC,true,gbc_btnHome,con,4,6,1,1,1.0,1.0,GridBagConstraints.CENTER);
		
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
