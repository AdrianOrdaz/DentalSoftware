package consultorioDental;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Font;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;

public class AgregarUsuario extends MetodosDiseño implements ActionListener {

	JPanel contentPane;
	JTextField jtIdUsuario;
	JTextField jtNombre;
	JTextField jtHorario;
	JTextField jtCorreo;
	JTextField jtContraseña;
	JTextField jtSueldoquincenal;
	JTextField jtDireccion;
	JTextField jtTelefono;
	ButtonGroup bg;
	JRadioButton jrb;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AgregarUsuario frame = new AgregarUsuario();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	protected AgregarUsuario() {
		setTitle("Gestionar Usuario/Agregar Usuario");
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lbAgregarUsuario = new JLabel("Agregar Usuario");
		lbAgregarUsuario.setFont(new Font("Open Sans", Font.PLAIN, 40));
		GridBagConstraints gbc_lbAgregarUsuario = new GridBagConstraints();
		gbc_lbAgregarUsuario.anchor = GridBagConstraints.NORTH;
		gbc_lbAgregarUsuario.gridx = 2;
		gbc_lbAgregarUsuario.gridy = 0;
		gbc_lbAgregarUsuario.weighty = 1.0;
		contentPane.add(lbAgregarUsuario, gbc_lbAgregarUsuario);
		
		JLabel lbCompleteCampos = new JLabel("Completa obligatoriamente los siguientes campos*");
		lbCompleteCampos.setFont(new Font("Tahoma", Font.ITALIC, 14));
		GridBagConstraints gbc_lbCompleteCampos = new GridBagConstraints();
		gbc_lbCompleteCampos.gridx = 2;
		gbc_lbCompleteCampos.gridy = 1;
		gbc_lbCompleteCampos.weighty = 1.0;
		contentPane.add(lbCompleteCampos, gbc_lbCompleteCampos);
		
		bg = new ButtonGroup();
		GridBagConstraints c= new GridBagConstraints();
		JRadioButton cbAplicar = new JRadioButton("Administrador");
		JRadioButton cbAplicar2 = new JRadioButton("Usuario");
		bg.add(cbAplicar);
		bg.add(cbAplicar2);
		adjustComponents(c, 2, 2, 1, 1, 0.0, 0.0, GridBagConstraints.WEST);
	    contentPane.add(cbAplicar,c);
		adjustComponents(c, 2, 2, 1, 1, 0.0, 0.0, GridBagConstraints.EAST);
	    contentPane.add(cbAplicar2,c);
		
		JLabel lbNombre = new JLabel("Nombre*:");
		lbNombre.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lbNombre = new GridBagConstraints();
		gbc_lbNombre.anchor = GridBagConstraints.EAST;
		gbc_lbNombre.weighty = 1.0;
		gbc_lbNombre.gridx = 1;
		gbc_lbNombre.gridy = 3;
		contentPane.add(lbNombre, gbc_lbNombre);
		
		jtNombre = new JTextField();
		jtNombre.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_jtNombre = new GridBagConstraints();
		gbc_jtNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtNombre.gridx = 2;
		gbc_jtNombre.gridy = 3;
		contentPane.add(jtNombre, gbc_jtNombre);
		jtNombre.setColumns(5);
		
		JLabel lbHorario = new JLabel("Horario*:");
		lbHorario.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lbHorario = new GridBagConstraints();
		gbc_lbHorario.anchor = GridBagConstraints.EAST;
		gbc_lbHorario.weighty = 1.0;
		gbc_lbHorario.gridx = 1;
		gbc_lbHorario.gridy = 4;
		contentPane.add(lbHorario, gbc_lbHorario);
		
		jtHorario = new JTextField();
		jtHorario.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_jtHorario = new GridBagConstraints();
		gbc_jtHorario.weighty = 1.0;
		gbc_jtHorario.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtHorario.gridx = 2;
		gbc_jtHorario.gridy = 4;
		contentPane.add(jtHorario, gbc_jtHorario);
		jtHorario.setColumns(5);
		
		JLabel lbCorreo = new JLabel("Correo Electr\u00F3nico*:");
		lbCorreo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lbCorreo = new GridBagConstraints();
		gbc_lbCorreo.anchor = GridBagConstraints.EAST;
		gbc_lbCorreo.weighty = 1.0;
		gbc_lbCorreo.gridx = 1;
		gbc_lbCorreo.gridy = 5;
		contentPane.add(lbCorreo, gbc_lbCorreo);
		
		jtCorreo = new JTextField();
		jtCorreo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_jtCorreo = new GridBagConstraints();
		gbc_jtCorreo.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtCorreo.gridx = 2;
		gbc_jtCorreo.gridy = 5;
		contentPane.add(jtCorreo, gbc_jtCorreo);
		jtCorreo.setColumns(5);
		
		JLabel lbContraseña = new JLabel("Contrase\u00F1a*:");
		lbContraseña.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lbContraseña = new GridBagConstraints();
		gbc_lbContraseña.anchor = GridBagConstraints.EAST;
		gbc_lbContraseña.weighty = 1.0;
		gbc_lbContraseña.gridx = 1;
		gbc_lbContraseña.gridy = 6;
		contentPane.add(lbContraseña, gbc_lbContraseña);
		
		jtContraseña = new JTextField();
		jtContraseña.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_jtContraseña = new GridBagConstraints();
		gbc_jtContraseña.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtContraseña.gridx = 2;
		gbc_jtContraseña.gridy = 6;
		contentPane.add(jtContraseña, gbc_jtContraseña);
		jtContraseña.setColumns(5);
		
		JLabel lbSueldoquincenal = new JLabel("Sueldo quincenal*:");
		lbSueldoquincenal.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lbSueldoquincenal = new GridBagConstraints();
		gbc_lbSueldoquincenal.anchor = GridBagConstraints.EAST;
		gbc_lbSueldoquincenal.weighty = 1.0;
		gbc_lbSueldoquincenal.gridx = 1;
		gbc_lbSueldoquincenal.gridy = 7;
		contentPane.add(lbSueldoquincenal, gbc_lbSueldoquincenal);
		
		jtSueldoquincenal = new JTextField();
		jtSueldoquincenal.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_jtSueldoquincenal = new GridBagConstraints();
		gbc_jtSueldoquincenal.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtSueldoquincenal.gridx = 2;
		gbc_jtSueldoquincenal.gridy = 7;
		contentPane.add(jtSueldoquincenal, gbc_jtSueldoquincenal);
		jtSueldoquincenal.setColumns(5);
		
		JLabel lbDireccion = new JLabel("Direcci\u00F3n*:");
		lbDireccion.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lbDireccion = new GridBagConstraints();
		gbc_lbDireccion.anchor = GridBagConstraints.EAST;
		gbc_lbDireccion.weighty = 1.0;
		gbc_lbDireccion.gridx = 1;
		gbc_lbDireccion.gridy = 8;
		contentPane.add(lbDireccion, gbc_lbDireccion);
		
		jtDireccion = new JTextField();
		jtDireccion.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_jtDireccion = new GridBagConstraints();
		gbc_jtDireccion.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtDireccion.gridx = 2;
		gbc_jtDireccion.gridy = 8;
		contentPane.add(jtDireccion, gbc_jtDireccion);
		jtDireccion.setColumns(5);
		
		JLabel lbTelefono = new JLabel("Tel\u00E9fono*:");
		lbTelefono.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lbTelefono = new GridBagConstraints();
		gbc_lbTelefono.anchor = GridBagConstraints.EAST;
		gbc_lbTelefono.weighty = 1.0;
		gbc_lbTelefono.gridx = 1;
		gbc_lbTelefono.gridy = 9;
		contentPane.add(lbTelefono, gbc_lbTelefono);
		
		jtTelefono = new JTextField();
		jtTelefono.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_jtTelefono = new GridBagConstraints();
		gbc_jtTelefono.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtTelefono.gridx = 2;
		gbc_jtTelefono.gridy = 9;
		contentPane.add(jtTelefono, gbc_jtTelefono);
		jtTelefono.setColumns(5);
		
		JButton btnAgregar = new JButton("Agregar");
		GridBagConstraints gbc_btnAgregar = new GridBagConstraints();
		gbc_btnAgregar.insets = new Insets(0, 0, 5, 5);
		adjustButton(btnAgregar,gbc_btnAgregar,contentPane,2,10,1,1,0.0,0.0,GridBagConstraints.CENTER);
		btnAgregar.addActionListener(this);
		
		buttonHome(this,false,new GridBagConstraints(),contentPane,2,11,1,1,1.0,0.0,GridBagConstraints.EAST);
		buttonRegresar(new GestionarUsuario(),this,new GridBagConstraints(),contentPane,1,11,1,1,0.0,0.0,GridBagConstraints.EAST);
		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setExtendedState(MAXIMIZED_BOTH);
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
	
	public void actionPerformed(ActionEvent e) {
		String ok = null;
		jrb = getSelection(bg);
		String s;
		if(jrb.getText() == "Administrador") {
			s = "1";
		}
		else {
			s = "0";
		}
		String nombre = jtNombre.getText();
		String contr= jtContraseña.getText();
		String hor=jtHorario.getText();
		String mail=jtCorreo.getText();
		String sldo =jtSueldoquincenal.getText();
		String dir =jtDireccion.getText();
		String tel =jtTelefono.getText();
		if(soloLetras(nombre)==false || nombre.length()>35 || nombre == null)
		{
			ok="nombre";
		}
		
		if(numYLetras(contr)==false || contr.length()>25 || contr ==null)
		{
			ok="contrasena";
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
		
		if(soloNumeros(tel)==false || tel.length()>10 || tel == null)
		{
			ok="telefono";
		}
		
		if(ok==null)
		{
			subirFilaCol8("admin","nom_usu","contr_usu","hor_usu","mail_usu","sldo_usu","dir_usu","tel_usu","admin_usu",
					nombre,contr,hor,mail,sldo,dir,tel,s);
			emptyJT(jtNombre,jtContraseña,jtHorario,jtCorreo,jtSueldoquincenal,jtDireccion,jtTelefono,new JTextField());
		}
		else
		{
			ErrorDeValidacion edv = new ErrorDeValidacion();
			edv.crearVE1(ok);
		}
	}

}



