package consultorioDental;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AgregarDentista extends MetodosDiseño implements ActionListener{
	JFrame fAD;
	JButton btnAgregar;
	JTextField jtID;
	JTextField jtNombre;
	JTextField jtEstudios;
	JTextField jtHorario;
	JTextField jtNumTel;
	JTextField jtSueldo;
	JTextField jtEmail;
	JTextField jtDireccion;
	
	public static void main(String[]args)
	{
		AgregarDentista vAD = new AgregarDentista();
		vAD.crearfAD();
	}
	
	protected JFrame crearfAD()
	{
		fAD = new JFrame("Consultorio Dental/Agregar Dentista");
		Container con = new Container();
		con = fAD.getContentPane();
		GridBagConstraints c = new GridBagConstraints();
		con.setLayout(new GridBagLayout());
		
		//(X,Y,ancho,alto,anchoy,anchox)
		JLabel lbInformacionDentista = new JLabel("Agregar Dentista");
		lbInformacionDentista.setFont (lbInformacionDentista.getFont ().deriveFont (40.0f));
		adjustComponents(c, 0, 0, 4, 1, 1.0, 1.0, GridBagConstraints.NORTH);
		con.add(lbInformacionDentista,c);
		//ID
		//JLabel lbID = new JLabel("ID: ");
		//lbID.setFont (lbID.getFont ().deriveFont (21.0f));
		//adjustComponents(c, 0, 1, 1, 1, 1.0, 1.0, GridBagConstraints.EAST);
		//con.add(lbID,c);
	
		JLabel lbNombre = new JLabel("Nombre: ");
		lbNombre.setFont (lbNombre.getFont ().deriveFont (21.0f));
		adjustComponents(c, 0, 1, 1, 1, 1.0, 1.0, GridBagConstraints.EAST);
		con.add(lbNombre,c);
		
		JLabel lbEstudios = new JLabel("Estudios: ");
		lbEstudios.setFont (lbEstudios.getFont ().deriveFont (21.0f));
		adjustComponents(c, 0, 2, 1, 1, 1.0, 1.0, GridBagConstraints.EAST);
		con.add(lbEstudios,c);
		
		JLabel lbNumTel = new JLabel("Telefono: ");
		lbNumTel.setFont (lbNumTel.getFont ().deriveFont (21.0f));
		adjustComponents(c, 0, 3, 1, 1, 1.0, 1.0, GridBagConstraints.EAST);
		con.add(lbNumTel,c);
		
		JLabel lbHorario = new JLabel("Horario: ");
		lbHorario.setFont (lbHorario.getFont ().deriveFont (21.0f));
		adjustComponents(c, 2, 1, 1, 1, 0.0, 1.0, GridBagConstraints.CENTER);
		con.add(lbHorario,c);
		
		JLabel lbSueldo = new JLabel("Sueldo: ");
		lbSueldo.setFont (lbSueldo.getFont ().deriveFont (21.0f));
		adjustComponents(c, 2, 2, 1, 1, 0.0, 1.0, GridBagConstraints.CENTER);
		con.add(lbSueldo,c);
		
		JLabel lbEmail = new JLabel("Email: ");
		lbEmail.setFont (lbEmail.getFont ().deriveFont (21.0f));
		adjustComponents(c, 2, 3, 1, 1, 0.0, 1.0, GridBagConstraints.CENTER);
		con.add(lbEmail,c);
		
		JLabel lbDireccion = new JLabel("Direccion: ");
		lbDireccion.setFont (lbDireccion.getFont ().deriveFont (21.0f));
		adjustComponents(c, 0, 4, 1, 1, 1.0, 1.0, GridBagConstraints.EAST);
		con.add(lbDireccion,c);
				
		jtNombre = new JTextField(15);
		adjustTextField(jtNombre, c, con, 1, 1, 1, 1, 0.0, 1.0, GridBagConstraints.CENTER);
		
		jtEstudios = new JTextField(15);
		adjustTextField(jtEstudios, c, con, 1, 2, 1, 1, 0.0, 1.0, GridBagConstraints.CENTER);

		jtNumTel = new JTextField(15);
		adjustTextField(jtNumTel, c, con, 1, 3, 1, 1, 0.0, 1.0, GridBagConstraints.CENTER);

		jtHorario = new JTextField(15);
		adjustTextField(jtHorario, c, con, 3, 1, 1, 1, 0.0, 1.0, GridBagConstraints.WEST);

		jtSueldo = new JTextField(15);
		adjustTextField(jtSueldo, c, con, 3, 2, 1, 1, 0.0, 1.0, GridBagConstraints.WEST);

		jtEmail = new JTextField(15);
		adjustTextField(jtEmail, c, con, 3, 3, 1, 1, 0.0, 1.0, GridBagConstraints.WEST);

		jtDireccion = new JTextField(15);
		adjustTextField(jtDireccion, c, con, 1, 4, 1, 1, 0.0, 1.0, GridBagConstraints.CENTER);
		
		//Botones
		btnAgregar  = new JButton("Agregar");
		c.insets = new Insets(0,250,0,0);
		adjustButton(btnAgregar,c,con,1,6,1,1,1.0,1.0,GridBagConstraints.EAST);
		c.insets = new Insets(0,0,0,0);
		
		Dentistas den = new Dentistas();
		buttonRegresar(den.crearfD(),fAD,c,con,2,6,1,1,0.0,1.0,GridBagConstraints.EAST);		
		buttonHome(fAD,true,c, con, 3, 6, 1, 1, 0.0, 1.0, GridBagConstraints.CENTER);
		
		btnAgregar.addActionListener(this);
		
		fAD.pack();
		fAD.setExtendedState(JFrame.MAXIMIZED_BOTH);
		fAD.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fAD.setVisible(true);
		den.fD.setVisible(false);
		con.setBackground(Color.WHITE);
		return fAD;
	}
	
	boolean soloLetras(String str)
	{
		Pattern p = Pattern.compile("^[ A-Za-z]+$");
		Matcher m = p.matcher(str);
		return m.matches();
	}
	
	boolean soloNumeros(String str)
	{
		Pattern p = Pattern.compile("[0-9]+");
		Matcher m = p.matcher(str);
		return m.matches();
	}
	
	boolean numYLetras(String str)
	{
		Pattern p = Pattern.compile("^[a-zA-Z0-9]+$");
		Matcher m = p.matcher(str);
		return m.matches();
	}
	
	boolean sueldo(String str)
	{
		Pattern p = Pattern.compile("^(\\d*\\.)?\\d+$");
		Matcher m = p.matcher(str);
		return m.matches();
	}

	public void actionPerformed(ActionEvent e) 
	{	
		String ok = null;
		String nombre = jtNombre.getText();
		String hor=jtHorario.getText();
		String mail=jtEmail.getText();
		String sldo =jtSueldo.getText();
		String dir =jtDireccion.getText();
		String tel =jtNumTel.getText();
		String est = jtEstudios.getText();
		if(soloLetras(nombre)==false || nombre.length()>35 || nombre == null)
		{
			ok="nombre";
		}
		
		if(hor.length()>30 || hor==null)
		{
			ok="horario";
		}
		
		if(mail.length()>4405 || mail ==null)
		{
			ok="mail";
		}
		
		if(sueldo(sldo)==false || sldo.length()>8|| sldo == null)
		{
			ok="sueldo";
		}
		
		if(dir.length()>70 || dir==null)
		{
			ok="direccion";
		}
		
		if(est.length()>70 || est==null)
		{
			ok="direccion";
		}
		
		if(soloNumeros(tel)==false || tel.length()>10 || tel == null)
		{
			ok="telefono";
		}
		if(ok==null)
		{
			subirFilaCol7("dentistas","nom_den","est_den","hor_den","sldo_den","dir_den","tel_den","mail_den",
					jtNombre.getText(),jtEstudios.getText(), jtHorario.getText(), jtSueldo.getText(), 
					jtDireccion.getText(), jtNumTel.getText(),jtEmail.getText());
			emptyJT(jtNombre,jtEstudios,jtHorario,jtSueldo,jtDireccion,jtNumTel,jtEmail,new JTextField());
		}else
		{
			ErrorDeValidacion edv = new ErrorDeValidacion();
			edv.crearVE1(ok);
		}
	}       
}
