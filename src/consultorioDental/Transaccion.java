package consultorioDental;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Font;
import java.awt.Insets;
import javax.swing.JTextField;
import java.awt.Component;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class Transaccion extends JFrame //extends metodosDiseño
{

	private JPanel contentPane;
	private JTextField jtIdCompra;
	private JTextField jtIdUsuario;
	private JTextField jtldCita;
	private JTextField jtPromocion;
	private JTextField jtTotal;
	private JTable tbProductos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Transaccion frame = new Transaccion();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Transaccion() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(0, 0,screen.width,screen.height - 30);
		setExtendedState(MAXIMIZED_BOTH);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{187, 168, 53, 203, 79, 85, 149, 372, 0};
		gbl_contentPane.rowHeights = new int[]{58, 52, 84, 29, 45, 29, 36, 309, 34, 37, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lbTitulo = new JLabel("Transaccion");
		lbTitulo.setFont(new Font("Tahoma", Font.PLAIN, 43));
		GridBagConstraints gbc_lbTitulo = new GridBagConstraints();
		gbc_lbTitulo.anchor = GridBagConstraints.NORTHWEST;
		gbc_lbTitulo.insets = new Insets(0, 0, 5, 5);
		gbc_lbTitulo.gridwidth = 2;
		gbc_lbTitulo.gridx = 1;
		gbc_lbTitulo.gridy = 1;
		contentPane.add(lbTitulo, gbc_lbTitulo);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");  
		LocalDateTime now = LocalDateTime.now();  //imprime fecha
		JLabel lbFecha = new JLabel(dtf.format(now)); //https://www.javatpoint.com/java-get-current-date
		lbFecha.setFont(new Font("Tahoma", Font.PLAIN, 24));
		GridBagConstraints gbc_lbFecha = new GridBagConstraints();
		gbc_lbFecha.insets = new Insets(0, 0, 5, 0);
		gbc_lbFecha.gridx = 7;
		gbc_lbFecha.gridy = 1;
		contentPane.add(lbFecha, gbc_lbFecha);
		
		JLabel lbIdCompra = new JLabel("Id de la compra");
		lbIdCompra.setFont(new Font("Tahoma", Font.PLAIN, 24));
		GridBagConstraints gbc_lbIdCompra = new GridBagConstraints();
		gbc_lbIdCompra.anchor = GridBagConstraints.NORTHWEST;
		gbc_lbIdCompra.insets = new Insets(0, 0, 5, 5);
		gbc_lbIdCompra.gridx = 1;
		gbc_lbIdCompra.gridy = 3;
		contentPane.add(lbIdCompra, gbc_lbIdCompra);
		
		jtIdCompra = new JTextField();
		jtIdCompra.setMaximumSize(new Dimension(50, 50));
		jtIdCompra.setFont(new Font("Tahoma", Font.PLAIN, 14));
		jtIdCompra.setColumns(10);
		GridBagConstraints gbc_jtIdCompra = new GridBagConstraints();
		gbc_jtIdCompra.fill = GridBagConstraints.BOTH;
		gbc_jtIdCompra.insets = new Insets(0, 0, 5, 5);
		gbc_jtIdCompra.gridwidth = 2;
		gbc_jtIdCompra.gridx = 2;
		gbc_jtIdCompra.gridy = 3;
		contentPane.add(jtIdCompra, gbc_jtIdCompra);
		
		JLabel lbIdUsuario = new JLabel("Id del usuario");
		lbIdUsuario.setFont(new Font("Tahoma", Font.PLAIN, 24));
		GridBagConstraints gbc_lbIdUsuario = new GridBagConstraints();
		gbc_lbIdUsuario.anchor = GridBagConstraints.NORTHWEST;
		gbc_lbIdUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_lbIdUsuario.gridx = 6;
		gbc_lbIdUsuario.gridy = 3;
		contentPane.add(lbIdUsuario, gbc_lbIdUsuario);
		
		jtIdUsuario = new JTextField();
		jtIdUsuario.setMaximumSize(new Dimension(50, 50));
		jtIdUsuario.setFont(new Font("Tahoma", Font.PLAIN, 14));
		jtIdUsuario.setColumns(10);
		GridBagConstraints gbc_jtIdUsuario = new GridBagConstraints();
		gbc_jtIdUsuario.fill = GridBagConstraints.BOTH;
		gbc_jtIdUsuario.insets = new Insets(0, 0, 5, 0);
		gbc_jtIdUsuario.gridx = 7;
		gbc_jtIdUsuario.gridy = 3;
		contentPane.add(jtIdUsuario, gbc_jtIdUsuario);
		
		JLabel lbIdCita = new JLabel("Id de la cita");
		lbIdCita.setFont(new Font("Tahoma", Font.PLAIN, 24));
		GridBagConstraints gbc_lbIdCita = new GridBagConstraints();
		gbc_lbIdCita.anchor = GridBagConstraints.NORTHWEST;
		gbc_lbIdCita.insets = new Insets(0, 0, 5, 5);
		gbc_lbIdCita.gridx = 1;
		gbc_lbIdCita.gridy = 5;
		contentPane.add(lbIdCita, gbc_lbIdCita);
		
		jtldCita = new JTextField();
		jtldCita.setColumns(10);
		GridBagConstraints gbc_jtldCita = new GridBagConstraints();
		gbc_jtldCita.fill = GridBagConstraints.BOTH;
		gbc_jtldCita.insets = new Insets(0, 0, 5, 5);
		gbc_jtldCita.gridwidth = 2;
		gbc_jtldCita.gridx = 2;
		gbc_jtldCita.gridy = 5;
		contentPane.add(jtldCita, gbc_jtldCita);
		
		JLabel lbPromocion = new JLabel("Promocion");
		lbPromocion.setFont(new Font("Tahoma", Font.PLAIN, 24));
		GridBagConstraints gbc_lbPromocion = new GridBagConstraints();
		gbc_lbPromocion.anchor = GridBagConstraints.NORTHWEST;
		gbc_lbPromocion.insets = new Insets(0, 0, 5, 5);
		gbc_lbPromocion.gridx = 6;
		gbc_lbPromocion.gridy = 5;
		contentPane.add(lbPromocion, gbc_lbPromocion);
		
		jtPromocion = new JTextField();
		jtPromocion.setColumns(10);
		GridBagConstraints gbc_jtPromocion = new GridBagConstraints();
		gbc_jtPromocion.fill = GridBagConstraints.BOTH;
		gbc_jtPromocion.insets = new Insets(0, 0, 5, 0);
		gbc_jtPromocion.gridx = 7;
		gbc_jtPromocion.gridy = 5;
		contentPane.add(jtPromocion, gbc_jtPromocion);
		
		JScrollPane spProductos = new JScrollPane();
		GridBagConstraints gbc_spProductos = new GridBagConstraints();
		gbc_spProductos.fill = GridBagConstraints.BOTH;
		gbc_spProductos.insets = new Insets(0, 0, 5, 0);
		gbc_spProductos.gridwidth = 7;
		gbc_spProductos.gridx = 1;
		gbc_spProductos.gridy = 7;
		contentPane.add(spProductos, gbc_spProductos);
		
		tbProductos = new JTable();
		tbProductos.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tbProductos.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"Id medicamento", "Nombre medicamento", "Cantidad a comprar", "Cantidad en inventario", "Precio Unitario"
			}
		));
		tbProductos.getColumnModel().getColumn(0).setPreferredWidth(94);
		tbProductos.getColumnModel().getColumn(1).setPreferredWidth(128);
		tbProductos.getColumnModel().getColumn(2).setPreferredWidth(108);
		tbProductos.getColumnModel().getColumn(3).setPreferredWidth(129);
		tbProductos.getColumnModel().getColumn(4).setPreferredWidth(98);
		tbProductos.setRowHeight(40);

		JTableHeader tableHeader = tbProductos.getTableHeader();//Estas tres
		Font headerFont = new Font("Verdana", Font.PLAIN, 20); //lineas de codigo
		tableHeader.setFont(headerFont);// Son para cambiar el header
		spProductos.setViewportView(tbProductos);
		
		JButton btnComprobar = new JButton("Comprobar");
		btnComprobar.setFont(new Font("Tahoma", Font.PLAIN, 24));
		GridBagConstraints gbc_btnComprobar = new GridBagConstraints();
		gbc_btnComprobar.anchor = GridBagConstraints.NORTH;
		gbc_btnComprobar.insets = new Insets(0, 0, 0, 5);
		gbc_btnComprobar.gridx = 1;
		gbc_btnComprobar.gridy = 9;
		contentPane.add(btnComprobar, gbc_btnComprobar);
		
		JButton btnGenerar = new JButton("Generar");
		btnGenerar.setFont(new Font("Tahoma", Font.PLAIN, 24));
		GridBagConstraints gbc_btnGenerar = new GridBagConstraints();
		gbc_btnGenerar.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnGenerar.insets = new Insets(0, 0, 0, 5);
		gbc_btnGenerar.gridx = 3;
		gbc_btnGenerar.gridy = 9;
		contentPane.add(btnGenerar, gbc_btnGenerar);
		
		JButton btnHome = new JButton(new ImageIcon("src/img/home.png"));
		btnHome.setPreferredSize(new Dimension(35, 35));
		btnHome.setBorder(new LineBorder(Color.white));
		GridBagConstraints gbc_btnHome = new GridBagConstraints();
		gbc_btnHome.insets = new Insets(0, 0, 0, 5);
		gbc_btnHome.gridx = 4;
		gbc_btnHome.gridy = 9;
		contentPane.add(btnHome, gbc_btnHome);
		
		JButton btnRegresar = new JButton(new ImageIcon("src/img/regresar.png"));
		GridBagConstraints gbc_btnRegresar = new GridBagConstraints();//--
		btnRegresar.setPreferredSize(new Dimension(35, 35));//--
		btnRegresar.setBorder(new LineBorder(Color.white));//--
		btnRegresar.setBackground(Color.white);//codigo de metodos diseno
		gbc_btnRegresar.insets = new Insets(0, 0, 0, 5);
		gbc_btnRegresar.gridx = 5;
		gbc_btnRegresar.gridy = 9;
		contentPane.add(btnRegresar, gbc_btnRegresar);
		
		JLabel lbTotal = new JLabel("Total ");
		lbTotal.setFont(new Font("Tahoma", Font.PLAIN, 24));
		GridBagConstraints gbc_lbTotal = new GridBagConstraints();
		gbc_lbTotal.anchor = GridBagConstraints.EAST;
		gbc_lbTotal.insets = new Insets(0, 0, 0, 5);
		gbc_lbTotal.gridx = 6;
		gbc_lbTotal.gridy = 9;
		contentPane.add(lbTotal, gbc_lbTotal);
		
		jtTotal = new JTextField();
		jtTotal.setColumns(10);
		GridBagConstraints gbc_jtTotal = new GridBagConstraints();
		gbc_jtTotal.fill = GridBagConstraints.BOTH;
		gbc_jtTotal.gridx = 7;
		gbc_jtTotal.gridy = 9;
		contentPane.add(jtTotal, gbc_jtTotal);
	}

}
