package consultorioDental;

import java.awt.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class VistaHistorial extends metodosDiseño{
	
	public static void main(String[] args) {
		VistaHistorial vh = new VistaHistorial();
		vh.crearGUI();
	}
	
	protected void crearGUI()
	{
		JDesktopPane jdp = new JDesktopPane();
		JInternalFrame fHtrl = new JInternalFrame("Consultorio Dental/Pacientes/Historial medico");
		Container con = new Container();
		GridBagConstraints c = new GridBagConstraints();
		con = fHtrl.getContentPane();
		con.setLayout(new GridBagLayout());

		JLabel lbTitulo = new JLabel("Historial medico");
		adjustComponents(c,0,0,2,1,0.0,1.0,GridBagConstraints.NORTH);
		con.add(lbTitulo,c);
		c.weightx = 0.0;
		
		JLabel lbPaciente = new JLabel("Paciente:");
		adjustComponents(c,0,1,1,1,1.0,0.0,GridBagConstraints.CENTER);
	    con.add(lbPaciente, c);
	    c.weighty = 0.0;
	    
	    JTextField jtPaciente = new JTextField();
	    jtPaciente.setPreferredSize(new Dimension(150,20));
	    jtPaciente.setEnabled(false);
	    adjustComponents(c,1,1,1,1,0.0,0.0,GridBagConstraints.WEST);
	    con.add(jtPaciente,c);
	    
	    String[] header = {"Enfermedades","Alergías","Riesgos hereditarios",
	    		"Servicios atendidos aquí","Medicamentos recetados aquí"};
	    Object[][] data = null;
	    DefaultTableModel dtm = new DefaultTableModel(data,header);
	    JTable tbHistorial = new JTable(dtm);
	    tbHistorial.setFillsViewportHeight(true);
	    tbHistorial.setEnabled(false);
	    tbHistorial.setPreferredScrollableViewportSize(new Dimension(600,500));
	    JScrollPane jsp = new JScrollPane(tbHistorial);
	    jsp.setVisible(true);
		adjustComponents(c, 0, 2, 2, 1, 1.0, 1.0, GridBagConstraints.NORTH);
	    con.add(jsp,c);
	    c.weightx = 0.0;
	    c.weighty = 0.0;
	    
	    fHtrl.setClosable(true);
		fHtrl.setVisible(true);
		fHtrl.setPreferredSize(new Dimension(650,600));
		fHtrl.pack();
		fHtrl.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		jdp.add(fHtrl);
	}

}
