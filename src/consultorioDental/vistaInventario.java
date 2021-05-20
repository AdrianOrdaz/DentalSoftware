package consultorioDental;

import java.awt.Color;
import java.awt.Container;
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

public class vistaInventario extends metodosDiseño implements ActionListener{

	public static void main(String[] args) 
	{
		vistaInventario vInv = new vistaInventario();
		vInv.crearInv();
	}


	private void crearInv() 
	{
		JFrame fInv = new JFrame("Consultorio Dental/Inventario");
		Container con = new Container();
		con = fInv.getContentPane();
		GridBagConstraints c = new GridBagConstraints();
		con.setLayout(new GridBagLayout());
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{166, 185, 193, 183, 164, 0};
		gridBagLayout.rowHeights = new int[]{74, 78, 326, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		fInv.getContentPane().setLayout(gridBagLayout);
		
		JLabel lbInventario = new JLabel("Inventario");
		lbInventario.setFont (lbInventario.getFont ().deriveFont (41.0f));
		adjustComponents(c, 2, 0, 1, 1, 1.0, 0.0, GridBagConstraints.CENTER);
		con.add(lbInventario,c);
		
		JLabel lbId_producto = new JLabel("ID Producto: ");
		lbId_producto.setFont (lbId_producto.getFont ().deriveFont (21.0f));
		adjustComponents(c, 1, 1, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER);
		con.add(lbId_producto,c);
		
		JButton btnBuscarId = new JButton("Buscar");
		btnBuscarId.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JTextField textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 2;
		gbc_textField.gridy = 1;
		fInv.getContentPane().add(textField, gbc_textField);
		textField.setColumns(10);
		GridBagConstraints gbc_btnBuscarId = new GridBagConstraints();
		gbc_btnBuscarId.insets = new Insets(0, 0, 5, 5);
		gbc_btnBuscarId.gridx = 3;
		gbc_btnBuscarId.gridy = 1;
		fInv.getContentPane().add(btnBuscarId, gbc_btnBuscarId);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridwidth = 5;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 0);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 2;
		fInv.getContentPane().add(scrollPane, gbc_scrollPane);
		
		JTable table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "Nombre", "Descripcion", "Cant.", "Compra", "Venta"
			}
		));
		scrollPane.setViewportView(table);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollPane.setRowHeaderView(scrollBar);
		
		JButton btnAgregar = new JButton("Agregar");
		adjustButton(btnAgregar, c, con, 0, 4, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER);
		
		JButton btnEliminar = new JButton("Eliminar");
		adjustButton(btnEliminar, c, con, 4, 4, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER);
		
		JButton btnModificar = new JButton("Modificar");
		adjustButton(btnModificar, c, con, 2, 4, 1, 1, 1.0, 0.0, GridBagConstraints.CENTER);
		
		JButton btnGuardar = new JButton("Guardar");
		adjustButton(btnGuardar, c, con, 2, 6, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER);
				
		JButton btnHome = new JButton(new ImageIcon("src/img/home.png"));
		GridBagConstraints gbc_btnHome = new GridBagConstraints();
		btnHome.setPreferredSize(new Dimension(35, 35));
		btnHome.setBorder(new LineBorder(Color.white));
		gbc_btnHome.gridx = 4;
		gbc_btnHome.gridy = 7;
		gbc_btnHome.weighty = 1.0;
		fInv.getContentPane().add(btnHome, gbc_btnHome);
		
		fInv.pack();
		fInv.setExtendedState(JFrame.MAXIMIZED_BOTH);
		fInv.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fInv.setVisible(true);
		con.setBackground(Color.WHITE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
