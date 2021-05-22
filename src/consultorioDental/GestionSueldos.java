package consultorioDental;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class GestionSueldos extends MetodosDiseño{
	JFrame fGS;
	public static void main(String[] args) {
		GestionSueldos vgs = new GestionSueldos();
		vgs.crearGUI();
	}
	protected JFrame crearGUI()
	{
		fGS = new JFrame("Gestionar Sueldos");
		Container con = new Container();
		GridBagConstraints c = new GridBagConstraints();
		con = fGS.getContentPane();
		con.setLayout(new GridBagLayout());
		
		JLabel lbTitulo = new JLabel("Gestionar sueldos");
		lbTitulo.setFont(new Font("Open Sans",Font.PLAIN, 40));
		adjustComponents(c, 0, 0, 4, 1, 1.0, 1.0, GridBagConstraints.NORTH);
		con.add(lbTitulo,c);
		
		String[] header = {"","ID","Nombre","Sueldo","Horas laborales"};
	    DefaultTableModel dtm = new DefaultTableModel(null,header);
	    JTable tbSueldos = new JTable(dtm);
	    tbSueldos.setFillsViewportHeight(true);
	    tbSueldos.setEnabled(false);
	    JScrollPane jsp = new JScrollPane(tbSueldos);
	    jsp.setVisible(true);
	    c.fill = GridBagConstraints.BOTH;
	    c.insets = new Insets(0,2,0,0);
		adjustComponents(c, 0, 1, 4, 1, 1.0, 1.0, GridBagConstraints.NORTH);
	    con.add(jsp,c);
	    c.fill = 0;
	    c.insets = new Insets(0,0,0,0);
	    
	    JButton btnEditar = new JButton("Editar");
	    btnEditar.setEnabled(false);
	    adjustButton(btnEditar, c, con, 0,3,1,1,1.0,1.0,GridBagConstraints.ABOVE_BASELINE_TRAILING);
	    JButton btnGuardar = new JButton("Guardar");
	    btnGuardar.setEnabled(false);
	    adjustButton(btnGuardar,c,con,1,3,1,1,0.0,1.0,GridBagConstraints.CENTER);
	    buttonHome(fGS,false,c,con,3,3,1,1,0.0,1.0,GridBagConstraints.ABOVE_BASELINE_LEADING);
		
		fGS.pack();
		fGS.setExtendedState(JFrame.MAXIMIZED_BOTH);
		fGS.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fGS.setVisible(true);
		con.setBackground(Color.WHITE);
		return fGS;
	}
}
