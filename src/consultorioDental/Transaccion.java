package consultorioDental;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class Transaccion extends MetodosDiseño implements ActionListener
{
	JFrame fCR;
	private JTextField jtIdCompra;
	private JTextField jtNomUsuario;
	private JTextField jtldCita;
	private JTextField jtPromocion;
	private JTextField jtTotal;
	private JTextField jtCantidadfilas;
	private JTable tbProductos;
	JComboBox jcbCantidadfilas = new JComboBox();
	int filas = 1;
	
	String IdCompra,IdCita,Usuario,Promocion,NombreMed,CantCompr,PrecUni,Total;

	public static void main(String[] args) {
		Transaccion fg = new Transaccion(); //nombre del archivo
		fg.crearTransaccionGUI();

	}

	protected JFrame crearTransaccionGUI(){
		fCR = new JFrame("Transaccion");
		Container con = this.getContentPane();
		con = fCR.getContentPane();
		con.setLayout(new GridBagLayout());
		
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{187, 168, 53, 100, 79, 85, 149, 372, 0};
		gbl_contentPane.rowHeights = new int[]{58, 52, 84, 29, 12, 35, 45, 309, 34, 37, 0};
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
		jtIdCompra.setEnabled(false);
		GridBagConstraints gbc_jtIdCompra = new GridBagConstraints();
		gbc_jtIdCompra.fill = GridBagConstraints.BOTH;
		gbc_jtIdCompra.insets = new Insets(0, 0, 5, 5);
		gbc_jtIdCompra.gridwidth = 2;
		gbc_jtIdCompra.gridx = 2;
		gbc_jtIdCompra.gridy = 3;
		con.add(jtIdCompra, gbc_jtIdCompra);
		int A = ((int) Double.parseDouble(UltVal("recibo", 1))+1);
		jtIdCompra.setText(""+A);
		
		JLabel lbUsuario = new JLabel("Nombre del paciente");
		lbUsuario.setFont(new Font("Tahoma", Font.PLAIN, 24));
		GridBagConstraints gbc_lbUsuario = new GridBagConstraints();
		gbc_lbUsuario.anchor = GridBagConstraints.NORTHWEST;
		gbc_lbUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_lbUsuario.gridx = 6;
		gbc_lbUsuario.gridy = 3;
		con.add(lbUsuario, gbc_lbUsuario);
		
		jtNomUsuario = new JTextField();
		jtNomUsuario.setMaximumSize(new Dimension(50, 50));
		jtNomUsuario.setFont(new Font("Tahoma", Font.PLAIN, 14));
		jtNomUsuario.setColumns(10);
		GridBagConstraints gbc_jtIdUsuario = new GridBagConstraints();
		gbc_jtIdUsuario.fill = GridBagConstraints.BOTH;
		gbc_jtIdUsuario.insets = new Insets(0, 0, 5, 0);
		gbc_jtIdUsuario.gridx = 7;
		gbc_jtIdUsuario.gridy = 3;
		con.add(jtNomUsuario, gbc_jtIdUsuario);
		
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
		
		JLabel lbCantidadfilas = new JLabel("Cantidad de filas");
		lbCantidadfilas.setFont(new Font("Tahoma", Font.PLAIN, 24));
		GridBagConstraints gbc_lbCantidadfilas = new GridBagConstraints();
		gbc_lbCantidadfilas.anchor = GridBagConstraints.CENTER;
		gbc_lbCantidadfilas.insets = new Insets(0, 0, 5, 5);
		gbc_lbCantidadfilas.gridx = 5;
		gbc_lbCantidadfilas.gridy = 6;
		con.add(lbCantidadfilas, gbc_lbCantidadfilas);
		
		//la hice global
		jcbCantidadfilas.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jcbCantidadfilas.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5","-1"}));
		GridBagConstraints gbcjcbCantidadfilas = new GridBagConstraints();
		gbcjcbCantidadfilas.insets = new Insets(0, 0, 5, 0);
		gbcjcbCantidadfilas.gridx = 6;
		gbcjcbCantidadfilas.gridy = 6;
		con.add(jcbCantidadfilas, gbcjcbCantidadfilas);
		
//		jtCantidadfilas = new JTextField();
//		jtCantidadfilas.setColumns(10);
//		GridBagConstraints gbc_jtjtCantidadfilas = new GridBagConstraints();
//		gbc_jtjtCantidadfilas.fill = GridBagConstraints.BOTH;
//		gbc_jtjtCantidadfilas.insets = new Insets(5,5,5,5);
//		gbc_jtjtCantidadfilas.gridx = 6;
//		gbc_jtjtCantidadfilas.gridy = 6;
//		con.add(jtCantidadfilas, gbc_jtjtCantidadfilas);
		
		JButton btnOK = new JButton("Añadir");
		btnOK.setFont(new Font("Tahoma", Font.PLAIN, 24));
		GridBagConstraints gbc_btnOK = new GridBagConstraints();
		gbc_btnOK.anchor = GridBagConstraints.WEST;
		gbc_btnOK.insets = new Insets(0, 0, 5, 0);
		gbc_btnOK.gridx = 7;
		gbc_btnOK.gridy = 6;
		con.add(btnOK, gbc_btnOK);
		btnOK.addActionListener(this);
		
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
				"Nombre medicamento", "Cantidad a comprar", "Cantidad en inventario", "Precio Unitario"
			}
		));
		tbProductos.getColumnModel().getColumn(0).setPreferredWidth(94);
		tbProductos.getColumnModel().getColumn(1).setPreferredWidth(128);
		tbProductos.getColumnModel().getColumn(2).setPreferredWidth(108);
		tbProductos.getColumnModel().getColumn(3).setPreferredWidth(129);
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
		btnComprobar.addActionListener(this);
		
		
		JButton btnGenerar = new JButton("Generar");
		btnGenerar.setFont(new Font("Tahoma", Font.PLAIN, 24));
		GridBagConstraints gbc_btnGenerar = new GridBagConstraints();
		gbc_btnGenerar.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnGenerar.insets = new Insets(0, 0, 0, 5);
		gbc_btnGenerar.gridx = 3;
		gbc_btnGenerar.gridy = 9;
		con.add(btnGenerar, gbc_btnGenerar);
		btnGenerar.addActionListener(this);
		
		GridBagConstraints gbc_btnHome = new GridBagConstraints();
		buttonHome(fCR, false, gbc_btnHome, con, 4, 9, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER);
		
		GridBagConstraints gbc_btnRegresar = new GridBagConstraints();//--
		gbc_btnRegresar.insets = new Insets(0, 0, 0, 5);
		AdministrarCaja ac = new AdministrarCaja();
		buttonRegresar(ac.CrearGui(),fCR,gbc_btnRegresar,con,5,9,1,1,0.0,0.0,GridBagConstraints.CENTER);
		
		JLabel lbTotal = new JLabel("Total ");
		lbTotal.setFont(new Font("Tahoma", Font.PLAIN, 24));
		GridBagConstraints gbc_lbTotal = new GridBagConstraints();
		gbc_lbTotal.anchor = GridBagConstraints.EAST;
		gbc_lbTotal.insets = new Insets(0, 0, 0, 5);
		gbc_lbTotal.gridx = 6;
		gbc_lbTotal.gridy = 9;
		con.add(lbTotal, gbc_lbTotal);
		
		jtTotal = new JTextField();
		jtTotal.setEnabled(false);
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
	
	public void actionPerformed(ActionEvent e) {
		switch(e.getActionCommand())
		{
			case "Comprobar":
				String valor11 = (String) tbProductos.getModel().getValueAt(0, 0);
				System.out.println(valor11);
				
				
				//String idDeLaCompra = jtIdCompra.getText();
				//txtA.getText()
				//System.out.println(tbProductos.getModel().getValueAt(1, 1));
			break;
			
			case "Generar":
				int i=1;
				//System.out.println(i+"  "+filas);
				while(filas+1!=i)
				{
					Usuario=jtNomUsuario.getText();
					IdCita=jtldCita.getText();
					Promocion = jtPromocion.getText();//                  y  x
					NombreMed=(String) tbProductos.getModel().getValueAt(i-1, 0);
					CantCompr=(String) tbProductos.getModel().getValueAt(i-1, 1);
					PrecUni=(String) tbProductos.getModel().getValueAt(i-1, 2);
					Total=jtTotal.getText();
					subirFilaCol7("recibo", "pte_rbo", "cita_rbo", "prom_rbo", "usu_rbo", "med_rbo", "indiv_rbo", "tot_rbo",
							Usuario, IdCita, Promocion, "sacarDeFK", NombreMed,PrecUni, Total);
					i++;
				}
			break;
			
			case "Añadir":
			{
				Object combobox = jcbCantidadfilas.getSelectedItem();
				String valorCombobox = ""+combobox;  // pro gamer move muajajaja
				int valor = Integer.parseInt(valorCombobox);
				
				filas = filas + valor;
				if (filas<1)
				{
					filas = 1;
				}
				
				
				
				if(valor>0)
				{
					for(i = 1; i<valor+1; i++)
					{
						DefaultTableModel model = (DefaultTableModel) tbProductos.getModel();
						model.addRow(new Object[]{null, null, null, null, null});
					}
				}
				else
				{
					if(valor<0)
					{
						DefaultTableModel mod = (DefaultTableModel) tbProductos.getModel();
						mod.removeRow(1);
					}		
				}
			}
		}
		
	}
}