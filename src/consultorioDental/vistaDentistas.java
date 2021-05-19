package consultorioDental;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JScrollPane;
import java.awt.Insets;
import javax.swing.JTable;
import javax.swing.JScrollBar;
import javax.swing.table.DefaultTableModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class vistaDentistas {

	private JFrame fDentistas;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					vistaDentistas window = new vistaDentistas();
					window.fDentistas.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public vistaDentistas() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		fDentistas = new JFrame();
		fDentistas.setTitle("Consultorio Dental: Dentistas");
		fDentistas.setBounds(100, 100, 942, 585);
		fDentistas.setExtendedState(JFrame.MAXIMIZED_BOTH);
		//fDentistas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{312, 323, 319, 51};
		gridBagLayout.rowHeights = new int[]{72, 298, 57, 55, 49, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		fDentistas.getContentPane().setLayout(gridBagLayout);
		
		JLabel lbDentistas = new JLabel("Dentistas");
		lbDentistas.setVerticalAlignment(SwingConstants.TOP);
		lbDentistas.setFont (lbDentistas.getFont ().deriveFont (40.0f));
		GridBagConstraints gbc_lbDentistas = new GridBagConstraints();
		gbc_lbDentistas.insets = new Insets(0, 0, 5, 5);
		gbc_lbDentistas.anchor = GridBagConstraints.NORTH;
		gbc_lbDentistas.gridx = 1;
		gbc_lbDentistas.gridy = 0;
		fDentistas.getContentPane().add(lbDentistas, gbc_lbDentistas);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.insets = new Insets(0, 0, 5, 0);
		gbc_scrollPane.gridwidth = 4;
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 1;
		fDentistas.getContentPane().add(scrollPane, gbc_scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "Nombre", "Info. Adicional"
			}
		));
		scrollPane.setViewportView(table);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollPane.setRowHeaderView(scrollBar);
		
		JButton btnAgregar = new JButton("Agregar");
		GridBagConstraints gbc_btnAgregar = new GridBagConstraints();
		gbc_btnAgregar.insets = new Insets(0, 0, 5, 5);
		gbc_btnAgregar.gridx = 0;
		gbc_btnAgregar.gridy = 2;
		fDentistas.getContentPane().add(btnAgregar, gbc_btnAgregar);
		
		JButton btnEliminar = new JButton("Eliminar");
		GridBagConstraints gbc_btnEliminar = new GridBagConstraints();
		gbc_btnEliminar.insets = new Insets(0, 0, 5, 0);
		gbc_btnEliminar.gridx = 2;
		gbc_btnEliminar.gridy = 2;
		fDentistas.getContentPane().add(btnEliminar, gbc_btnEliminar);
		
		JButton btnGuardar = new JButton("Guardar");
		GridBagConstraints gbc_btnGuardar = new GridBagConstraints();
		gbc_btnGuardar.insets = new Insets(0, 0, 5, 5);
		gbc_btnGuardar.gridx = 1;
		gbc_btnGuardar.gridy = 3;
		fDentistas.getContentPane().add(btnGuardar, gbc_btnGuardar);
		
		JButton btnHome = new JButton(new ImageIcon("src/img/home.png"));
		GridBagConstraints gbc_btnHome = new GridBagConstraints();
		btnHome.setPreferredSize(new Dimension(35, 35));
		btnHome.setBorder(new LineBorder(Color.white));
		gbc_btnHome.gridx = 2;
		gbc_btnHome.gridy = 4;
		gbc_btnHome.weightx = 1.0;
		fDentistas.getContentPane().add(btnHome, gbc_btnHome);
	}

}
