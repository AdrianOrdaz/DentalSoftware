package consultorioDental;

import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Font;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.util.Date;

public class RealizarPedido extends MetodosDiseño{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static RealizarPedido frame;
	private JPanel contentPane;
	private JTextField jtProveedor;
	private JTextField jtDate;
	private JTable tbProductos;
	private JTextField jtTotal;
	private JTextField jtAutorizado;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new RealizarPedido();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	protected RealizarPedido() {
		setTitle("Realizar pedido");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		pack();
		this.setExtendedState(MAXIMIZED_BOTH);
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 1.0, 1.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lbRealizarPedido = new JLabel("Realizar un pedido");
		lbRealizarPedido.setFont(new Font("Open Sans", Font.PLAIN, 40));
		GridBagConstraints gbc_lbRealizarPedido = new GridBagConstraints();
		adjustComponents(gbc_lbRealizarPedido,0,0,6,2,0.0,1.0,GridBagConstraints.NORTH);
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
		
		JLabel lbDate = new JLabel("Fecha:");
		lbDate.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lbDate = new GridBagConstraints();
		gbc_lbDate.anchor = GridBagConstraints.EAST;
		gbc_lbDate.insets = new Insets(0, 0, 5, 5);
		gbc_lbDate.gridx = 1;
		gbc_lbDate.gridy = 3;
		contentPane.add(lbDate, gbc_lbDate);
		
		jtDate = new JTextField("" + new Date());
		jtDate.setFont(new Font("Tahoma", Font.PLAIN, 14));
		jtDate.setEditable(false);
		GridBagConstraints gbc_jtDate = new GridBagConstraints();
		gbc_jtDate.insets = new Insets(0, 0, 5, 5);
		gbc_jtDate.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtDate.gridx = 2;
		gbc_jtDate.gridy = 3;
		contentPane.add(jtDate, gbc_jtDate);
		jtDate.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 3;
		gbc_scrollPane.gridy = 4;
		contentPane.add(scrollPane, gbc_scrollPane);
		
		tbProductos = new JTable();
		tbProductos.setModel(new DefaultTableModel(
			new Object[][] {null},
			new String[] {
				"No.", "Art\u00EDculo", "Cantidad", "Precio unitario", "Precio Total"
			}
		) {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			Class[] columnTypes = new Class[] {
				Short.class, String.class, Integer.class, Float.class, Float.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		tbProductos.setFont(new Font("Tahoma", Font.PLAIN, 14));
		scrollPane.setViewportView(tbProductos);
		
		JLabel lbTotal = new JLabel("Total:");
		lbTotal.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lbTotal = new GridBagConstraints();
		gbc_lbTotal.anchor = GridBagConstraints.SOUTH;
		gbc_lbTotal.gridx = 4;
		gbc_lbTotal.gridy = 4;
		contentPane.add(lbTotal, gbc_lbTotal);
		
		jtTotal = new JTextField();
		jtTotal.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_jtTotal = new GridBagConstraints();
		jtTotal.setEditable(false);
		gbc_jtTotal.anchor = GridBagConstraints.SOUTHWEST;
		gbc_jtTotal.gridx = 5;
		gbc_jtTotal.gridy = 4;
		contentPane.add(jtTotal, gbc_jtTotal);
		jtTotal.setColumns(10);
		
		JLabel lbAutorizado = new JLabel("Autorizado por:");
		lbAutorizado.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lbAutorizado = new GridBagConstraints();
		gbc_lbAutorizado.anchor = GridBagConstraints.SOUTHEAST;
		gbc_lbAutorizado.gridx = 1;
		gbc_lbAutorizado.gridy = 4;
		contentPane.add(lbAutorizado, gbc_lbAutorizado);
		
		jtAutorizado = new JTextField();
		jtAutorizado.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_jtAutorizado = new GridBagConstraints();
		jtAutorizado.setEditable(false);
		gbc_jtAutorizado.anchor = GridBagConstraints.SOUTH;
		gbc_jtAutorizado.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtAutorizado.gridx = 2;
		gbc_jtAutorizado.gridy = 4;
		contentPane.add(jtAutorizado, gbc_jtAutorizado);
		jtAutorizado.setColumns(10);
		
		JButton btnImprimir = new JButton("Imprimir");
		adjustButton(btnImprimir,new GridBagConstraints(),contentPane,4,7,1,1,1.0,0.0,GridBagConstraints.CENTER);
		
		JButton btnEnviar = new JButton("Enviar");
		adjustButton(btnEnviar,new GridBagConstraints(),contentPane,5,7,1,1,0.0,0.0,GridBagConstraints.CENTER);
		
		buttonHome(this,false,new GridBagConstraints(),contentPane, 3,7,1,1,0.0,0.0,GridBagConstraints.CENTER);
	}

}
