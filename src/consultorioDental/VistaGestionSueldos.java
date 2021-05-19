package consultorioDental;

import java.awt.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class VistaGestionSueldos extends metodosDiseño{

	public static void main(String[] args) {
		VistaGestionSueldos vgs = new VistaGestionSueldos();
		vgs.crearGUI();
	}
	protected void crearGUI()
	{
		JFrame fGS = new JFrame("Consultorio Dental/Gestionar Sueldos");
		Container con = new Container();
		GridBagConstraints c = new GridBagConstraints();
		con = fGS.getContentPane();
		con.setLayout(new GridBagLayout());
		
		JLabel lbTitulo = new JLabel("Gestionar sueldos");
		lbTitulo.setFont(new Font("Open Sans",Font.CENTER_BASELINE, 24));
		adjustComponents(c, 0, 0, 4, 1, 1.0, 1.0, GridBagConstraints.NORTH);
		con.add(lbTitulo,c);
		
		String[] header = {"ID","Nombre","Sueldo","Horas laborales"};
	    DefaultTableModel dtm = new DefaultTableModel(null,header);
	    JTable tbSueldos = new JTable(dtm);
	    tbSueldos.setFillsViewportHeight(true);
	    tbSueldos.setEnabled(false);
	    JScrollPane jsp = new JScrollPane(tbSueldos);
	    jsp.setVisible(true);
		adjustComponents(c, 0, 1, 4, 1, 1.0, 1.0, GridBagConstraints.NORTH);
	    con.add(jsp,c);
	    
	    JButton btnEditar = new JButton("Editar");
	    btnEditar.setEnabled(false);
	    adjustButton(btnEditar, c, con, 0,3,1,1,1.0,1.0,GridBagConstraints.ABOVE_BASELINE_TRAILING);
	    JButton btnGuardar = new JButton("Guardar");
	    btnGuardar.setEnabled(false);
	    adjustButton(btnGuardar,c,con,1,3,1,1,0.0,1.0,GridBagConstraints.CENTER);
	    buttonHome(fGS,c,con,3,3,1,1,0.0,1.0,GridBagConstraints.ABOVE_BASELINE_LEADING);
		
		fGS.pack();
		fGS.setExtendedState(JFrame.MAXIMIZED_BOTH);
		fGS.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fGS.setVisible(true);
		con.setBackground(Color.WHITE);
	}
}
