package consultorioDental;

import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class Servicios extends MetodosDiseño implements ActionListener {
	String valor;

	JPanel contentPane;
	JTable tbServicios;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Servicios frame = new Servicios();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	protected Servicios() 
	{
		
		setTitle("Consultorio Dental/Servicios");
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		setContentPane(contentPane);
		contentPane.setLayout(new GridBagLayout());
		
		
		JLabel lbServicios = new JLabel("Servicios");
		lbServicios.setFont(new Font("Open Sans", Font.PLAIN, 40));
		GridBagConstraints gbc_lbServicios = new GridBagConstraints();
		adjustComponents(gbc_lbServicios,0,0,4,1,0.0,1.0,GridBagConstraints.NORTH);
		contentPane.add(lbServicios, gbc_lbServicios);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		adjustComponents(gbc_scrollPane,0,1,4,1,1.0,1.0,GridBagConstraints.CENTER);
		contentPane.add(scrollPane, gbc_scrollPane);
		tbServicios = new JTable();
		tbServicios.setModel(new DefaultTableModel(
			new Object[][] {
				{obtenerString ("servicios", 2, 1),obtenerString ("servicios", 1, 1), obtenerString ("servicios", 3, 1)},
			},
			new String[] {
				"No.", "Nombre", "Costo"
			}
		) 
		{
			Class[] columnTypes = new Class[] {
				String.class, Short.class, Short.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		
		tbServicios.setFont(new Font("Tahoma", Font.PLAIN, 14));
		scrollPane.setViewportView(tbServicios);
		/*if(NumFil("servicios")>2)
		{
		for(int i = 1; i<NumFil("servicios"); i++)
		{
		int a=i+1;
		DefaultTableModel model = (DefaultTableModel) tbServicios.getModel();
		model.addRow(new Object[]{obtenerString("servicios",2,a), obtenerString("servicios",1,a), obtenerString("servicios",3,a)});
		}
		}*/
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setEnabled(false);
		adjustButton(btnEliminar,new GridBagConstraints(),contentPane,2,2,1,1,1.0,1.0,GridBagConstraints.WEST);
		tbServicios.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			btnEliminar.setEnabled(isEnabled());
			valor = (String) tbServicios.getModel().getValueAt(tbServicios.getSelectedRow(), 1);
			
			}
			});
	
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setEnabled(false);
		adjustButton(btnEditar,new GridBagConstraints(),contentPane,1,2,1,1,0.0,1.0,GridBagConstraints.CENTER);
		
		tbServicios.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			btnEditar.setEnabled(isEnabled());
			valor = (String) tbServicios.getModel().getValueAt(tbServicios.getSelectedRow(), 1);
			}
			});
		
		JButton btnAgregar = new JButton("Agregar");
		adjustButton(btnAgregar,new GridBagConstraints(),contentPane,0,2,1,1,0.0,1.0,GridBagConstraints.EAST);
		btnAgregar.addActionListener(this);
		
		buttonHome(this,true,new GridBagConstraints(),contentPane,3,2,1,1,0.0,1.0,GridBagConstraints.CENTER);
	}
	public void actionPerformed(ActionEvent e) {
		switch(e.getActionCommand())
		{
			case "Agregar":
				AgregarServicio as = new AgregarServicio();
				as.setVisible(true);
				this.setVisible(false);
			break;
		}
		
	} 

}

