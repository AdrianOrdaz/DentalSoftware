package consultorioDental;

import java.awt.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class Transaccion extends MetodosDiseño
{
	JFrame fCR;
	private JTextField jtIdCompra;
	private JTextField jtIdUsuario;
	private JTextField jtldCita;
	private JTextField jtPromocion;
	private JTextField jtTotal;
	private JTable tbProductos;

	public static void main(String[] args) {
		Transaccion fg = new Transaccion(); //nombre del archivo
		fg.crearTransaccionGUI();

	}

<<<<<<< HEAD
	void CrearTransaccionGUI(){
		//Llama a la creacion del gui
		JFrame fCR = new JFrame("Transaccion");
=======
	protected JFrame crearTransaccionGUI(){
		fCR = new JFrame("Transaccion");
>>>>>>> refs/heads/MetodosBD
		Container con = this.getContentPane();
		con = fCR.getContentPane();
		con.setLayout(new GridBagLayout());
		
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{187, 168, 53, 203, 79, 85, 149, 372, 0};
		gbl_contentPane.rowHeights = new int[]{58, 52, 84, 29, 45, 29, 36, 309, 34, 37, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		con.setLayout(gbl_contentPane);
		
		JLabel lbTitulo = new JLabel("Transaccion");
		lbTitulo.setFont(new Font("Tahoma", Font.PLAIN, 43));
		GridBagConstraints gbc_lbTitulo = new GridBagConstraints();
		adjustComponents(gbc_lbTitulo,1,1,2,0,0.0,0.0,GridBagConstraints.NORTHWEST);
		gbc_lbTitulo.insets = new Insets(0, 0, 5, 5);
		con.add(lbTitulo, gbc_lbTitulo);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");  
		LocalDateTime now = LocalDateTime.now();  //imprime fecha
		JLabel lbFecha = new JLabel(dtf.format(now)); //https://www.javatpoint.com/java-get-current-date
		lbFecha.setFont(new Font("Tahoma", Font.PLAIN, 24));
		GridBagConstraints gbc_lbFecha = new GridBagConstraints();
		gbc_lbFecha.insets = new Insets(0, 0, 5, 0);
		gbc_lbFecha.gridx = 7;
		gbc_lbFecha.gridy = 1;
		con.add(lbFecha, gbc_lbFecha);
		
		JLabel lbIdCompra = new JLabel("Id de la compra");
		lbIdCompra.setFont(new Font("Tahoma", Font.PLAIN, 24));
		GridBagConstraints gbc_lbIdCompra = new GridBagConstraints();
		gbc_lbIdCompra.anchor = GridBagConstraints.NORTHWEST;
		gbc_lbIdCompra.insets = new Insets(0, 0, 5, 5);
		gbc_lbIdCompra.gridx = 1;
		gbc_lbIdCompra.gridy = 3;
		con.add(lbIdCompra, gbc_lbIdCompra);
		
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
		con.add(jtIdCompra, gbc_jtIdCompra);
		
		JLabel lbIdUsuario = new JLabel("Id del usuario");
		lbIdUsuario.setFont(new Font("Tahoma", Font.PLAIN, 24));
		GridBagConstraints gbc_lbIdUsuario = new GridBagConstraints();
		gbc_lbIdUsuario.anchor = GridBagConstraints.NORTHWEST;
		gbc_lbIdUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_lbIdUsuario.gridx = 6;
		gbc_lbIdUsuario.gridy = 3;
		con.add(lbIdUsuario, gbc_lbIdUsuario);
		
		jtIdUsuario = new JTextField();
		jtIdUsuario.setMaximumSize(new Dimension(50, 50));
		jtIdUsuario.setFont(new Font("Tahoma", Font.PLAIN, 14));
		jtIdUsuario.setColumns(10);
		GridBagConstraints gbc_jtIdUsuario = new GridBagConstraints();
		gbc_jtIdUsuario.fill = GridBagConstraints.BOTH;
		gbc_jtIdUsuario.insets = new Insets(0, 0, 5, 0);
		gbc_jtIdUsuario.gridx = 7;
		gbc_jtIdUsuario.gridy = 3;
		con.add(jtIdUsuario, gbc_jtIdUsuario);
		
		JLabel lbIdCita = new JLabel("Id de la cita");
		lbIdCita.setFont(new Font("Tahoma", Font.PLAIN, 24));
		GridBagConstraints gbc_lbIdCita = new GridBagConstraints();
		gbc_lbIdCita.anchor = GridBagConstraints.NORTHWEST;
		gbc_lbIdCita.insets = new Insets(0, 0, 5, 5);
		gbc_lbIdCita.gridx = 1;
		gbc_lbIdCita.gridy = 5;
		con.add(lbIdCita, gbc_lbIdCita);
		
		jtldCita = new JTextField();
		jtldCita.setColumns(10);
		GridBagConstraints gbc_jtldCita = new GridBagConstraints();
		gbc_jtldCita.fill = GridBagConstraints.BOTH;
		gbc_jtldCita.insets = new Insets(0, 0, 5, 5);
		gbc_jtldCita.gridwidth = 2;
		gbc_jtldCita.gridx = 2;
		gbc_jtldCita.gridy = 5;
		con.add(jtldCita, gbc_jtldCita);
		
		JLabel lbPromocion = new JLabel("Promocion");
		lbPromocion.setFont(new Font("Tahoma", Font.PLAIN, 24));
		GridBagConstraints gbc_lbPromocion = new GridBagConstraints();
		gbc_lbPromocion.anchor = GridBagConstraints.NORTHWEST;
		gbc_lbPromocion.insets = new Insets(0, 0, 5, 5);
		gbc_lbPromocion.gridx = 6;
		gbc_lbPromocion.gridy = 5;
		con.add(lbPromocion, gbc_lbPromocion);
		
		jtPromocion = new JTextField();
		jtPromocion.setColumns(10);
		GridBagConstraints gbc_jtPromocion = new GridBagConstraints();
		gbc_jtPromocion.fill = GridBagConstraints.BOTH;
		gbc_jtPromocion.insets = new Insets(0, 0, 5, 0);
		gbc_jtPromocion.gridx = 7;
		gbc_jtPromocion.gridy = 5;
		con.add(jtPromocion, gbc_jtPromocion);
		
		JScrollPane spProductos = new JScrollPane();
		GridBagConstraints gbc_spProductos = new GridBagConstraints();
		gbc_spProductos.fill = GridBagConstraints.BOTH;
		gbc_spProductos.insets = new Insets(0, 0, 5, 0);
		gbc_spProductos.gridwidth = 7;
		gbc_spProductos.gridx = 1;
		gbc_spProductos.gridy = 7;
		con.add(spProductos, gbc_spProductos);
		
		tbProductos = new JTable();
		tbProductos.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tbProductos.setModel(new DefaultTableModel(
			new Object[][] {null},
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
		con.add(btnComprobar, gbc_btnComprobar);
		
		JButton btnGenerar = new JButton("Generar");
		btnGenerar.setFont(new Font("Tahoma", Font.PLAIN, 24));
		GridBagConstraints gbc_btnGenerar = new GridBagConstraints();
		gbc_btnGenerar.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnGenerar.insets = new Insets(0, 0, 0, 5);
		gbc_btnGenerar.gridx = 3;
		gbc_btnGenerar.gridy = 9;
		con.add(btnGenerar, gbc_btnGenerar);
		
		GridBagConstraints gbc_btnHome = new GridBagConstraints();
		buttonHome(fCR, false, gbc_btnHome, con, 4, 9, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER);
		
<<<<<<< HEAD
		AdministrarCaja ad = new AdministrarCaja();
		buttonRegresar(this,fCR,new GridBagConstraints(),con,5,9,1,1,0.0,0.0,GridBagConstraints.CENTER);
=======
		GridBagConstraints gbc_btnRegresar = new GridBagConstraints();//--
		gbc_btnRegresar.insets = new Insets(0, 0, 0, 5);
		AdministrarCaja ac = new AdministrarCaja();
		buttonRegresar(ac.CrearGui(),fCR,gbc_btnRegresar,con,5,9,1,1,0.0,0.0,GridBagConstraints.CENTER);
>>>>>>> refs/heads/MetodosBD
		
		JLabel lbTotal = new JLabel("Total ");
		lbTotal.setFont(new Font("Tahoma", Font.PLAIN, 24));
		GridBagConstraints gbc_lbTotal = new GridBagConstraints();
		gbc_lbTotal.anchor = GridBagConstraints.EAST;
		gbc_lbTotal.insets = new Insets(0, 0, 0, 5);
		gbc_lbTotal.gridx = 6;
		gbc_lbTotal.gridy = 9;
		con.add(lbTotal, gbc_lbTotal);
		
		jtTotal = new JTextField();
		jtTotal.setColumns(10);
		GridBagConstraints gbc_jtTotal = new GridBagConstraints();
		gbc_jtTotal.fill = GridBagConstraints.BOTH;
		gbc_jtTotal.gridx = 7;
		gbc_jtTotal.gridy = 9;
		con.add(jtTotal, gbc_jtTotal);
		
		fCR.pack();
		fCR.setExtendedState(JFrame.MAXIMIZED_BOTH);
		fCR.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fCR.setVisible(true);
		ac.fCR.setVisible(false);
		con.setBackground(Color.WHITE);
		return fCR;
	}
}