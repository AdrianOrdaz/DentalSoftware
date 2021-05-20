package consultorioDental;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Font;
import java.awt.Insets;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
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

	public static void main(String[] args) {
		EntradaSalidaMedicamentos fg = new EntradaSalidaMedicamentos(); //nombre del archivo
		fg.CrearGui();
	}
	private void  CrearGui() {
		JFrame fCR = new JFrame("Entrada salida medicamentos");
		Container con = this.getContentPane();
		con = fCR.getContentPane();
		con.setLayout(new GridBagLayout());
		
		fCR.pack();
		fCR.setExtendedState(JFrame.MAXIMIZED_BOTH);
		fCR.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fCR.setVisible(true);
		con.setBackground(Color.WHITE);
		
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{257, 297, 119, 206, 95, 77, 194, 0};
		gbl_contentPane.rowHeights = new int[]{40, 56, 56, 50, 440, 49, 37, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		con.setLayout(gbl_contentPane);
		
		JLabel lbTitulo1 = new JLabel("Entrada / Salida de");
		lbTitulo1.setFont(new Font("Tahoma", Font.PLAIN, 46));
		GridBagConstraints gbc_lbTitulo1 = new GridBagConstraints();
		gbc_lbTitulo1.anchor = GridBagConstraints.NORTHWEST;
		gbc_lbTitulo1.insets = new Insets(0, 0, 5, 5);
		gbc_lbTitulo1.gridwidth = 2;
		gbc_lbTitulo1.gridx = 1;
		gbc_lbTitulo1.gridy = 1;
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
		lbTitulo2.setFont(new Font("Tahoma", Font.PLAIN, 46));
		GridBagConstraints gbc_lbTitulo2 = new GridBagConstraints();
		gbc_lbTitulo2.anchor = GridBagConstraints.NORTHWEST;
		gbc_lbTitulo2.insets = new Insets(0, 0, 5, 5);
		gbc_lbTitulo2.gridx = 1;
		gbc_lbTitulo2.gridy = 2;
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
		gbc_spProductos.gridy = 4;
		con.add(spProductos, gbc_spProductos);
		
		tbProductos = new JTable();
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
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
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
		btnImprimir.setFont(new Font("Tahoma", Font.PLAIN, 24));
		GridBagConstraints gbc_btnImprimir = new GridBagConstraints();
		gbc_btnImprimir.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnImprimir.insets = new Insets(0, 0, 0, 5);
		gbc_btnImprimir.gridx = 1;
		gbc_btnImprimir.gridy = 6;
		con.add(btnImprimir, gbc_btnImprimir);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setFont(new Font("Tahoma", Font.PLAIN, 24));
		GridBagConstraints gbc_btnGuardar = new GridBagConstraints();
		gbc_btnGuardar.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnGuardar.insets = new Insets(0, 0, 0, 5);
		gbc_btnGuardar.gridx = 2;
		gbc_btnGuardar.gridy = 6;
		con.add(btnGuardar, gbc_btnGuardar);
		
		JButton btnHome = new JButton(new ImageIcon("src/img/home.png"));
		btnHome.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnHome.setPreferredSize(new Dimension(35, 35));
		btnHome.setBorder(new LineBorder(Color.white));
		GridBagConstraints gbc_btnHome = new GridBagConstraints();
		gbc_btnHome.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnHome.insets = new Insets(0, 0, 0, 5);
		gbc_btnHome.gridx = 4;
		gbc_btnHome.gridy = 6;
		con.add(btnHome, gbc_btnHome);
		
		JButton btnReturn = new JButton(new ImageIcon("src/img/regresar.png"));
		btnReturn.setPreferredSize(new Dimension(35, 35));
		btnReturn.setBorder(new LineBorder(Color.white));
		btnReturn.setBackground(Color.white);
		btnReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnReturn = new GridBagConstraints();
		gbc_btnReturn.anchor = GridBagConstraints.NORTH;
		gbc_btnReturn.gridx = 6;
		gbc_btnReturn.gridy = 6;
		con.add(btnReturn, gbc_btnReturn);
		
		fCR.revalidate();
		fCR.repaint();
	}
}
