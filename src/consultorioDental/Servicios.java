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
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Servicios extends MetodosDiseño implements ActionListener {

	private JPanel contentPane;
	private JTable tbServicios;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Servicios frame = new Servicios();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public Servicios() {
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
		gbl_contentPane.columnWidths = new int[]{71, 55, 697, 79, 77, 70, 220, 139, 80, 0};
		gbl_contentPane.rowHeights = new int[]{0, 100, 480, 71, 70, 71, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lbServicios = new JLabel("Servicios");
		lbServicios.setFont(new Font("Tahoma", Font.PLAIN, 31));
		GridBagConstraints gbc_lbServicios = new GridBagConstraints();
		gbc_lbServicios.insets = new Insets(0, 0, 5, 5);
		gbc_lbServicios.gridx = 2;
		gbc_lbServicios.gridy = 1;
		contentPane.add(lbServicios, gbc_lbServicios);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 2;
		gbc_scrollPane.gridy = 2;
		contentPane.add(scrollPane, gbc_scrollPane);
		
		tbServicios = new JTable();
		tbServicios.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"Activado/Desacivado", "No.", "Nombre", "Costo"
			}
		) {
			Class[] columnTypes = new Class[] {
				Boolean.class, Short.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		tbServicios.setFont(new Font("Tahoma", Font.PLAIN, 14));
		scrollPane.setViewportView(tbServicios);
		
		JLabel lbRegresar = new JLabel("");
		lbRegresar.setIcon(new ImageIcon("C:\\Users\\Kevin\\git\\PROYECTO-DE-POO\\src\\img\\regresar.png"));
		GridBagConstraints gbc_lbRegresar = new GridBagConstraints();
		gbc_lbRegresar.anchor = GridBagConstraints.SOUTH;
		gbc_lbRegresar.insets = new Insets(0, 0, 5, 5);
		gbc_lbRegresar.gridx = 0;
		gbc_lbRegresar.gridy = 4;
		contentPane.add(lbRegresar, gbc_lbRegresar);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_btnEliminar = new GridBagConstraints();
		gbc_btnEliminar.insets = new Insets(0, 0, 5, 5);
		gbc_btnEliminar.gridx = 3;
		gbc_btnEliminar.gridy = 4;
		contentPane.add(btnEliminar, gbc_btnEliminar);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_btnEditar = new GridBagConstraints();
		gbc_btnEditar.insets = new Insets(0, 0, 5, 5);
		gbc_btnEditar.gridx = 4;
		gbc_btnEditar.gridy = 4;
		contentPane.add(btnEditar, gbc_btnEditar);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_btnAgregar = new GridBagConstraints();
		gbc_btnAgregar.insets = new Insets(0, 0, 5, 5);
		gbc_btnAgregar.gridx = 5;
		gbc_btnAgregar.gridy = 4;
		contentPane.add(btnAgregar, gbc_btnAgregar);
		btnAgregar.addActionListener(this);
		
		buttonHome(this,true,new GridBagConstraints(),contentPane,1,4,1,1,0.0,0.0,GridBagConstraints.CENTER);
	}
	public void actionPerformed(ActionEvent e) {
		switch(e.getActionCommand())
		{
			case "Agregar":
				AgregarServicio as = new AgregarServicio();
				as.setVisible(true);
				this.setVisible(false);
			break;
		}
		
	}
	protected void activeTF(JCheckBox cb,JCheckBox cb1, JTextField jt) 
	{
		cb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cb.isSelected()) {
					jt.setEnabled(true);
				}else {
					jt.setEnabled(false);
				}
				if(cb1.isSelected()) {
					jt.setEnabled(false);
				}
			}
	    });
	}
}
