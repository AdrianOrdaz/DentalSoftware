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
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class realizarpedido extends metodosDiseño{

	static realizarpedido frame;
	private JPanel contentPane;
	private JTextField jtProveedor;
	private JTextField jtDate;
	private JTable tbProductos;
	private JTextField jtTotal;
	private JTextField jtElaborado;
	private JTextField jtAutorizado;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new realizarpedido();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public realizarpedido() {
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
		gbl_contentPane.columnWidths = new int[]{62, 59, 0, 499, 90, 103, 99, 135, 77, 0};
		gbl_contentPane.rowHeights = new int[]{0, 72, 55, 49, 365, 69, 0, 63, 55, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 1.0, 1.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lbRealizarPedido = new JLabel("Realizar un pedido");
		lbRealizarPedido.setFont(new Font("Tahoma", Font.PLAIN, 31));
		GridBagConstraints gbc_lbRealizarPedido = new GridBagConstraints();
		gbc_lbRealizarPedido.insets = new Insets(0, 0, 5, 5);
		gbc_lbRealizarPedido.gridx = 2;
		gbc_lbRealizarPedido.gridy = 1;
		contentPane.add(lbRealizarPedido, gbc_lbRealizarPedido);
		
		
		JLabel lbProveedor = new JLabel("Proveedor:");
		lbProveedor.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lbProveedor = new GridBagConstraints();
		gbc_lbProveedor.anchor = GridBagConstraints.EAST;
		gbc_lbProveedor.insets = new Insets(0, 0, 5, 5);
		gbc_lbProveedor.gridx = 1;
		gbc_lbProveedor.gridy = 2;
		contentPane.add(lbProveedor, gbc_lbProveedor);
		
		jtProveedor = new JTextField();
		jtProveedor.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_jtProveedor = new GridBagConstraints();
		gbc_jtProveedor.insets = new Insets(0, 0, 5, 5);
		gbc_jtProveedor.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtProveedor.gridx = 2;
		gbc_jtProveedor.gridy = 2;
		contentPane.add(jtProveedor, gbc_jtProveedor);
		jtProveedor.setColumns(10);
		
		JLabel lbDate = new JLabel("Fecha de pedido");
		lbDate.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lbDate = new GridBagConstraints();
		gbc_lbDate.anchor = GridBagConstraints.EAST;
		gbc_lbDate.insets = new Insets(0, 0, 5, 5);
		gbc_lbDate.gridx = 1;
		gbc_lbDate.gridy = 3;
		contentPane.add(lbDate, gbc_lbDate);
		
		jtDate = new JTextField();
		jtDate.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_jtDate = new GridBagConstraints();
		gbc_jtDate.insets = new Insets(0, 0, 5, 5);
		gbc_jtDate.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtDate.gridx = 2;
		gbc_jtDate.gridy = 3;
		contentPane.add(jtDate, gbc_jtDate);
		jtDate.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 3;
		gbc_scrollPane.gridy = 4;
		contentPane.add(scrollPane, gbc_scrollPane);
		
		tbProductos = new JTable();
		tbProductos.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"No.", "Art\u00EDculo", "Cantidad", "Precio unitario", "Precio Total"
			}
		) {
			Class[] columnTypes = new Class[] {
				Short.class, String.class, Integer.class, Float.class, Float.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		tbProductos.setFont(new Font("Tahoma", Font.PLAIN, 14));
		scrollPane.setViewportView(tbProductos);
		
		JLabel lbElaborado = new JLabel("Elaborado po:");
		lbElaborado.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lbElaborado = new GridBagConstraints();
		gbc_lbElaborado.anchor = GridBagConstraints.EAST;
		gbc_lbElaborado.insets = new Insets(0, 0, 5, 5);
		gbc_lbElaborado.gridx = 1;
		gbc_lbElaborado.gridy = 5;
		contentPane.add(lbElaborado, gbc_lbElaborado);
		
		jtElaborado = new JTextField();
		jtElaborado.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_jtElaborado = new GridBagConstraints();
		gbc_jtElaborado.insets = new Insets(0, 0, 5, 5);
		gbc_jtElaborado.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtElaborado.gridx = 2;
		gbc_jtElaborado.gridy = 5;
		contentPane.add(jtElaborado, gbc_jtElaborado);
		jtElaborado.setColumns(10);
		
		JLabel lbTotal = new JLabel("Total:");
		lbTotal.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lbTotal = new GridBagConstraints();
		gbc_lbTotal.anchor = GridBagConstraints.EAST;
		gbc_lbTotal.insets = new Insets(0, 0, 5, 5);
		gbc_lbTotal.gridx = 4;
		gbc_lbTotal.gridy = 5;
		contentPane.add(lbTotal, gbc_lbTotal);
		
		jtTotal = new JTextField();
		jtTotal.setFont(new Font("Tahoma", Font.PLAIN, 14));
		jtTotal.setText("");
		GridBagConstraints gbc_jtTotal = new GridBagConstraints();
		gbc_jtTotal.insets = new Insets(0, 0, 5, 5);
		gbc_jtTotal.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtTotal.gridx = 5;
		gbc_jtTotal.gridy = 5;
		contentPane.add(jtTotal, gbc_jtTotal);
		jtTotal.setColumns(10);
		
		JLabel lbAutorizado = new JLabel("Autorizado por:");
		lbAutorizado.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lbAutorizado = new GridBagConstraints();
		gbc_lbAutorizado.anchor = GridBagConstraints.EAST;
		gbc_lbAutorizado.insets = new Insets(0, 0, 5, 5);
		gbc_lbAutorizado.gridx = 1;
		gbc_lbAutorizado.gridy = 7;
		contentPane.add(lbAutorizado, gbc_lbAutorizado);
		
		jtAutorizado = new JTextField();
		jtAutorizado.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_jtAutorizado = new GridBagConstraints();
		gbc_jtAutorizado.insets = new Insets(0, 0, 5, 5);
		gbc_jtAutorizado.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtAutorizado.gridx = 2;
		gbc_jtAutorizado.gridy = 7;
		contentPane.add(jtAutorizado, gbc_jtAutorizado);
		jtAutorizado.setColumns(10);
		
		JButton btnImprimir = new JButton("Imprimir");
		btnImprimir.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_btnImprimir = new GridBagConstraints();
		gbc_btnImprimir.insets = new Insets(0, 0, 5, 5);
		gbc_btnImprimir.gridx = 4;
		gbc_btnImprimir.gridy = 7;
		contentPane.add(btnImprimir, gbc_btnImprimir);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_btnEnviar = new GridBagConstraints();
		gbc_btnEnviar.insets = new Insets(0, 0, 5, 5);
		gbc_btnEnviar.gridx = 5;
		gbc_btnEnviar.gridy = 7;
		contentPane.add(btnEnviar, gbc_btnEnviar);
		
		JLabel lbRegresar = new JLabel("");
		lbRegresar.setIcon(new ImageIcon("C:\\Users\\Kevin\\git\\PROYECTO-DE-POO\\src\\img\\regresar.png"));
		GridBagConstraints gbc_lbRegresar = new GridBagConstraints();
		gbc_lbRegresar.anchor = GridBagConstraints.SOUTH;
		gbc_lbRegresar.insets = new Insets(0, 0, 5, 5);
		gbc_lbRegresar.gridx = 0;
		gbc_lbRegresar.gridy = 8;
		contentPane.add(lbRegresar, gbc_lbRegresar);
		
		buttonHome(this,false,new GridBagConstraints(),contentPane, 3,8,1,1,0.0,0.0,GridBagConstraints.CENTER);
	}

}
