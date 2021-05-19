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

public class vistaInformacionDentista extends metDiseño implements ActionListener 
{
	public static void main(String[]args)
	{
		crearfID();
	}
	
	private static void crearfID()
	{
		vistaInformacionDentista fID = new vistaInformacionDentista();
		Container con = new Container();
		con = fID.getContentPane();
		GridBagConstraints c = new GridBagConstraints();
		con.setLayout(new GridBagLayout());
		
		//(X,Y,ancho,alto,anchoy,anchox)
		JLabel lbInformacionDentista = new JLabel("Informacion del Dentista");
		lbInformacionDentista.setFont (lbInformacionDentista.getFont ().deriveFont (41.0f));
		adjustLabel(lbInformacionDentista, c, con, 1, 0, 3, 1, 1.0, 1.0, GridBagConstraints.EAST);
		
		//ID
		JLabel lbID = new JLabel(" ID: ");
		lbID.setFont (lbID.getFont ().deriveFont (21.0f));
		adjustLabel(lbID, c, con, 0, 1, 1, 1, 1.0, 0.0, GridBagConstraints.CENTER);
	
		JTextField jtID = new JTextField(15);
		adjustTextField(jtID, c, con, 1, 1, 1, 1, 1.0, 1.0,GridBagConstraints.CENTER,GridBagConstraints.HORIZONTAL);
		
		
		//Nombre
		JLabel lbNombre = new JLabel(" Nombre: ");
		lbNombre.setFont (lbNombre.getFont ().deriveFont (21.0f));
		adjustLabel(lbNombre, c, con, 0, 2, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER);
		
		JTextField jtNombre = new JTextField(15);
		adjustTextField(jtNombre, c, con, 1, 2, 1, 1, 1.0, 0.0, GridBagConstraints.CENTER,GridBagConstraints.HORIZONTAL);
		
		//Estudios
		JLabel lbEstudios = new JLabel(" Estudios: ");
		lbEstudios.setFont (lbEstudios.getFont ().deriveFont (21.0f));
		adjustLabel(lbEstudios, c, con, 0, 3, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER);

		JTextField jtEstudios = new JTextField(15);
		adjustTextField(jtEstudios, c, con, 1, 3, 1, 1, 1.0, 0.0, GridBagConstraints.CENTER,GridBagConstraints.HORIZONTAL);
		
		//Num Tel
		JLabel lbNumTel = new JLabel(" NumTel: ");
		lbNumTel.setFont (lbNumTel.getFont ().deriveFont (21.0f));
		adjustLabel(lbNumTel, c, con, 0, 4, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER);

		JTextField jtNumTel = new JTextField(15);
		adjustTextField(jtNumTel, c, con, 1, 4, 1, 1, 1.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL);
		
		//Horario
		JLabel lbHorario = new JLabel("Horario: ");
		lbHorario.setFont (lbHorario.getFont ().deriveFont (21.0f));
		adjustLabel(lbHorario, c, con, 3, 1, 1, 1, 0.0, 0.0, GridBagConstraints.EAST);

		JTextField jtHorario = new JTextField(15);
		adjustTextField(jtHorario, c, con, 4, 1, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL);
		
		//Sueldo
		JLabel lbSueldo = new JLabel("Sueldo: ");
		lbSueldo.setFont (lbSueldo.getFont ().deriveFont (21.0f));
		adjustLabel(lbSueldo, c, con, 3, 2, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER);

		JTextField jtSueldo = new JTextField(15);
		adjustTextField(jtSueldo, c, con, 4, 2, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL);
		
		//Email
		JLabel lbEmail = new JLabel("Email: ");
		lbEmail.setFont (lbEmail.getFont ().deriveFont (21.0f));
		adjustLabel(lbEmail, c, con, 3, 3, 1, 1, 0.0, 0.0, GridBagConstraints.WEST);

		JTextField jtEmail = new JTextField(15);
		adjustTextField(jtEmail, c, con, 4, 3, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL);
		
		//Direccion
		JLabel lbDireccion = new JLabel("Direccion: ");
		lbDireccion.setFont (lbDireccion.getFont ().deriveFont (21.0f));
		adjustLabel(lbDireccion, c, con, 3, 4, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER);

		JTextField jtDireccion = new JTextField(15);
		adjustTextField(jtDireccion, c, con, 4, 4, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL);
		
		//Botones
		JButton btnAgregarDentista  = new JButton("Agregar");
		adjustButton(btnAgregarDentista, c, con, 2, 6, 1, 1, 1.0, 0.0, GridBagConstraints.CENTER,GridBagConstraints.NONE);
		
		JButton btnRegresarDentistas  = new JButton("Dentistas");
		adjustButton(btnRegresarDentistas, c, con, 5, 6, 1, 1, 1.0, 0.5, GridBagConstraints.CENTER,GridBagConstraints.NONE);
				
		
		jtID.setEditable(true);
		jtNombre.setEditable(true);
		jtEstudios.setEditable(true);
		jtNumTel.setEditable(true);
		jtHorario.setEditable(true);
		jtSueldo.setEditable(true);
		jtEmail.setEditable(true);
		jtDireccion.setEditable(true);
		
		buttonHome(c, con, 5, 7, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER);
		fID.pack();
		fID.setExtendedState(JFrame.MAXIMIZED_BOTH);
		fID.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fID.setVisible(true);
		con.setBackground(Color.WHITE);
	
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
