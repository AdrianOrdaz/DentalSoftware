package consultorioDental;

import java.awt.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class VistaRecibo extends metodosDiseño{

	public static void main(String[] args) {
		VistaRecibo vr = new VistaRecibo();
		vr.crearGUI();
	}

	protected void crearGUI()
	{
		JFrame fR = new JFrame("Consultorio Dental/Recibo");
		Container con = new Container();
		GridBagConstraints c = new GridBagConstraints();
		con = fR.getContentPane();
		con.setLayout(new GridBagLayout());
		
		JLabel lbTitulo = new JLabel("RECIBO");
		lbTitulo.setFont(new Font("Open Sans",Font.CENTER_BASELINE, 24));
		adjustComponents(c, 0, 0, 6, 1, 1.0, 1.0, GridBagConstraints.NORTH);
		con.add(lbTitulo,c);
		
		JLabel lbID_Venta = new JLabel("ID Venta:");
		adjustComponents(c, 0, 1, 1, 1, 1.0, 0.0, GridBagConstraints.CENTER);
		con.add(lbID_Venta,c);
		
		JTextField jtID_Venta = new JTextField();
		jtID_Venta.setEnabled(false);
		jtID_Venta.setPreferredSize(new Dimension(259,25));
		adjustComponents(c, 1, 1, 1, 1, 0.0, 0.0, GridBagConstraints.WEST);
	    con.add(jtID_Venta,c);
	    
	    JLabel lbDate = new JLabel("Fecha:");
	    c.insets = new Insets(0,0,0,10);
		adjustComponents(c,3, 1, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER);
		con.add(lbDate,c);
		
		JTextField jtDate = new JTextField();
		c.insets = new Insets(0,0,0,0);
		jtDate.setEnabled(false);
		jtDate.setPreferredSize(new Dimension(100,25));
		adjustComponents(c, 4, 1, 1, 1, 0.0, 0.0, GridBagConstraints.WEST);
	    con.add(jtDate,c);
	    
	    JLabel lbPaciente = new JLabel("Paciente:");
		adjustComponents(c, 0, 2, 1, 1, 1.0, 0.0, GridBagConstraints.CENTER);
		con.add(lbPaciente,c);
		
		JTextField jtPaciente = new JTextField();
		jtPaciente.setPreferredSize(new Dimension(259,25));
		adjustComponents(c, 1, 2, 1, 1, 0.0, 0.0, GridBagConstraints.WEST);
	    con.add(jtPaciente,c);
	    
	    JLabel lbID_Cita = new JLabel("ID Cita:");
		adjustComponents(c, 0, 3, 1, 1, 1.0, 0.0, GridBagConstraints.CENTER);
		con.add(lbID_Cita,c);
		
		JTextField jtID_Cita = new JTextField();
		jtID_Cita.setEnabled(false);
		jtID_Cita.setPreferredSize(new Dimension(259,25));
		adjustComponents(c, 1, 3, 2, 1, 0.0, 0.0, GridBagConstraints.WEST);
	    con.add(jtID_Cita,c);
	    
	    JLabel lbPromocion = new JLabel("¿Promocion?");
		adjustComponents(c, 0, 4, 1, 1, 1.0, 0.0, GridBagConstraints.CENTER);
		con.add(lbPromocion,c);
		
		JCheckBox cbAplicar = new JCheckBox();
		adjustComponents(c, 1, 4, 2, 1, 0.0, 0.0, GridBagConstraints.WEST);
	    con.add(cbAplicar,c);
		
		JTextField jtPromocion = new JTextField();
		jtPromocion.setPreferredSize(new Dimension(200,25));
		c.insets = new Insets(0,55,0,0);
		jtPromocion.setEnabled(false);
		adjustComponents(c, 1, 4, 1, 1, 0.0, 0.0, GridBagConstraints.WEST);
	    con.add(jtPromocion,c);
	    c.insets = new Insets(0,0,0,0);
	    
	    String[] header = {"ID Medicamento","Nombre","Cantidad","Precio","Subtotal"};
	    DefaultTableModel dtm = new DefaultTableModel(null,header);
	    JTable tbMedicamentos = new JTable(dtm);
	    tbMedicamentos.setPreferredScrollableViewportSize(new Dimension(700,0));
	    tbMedicamentos.setFillsViewportHeight(true);
	    tbMedicamentos.setEnabled(false);
	    JScrollPane jsp = new JScrollPane(tbMedicamentos);
	    jsp.setVisible(true);
		adjustComponents(c, 0, 5, 6, 1, 1.0, 1.0, GridBagConstraints.NORTH);
	    con.add(jsp,c);
	    
	    String[] header2 = {"ID Servicio","Nombre","Precio"};
	    DefaultTableModel dtm2 = new DefaultTableModel(null,header2);
	    JTable tbServicios = new JTable(dtm2);
	    tbServicios.setPreferredScrollableViewportSize(new Dimension(700,0));
	    tbServicios.setFillsViewportHeight(true);
	    tbServicios.setEnabled(false);
	    JScrollPane jsp2 = new JScrollPane(tbServicios);
	    jsp2.setVisible(true);
		adjustComponents(c, 0, 6, 6, 1, 1.0, 1.0, GridBagConstraints.NORTH);
	    con.add(jsp2,c);
	    
	    JLabel lbConsulta = new JLabel("¿Consulto?");
		adjustComponents(c, 0, 7, 1, 1, 1.0, 0.0, GridBagConstraints.CENTER);
		con.add(lbConsulta,c);
		
		JCheckBox cbAplicar2 = new JCheckBox();
		adjustComponents(c, 1, 7, 1, 1, 0.0, 0.0, GridBagConstraints.WEST);
	    con.add(cbAplicar2,c);
		
	    JLabel lbInfo = new JLabel("SE SUMA PRECIO CONSULTA");
	    c.insets = new Insets(0,55,0,0);
	    lbInfo.setForeground(Color.LIGHT_GRAY);
		adjustComponents(c, 1, 7, 1, 1, 0.0, 0.0, GridBagConstraints.WEST);
		con.add(lbInfo,c);
		c.insets = new Insets(0,0,0,0);
		
		JLabel lbUsuario = new JLabel("Atendio:");
		adjustComponents(c, 0, 8, 1, 1, 1.0, 0.0, GridBagConstraints.CENTER);
		con.add(lbUsuario,c);
		
		JTextField jtUsuario = new JTextField();
		jtUsuario.setEnabled(false);
		jtUsuario.setPreferredSize(new Dimension(259,25));
		adjustComponents(c, 1, 8, 2, 1, 0.0, 0.0, GridBagConstraints.WEST);
	    con.add(jtUsuario,c);
	    
	    JLabel lbTotal = new JLabel("Total:");
		adjustComponents(c,4, 8, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER);
		con.add(lbTotal,c);
		
		JTextField jtTotal = new JTextField();
		jtTotal.setEnabled(false);
		jtTotal.setPreferredSize(new Dimension(100,25));
		adjustComponents(c, 5, 8, 2, 1, 0.0, 0.0, GridBagConstraints.WEST);
	    con.add(jtTotal,c);
	    
	    JButton btnGuardar = new JButton("Guardar");
	    adjustButton(btnGuardar,c,con,0,9,1,1,1.0,1.0,GridBagConstraints.CENTER);
	    
	    JButton btnImprimir = new JButton("Imprimir");
	    adjustButton(btnImprimir,c,con,1,9,1,1,0.0,1.0,GridBagConstraints.CENTER);
	    buttonHome(c,con,5,9,1,1,0.0,1.0,GridBagConstraints.CENTER);
		
		fR.pack();
		fR.setExtendedState(JFrame.MAXIMIZED_BOTH);
		fR.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fR.setVisible(true);
		con.setBackground(Color.WHITE);
	}
}
