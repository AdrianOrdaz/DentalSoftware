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

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AgregarPaciente extends MetodosDiseño implements ActionListener{
	JFrame fAR;
	JTextField jtNombre_Pte;
	JTextField jtEdad_Pte;
	JTextField jtCel_Pte;
	JTextField jtMail_Pte;
	JTextField jtEnfermedad;
	JTextField jtAlergias;
	JTextField jtCirugias;
	JTextField jtFamiliar;
	ButtonGroup bg;
	JRadioButton jrb;
	
	public static void main(String[] args) {
		AgregarPaciente vap = new AgregarPaciente();
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
		
		jtNombre_Pte = new JTextField();
		jtNombre_Pte.setPreferredSize(new Dimension(259,25));
		adjustComponents(c, 1, 2, 1, 1, 0.0, 0.0, GridBagConstraints.WEST);
	    con.add(jtNombre_Pte,c);
	    
	    JLabel lbEdad_Pte = new JLabel("Edad:");
		adjustComponents(c, 0, 3, 1, 1, 1.0, 0.0, GridBagConstraints.CENTER);
		con.add(lbEdad_Pte,c);
		
		jtEdad_Pte = new JTextField();
		jtEdad_Pte.setPreferredSize(new Dimension(100,25));
		adjustComponents(c, 1, 3, 1, 1, 0.0, 0.0, GridBagConstraints.WEST);
	    con.add(jtEdad_Pte,c);
	    
	    JLabel lbSexo = new JLabel("Sexo:");
		adjustComponents(c, 2, 3, 1, 1, 0.0, 0.0, GridBagConstraints.WEST);
		con.add(lbSexo,c);
		
		bg = new ButtonGroup();
		JRadioButton cbAplicar = new JRadioButton("M");
		JRadioButton cbAplicar2 = new JRadioButton("F");
		bg.add(cbAplicar);
		bg.add(cbAplicar2);
		adjustComponents(c, 2, 3, 1, 1, 0.0, 0.0, GridBagConstraints.WEST);
		c.insets = new Insets(0,50,0,0);
	    con.add(cbAplicar,c);
		adjustComponents(c, 2, 3, 1, 1, 0.0, 0.0, GridBagConstraints.WEST);
		c.insets = new Insets(0,100,0,0);
	    con.add(cbAplicar2,c);
	    c.insets = new Insets(0,0,0,0);
	    
	    JLabel lbCel_Pte = new JLabel("Telefono:");
		adjustComponents(c, 0, 4, 1, 1, 1.0, 0.0, GridBagConstraints.CENTER);
		con.add(lbCel_Pte,c);
		
	    jtCel_Pte = new JTextField();
		jtCel_Pte.setPreferredSize(new Dimension(259,25));
		adjustComponents(c, 1, 4, 1, 1, 0.0, 0.0, GridBagConstraints.WEST);
	    con.add(jtCel_Pte,c);
	    
	    JLabel lbMail_Pte = new JLabel("Mail:");
		adjustComponents(c, 0, 5, 1, 1, 1.0, 0.0, GridBagConstraints.CENTER);
		con.add(lbMail_Pte,c);
		
		jtMail_Pte = new JTextField();
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
		
		JRadioButton cbAplicar3 = new JRadioButton("Sí");
		adjustComponents(c, 1, 7, 1, 1, 0.0, 0.0, GridBagConstraints.WEST);
	    con.add(cbAplicar3,c);
	    JRadioButton cbAplicar4 = new JRadioButton("No");
		adjustComponents(c, 1, 7, 1, 1, 0.0, 0.0, GridBagConstraints.EAST);
	    con.add(cbAplicar4,c);
	    jtEnfermedad = new JTextField();
		jtEnfermedad.setPreferredSize(new Dimension(259,25));
		jtEnfermedad.setEnabled(false);
		adjustComponents(c, 2, 7, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER);
	    con.add(jtEnfermedad,c);
	    activeTF(cbAplicar3,cbAplicar4,jtEnfermedad);
		
	    JLabel lbAlergia = new JLabel("Alergias");
		adjustComponents(c, 0, 8, 1, 1, 1.0, 0.0, GridBagConstraints.CENTER);
		con.add(lbAlergia,c);
		
		JRadioButton cbAplicar5 = new JRadioButton("Sí");
		adjustComponents(c, 1, 8, 1, 1, 0.0, 0.0, GridBagConstraints.WEST);
	    con.add(cbAplicar5,c);
	    JRadioButton cbAplicar6 = new JRadioButton("No");
		adjustComponents(c, 1, 8, 1, 1, 0.0, 0.0, GridBagConstraints.EAST);
	    con.add(cbAplicar6,c);
	    jtAlergias = new JTextField();
		jtAlergias.setPreferredSize(new Dimension(259,25));
		jtAlergias.setEnabled(false);
		adjustComponents(c, 2, 8, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER);
	    con.add(jtAlergias,c);
	    activeTF(cbAplicar5,cbAplicar6,jtAlergias);
	    
	    JLabel lbCirugias = new JLabel("¿Cirugias recientes?");
		adjustComponents(c, 0, 9, 1, 1, 1.0, 0.0, GridBagConstraints.CENTER);
		con.add(lbCirugias,c);
		
		JRadioButton cbAplicar7 = new JRadioButton("Sí");
		adjustComponents(c, 1, 9, 1, 1, 0.0, 0.0, GridBagConstraints.WEST);
	    con.add(cbAplicar7,c);
	    JRadioButton cbAplicar8 = new JRadioButton("No");
		adjustComponents(c, 1, 9, 1, 1, 0.0, 0.0, GridBagConstraints.EAST);
	    con.add(cbAplicar8,c);
	    jtCirugias = new JTextField();
	    jtCirugias.setEnabled(false);
		jtCirugias.setPreferredSize(new Dimension(259,25));
		adjustComponents(c, 2, 9, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER);
	    con.add(jtCirugias,c);
	    activeTF(cbAplicar7,cbAplicar8,jtCirugias);
	    
	    JLabel lbFamiliar = new JLabel("Enfermedad de algún familiar:");
		adjustComponents(c, 0, 10, 1, 1, 1.0, 0.0, GridBagConstraints.CENTER);
		con.add(lbFamiliar,c);
		
		JRadioButton cbAplicar9 = new JRadioButton("Sí");
		adjustComponents(c, 1, 10, 1, 1, 0.0, 0.0, GridBagConstraints.WEST);
	    con.add(cbAplicar9,c);
	    JRadioButton cbAplicar10 = new JRadioButton("No");
		adjustComponents(c, 1, 10, 1, 1, 0.0, 0.0, GridBagConstraints.EAST);
	    con.add(cbAplicar10,c);
	    jtFamiliar = new JTextField();
		jtFamiliar.setPreferredSize(new Dimension(259,25));
		jtFamiliar.setEnabled(false);
		adjustComponents(c, 2, 10, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER);
	    con.add(jtFamiliar,c);
	    activeTF(cbAplicar9,cbAplicar10,jtFamiliar);
	    
	    JButton btnGuardar = new JButton("Guardar");
	    adjustButton(btnGuardar,c,con,0,11,1,1,1.0,1.0,GridBagConstraints.CENTER);
	    Pacientes vp = new Pacientes();
	    buttonRegresar(vp.crearGUI(),fAR,c,con,2,11,1,1,0.0,0.0,GridBagConstraints.CENTER);
	    vp.fPte.setVisible(false);
	    c.insets = new Insets(0,100,0,0);
	    btnGuardar.addActionListener(this);
	    buttonHome(fAR,true,c,con,2,11,1,1,0.0,1.0,GridBagConstraints.CENTER);
	    
	    
		fAR.pack();
		fAR.setExtendedState(JFrame.MAXIMIZED_BOTH);
		fAR.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fAR.setVisible(true);
		con.setBackground(Color.WHITE);
		return fAR;
	}
	public void actionPerformed(ActionEvent e) {
		jrb = getSelection(bg);
		subirFilaCol9("pacientes ","nom_pte","edad_pte","tel_pte","mail_pte","sexo_pte","enfermedad_pte",
				"alergias_pte","cirugias_pte","familiar_pte",jtNombre_Pte.getText(),jtEdad_Pte.getText()
				,jtCel_Pte.getText(),jtMail_Pte.getText(),jrb.getText(),jtEnfermedad.getText(),jtAlergias.getText(),
				jtCirugias.getText(),jtFamiliar.getText());
		emptyJT(jtNombre_Pte,jtEdad_Pte,jtCel_Pte,jtMail_Pte,jtEnfermedad,jtAlergias,jtCirugias,jtFamiliar);
	}

}
