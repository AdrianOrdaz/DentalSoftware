package consultorioDental;

import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Promociones extends MetodosDiseño implements ActionListener{
	String valor;
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
				{obtenerString ("promociones", 1, 1),obtenerString ("promociones", 2, 1), obtenerString ("promociones", 3, 1), obtenerString("promociones", 4, 1)
				,obtenerString("promociones", 5, 1), obtenerString("promociones", 6, 1), obtenerString("promociones", 7, 1), obtenerString("promociones", 8, 1)	},
			},
			new String[] {
				"No.", "Servicio con promocion", "Dias en que aplica","Terminos y condiciones","Costo de productos por separado",
				"Costo de la promocion","Porcenaje ahorrado","Dinero ahorrado"
			}
		) 
		{
			Class[] columnTypes = new Class[] {
				Short.class, String.class, String.class,String.class, Short.class , Short.class, Short.class, Short.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		
		tbPromociones.setFont(new Font("Tahoma", Font.PLAIN, 14));
		scrollPane.setViewportView(tbPromociones);
		if(NumFil("promociones")>2)
		{
		for(int i = 1; i<NumFil("promociones"); i++)
		{
		int a=i+1;
		DefaultTableModel model = (DefaultTableModel) tbPromociones.getModel();
		model.addRow(new Object[]{obtenerString("promociones",1,a), obtenerString("promociones",2,a), obtenerString("promociones",3,a), obtenerString("promociones",4,a)
				, obtenerString("promociones",5,a), obtenerString("promociones",6,a), obtenerString("promociones",7,a), obtenerString("promociones",8,a)});
		}
		}
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setEnabled(false);
		GridBagConstraints gbc_btnEliminar = new GridBagConstraints();
		adjustButton(btnEliminar,gbc_btnEliminar,contentPane,3,3,1,1,1.0,1.0,GridBagConstraints.CENTER);
		tbPromociones.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			btnEliminar.setEnabled(isEnabled());
			valor = (String) tbPromociones.getModel().getValueAt(tbPromociones.getSelectedRow(), 1);
			
			
			
			}
			});
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setEnabled(false);
		GridBagConstraints gbc_btnEditar = new GridBagConstraints();
		adjustButton(btnEditar,gbc_btnEditar,contentPane,2,3,1,1,0.0,1.0,GridBagConstraints.CENTER);
		tbPromociones.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			btnEditar.setEnabled(isEnabled());
			valor = (String) tbPromociones.getModel().getValueAt(tbPromociones.getSelectedRow(), 1);
			
			
			}
			});
		
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
			
			case "Editar":
				
			
			break;
				
		}
		
	}

}
