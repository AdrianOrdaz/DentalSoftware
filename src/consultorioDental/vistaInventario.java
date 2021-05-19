package consultorioDental;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollBar;

public class vistaInventario {

	private JFrame fInventario;
	private JButton btnBuscarId;
	private JScrollPane scrollPane;
	private JTable table;
	private JButton btnAgregar;
	private JButton btnModificar;
	private JButton btnEliminar;
	private JButton btnRegresar;
	private JButton btnGuardar;
	private JButton btnHome;
	private JScrollBar scrollBar;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					vistaInventario window = new vistaInventario();
					window.fInventario.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public vistaInventario() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		fInventario = new JFrame();
		fInventario.setTitle("Consultorio Dental: Inventario");
		//frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		fInventario.setExtendedState(JFrame.MAXIMIZED_BOTH);
		fInventario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{166, 185, 193, 183, 164, 0};
		gridBagLayout.rowHeights = new int[]{74, 78, 326, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		fInventario.getContentPane().setLayout(gridBagLayout);
		
		JLabel lbInventario = new JLabel("Inventario");
		GridBagConstraints gbc_lbInventario = new GridBagConstraints();
		lbInventario.setFont (lbInventario.getFont ().deriveFont (40.0f));
		gbc_lbInventario.insets = new Insets(0, 0, 5, 5);
		gbc_lbInventario.gridx = 2;
		gbc_lbInventario.gridy = 0;
		gbc_lbInventario.weighty = 1.0;
		fInventario.getContentPane().add(lbInventario, gbc_lbInventario);
		
		JLabel lbId_producto = new JLabel("ID del Producto");
		GridBagConstraints gbc_lbId_producto = new GridBagConstraints();
		gbc_lbId_producto.anchor = GridBagConstraints.EAST;
		gbc_lbId_producto.insets = new Insets(0, 0, 5, 5);
		gbc_lbId_producto.gridx = 1;
		gbc_lbId_producto.gridy = 1;
		fInventario.getContentPane().add(lbId_producto, gbc_lbId_producto);
		
		btnBuscarId = new JButton("Buscar");
		btnBuscarId.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 2;
		gbc_textField.gridy = 1;
		fInventario.getContentPane().add(textField, gbc_textField);
		textField.setColumns(10);
		GridBagConstraints gbc_btnBuscarId = new GridBagConstraints();
		gbc_btnBuscarId.insets = new Insets(0, 0, 5, 5);
		gbc_btnBuscarId.gridx = 3;
		gbc_btnBuscarId.gridy = 1;
		fInventario.getContentPane().add(btnBuscarId, gbc_btnBuscarId);
		
		scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridwidth = 5;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 0);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 2;
		fInventario.getContentPane().add(scrollPane, gbc_scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "Nombre", "Descripcion", "Cant.", "Compra", "Venta"
			}
		));
		scrollPane.setViewportView(table);
		
		scrollBar = new JScrollBar();
		scrollPane.setRowHeaderView(scrollBar);
		
		btnAgregar = new JButton("Agregar");
		GridBagConstraints gbc_btnAgregar = new GridBagConstraints();
		gbc_btnAgregar.insets = new Insets(0, 0, 5, 5);
		gbc_btnAgregar.gridx = 0;
		gbc_btnAgregar.gridy = 4;
		fInventario.getContentPane().add(btnAgregar, gbc_btnAgregar);
		
		btnModificar = new JButton("Modificar");
		GridBagConstraints gbc_btnModificar = new GridBagConstraints();
		gbc_btnModificar.insets = new Insets(0, 0, 5, 5);
		gbc_btnModificar.gridx = 2;
		gbc_btnModificar.gridy = 4;
		fInventario.getContentPane().add(btnModificar, gbc_btnModificar);
		
		btnEliminar = new JButton("Eliminar");
		GridBagConstraints gbc_btnEliminar = new GridBagConstraints();
		gbc_btnEliminar.insets = new Insets(0, 0, 5, 0);
		gbc_btnEliminar.gridx = 4;
		gbc_btnEliminar.gridy = 4;
		fInventario.getContentPane().add(btnEliminar, gbc_btnEliminar);
		
		btnGuardar = new JButton("Guardar");
		GridBagConstraints gbc_btnGuardar = new GridBagConstraints();
		gbc_btnGuardar.insets = new Insets(0, 0, 5, 5);
		gbc_btnGuardar.gridx = 2;
		gbc_btnGuardar.gridy = 6;
		fInventario.getContentPane().add(btnGuardar, gbc_btnGuardar);
		
		/*btnRegresar = new JButton("Regresar");
		GridBagConstraints gbc_btnRegresar = new GridBagConstraints();
		gbc_btnRegresar.gridx = 4;
		gbc_btnRegresar.gridy = 7;
		fInventario.getContentPane().add(btnRegresar, gbc_btnRegresar);*/
		
		btnHome = new JButton(new ImageIcon("src/img/home.png"));
		GridBagConstraints gbc_btnHome = new GridBagConstraints();
		btnHome.setPreferredSize(new Dimension(35, 35));
		btnHome.setBorder(new LineBorder(Color.white));
		gbc_btnHome.gridx = 4;
		gbc_btnHome.gridy = 7;
		gbc_btnHome.weighty = 1.0;
		fInventario.getContentPane().add(btnHome, gbc_btnHome);
	}

}
