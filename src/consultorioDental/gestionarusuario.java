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
		contentPane.setBackground(Color.WHITE);;
		this.setExtendedState(MAXIMIZED_BOTH);
		setContentPane(contentPane);
		contentPane.setLayout(new GridBagLayout());
		
		JLabel lbGestionarUsuario = new JLabel("Gestionar Usuario");
		lbGestionarUsuario.setFont(new Font("Tahoma", Font.PLAIN, 32));
		GridBagConstraints gbc_lbGestionarUsuario = new GridBagConstraints();
		adjustComponents(gbc_lbGestionarUsuario,0,0,5,1,0.0,1.0,GridBagConstraints.NORTH);
		contentPane.add(lbGestionarUsuario, gbc_lbGestionarUsuario);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
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
				"", "No.", "Nombre", "Horario", "Hora de inicio", "Hora de cierre", "Correo electr\u00F3nico ", "Sueldo quincenal", "Direcci\u00F3n", "Tel\u00E9fono", "Contrase\u00F1a"
			}
		) {
			Class[] columnTypes = new Class[] {
				Boolean.class, Short.class, String.class, String.class, String.class, String.class, String.class, Float.class, String.class, Integer.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		scrollPane.setViewportView(tbGestionarUsuario);
		adjustComponents(gbc_scrollPane,0,1,5,1,1.0,1.0,GridBagConstraints.CENTER);
		contentPane.add(scrollPane, gbc_scrollPane);
		
		buttonHome(this,false,new GridBagConstraints(),contentPane,1,2,1,1,1.0,1.0,GridBagConstraints.CENTER);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		adjustButton(btnEliminar,new GridBagConstraints(),contentPane,2,2,1,1,0.0,1.0,GridBagConstraints.ABOVE_BASELINE_TRAILING);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		adjustButton(btnEditar,new GridBagConstraints(),contentPane,3,2,1,1,0.0,1.0,GridBagConstraints.CENTER);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		adjustButton(btnAgregar,new GridBagConstraints(),contentPane,4,2,1,1,0.0,1.0,GridBagConstraints.ABOVE_BASELINE_LEADING);
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
}
