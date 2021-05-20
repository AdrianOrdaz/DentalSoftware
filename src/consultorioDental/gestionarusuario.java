package consultorioDental;

import java.awt.BorderLayout;
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
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;

public class gestionarusuario extends metodosDiseño implements ActionListener {

	private JPanel contentPane;
	private JTable tbGestionarUsuario;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gestionarusuario frame = new gestionarusuario();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	protected gestionarusuario() {
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
		gbl_contentPane.columnWidths = new int[]{156, 1097, 67, 81, 92, 89, 0};
		gbl_contentPane.rowHeights = new int[]{116, 530, 185, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lbGestionarUsuario = new JLabel("Gestionar Usuario");
		lbGestionarUsuario.setFont(new Font("Tahoma", Font.PLAIN, 32));
		GridBagConstraints gbc_lbGestionarUsuario = new GridBagConstraints();
		gbc_lbGestionarUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_lbGestionarUsuario.gridx = 1;
		gbc_lbGestionarUsuario.gridy = 0;
		contentPane.add(lbGestionarUsuario, gbc_lbGestionarUsuario);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 1;
		contentPane.add(scrollPane, gbc_scrollPane);
		
		tbGestionarUsuario = new JTable();
		tbGestionarUsuario.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"Activadof", "No.", "Nombre", "Horario", "Hora de inicio", "Hora de cierre", "Correo electr\u00F3nico ", "Sueldo quincenal", "Direcci\u00F3n", "Tel\u00E9fono", "Contrase\u00F1a"
			}
		) {
			Class[] columnTypes = new Class[] {
				Boolean.class, Short.class, String.class, String.class, String.class, String.class, String.class, Float.class, String.class, Integer.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		tbGestionarUsuario.getColumnModel().getColumn(0).setPreferredWidth(80);
		tbGestionarUsuario.getColumnModel().getColumn(3).setPreferredWidth(46);
		tbGestionarUsuario.getColumnModel().getColumn(4).setPreferredWidth(40);
		tbGestionarUsuario.getColumnModel().getColumn(6).setPreferredWidth(61);
		tbGestionarUsuario.getColumnModel().getColumn(7).setPreferredWidth(84);
		scrollPane.setViewportView(tbGestionarUsuario);
		
		JLabel lbRegresar = new JLabel("");
		lbRegresar.setIcon(new ImageIcon("C:\\Users\\Kevin\\git\\PROYECTO-DE-POO\\src\\img\\regresar.png"));
		GridBagConstraints gbc_lbRegresar = new GridBagConstraints();
		gbc_lbRegresar.anchor = GridBagConstraints.EAST;
		gbc_lbRegresar.insets = new Insets(0, 0, 0, 5);
		gbc_lbRegresar.gridx = 0;
		gbc_lbRegresar.gridy = 2;
		contentPane.add(lbRegresar, gbc_lbRegresar);
		
		buttonHome(this,false,new GridBagConstraints(),contentPane,1,2,1,1,0.0,0.0,GridBagConstraints.WEST);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_btnEliminar = new GridBagConstraints();
		gbc_btnEliminar.insets = new Insets(0, 0, 0, 5);
		gbc_btnEliminar.gridx = 2;
		gbc_btnEliminar.gridy = 2;
		contentPane.add(btnEliminar, gbc_btnEliminar);
		int fila = tbGestionarUsuario.getSelectedRow();
		this.activarboton(fila, btnEliminar);

		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_btnEditar = new GridBagConstraints();
		gbc_btnEditar.insets = new Insets(0, 0, 0, 5);
		gbc_btnEditar.gridx = 3;
		gbc_btnEditar.gridy = 2;
		contentPane.add(btnEditar, gbc_btnEditar);
		
		JButton btnAgregar = new JButton("Agregar");
		
			btnAgregar.setFont(new Font("Tahoma", Font.PLAIN, 14));
			GridBagConstraints gbc_btnAgregar = new GridBagConstraints();
			gbc_btnAgregar.insets = new Insets(0, 0, 0, 5);
			gbc_btnAgregar.gridx = 4;
			gbc_btnAgregar.gridy = 2;
			contentPane.add(btnAgregar, gbc_btnAgregar);
			btnAgregar.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {
		switch(e.getActionCommand())
		{
			case "Agregar":
				agregarusuario au = new agregarusuario();
				au.setVisible(true);
				this.setVisible(false);
			break;
		}
		
	}
	
	protected void activarboton(int fila,JButton btnNewButton)
	{
		
			fila = tbGestionarUsuario.getSelectedRow();
			if(fila>=0) {
			 btnNewButton.setEnabled(true);
			}else {
			btnNewButton.setEnabled(false);
			}
	}
}
