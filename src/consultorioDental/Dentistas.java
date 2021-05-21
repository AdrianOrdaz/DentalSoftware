package consultorioDental;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

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

public class Dentistas extends MetodosDiseño implements ActionListener{
	
	JFrame fD;
	JButton btnAgregar;
	JButton btnEliminar;
	JButton btnEditar;
	JButton btnGuardar;
	public static void main(String[] args) 
	{
		Dentistas den = new Dentistas();
		den.crearfD();
	}

	protected JFrame crearfD() 
	{
		fD = new JFrame("Consultorio Dental/Dentistas");
		Container con = new Container();
		con = fD.getContentPane();
		GridBagConstraints c = new GridBagConstraints();
		con.setLayout(new GridBagLayout());

		JLabel lbDentistas = new JLabel("Dentistas");
		lbDentistas.setFont (new Font("Open Sans",Font.CENTER_BASELINE,40));
		adjustComponents(c, 0, 0, 5, 1, 1.0, 1.0, GridBagConstraints.NORTH);
		con.add(lbDentistas,c);
		
		JScrollPane scrollPane = new JScrollPane();
		c.fill = GridBagConstraints.BOTH;
		adjustComponents(c,0,1,5,1,1.0,1.0,GridBagConstraints.CENTER);
		fD.getContentPane().add(scrollPane, c);
		c.fill = 0;
		
		JTable table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {"",
				"ID", "Nombre", "Info. Adicional"
			}
		));
		scrollPane.setViewportView(table);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollPane.setRowHeaderView(scrollBar);
		
		btnAgregar = new JButton("Agregar");
		c.insets = new Insets(0,100,0,0);
		adjustButton(btnAgregar, c, con, 0, 2, 1, 1, 1.0, 1.0, GridBagConstraints.WEST);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setEnabled(false);
		adjustButton(btnEliminar, c, con, 0, 2, 1, 1, 0.0, 1.0, GridBagConstraints.CENTER);
		
		btnEditar = new JButton("Editar");
		btnEditar.setEnabled(false);
		adjustButton(btnEditar, c, con, 0, 2, 1, 1, 0.0, 0.0, GridBagConstraints.EAST);
		
		c.insets = new Insets(0,0,0,0);
		buttonHome(fD,true,c,con,4,2,1,1,0.0,1.0,GridBagConstraints.CENTER);
		
		btnAgregar.addActionListener(this);
		btnEliminar.addActionListener(this);
		btnEditar.addActionListener(this);
		btnHome.addActionListener(this);

		fD.pack();
		fD.setExtendedState(JFrame.MAXIMIZED_BOTH);
		fD.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fD.setVisible(true);
		con.setBackground(Color.WHITE);
		return fD;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if (e.getSource()==btnAgregar) 
		{
			AgregarDentista vAD = new AgregarDentista();
			vAD.crearfAD();
			fD.setVisible(false);
        }
		
	}

}
