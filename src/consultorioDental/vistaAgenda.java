package consultorioDental;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Insets;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.JScrollBar;
import javax.swing.table.DefaultTableModel;

public class vistaAgenda {

	private JFrame fAgenda;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					vistaAgenda window = new vistaAgenda();
					window.fAgenda.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public vistaAgenda() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		fAgenda = new JFrame();
		fAgenda.setTitle("Consultorio Dental: Agenda");
		fAgenda.setExtendedState(JFrame.MAXIMIZED_BOTH);
		fAgenda.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{232, 228, 214, 190, 0};
		gridBagLayout.rowHeights = new int[]{72, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		fAgenda.getContentPane().setLayout(gridBagLayout);
		
		JLabel lbAgenda = new JLabel("Agenda");
		lbAgenda.setFont (lbAgenda.getFont ().deriveFont (40.0f));
		GridBagConstraints gbc_lbAgenda = new GridBagConstraints();
		gbc_lbAgenda.gridwidth = 1;
		gbc_lbAgenda.insets = new Insets(0, 0, 5, 5);
		gbc_lbAgenda.gridx = 1;
		gbc_lbAgenda.gridy = 0;
		fAgenda.getContentPane().add(lbAgenda, gbc_lbAgenda);
		
		JComboBox cbFecha = new JComboBox();
		cbFecha.setToolTipText("Fecha: DD/MM/AAAA");
		GridBagConstraints gbc_cbFecha = new GridBagConstraints();
		gbc_cbFecha.insets = new Insets(0, 0, 5, 5);
		gbc_cbFecha.fill = GridBagConstraints.HORIZONTAL;
		gbc_cbFecha.gridx = 0;
		gbc_cbFecha.gridy = 1;
		fAgenda.getContentPane().add(cbFecha, gbc_cbFecha);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridwidth = 4;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 0);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 2;
		fAgenda.getContentPane().add(scrollPane, gbc_scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "Paciente", "Hora", "Dentista", "Asistio"
			}
		));
		scrollPane.setViewportView(table);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollPane.setRowHeaderView(scrollBar);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnModificar = new GridBagConstraints();
		gbc_btnModificar.insets = new Insets(0, 0, 5, 5);
		gbc_btnModificar.gridx = 0;
		gbc_btnModificar.gridy = 3;
		fAgenda.getContentPane().add(btnModificar, gbc_btnModificar);
		
		JButton btnEliminar = new JButton("Eliminar");
		GridBagConstraints gbc_btnEliminar = new GridBagConstraints();
		gbc_btnEliminar.insets = new Insets(0, 0, 5, 5);
		gbc_btnEliminar.gridx = 2;
		gbc_btnEliminar.gridy = 3;
		fAgenda.getContentPane().add(btnEliminar, gbc_btnEliminar);
		
		JButton btnGuardar = new JButton("Guardar");
		GridBagConstraints gbc_btnGuardar = new GridBagConstraints();
		gbc_btnGuardar.insets = new Insets(0, 0, 5, 5);
		gbc_btnGuardar.gridx = 1;
		gbc_btnGuardar.gridy = 4;
		fAgenda.getContentPane().add(btnGuardar, gbc_btnGuardar);
		
		JButton btnHome = new JButton(new ImageIcon("src/img/home.png"));
		GridBagConstraints gbc_btnHome = new GridBagConstraints();
		btnHome.setPreferredSize(new Dimension(35, 35));
		btnHome.setBorder(new LineBorder(Color.white));
		gbc_btnHome.gridx = 3;
		gbc_btnHome.gridy = 5;
		gbc_btnHome.weightx = 1.0;
		fAgenda.getContentPane().add(btnHome, gbc_btnHome);
	}

}
