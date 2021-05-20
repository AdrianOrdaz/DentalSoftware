package consultorioDental;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
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
		crearAC();
	}
	
	private static void crearAC()
	{
		vistaAgendarCita fAC = new vistaAgendarCita();
		Container con = new Container();
		con = fAC.getContentPane();
		GridBagConstraints c = new GridBagConstraints();
		con.setLayout(new GridBagLayout());
		
		//(X,Y,ancho,alto,anchoy,anchox)
		JLabel lbAgendarCita = new JLabel("Agendar Cita");
		lbAgendarCita.setFont (lbAgendarCita.getFont ().deriveFont (41.0f));
		adjustLabel(lbAgendarCita, c, con, 1, 0, 2, 1, 1.0, 1.0, GridBagConstraints.CENTER);
		
		//Paciente
		JLabel lbPaciente = new JLabel("  Paciente: ");
		lbPaciente.setFont (lbPaciente.getFont ().deriveFont (21.0f));
		adjustLabel(lbPaciente, c, con, 0, 1, 1, 1, 1.0, 0.0, GridBagConstraints.CENTER);
	
		JTextField jtPaciente = new JTextField(15);
		adjustLargeTextField(jtPaciente, c, con, 1, 1, 1, 1, 1.0, 1.0,GridBagConstraints.CENTER,GridBagConstraints.HORIZONTAL);
		
		
		//Fecha
		JLabel lbFecha = new JLabel("  Fecha: ");
		lbFecha.setFont (lbFecha.getFont ().deriveFont (21.0f));
		adjustLabel(lbFecha, c, con, 0, 2, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER);
		
		JTextField jtFecha = new JTextField(15);
		adjustLargeTextField(jtFecha, c, con, 1, 2, 1, 1, 1.0, 0.0, GridBagConstraints.CENTER);
		GridBagConstraints gbc_jtFecha = new GridBagConstraints();
		gbc_jtFecha.anchor = GridBagConstraints.CENTER;
		
		
		//Hora
		JLabel lbHora = new JLabel("  Hora: ");
		lbHora.setFont (lbHora.getFont ().deriveFont (21.0f));
		adjustLabel(lbHora, c, con, 0, 3, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER);

		JTextField jtHora = new JTextField(15);
		adjustTextField(jtHora, c, con, 1, 3, 1, 1, 1.0, 0.0, GridBagConstraints.CENTER,GridBagConstraints.HORIZONTAL);
		
		//Dentista
		JLabel lbDentista = new JLabel("  Dentista: ");
		lbDentista.setFont (lbDentista.getFont ().deriveFont (21.0f));
		adjustLabel(lbDentista, c, con, 0, 4, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER);

		JTextField jtDentista = new JTextField(15);
		adjustTextField(jtDentista, c, con, 1, 4, 1, 1, 1.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL);
		
		//Botones
		JButton btnAgendarCita  = new JButton("Agendar Cita");
		adjustButton(btnAgendarCita, c, con, 1, 6, 1, 1, 1.0, 0.0, GridBagConstraints.CENTER,GridBagConstraints.NONE);
		
		
		jtPaciente.setEditable(true);
		jtFecha.setEditable(true);
		jtHora.setEditable(true);
		jtDentista.setEditable(true);
		
		buttonHome(c, con, 3, 6, 1, 1, 0.0, 1.0, GridBagConstraints.CENTER);
		
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
