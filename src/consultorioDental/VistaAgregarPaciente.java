package consultorioDental;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class VistaAgregarPaciente extends metodosDiseño{
	JFrame fAR;
	public static void main(String[] args) {
		VistaAgregarPaciente vap = new VistaAgregarPaciente();
		vap.crearGUI();
	}

	protected JFrame crearGUI()
	{
		fAR = new JFrame("Consultorio Dental/Paciente/Agregar Paciente");
		Container con = new Container();
		GridBagConstraints c = new GridBagConstraints();
		con = fAR.getContentPane();
		con.setLayout(new GridBagLayout());
		
		JLabel lbTitulo = new JLabel("AGREGAR PACIENTE");
		lbTitulo.setFont(new Font("Open Sans",Font.CENTER_BASELINE, 24));
		adjustComponents(c, 0, 0, 3, 1, 1.0, 1.0, GridBagConstraints.NORTH);
		con.add(lbTitulo,c);
		
		JLabel lbApartado = new JLabel("Datos personales");
		lbApartado.setFont(new Font("Open Sans",Font.CENTER_BASELINE, 20));
		adjustComponents(c, 0, 1, 3, 1, 1.0, 1.0, GridBagConstraints.NORTH);
		con.add(lbApartado,c);
		
		JLabel lbNombre_Pte = new JLabel("Nombre:");
		adjustComponents(c, 0, 2, 1, 1, 1.0, 0.0, GridBagConstraints.CENTER);
		con.add(lbNombre_Pte,c);
		
		JTextField jtNombre_Pte = new JTextField();
		jtNombre_Pte.setPreferredSize(new Dimension(259,25));
		adjustComponents(c, 1, 2, 1, 1, 0.0, 0.0, GridBagConstraints.WEST);
	    con.add(jtNombre_Pte,c);
	    
	    JLabel lbEdad_Pte = new JLabel("Edad:");
		adjustComponents(c, 0, 3, 1, 1, 1.0, 0.0, GridBagConstraints.CENTER);
		con.add(lbEdad_Pte,c);
		
		JTextField jtEdad_Pte = new JTextField();
		jtEdad_Pte.setPreferredSize(new Dimension(100,25));
		adjustComponents(c, 1, 3, 1, 1, 0.0, 0.0, GridBagConstraints.WEST);
	    con.add(jtEdad_Pte,c);
	    
	    JLabel lbSexo = new JLabel("Sexo:");
		adjustComponents(c, 2, 3, 1, 1, 0.0, 0.0, GridBagConstraints.WEST);
		con.add(lbSexo,c);
		
		JCheckBox cbAplicar = new JCheckBox("M");
		adjustComponents(c, 2, 3, 1, 1, 0.0, 0.0, GridBagConstraints.WEST);
		c.insets = new Insets(0,50,0,0);
	    con.add(cbAplicar,c);
	    JCheckBox cbAplicar2 = new JCheckBox("F");
		adjustComponents(c, 2, 3, 1, 1, 0.0, 0.0, GridBagConstraints.WEST);
		c.insets = new Insets(0,100,0,0);
	    con.add(cbAplicar2,c);
	    c.insets = new Insets(0,0,0,0);
	    
	    JLabel lbCel_Pte = new JLabel("Telefono:");
		adjustComponents(c, 0, 4, 1, 1, 1.0, 0.0, GridBagConstraints.CENTER);
		con.add(lbCel_Pte,c);
		
	    JTextField jtCel_Pte = new JTextField();
		jtCel_Pte.setPreferredSize(new Dimension(259,25));
		adjustComponents(c, 1, 4, 1, 1, 0.0, 0.0, GridBagConstraints.WEST);
	    con.add(jtCel_Pte,c);
	    
	    JLabel lbMail_Pte = new JLabel("Mail:");
		adjustComponents(c, 0, 5, 1, 1, 1.0, 0.0, GridBagConstraints.CENTER);
		con.add(lbMail_Pte,c);
		
		JTextField jtMail_Pte = new JTextField();
		jtMail_Pte.setPreferredSize(new Dimension(259,25));
		adjustComponents(c, 1, 5, 1, 1, 0.0, 0.0, GridBagConstraints.WEST);
	    con.add(jtMail_Pte,c);
	    
	    JLabel lbApartado2 = new JLabel("Historial medico");
	    lbApartado2.setFont(new Font("Open Sans",Font.CENTER_BASELINE, 20));
		adjustComponents(c, 0, 6, 3, 1, 1.0, 1.0, GridBagConstraints.CENTER);
		con.add(lbApartado2,c);
		
		JLabel lbEnfermedad = new JLabel("¿Padece alguna enfermedad grave?");
		adjustComponents(c, 0, 7, 1, 1, 1.0, 0.0, GridBagConstraints.CENTER);
		con.add(lbEnfermedad,c);
		
		JCheckBox cbAplicar3 = new JCheckBox("Sí");
		adjustComponents(c, 1, 7, 1, 1, 0.0, 0.0, GridBagConstraints.WEST);
	    con.add(cbAplicar3,c);
	    JCheckBox cbAplicar4 = new JCheckBox("No");
		adjustComponents(c, 1, 7, 1, 1, 0.0, 0.0, GridBagConstraints.EAST);
	    con.add(cbAplicar4,c);
	    JTextField jtEnfermedad = new JTextField();
		jtEnfermedad.setPreferredSize(new Dimension(259,25));
		jtEnfermedad.setEnabled(false);
		adjustComponents(c, 2, 7, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER);
	    con.add(jtEnfermedad,c);
	    activeTF(cbAplicar3,cbAplicar4,jtEnfermedad);
		
	    JLabel lbAlergia = new JLabel("Alergias");
		adjustComponents(c, 0, 8, 1, 1, 1.0, 0.0, GridBagConstraints.CENTER);
		con.add(lbAlergia,c);
		
		JCheckBox cbAplicar5 = new JCheckBox("Sí");
		adjustComponents(c, 1, 8, 1, 1, 0.0, 0.0, GridBagConstraints.WEST);
	    con.add(cbAplicar5,c);
	    JCheckBox cbAplicar6 = new JCheckBox("No");
		adjustComponents(c, 1, 8, 1, 1, 0.0, 0.0, GridBagConstraints.EAST);
	    con.add(cbAplicar6,c);
	    JTextField jtAlergias = new JTextField();
		jtAlergias.setPreferredSize(new Dimension(259,25));
		jtAlergias.setEnabled(false);
		adjustComponents(c, 2, 8, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER);
	    con.add(jtAlergias,c);
	    activeTF(cbAplicar5,cbAplicar6,jtAlergias);
	    
	    JLabel lbCirugias = new JLabel("¿Cirugias recientes?");
		adjustComponents(c, 0, 9, 1, 1, 1.0, 0.0, GridBagConstraints.CENTER);
		con.add(lbCirugias,c);
		
		JCheckBox cbAplicar7 = new JCheckBox("Sí");
		adjustComponents(c, 1, 9, 1, 1, 0.0, 0.0, GridBagConstraints.WEST);
	    con.add(cbAplicar7,c);
	    JCheckBox cbAplicar8 = new JCheckBox("No");
		adjustComponents(c, 1, 9, 1, 1, 0.0, 0.0, GridBagConstraints.EAST);
	    con.add(cbAplicar8,c);
	    JTextField jtCirugias = new JTextField();
	    jtCirugias.setEnabled(false);
		jtCirugias.setPreferredSize(new Dimension(259,25));
		adjustComponents(c, 2, 9, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER);
	    con.add(jtCirugias,c);
	    activeTF(cbAplicar7,cbAplicar8,jtCirugias);
	    
	    JLabel lbFamiliar = new JLabel("Enfermedad de algún familiar:");
		adjustComponents(c, 0, 10, 1, 1, 1.0, 0.0, GridBagConstraints.CENTER);
		con.add(lbFamiliar,c);
		
		JCheckBox cbAplicar9 = new JCheckBox("Sí");
		adjustComponents(c, 1, 10, 1, 1, 0.0, 0.0, GridBagConstraints.WEST);
	    con.add(cbAplicar9,c);
	    JCheckBox cbAplicar10 = new JCheckBox("No");
		adjustComponents(c, 1, 10, 1, 1, 0.0, 0.0, GridBagConstraints.EAST);
	    con.add(cbAplicar10,c);
	    JTextField jtFamiliar = new JTextField();
		jtFamiliar.setPreferredSize(new Dimension(259,25));
		jtFamiliar.setEnabled(false);
		adjustComponents(c, 2, 10, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER);
	    con.add(jtFamiliar,c);
	    activeTF(cbAplicar9,cbAplicar10,jtFamiliar);
	    
	    JButton btnGuardar = new JButton("Guardar");
	    adjustButton(btnGuardar,c,con,0,11,1,1,1.0,1.0,GridBagConstraints.CENTER);
	    VistaPacientes vp = new VistaPacientes();
	    buttonRegresar(vp.crearGUI(),fAR,c,con,2,11,1,1,0.0,0.0,GridBagConstraints.CENTER);
	    c.insets = new Insets(0,100,0,0);
	    buttonHome(fAR,true,c,con,2,11,1,1,0.0,1.0,GridBagConstraints.CENTER);
	    
		fAR.pack();
		fAR.setExtendedState(JFrame.MAXIMIZED_BOTH);
		fAR.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fAR.setVisible(true);
		vp.fPte.setVisible(false);
		con.setBackground(Color.WHITE);
		return fAR;
	}

}
