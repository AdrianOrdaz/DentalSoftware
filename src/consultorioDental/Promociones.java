package consultorioDental;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Promociones extends MetodosDiseño implements ActionListener{

	private JPanel contentPane;
	private JTable tbPromociones;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Promociones frame = new Promociones();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	protected Promociones() {
		setTitle("Consultorio Dental/Promociones");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setExtendedState(MAXIMIZED_BOTH);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		setContentPane(contentPane);
		contentPane.setLayout(new GridBagLayout());
		
		JLabel lbPromociones = new JLabel("Promociones");
		lbPromociones.setFont(new Font("Open Sans", Font.PLAIN, 40));
		GridBagConstraints gbc_lbPromociones = new GridBagConstraints();
		adjustComponents(gbc_lbPromociones,0,0,5,1,1.0,1.0,GridBagConstraints.NORTH);
		contentPane.add(lbPromociones, gbc_lbPromociones);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		adjustComponents(gbc_scrollPane,0,1,5,2,1.0,1.0,GridBagConstraints.NORTH);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		contentPane.add(scrollPane, gbc_scrollPane);
		
		tbPromociones = new JTable();
		tbPromociones.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"", "No.", "Descripci\u00F3n ", "Costo", "D\u00EDa en que aplica", "Procentaje ahorrado", "Dinero ahorrado", "T\u00E9rminos y condiciones"
			}
		) {
			Class[] columnTypes = new Class[] {
				Boolean.class, Short.class, String.class, Float.class, String.class, String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		scrollPane.setViewportView(tbPromociones);
	
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setEnabled(false);
		GridBagConstraints gbc_btnEliminar = new GridBagConstraints();
		adjustButton(btnEliminar,gbc_btnEliminar,contentPane,3,3,1,1,1.0,1.0,GridBagConstraints.CENTER);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setEnabled(false);
		GridBagConstraints gbc_btnEditar = new GridBagConstraints();
		adjustButton(btnEditar,gbc_btnEditar,contentPane,2,3,1,1,0.0,1.0,GridBagConstraints.CENTER);
		
		JButton btnAgregar = new JButton("Agregar");
		GridBagConstraints gbc_btnAgregar = new GridBagConstraints();
		adjustButton(btnAgregar,gbc_btnAgregar,contentPane,1,3,1,1,0.0,1.0,GridBagConstraints.CENTER);
		btnAgregar.addActionListener(this);
		
		buttonHome(this,true,new GridBagConstraints(),contentPane,4,3,1,1,0.0,1.0,GridBagConstraints.CENTER);
	}
	
	public void actionPerformed(ActionEvent e) {
		switch(e.getActionCommand())
		{
			case "Agregar":
				AgregarPromocion ap = new AgregarPromocion();
				ap.setVisible(true);
				this.setVisible(false);
			break;
		}
		
	}

}
