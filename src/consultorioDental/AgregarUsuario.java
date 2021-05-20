package consultorioDental;

import java.awt.BorderLayout;
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
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AgregarUsuario extends MetodosDiseño {

	private JPanel contentPane;
	private JTextField jtIdUsuario;
	private JTextField jtNombre;
	private JTextField jtHorario;
	private JTextField jtCorreo;
	private JTextField jtContraseña;
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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setExtendedState(MAXIMIZED_BOTH);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(0,0,screen.width,screen.height - 30);
		this.setExtendedState(MAXIMIZED_BOTH);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{23, 254, 211, 150, 146, 160, 138, 154, 62, 0};
		gbl_contentPane.rowHeights = new int[]{138, 46, 61, 47, 30, 53, 32, 52, 32, 52, 29, 52, 29, 51, 30, 51, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lbAgregarUsuario = new JLabel("Agregar Usuario");
		lbAgregarUsuario.setFont(new Font("Tahoma", Font.PLAIN, 34));
		GridBagConstraints gbc_lbAgregarUsuario = new GridBagConstraints();
		gbc_lbAgregarUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_lbAgregarUsuario.anchor = GridBagConstraints.ABOVE_BASELINE_TRAILING;
		gbc_lbAgregarUsuario.gridx = 2;
		gbc_lbAgregarUsuario.gridy = 0;
		contentPane.add(lbAgregarUsuario, gbc_lbAgregarUsuario);
		
		JLabel lbCompleteCampos = new JLabel("Completa obligatoriamente los siguientes campos*");
		lbCompleteCampos.setFont(new Font("Tahoma", Font.ITALIC, 14));
		GridBagConstraints gbc_lbCompleteCampos = new GridBagConstraints();
		gbc_lbCompleteCampos.insets = new Insets(0, 0, 5, 5);
		gbc_lbCompleteCampos.gridx = 2;
		gbc_lbCompleteCampos.gridy = 1;
		contentPane.add(lbCompleteCampos, gbc_lbCompleteCampos);
		
		JLabel lbIdUsuario = new JLabel("Id del usuario*:");
		lbIdUsuario.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lbIdUsuario = new GridBagConstraints();
		gbc_lbIdUsuario.anchor = GridBagConstraints.EAST;
		gbc_lbIdUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_lbIdUsuario.gridx = 1;
		gbc_lbIdUsuario.gridy = 2;
		contentPane.add(lbIdUsuario, gbc_lbIdUsuario);
		
		jtIdUsuario = new JTextField();
		jtIdUsuario.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_jtIdUsuario = new GridBagConstraints();
		gbc_jtIdUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_jtIdUsuario.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtIdUsuario.gridx = 2;
		gbc_jtIdUsuario.gridy = 2;
		contentPane.add(jtIdUsuario, gbc_jtIdUsuario);
		jtIdUsuario.setColumns(5);
		
		JLabel lbNombre = new JLabel("Nombre*:");
		lbNombre.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lbNombre = new GridBagConstraints();
		gbc_lbNombre.anchor = GridBagConstraints.EAST;
		gbc_lbNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lbNombre.gridx = 1;
		gbc_lbNombre.gridy = 3;
		contentPane.add(lbNombre, gbc_lbNombre);
		
		jtNombre = new JTextField();
		jtNombre.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_jtNombre = new GridBagConstraints();
		gbc_jtNombre.insets = new Insets(0, 0, 5, 5);
		gbc_jtNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtNombre.gridx = 2;
		gbc_jtNombre.gridy = 3;
		contentPane.add(jtNombre, gbc_jtNombre);
		jtNombre.setColumns(5);
		
		JLabel lbHorario = new JLabel("Horario*:");
		lbHorario.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lbHorario = new GridBagConstraints();
		gbc_lbHorario.anchor = GridBagConstraints.EAST;
		gbc_lbHorario.insets = new Insets(0, 0, 5, 5);
		gbc_lbHorario.gridx = 1;
		gbc_lbHorario.gridy = 4;
		contentPane.add(lbHorario, gbc_lbHorario);
		
		jtHorario = new JTextField();
		jtHorario.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_jtHorario = new GridBagConstraints();
		gbc_jtHorario.insets = new Insets(0, 0, 5, 5);
		gbc_jtHorario.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtHorario.gridx = 2;
		gbc_jtHorario.gridy = 4;
		contentPane.add(jtHorario, gbc_jtHorario);
		jtHorario.setColumns(5);
		
		JLabel lbCorreo = new JLabel("Correo Electr\u00F3nico*:");
		lbCorreo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lbCorreo = new GridBagConstraints();
		gbc_lbCorreo.anchor = GridBagConstraints.EAST;
		gbc_lbCorreo.insets = new Insets(0, 0, 5, 5);
		gbc_lbCorreo.gridx = 1;
		gbc_lbCorreo.gridy = 5;
		contentPane.add(lbCorreo, gbc_lbCorreo);
		
		jtCorreo = new JTextField();
		jtCorreo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_jtCorreo = new GridBagConstraints();
		gbc_jtCorreo.insets = new Insets(0, 0, 5, 5);
		gbc_jtCorreo.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtCorreo.gridx = 2;
		gbc_jtCorreo.gridy = 5;
		contentPane.add(jtCorreo, gbc_jtCorreo);
		jtCorreo.setColumns(5);
		
		JLabel lbContraseña = new JLabel("Contrase\u00F1a*:");
		lbContraseña.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lbContraseña = new GridBagConstraints();
		gbc_lbContraseña.anchor = GridBagConstraints.EAST;
		gbc_lbContraseña.insets = new Insets(0, 0, 5, 5);
		gbc_lbContraseña.gridx = 1;
		gbc_lbContraseña.gridy = 6;
		contentPane.add(lbContraseña, gbc_lbContraseña);
		
		jtContraseña = new JTextField();
		jtContraseña.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_jtContraseña = new GridBagConstraints();
		gbc_jtContraseña.insets = new Insets(0, 0, 5, 5);
		gbc_jtContraseña.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtContraseña.gridx = 2;
		gbc_jtContraseña.gridy = 6;
		contentPane.add(jtContraseña, gbc_jtContraseña);
		jtContraseña.setColumns(5);
		
		JLabel lbSueldoquincenal = new JLabel("Sueldo quincenal*:");
		lbSueldoquincenal.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lbSueldoquincenal = new GridBagConstraints();
		gbc_lbSueldoquincenal.anchor = GridBagConstraints.EAST;
		gbc_lbSueldoquincenal.insets = new Insets(0, 0, 5, 5);
		gbc_lbSueldoquincenal.gridx = 1;
		gbc_lbSueldoquincenal.gridy = 7;
		contentPane.add(lbSueldoquincenal, gbc_lbSueldoquincenal);
		
		jtSueldoquincenal = new JTextField();
		jtSueldoquincenal.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_jtSueldoquincenal = new GridBagConstraints();
		gbc_jtSueldoquincenal.insets = new Insets(0, 0, 5, 5);
		gbc_jtSueldoquincenal.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtSueldoquincenal.gridx = 2;
		gbc_jtSueldoquincenal.gridy = 7;
		contentPane.add(jtSueldoquincenal, gbc_jtSueldoquincenal);
		jtSueldoquincenal.setColumns(5);
		
		JLabel lbDireccion = new JLabel("Direcci\u00F3n*:");
		lbDireccion.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lbDireccion = new GridBagConstraints();
		gbc_lbDireccion.anchor = GridBagConstraints.EAST;
		gbc_lbDireccion.insets = new Insets(0, 0, 5, 5);
		gbc_lbDireccion.gridx = 1;
		gbc_lbDireccion.gridy = 8;
		contentPane.add(lbDireccion, gbc_lbDireccion);
		
		jtDireccion = new JTextField();
		jtDireccion.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_jtDireccion = new GridBagConstraints();
		gbc_jtDireccion.insets = new Insets(0, 0, 5, 5);
		gbc_jtDireccion.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtDireccion.gridx = 2;
		gbc_jtDireccion.gridy = 8;
		contentPane.add(jtDireccion, gbc_jtDireccion);
		jtDireccion.setColumns(5);
		
		JLabel lbTelefono = new JLabel("Tel\u00E9fono*:");
		lbTelefono.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lbTelefono = new GridBagConstraints();
		gbc_lbTelefono.anchor = GridBagConstraints.EAST;
		gbc_lbTelefono.insets = new Insets(0, 0, 5, 5);
		gbc_lbTelefono.gridx = 1;
		gbc_lbTelefono.gridy = 9;
		contentPane.add(lbTelefono, gbc_lbTelefono);
		
		jtTelefono = new JTextField();
		jtTelefono.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_jtTelefono = new GridBagConstraints();
		gbc_jtTelefono.insets = new Insets(0, 0, 5, 5);
		gbc_jtTelefono.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtTelefono.gridx = 2;
		gbc_jtTelefono.gridy = 9;
		contentPane.add(jtTelefono, gbc_jtTelefono);
		jtTelefono.setColumns(5);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_btnAgregar = new GridBagConstraints();
		gbc_btnAgregar.insets = new Insets(0, 0, 5, 5);
		gbc_btnAgregar.gridx = 2;
		gbc_btnAgregar.gridy = 10;
		contentPane.add(btnAgregar, gbc_btnAgregar);
		
		buttonHome(this,false,new GridBagConstraints(),contentPane,4,13,1,1,0.0,0.0,GridBagConstraints.WEST);
		buttonRegresar(new GestionarUsuario(),this,new GridBagConstraints(),contentPane,3,13,1,1,0.0,0.0,GridBagConstraints.WEST);
	}

}
