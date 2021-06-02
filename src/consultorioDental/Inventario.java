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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollBar;

public class Inventario extends MetodosDiseño implements ActionListener{
	JFrame fInv;
	JButton btnEliminar;
	JButton btnEditar;
	JTable tbInventario;
	public static void main(String[] args) 
	{
		Inventario vInv = new Inventario();
		vInv.crearInv();
	}


	protected JFrame crearInv() 
	{
		fInv = new JFrame("Consultorio Dental/Inventario");
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
		lbInventario.setFont (lbInventario.getFont ().deriveFont (40.0f));
		adjustComponents(c, 0, 0, 5, 1, 1.0, 1.0, GridBagConstraints.NORTH);
		con.add(lbInventario,c);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridwidth = 5;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 0);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 2;
		fInv.getContentPane().add(scrollPane, gbc_scrollPane);
		String [] nomColumnas = {"ID", "Nombre", "Descripcion", "Cant.", "Compra","Venta"};
		tbInventario = new JTable();
		tbInventario.getTableHeader().setReorderingAllowed(false);
		scrollPane.setViewportView(tbInventario);
		JScrollBar scrollBar = new JScrollBar();
		scrollPane.setRowHeaderView(scrollBar);
		
		btnEliminar = new JButton("Eliminar");
		adjustButton(btnEliminar, c, con, 0, 4, 1, 1, 0.0, 0.0, GridBagConstraints.ABOVE_BASELINE_TRAILING);
		
		btnEditar = new JButton("Editar");
		btnEditar.setEnabled(true);
		adjustButton(btnEditar, c, con, 1, 4, 1, 1, 1.0, 0.0, GridBagConstraints.CENTER);
		
		buttonHome(fInv,true,new GridBagConstraints(),con,3,4,1,1,1.0,1.0,GridBagConstraints.EAST);
		
		fInv.pack();
		fInv.setExtendedState(JFrame.MAXIMIZED_BOTH);
		fInv.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fInv.setVisible(true);
		con.setBackground(Color.WHITE);
		return fInv;
	}

	public void actionPerformed(ActionEvent e) {
		
	}

}
