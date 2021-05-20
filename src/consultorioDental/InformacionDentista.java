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

public class InformacionDentista extends MetodosDiseño implements ActionListener 
{
	public static void main(String[]args)
	{
		InformacionDentista vID = new InformacionDentista();
		vID.crearfID();
	}
	
	private void crearfID()
	{
		JFrame fID = new JFrame("Consultorio Dental/Informacion Dentista");
		Container con = new Container();
		con = fID.getContentPane();
		GridBagConstraints c = new GridBagConstraints();
		con.setLayout(new GridBagLayout());
		
		//(X,Y,ancho,alto,anchoy,anchox)
		JLabel lbInformacionDentista = new JLabel("Informacion del Dentista");
		lbInformacionDentista.setFont (lbInformacionDentista.getFont ().deriveFont (41.0f));
		adjustComponents(c, 1, 0, 3, 1, 1.0, 1.0, GridBagConstraints.EAST);
		con.add(lbInformacionDentista,c);
		//ID
		JLabel lbID = new JLabel("ID: ");
		lbID.setFont (lbID.getFont ().deriveFont (21.0f));
		adjustComponents(c, 0, 1, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER);
		con.add(lbID,c);
	
		JLabel lbNombre = new JLabel("Nombre: ");
		lbNombre.setFont (lbNombre.getFont ().deriveFont (21.0f));
		adjustComponents(c, 0, 2, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER);
		con.add(lbNombre,c);
		
		JLabel lbEstudios = new JLabel("Estudios: ");
		lbEstudios.setFont (lbEstudios.getFont ().deriveFont (21.0f));
		adjustComponents(c, 0, 3, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER);
		con.add(lbEstudios,c);
		
		JLabel lbNumTel = new JLabel("NumTel: ");
		lbNumTel.setFont (lbNumTel.getFont ().deriveFont (21.0f));
		adjustComponents(c, 0, 4, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER);
		con.add(lbNumTel,c);
		
		JLabel lbHorario = new JLabel("Horario: ");
		lbHorario.setFont (lbHorario.getFont ().deriveFont (21.0f));
		adjustComponents(c, 3, 1, 1, 1, 0.0, 0.0, GridBagConstraints.EAST);
		con.add(lbHorario,c);
		
		JLabel lbSueldo = new JLabel("Sueldo: ");
		lbSueldo.setFont (lbSueldo.getFont ().deriveFont (21.0f));
		adjustComponents(c, 3, 2, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER);
		con.add(lbSueldo,c);
		
		JLabel lbEmail = new JLabel("Email: ");
		lbEmail.setFont (lbEmail.getFont ().deriveFont (21.0f));
		adjustComponents(c, 3, 3, 1, 1, 0.0, 0.0, GridBagConstraints.WEST);
		con.add(lbEmail,c);
		
		JLabel lbDireccion = new JLabel("Direccion: ");
		lbDireccion.setFont (lbDireccion.getFont ().deriveFont (21.0f));
		adjustComponents(c, 3, 4, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER);
		con.add(lbDireccion,c);
		
		JTextField jtID = new JTextField(15);
		adjustTextField(jtID, c, con, 1, 1, 1, 1, 1.0, 1.0,GridBagConstraints.CENTER,GridBagConstraints.HORIZONTAL);
				
		JTextField jtNombre = new JTextField(15);
		adjustTextField(jtNombre, c, con, 1, 2, 1, 1, 1.0, 0.0, GridBagConstraints.CENTER,GridBagConstraints.HORIZONTAL);
		
		JTextField jtEstudios = new JTextField(15);
		adjustTextField(jtEstudios, c, con, 1, 3, 1, 1, 1.0, 0.0, GridBagConstraints.CENTER,GridBagConstraints.HORIZONTAL);

		JTextField jtNumTel = new JTextField(15);
		adjustTextField(jtNumTel, c, con, 1, 4, 1, 1, 1.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL);

		JTextField jtHorario = new JTextField(15);
		adjustTextField(jtHorario, c, con, 4, 1, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL);

		JTextField jtSueldo = new JTextField(15);
		adjustTextField(jtSueldo, c, con, 4, 2, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL);

		JTextField jtEmail = new JTextField(15);
		adjustTextField(jtEmail, c, con, 4, 3, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL);

		JTextField jtDireccion = new JTextField(15);
		adjustTextField(jtDireccion, c, con, 4, 4, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL);
		
		//Botones
		JButton btnModificar  = new JButton("Modificar");
		GridBagConstraints gbc_btnModificar = new GridBagConstraints();
		gbc_btnModificar.gridx = 2;
		gbc_btnModificar.gridy = 6;
		gbc_btnModificar.gridwidth = 1;
		gbc_btnModificar.gridheight = 1;
		gbc_btnModificar.weighty = 1.0;
		gbc_btnModificar.fill = GridBagConstraints.NONE;
		fID.getContentPane().add(btnModificar, gbc_btnModificar);
		
		JButton btnRegresar = new JButton("Regresar");
		GridBagConstraints gbc_btnRegresar = new GridBagConstraints();
		gbc_btnRegresar.gridx = 5;
		gbc_btnRegresar.gridy = 6;
		gbc_btnRegresar.gridwidth = 1;
		gbc_btnRegresar.gridheight = 1;
		gbc_btnRegresar.weighty = 1.0;
		gbc_btnRegresar.weightx = 1.0;
		gbc_btnRegresar.fill = GridBagConstraints.NONE;
		fID.getContentPane().add(btnRegresar, gbc_btnRegresar);
				
		
		jtID.setEditable(false);
		jtNombre.setEditable(false);
		jtEstudios.setEditable(false);
		jtNumTel.setEditable(false);
		jtHorario.setEditable(false);
		jtSueldo.setEditable(false);
		jtEmail.setEditable(false);
		jtDireccion.setEditable(false);
		
		//buttonHome(c, con, 5, 7, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER);
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
