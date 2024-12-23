package consultorioDental;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Font;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JButton;

public class AgregarUsuario extends MetodosDise�o {

	private JPanel contentPane;
	private JTextField jtIdUsuario;
	private JTextField jtNombre;
	private JTextField jtHorario;
	private JTextField jtCorreo;
	private JTextField jtContrase�a;
	private JTextField jtSueldoquincenal;
	private JTextField jtDireccion;
	private JTextField jtTelefono;
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
		
		JLabel lbIdUsuario = new JLabel("Id del usuario*:");
		lbIdUsuario.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lbIdUsuario = new GridBagConstraints();
		gbc_lbIdUsuario.weighty = 1.0;
		gbc_lbIdUsuario.anchor = GridBagConstraints.EAST;
		gbc_lbIdUsuario.gridx = 1;
		gbc_lbIdUsuario.gridy = 2;
		contentPane.add(lbIdUsuario, gbc_lbIdUsuario);
		
		jtIdUsuario = new JTextField();
		jtIdUsuario.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_jtIdUsuario = new GridBagConstraints();
		gbc_jtIdUsuario.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtIdUsuario.gridx = 2;
		gbc_jtIdUsuario.gridy = 2;
		contentPane.add(jtIdUsuario, gbc_jtIdUsuario);
		jtIdUsuario.setColumns(5);
		
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
		
		JLabel lbContrase�a = new JLabel("Contrase\u00F1a*:");
		lbContrase�a.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lbContrase�a = new GridBagConstraints();
		gbc_lbContrase�a.anchor = GridBagConstraints.EAST;
		gbc_lbContrase�a.weighty = 1.0;
		gbc_lbContrase�a.gridx = 1;
		gbc_lbContrase�a.gridy = 6;
		contentPane.add(lbContrase�a, gbc_lbContrase�a);
		
		jtContrase�a = new JTextField();
		jtContrase�a.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_jtContrase�a = new GridBagConstraints();
		gbc_jtContrase�a.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtContrase�a.gridx = 2;
		gbc_jtContrase�a.gridy = 6;
		contentPane.add(jtContrase�a, gbc_jtContrase�a);
		jtContrase�a.setColumns(5);
		
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
		
		buttonHome(this,false,new GridBagConstraints(),contentPane,2,11,1,1,1.0,0.0,GridBagConstraints.EAST);
		buttonRegresar(new GestionarUsuario(),this,new GridBagConstraints(),contentPane,1,11,1,1,0.0,0.0,GridBagConstraints.EAST);
		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setExtendedState(MAXIMIZED_BOTH);
	}
	
	
	
	private void obtencionDeDatos()
	{
		//String nombre
	}

}



