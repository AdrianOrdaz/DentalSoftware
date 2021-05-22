package consultorioDental;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Font;
import java.awt.Insets;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

public class GestionarUsuario extends MetodosDiseño implements ActionListener {

	private JPanel contentPane;
	private JTable tbGestionarUsuario;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GestionarUsuario frame = new GestionarUsuario();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	protected GestionarUsuario() {
		setTitle("Gestionar usuario");
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		setContentPane(contentPane);
		contentPane.setLayout(new GridBagLayout());
		
		JLabel lbGestionarUsuario = new JLabel("Gestionar Usuario");
		lbGestionarUsuario.setFont(new Font("Tahoma", Font.PLAIN, 40));
		GridBagConstraints gbc_lbGestionarUsuario = new GridBagConstraints();
		adjustComponents(gbc_lbGestionarUsuario,0,0,5,1,1.0,1.0,GridBagConstraints.NORTH);
		contentPane.add(lbGestionarUsuario, gbc_lbGestionarUsuario);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.insets = new Insets(0,2,0,0);
		tbGestionarUsuario = new JTable();
		tbGestionarUsuario.setModel(new DefaultTableModel(
			new Object[][] {null},
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
		adjustComponents(gbc_scrollPane,1,1,4,1,1.0,1.0,GridBagConstraints.CENTER);
		contentPane.add(scrollPane, gbc_scrollPane);
		
		buttonHome(this,false,new GridBagConstraints(),contentPane,4,2,1,1,0.0,1.0,GridBagConstraints.CENTER);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setEnabled(false);
		adjustButton(btnEliminar,new GridBagConstraints(),contentPane,3,2,1,1,0.0,1.0,GridBagConstraints.CENTER);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setEnabled(false);
		adjustButton(btnEditar,new GridBagConstraints(),contentPane,2,2,1,1,0.0,1.0,GridBagConstraints.CENTER);
		
		JButton btnAgregar = new JButton("Agregar");
		adjustButton(btnAgregar,new GridBagConstraints(),contentPane,1,2,1,1,1.0,1.0,GridBagConstraints.CENTER);
		btnAgregar.addActionListener(this);
		
		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setExtendedState(MAXIMIZED_BOTH);
	}
	public void actionPerformed(ActionEvent e) {
		switch(e.getActionCommand())
		{
			case "Agregar":
				AgregarUsuario au = new AgregarUsuario();
				au.setVisible(true);
				this.setVisible(false);
			break;
		}
		
	}
}
