package consultorioDental;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.border.LineBorder;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Font;
import java.awt.Insets;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class EntradaSalidaMedicamentos extends MetodosDiseño {

	private JTable tbProductos;
	JFrame fCR;
	public static void main(String[] args) {
		EntradaSalidaMedicamentos fg = new EntradaSalidaMedicamentos(); //nombre del archivo
		fg.CrearGui();
	}
	protected JFrame CrearGui() {
		fCR = new JFrame("Entrada salida medicamentos");
		Container con = this.getContentPane();
		con = fCR.getContentPane();
		con.setLayout(new GridBagLayout());
		
		JLabel lbTitulo1 = new JLabel("Entrada / Salida de");
		lbTitulo1.setFont(new Font("Tahoma", Font.PLAIN, 40));
		GridBagConstraints gbc_lbTitulo1 = new GridBagConstraints();
		gbc_lbTitulo1.anchor = GridBagConstraints.NORTHWEST;
		gbc_lbTitulo1.gridwidth = 2;
		gbc_lbTitulo1.gridx = 0;
		gbc_lbTitulo1.gridy = 0;
		con.add(lbTitulo1, gbc_lbTitulo1);
		
		JLabel lnPeriodo = new JLabel("Periodo de tiempo");
		lnPeriodo.setFont(new Font("Tahoma", Font.PLAIN, 24));
		GridBagConstraints gbc_lnPeriodo = new GridBagConstraints();
		gbc_lnPeriodo.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lnPeriodo.insets = new Insets(0, 0, 5, 0);
		gbc_lnPeriodo.gridx = 6;
		gbc_lnPeriodo.gridy = 1;
		con.add(lnPeriodo, gbc_lnPeriodo);
		
		JLabel lbTitulo2 = new JLabel("medicamentos");
		lbTitulo2.setFont(new Font("Tahoma", Font.PLAIN, 40));
		GridBagConstraints gbc_lbTitulo2 = new GridBagConstraints();
		gbc_lbTitulo2.anchor = GridBagConstraints.NORTHWEST;
		gbc_lbTitulo2.insets = new Insets(0, 0, 5, 5);
		gbc_lbTitulo2.gridx = 1;
		gbc_lbTitulo2.gridy = 1;
		con.add(lbTitulo2, gbc_lbTitulo2);
		
		JComboBox jcbPeriodo = new JComboBox();
		jcbPeriodo.setFont(new Font("Tahoma", Font.PLAIN, 24));
		jcbPeriodo.setModel(new DefaultComboBoxModel(new String[] {"Diario", "Semanal", "Mensual", "Trimestral"}));
		GridBagConstraints gbc_jcbPeriodo = new GridBagConstraints();
		gbc_jcbPeriodo.anchor = GridBagConstraints.NORTH;
		gbc_jcbPeriodo.fill = GridBagConstraints.HORIZONTAL;
		gbc_jcbPeriodo.insets = new Insets(0, 0, 5, 0);
		gbc_jcbPeriodo.gridx = 6;
		gbc_jcbPeriodo.gridy = 2;
		con.add(jcbPeriodo, gbc_jcbPeriodo);
		
		JScrollPane spProductos = new JScrollPane();
		GridBagConstraints gbc_spProductos = new GridBagConstraints();
		gbc_spProductos.fill = GridBagConstraints.BOTH;
		gbc_spProductos.insets = new Insets(0, 0, 5, 0);
		gbc_spProductos.gridwidth = 6;
		gbc_spProductos.gridx = 1;
		gbc_spProductos.gridy = 3;
		con.add(spProductos, gbc_spProductos);
		
		tbProductos = new JTable();
		tbProductos.setModel(new DefaultTableModel(
			new Object[][] {null},
			new String[] {
				"Periodo", "Id", "Medicamento", "Movimiento", "Total"
			}
		));
		JTableHeader tableHeader = tbProductos.getTableHeader();//Estas tres
		Font headerFont = new Font("Verdana", Font.PLAIN, 25); //lineas de codigo
		tableHeader.setFont(headerFont);// Son para cambiar el header
		
		tbProductos.setRowHeight(40);
		spProductos.setViewportView(tbProductos);
		
		JButton btnImprimir = new JButton("Imprimir");
		adjustButton(btnImprimir,new GridBagConstraints(),con,1,4,1,1,0.0,0.0,GridBagConstraints.CENTER);
		
		JButton btnGuardar = new JButton("Guardar");
		adjustButton(btnGuardar,new GridBagConstraints(),con,2,4,1,1,0.0,0.0,GridBagConstraints.WEST);
		
		buttonHome(fCR,false,new GridBagConstraints(),con,4,4,1,1,0.0,1.0,GridBagConstraints.EAST);
		
		fCR.pack();
		fCR.setExtendedState(JFrame.MAXIMIZED_BOTH);
		fCR.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fCR.setVisible(true);
		con.setBackground(Color.WHITE);
		return fCR;
	}
}
