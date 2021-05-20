package consultorioDental;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Font;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class MovimientoExtraordinario extends MetodosDiseño {

	private JTextField jtMonto;
	private JTable tbLista;

	public static void main(String[] args) {
		MovimientoExtraordinario fg = new MovimientoExtraordinario(); //nombre del archivo
		fg.CrearGui();
	}

	private void  CrearGui() {
		JFrame fCR = new JFrame("Administrar Caja");
		//setBounds(100, 100, 1001, 622);
		Container con = this.getContentPane();
		con = fCR.getContentPane();
		con.setLayout(new GridBagLayout());
		
		fCR.pack();
		fCR.setExtendedState(JFrame.MAXIMIZED_BOTH);
		fCR.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fCR.setVisible(true);
		con.setBackground(Color.WHITE);
		
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{180, 244, 72, 166, 160, 160, 0};
		gbl_contentPane.rowHeights = new int[]{62, 55, 50, 29, 31, 47, 29, 136, 54, 37, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		con.setLayout(gbl_contentPane);
		
		JLabel lbTitulo = new JLabel("Movimiento extraordinario");
		lbTitulo.setFont(new Font("Tahoma", Font.PLAIN, 45));
		GridBagConstraints gbc_lbTitulo = new GridBagConstraints();
		gbc_lbTitulo.anchor = GridBagConstraints.NORTHWEST;
		gbc_lbTitulo.insets = new Insets(0, 0, 5, 5);
		gbc_lbTitulo.gridwidth = 4;
		gbc_lbTitulo.gridx = 1;
		gbc_lbTitulo.gridy = 1;
		con.add(lbTitulo, gbc_lbTitulo);
		
		JLabel lbMonto = new JLabel("Monto a mover");
		lbMonto.setFont(new Font("Tahoma", Font.PLAIN, 24));
		GridBagConstraints gbc_lbMonto = new GridBagConstraints();
		gbc_lbMonto.anchor = GridBagConstraints.NORTHWEST;
		gbc_lbMonto.insets = new Insets(0, 0, 5, 5);
		gbc_lbMonto.gridx = 1;
		gbc_lbMonto.gridy = 3;
		con.add(lbMonto, gbc_lbMonto);
		
		JLabel lbLista = new JLabel("Lista");
		lbLista.setFont(new Font("Tahoma", Font.PLAIN, 24));
		GridBagConstraints gbc_lbLista = new GridBagConstraints();
		gbc_lbLista.gridwidth = 2;
		gbc_lbLista.anchor = GridBagConstraints.NORTH;
		gbc_lbLista.fill = GridBagConstraints.HORIZONTAL;
		gbc_lbLista.insets = new Insets(0, 0, 5, 5);
		gbc_lbLista.gridx = 3;
		gbc_lbLista.gridy = 3;
		con.add(lbLista, gbc_lbLista);
		
		jtMonto = new JTextField();
		jtMonto.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jtMonto.setColumns(10);
		GridBagConstraints gbc_jtMonto = new GridBagConstraints();
		gbc_jtMonto.anchor = GridBagConstraints.NORTH;
		gbc_jtMonto.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtMonto.insets = new Insets(0, 0, 5, 5);
		gbc_jtMonto.gridx = 1;
		gbc_jtMonto.gridy = 4;
		con.add(jtMonto, gbc_jtMonto);
		
		JScrollPane spLista = new JScrollPane();
		GridBagConstraints gbc_spLista = new GridBagConstraints();
		gbc_spLista.gridwidth = 2;
		gbc_spLista.fill = GridBagConstraints.BOTH;
		gbc_spLista.insets = new Insets(0, 0, 5, 5);
		gbc_spLista.gridheight = 4;
		gbc_spLista.gridx = 3;
		gbc_spLista.gridy = 4;
		con.add(spLista, gbc_spLista);
		
		tbLista = new JTable();
		tbLista.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
			},
			new String[] {
				"Monto", "Motivo"
			}
		));
		tbLista.getColumnModel().getColumn(0).setPreferredWidth(69);
		tbLista.getColumnModel().getColumn(1).setPreferredWidth(134);
		tbLista.setRowHeight(30);
		tbLista.setFont(new Font("Tahoma", Font.PLAIN, 20));
		spLista.setViewportView(tbLista);
		
		JLabel lbMotivo = new JLabel("Motivo");
		lbMotivo.setFont(new Font("Tahoma", Font.PLAIN, 24));
		GridBagConstraints gbc_lbMotivo = new GridBagConstraints();
		gbc_lbMotivo.anchor = GridBagConstraints.NORTHWEST;
		gbc_lbMotivo.insets = new Insets(0, 0, 5, 5);
		gbc_lbMotivo.gridx = 1;
		gbc_lbMotivo.gridy = 6;
		con.add(lbMotivo, gbc_lbMotivo);
		
		JScrollPane spMotivo = new JScrollPane();
		
		JTextArea jtaMotivo = new JTextArea();
		jtaMotivo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		spMotivo.setViewportView(jtaMotivo);
		GridBagConstraints gbc_spMotivo = new GridBagConstraints();
		gbc_spMotivo.fill = GridBagConstraints.BOTH;
		gbc_spMotivo.insets = new Insets(0, 0, 5, 5);
		gbc_spMotivo.gridx = 1;
		gbc_spMotivo.gridy = 7;
		con.add(spMotivo, gbc_spMotivo);
		
		JButton btnAnadirMov = new JButton("A\u00F1adir Movimiento");
		btnAnadirMov.setFont(new Font("Tahoma", Font.PLAIN, 24));
		GridBagConstraints gbc_btnAnadirMov = new GridBagConstraints();
		gbc_btnAnadirMov.anchor = GridBagConstraints.NORTH;
		gbc_btnAnadirMov.insets = new Insets(0, 0, 0, 5);
		gbc_btnAnadirMov.gridx = 1;
		gbc_btnAnadirMov.gridy = 9;
		con.add(btnAnadirMov, gbc_btnAnadirMov);
		
		JButton btnOK = new JButton("OK");
		btnOK.setFont(new Font("Tahoma", Font.PLAIN, 24));
		GridBagConstraints gbc_btnOK = new GridBagConstraints();
		gbc_btnOK.insets = new Insets(0, 0, 0, 5);
		gbc_btnOK.gridx = 3;
		gbc_btnOK.gridy = 9;
		con.add(btnOK, gbc_btnOK);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setFont(new Font("Tahoma", Font.PLAIN, 24));
		GridBagConstraints gbc_btnEliminar = new GridBagConstraints();
		gbc_btnEliminar.insets = new Insets(0, 0, 0, 5);
		gbc_btnEliminar.gridx = 4;
		gbc_btnEliminar.gridy = 9;
		con.add(btnEliminar, gbc_btnEliminar);
		
		fCR.revalidate();
		fCR.repaint();
	}
}
