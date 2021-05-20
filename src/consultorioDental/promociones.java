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
import java.awt.Insets;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class promociones extends metodosDiseño implements ActionListener{

	private JPanel contentPane;
	private JTable tbPromociones;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					promociones frame = new promociones();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public promociones() {
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
		gbl_contentPane.columnWidths = new int[]{58, 51, 786, 88, 75, 90, 0};
		gbl_contentPane.rowHeights = new int[]{0, 93, 610, 66, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lbPromociones = new JLabel("Promociones");
		lbPromociones.setFont(new Font("Tahoma", Font.PLAIN, 34));
		GridBagConstraints gbc_lbPromociones = new GridBagConstraints();
		gbc_lbPromociones.insets = new Insets(0, 0, 5, 5);
		gbc_lbPromociones.gridx = 2;
		gbc_lbPromociones.gridy = 1;
		contentPane.add(lbPromociones, gbc_lbPromociones);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 2;
		gbc_scrollPane.gridy = 2;
		contentPane.add(scrollPane, gbc_scrollPane);
		
		tbPromociones = new JTable();
		tbPromociones.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Activado/Desactivado", "No.", "Descripci\u00F3n ", "Costo", "D\u00EDa en que aplica", "Procentaje ahorrado", "Dinero ahorrado", "T\u00E9rminos y condiciones"
			}
		) {
			Class[] columnTypes = new Class[] {
				Boolean.class, Short.class, String.class, Float.class, String.class, String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		tbPromociones.getColumnModel().getColumn(0).setPreferredWidth(128);
		tbPromociones.getColumnModel().getColumn(1).setPreferredWidth(51);
		tbPromociones.getColumnModel().getColumn(3).setPreferredWidth(68);
		tbPromociones.getColumnModel().getColumn(5).setPreferredWidth(112);
		tbPromociones.getColumnModel().getColumn(6).setPreferredWidth(99);
		tbPromociones.setFont(new Font("Tahoma", Font.PLAIN, 14));
		scrollPane.setViewportView(tbPromociones);
		
		JLabel lbRegresar = new JLabel("");
		lbRegresar.setIcon(new ImageIcon("C:\\Users\\Kevin\\git\\PROYECTO-DE-POO\\src\\img\\regresar.png"));
		GridBagConstraints gbc_lbRegresar = new GridBagConstraints();
		gbc_lbRegresar.insets = new Insets(0, 0, 5, 5);
		gbc_lbRegresar.gridx = 0;
		gbc_lbRegresar.gridy = 3;
		contentPane.add(lbRegresar, gbc_lbRegresar);
	
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_btnEliminar = new GridBagConstraints();
		gbc_btnEliminar.insets = new Insets(0, 0, 5, 5);
		gbc_btnEliminar.gridx = 3;
		gbc_btnEliminar.gridy = 3;
		contentPane.add(btnEliminar, gbc_btnEliminar);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_btnEditar = new GridBagConstraints();
		gbc_btnEditar.insets = new Insets(0, 0, 5, 5);
		gbc_btnEditar.gridx = 4;
		gbc_btnEditar.gridy = 3;
		contentPane.add(btnEditar, gbc_btnEditar);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_btnAgregar = new GridBagConstraints();
		gbc_btnAgregar.insets = new Insets(0, 0, 5, 0);
		gbc_btnAgregar.gridx = 5;
		gbc_btnAgregar.gridy = 3;
		contentPane.add(btnAgregar, gbc_btnAgregar);
		btnAgregar.addActionListener(this);
		
		buttonHome(this,true,new GridBagConstraints(),contentPane,1,3,1,1,0.0,0.0,GridBagConstraints.EAST);
	}
	
	public void actionPerformed(ActionEvent e) {
		switch(e.getActionCommand())
		{
			case "Agregar":
				agregarpromocion ap = new agregarpromocion();
				ap.setVisible(true);
				this.setVisible(false);
			break;
		}
		
	}

}
