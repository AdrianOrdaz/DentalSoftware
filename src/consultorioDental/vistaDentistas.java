package consultorioDental;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JScrollPane;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTable;
import javax.swing.JScrollBar;
import javax.swing.table.DefaultTableModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.border.LineBorder;

public class vistaDentistas extends metodosDiseño implements ActionListener{

	public static void main(String[] args) 
	{
		vistaDentistas vD = new vistaDentistas();
		vD.crearfD();
	}

	private void crearfD() 
	{
		
		JFrame fD = new JFrame("Consultorio Dental/Dentistas");
		Container con = new Container();
		con = fD.getContentPane();
		GridBagConstraints c = new GridBagConstraints();
		con.setLayout(new GridBagLayout());

		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{312, 323, 319, 51};
		gridBagLayout.rowHeights = new int[]{72, 298, 57, 55, 49, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		fD.getContentPane().setLayout(gridBagLayout);
		
		JLabel lbDentistas = new JLabel("Dentistas");
		lbDentistas.setFont (lbDentistas.getFont ().deriveFont (41.0f));
		adjustComponents(c, 1, 0, 1, 1, 1.0, 1.0, GridBagConstraints.CENTER);
		con.add(lbDentistas,c);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.insets = new Insets(0, 0, 5, 0);
		gbc_scrollPane.gridwidth = 4;
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 1;
		fD.getContentPane().add(scrollPane, gbc_scrollPane);
		
		JTable table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "Nombre", "Info. Adicional"
			}
		));
		scrollPane.setViewportView(table);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollPane.setRowHeaderView(scrollBar);
		
		JButton btnAgregar = new JButton("Agregar");
		adjustButton(btnAgregar, c, con, 0, 2, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER);
		
		JButton btnEliminar = new JButton("Eliminar");
		adjustButton(btnEliminar, c, con, 2, 2, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER);
		
		JButton btnGuardar = new JButton("Guardar");
		adjustButton(btnGuardar, c, con, 1, 3, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER);
		
		JButton btnHome = new JButton(new ImageIcon("src/img/home.png"));
		GridBagConstraints gbc_btnHome = new GridBagConstraints();
		btnHome.setPreferredSize(new Dimension(35, 35));
		btnHome.setBorder(new LineBorder(Color.white));
		gbc_btnHome.gridx = 2;
		gbc_btnHome.gridy = 4;
		gbc_btnHome.weightx = 1.0;
		fD.getContentPane().add(btnHome, gbc_btnHome);
		
		fD.pack();
		fD.setExtendedState(JFrame.MAXIMIZED_BOTH);
		fD.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fD.setVisible(true);
		con.setBackground(Color.WHITE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}

}
