package consultorioDental;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

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

public class AgendaVista extends MetodosDiseño implements ActionListener {

	public static void main(String[] args) 
	{
		AgendaVista av = new AgendaVista();
		av.crearfA();
	}

	protected void crearfA() 
	{
		JFrame fAgenda = new JFrame("Consultorio Dental/Agenda");
		Container con = new Container();
		con = fAgenda.getContentPane();
		GridBagConstraints c = new GridBagConstraints();
		con.setLayout(new GridBagLayout());
		
		JLabel lbAgenda = new JLabel("Agenda");
		lbAgenda.setFont (new Font("Open Sans",Font.CENTER_BASELINE, 40));
		adjustComponents(c, 0, 0, 4, 1, 1.0, 1.0, GridBagConstraints.NORTH);
		con.add(lbAgenda,c);
		
		JComboBox cbFecha = new JComboBox();
		cbFecha.setToolTipText("Fecha: DD/MM/AAAA");
		GridBagConstraints gbc_cbFecha = new GridBagConstraints();
		gbc_cbFecha.insets = new Insets(0, 2, 5, 5);
		gbc_cbFecha.fill = GridBagConstraints.HORIZONTAL;
		adjustComponents(gbc_cbFecha,0,1,1,1,0.0,0.0,GridBagConstraints.CENTER);
		fAgenda.getContentPane().add(cbFecha, gbc_cbFecha);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.insets = new Insets(0, 0, 5, 0);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		adjustComponents(gbc_scrollPane,0,2,4,1,0.0,0.0,GridBagConstraints.CENTER);
		fAgenda.getContentPane().add(scrollPane, gbc_scrollPane);
		
		JTable table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"","ID", "Paciente", "Hora", "Dentista", "Asistio"
			}
		));
		scrollPane.setViewportView(table);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollPane.setRowHeaderView(scrollBar);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setEnabled(false);
		adjustButton(btnEditar,c,con,0,3,1,1,1.0,1.0,GridBagConstraints.CENTER);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setEnabled(false);
		adjustButton(btnEliminar, c, con, 1, 3, 1, 1, 0.0, 1.0, GridBagConstraints.WEST);
		
		/*JButton btnGuardar = new JButton("Guardar");
		adjustButton(btnGuardar, c, con, 2, 3, 1, 1, 0.0, 1.0, GridBagConstraints.WEST);*/
		
		buttonHome(fAgenda,true,c,con,3,3,1,1,0.0,1.0,GridBagConstraints.CENTER);
		
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
