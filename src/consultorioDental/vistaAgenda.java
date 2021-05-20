package consultorioDental;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Insets;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JScrollBar;
import javax.swing.table.DefaultTableModel;

public class vistaAgenda extends metodosDiseño implements ActionListener {

	public static void main(String[] args) 
	{
		vistaAgenda vA = new vistaAgenda();
		vA.crearfA();
	}

	private void crearfA() 
	{
		JFrame fAgenda = new JFrame("Consultorio Dental/Agenda");
		Container con = new Container();
		con = fAgenda.getContentPane();
		GridBagConstraints c = new GridBagConstraints();
		con.setLayout(new GridBagLayout());
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{232, 228, 214, 190, 0};
		gridBagLayout.rowHeights = new int[]{72, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		fAgenda.getContentPane().setLayout(gridBagLayout);
		
		JLabel lbAgenda = new JLabel("Dentistas");
		lbAgenda.setFont (lbAgenda.getFont ().deriveFont (41.0f));
		adjustComponents(c, 1, 0, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER);
		con.add(lbAgenda,c);
		
		JComboBox cbFecha = new JComboBox();
		cbFecha.setToolTipText("Fecha: DD/MM/AAAA");
		GridBagConstraints gbc_cbFecha = new GridBagConstraints();
		gbc_cbFecha.insets = new Insets(0, 0, 5, 5);
		gbc_cbFecha.fill = GridBagConstraints.HORIZONTAL;
		gbc_cbFecha.gridx = 0;
		gbc_cbFecha.gridy = 1;
		fAgenda.getContentPane().add(cbFecha, gbc_cbFecha);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridwidth = 4;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 0);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 2;
		fAgenda.getContentPane().add(scrollPane, gbc_scrollPane);
		
		JTable table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "Paciente", "Hora", "Dentista", "Asistio"
			}
		));
		scrollPane.setViewportView(table);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollPane.setRowHeaderView(scrollBar);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnModificar = new GridBagConstraints();
		gbc_btnModificar.insets = new Insets(0, 0, 5, 5);
		gbc_btnModificar.gridx = 0;
		gbc_btnModificar.gridy = 3;
		fAgenda.getContentPane().add(btnModificar, gbc_btnModificar);
		
		JButton btnEliminar = new JButton("Eliminar");
		adjustButton(btnEliminar, c, con, 2, 3, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER);
		
		JButton btnGuardar = new JButton("Guardar");
		adjustButton(btnGuardar, c, con, 1, 4, 1, 1, 1.0, 0.0, GridBagConstraints.CENTER);
		
		
		fAgenda.pack();
		fAgenda.setExtendedState(JFrame.MAXIMIZED_BOTH);
		fAgenda.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fAgenda.setVisible(true);
		con.setBackground(Color.WHITE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
