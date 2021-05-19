package consultorioDental;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class VistaReceta extends metodosDiseño {

	public static void main(String[] args) {
		VistaReceta vr = new VistaReceta();
		vr.crearGUI();
	}
	protected void crearGUI()
	{
		JFrame fCR = new JFrame("Consultorio Dental/Pacientes/Crear receta");
		Container con = new Container();
		GridBagConstraints c = new GridBagConstraints();
		con = fCR.getContentPane();
		con.setLayout(new GridBagLayout());
		
		JLabel lbTitulo = new JLabel("CREAR RECETA");
		lbTitulo.setFont(new Font("Open Sans",Font.CENTER_BASELINE, 24));
		adjustComponents(c, 0, 0, 5, 1, 0.0, 1.0, GridBagConstraints.NORTH);
		con.add(lbTitulo,c);
		c.weightx = 0.0;
		
		JLabel lbDate = new JLabel("Fecha:");
		adjustComponents(c, 2, 1, 3, 1, 0.0, 1.0, GridBagConstraints.CENTER);
		con.add(lbDate,c);
		c.weightx = 0.0;
		
		JTextField jtDate = new JTextField();
		jtDate.setPreferredSize(new Dimension(100,25));
		adjustComponents(c, 3, 1, 1, 1, 0.0, 0.0, GridBagConstraints.EAST);
	    con.add(jtDate,c);
	    
	    JLabel imgLogo = new JLabel();
		ImageIcon logo = new ImageIcon("src/img/logomini.png");
		imgLogo.setIcon(logo);
		adjustComponents(c,4,1,1,1,0.0,0.0,GridBagConstraints.CENTER);
		con.add(imgLogo,c);
		
		JLabel lbDentista = new JLabel("Dentista:");
		adjustComponents(c, 0, 2, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER);
		con.add(lbDentista,c);
		
		JTextField jtDentista = new JTextField();
		jtDentista.setPreferredSize(new Dimension(259,25));
		adjustComponents(c, 1, 2, 1, 1, 0.0, 0.0, GridBagConstraints.WEST);
	    con.add(jtDentista,c);
	    
	    JLabel lbPaciente = new JLabel("Paciente:");
		adjustComponents(c, 0, 3, 1, 1, 1.0, 0.0, GridBagConstraints.CENTER);
		con.add(lbPaciente,c);
		c.weighty = 0.0;
		
		JTextField jtPaciente = new JTextField();
		jtPaciente.setPreferredSize(new Dimension(259,25));
		jtPaciente.setEnabled(false);
		adjustComponents(c, 1, 3, 1, 1, 0.0, 0.0, GridBagConstraints.WEST);
	    con.add(jtPaciente,c);
	    
	    JLabel lbDiagnostico = new JLabel("Diagnostico:");
		adjustComponents(c, 0, 4, 1, 1, 1.0, 0.0, GridBagConstraints.CENTER);
		con.add(lbDiagnostico,c);
		c.weighty = 0.0;
		
		JTextField jtDiagnostico = new JTextField();
		jtDiagnostico.setPreferredSize(new Dimension(750,100));
		adjustComponents(c, 1, 4, 3, 1, 0.0, 1.0, GridBagConstraints.WEST);
	    con.add(jtDiagnostico,c);
	    c.weightx = 0.0;
	    
	    JLabel lbMedicamento = new JLabel("Medicamentos:");
		adjustComponents(c, 0, 5, 1, 1, 1.0, 0.0, GridBagConstraints.CENTER);
		con.add(lbMedicamento,c);
		c.weighty = 0.0;
		
		JTextField jtMedicamento = new JTextField();
		jtMedicamento.setPreferredSize(new Dimension(750,100));
		adjustComponents(c, 1, 5, 3, 1, 0.0, 1.0, GridBagConstraints.WEST);
	    con.add(jtMedicamento,c);
	    c.weightx = 0.0;
	    
	    JButton btnGuardar = new JButton("Guardar");
	    adjustButton(btnGuardar, c, con, 0, 6, 1, 1, 1.0, 1.0, GridBagConstraints.ABOVE_BASELINE_TRAILING);
	    c.weighty = 0.0;
	    c.weightx = 0.0;
	    
	    JButton btnImprimir = new JButton("Imprimir");
	    adjustButton(btnImprimir, c, con, 1, 6, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER);
	    
	    buttonRegresar(c,con,2,6,1,1,0.0,1.0,GridBagConstraints.EAST);
	    buttonHome(c,con,4,6,1,1,0.0,1.0,GridBagConstraints.ABOVE_BASELINE_LEADING);
	    
		fCR.pack();
		fCR.setExtendedState(JFrame.MAXIMIZED_BOTH);
		fCR.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fCR.setVisible(true);
		con.setBackground(Color.WHITE);
	}
}
