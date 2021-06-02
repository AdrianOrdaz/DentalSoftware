package consultorioDental;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Font;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class CorteDeCaja extends MetodosDiseño {

	private JTextField jtDineroApertura;
	private JTextField jtDineroCierre;
	private JTextField jtSumaTotal;
	private JTextField jtHoraCierre;
	private JTextField jtHoraApertura;
	private JTable tbLista;

	public static void main(String[] args) {
		CorteDeCaja fg = new CorteDeCaja(); //nombre del archivo
		fg.CrearGui();
	}

	protected JFrame  CrearGui() {
		JFrame fCR = new JFrame("Corte de caja");
		Container con = this.getContentPane();
		con = fCR.getContentPane();
		con.setLayout(new GridBagLayout());
		
		JLabel lbTitulo = new JLabel("Corte de caja");
		lbTitulo.setFont(new Font("Open Sans", Font.PLAIN, 40));
		GridBagConstraints gbc_lbTitulo = new GridBagConstraints();
		adjustComponents(gbc_lbTitulo,0,0,4,1,1.0,1.0,GridBagConstraints.NORTH);
		con.add(lbTitulo, gbc_lbTitulo);
		
		JLabel lbDineroApertura = new JLabel("Cantidad de efectivo a la hora de apertura");
		lbDineroApertura.setFont(new Font("Tahoma", Font.PLAIN, 24));
		GridBagConstraints gbc_lbDineroApertura = new GridBagConstraints();
		adjustComponents(gbc_lbDineroApertura,1,1,2,1,0.0,1.0,GridBagConstraints.CENTER);
		con.add(lbDineroApertura, gbc_lbDineroApertura);
		
		jtDineroApertura = new JTextField(10);
		jtDineroApertura.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_jtDineroApertura = new GridBagConstraints();
		adjustComponents(gbc_jtDineroApertura,1,2,2,1,0.0,1.0,GridBagConstraints.NORTH);
		con.add(jtDineroApertura, gbc_jtDineroApertura);
		
		JLabel lbDineroCierre = new JLabel("Cantidad de efectivo a la hora del cierre");
		lbDineroCierre.setFont(new Font("Tahoma", Font.PLAIN, 24));
		GridBagConstraints gbc_lbDineroCierre = new GridBagConstraints();
		adjustComponents(gbc_lbDineroCierre,1,3,2,1,0.0,1.0,GridBagConstraints.NORTH);
		con.add(lbDineroCierre, gbc_lbDineroCierre);
		
		jtDineroCierre = new JTextField(10);
		jtDineroCierre.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_jtDineroCierre = new GridBagConstraints();
		adjustComponents(gbc_jtDineroCierre,1,4,2,1,0.0,1.0,GridBagConstraints.NORTH);
		con.add(jtDineroCierre, gbc_jtDineroCierre);
		
		JLabel lbSumaTotal = new JLabel("Suma total de la caja");
		lbSumaTotal.setFont(new Font("Tahoma", Font.PLAIN, 24));
		GridBagConstraints gbc_lbSumaTotal = new GridBagConstraints();
		adjustComponents(gbc_lbSumaTotal,1,5,2,1,0.0,1.0,GridBagConstraints.NORTH);
		con.add(lbSumaTotal, gbc_lbSumaTotal);
		
		jtSumaTotal = new JTextField(10);
		jtSumaTotal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_jtSumaTotal = new GridBagConstraints();
		adjustComponents(gbc_jtSumaTotal,1,6,2,1,1.0,1.0,GridBagConstraints.NORTH);
		con.add(jtSumaTotal, gbc_jtSumaTotal);
		
		JLabel lbHoraApertura = new JLabel("Hora de apertura");
		lbHoraApertura.setFont(new Font("Tahoma", Font.PLAIN, 24));
		GridBagConstraints gbc_lbHoraApertura = new GridBagConstraints();
		adjustComponents(gbc_lbHoraApertura,0,7,2,1,1.0,1.0,GridBagConstraints.EAST);
		con.add(lbHoraApertura, gbc_lbHoraApertura);
		
		JLabel lbHoraCierre = new JLabel("Hora de cierre");
		lbHoraCierre.setFont(new Font("Tahoma", Font.PLAIN, 24));
		GridBagConstraints gbc_lbHoraCierre = new GridBagConstraints();
		adjustComponents(gbc_lbHoraCierre,2,7,2,1,0.0,1.0,GridBagConstraints.CENTER);
		con.add(lbHoraCierre, gbc_lbHoraCierre);
		
		jtHoraApertura = new JTextField(10);
		jtHoraApertura.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jtHoraApertura.setEditable(false);
		GridBagConstraints gbc_jtHoraApertura = new GridBagConstraints();
		adjustComponents(gbc_jtHoraApertura,0,8,2,1,1.0,1.0,GridBagConstraints.NORTHEAST);
		con.add(jtHoraApertura, gbc_jtHoraApertura);
		
		jtHoraCierre = new JTextField(10);
		jtHoraCierre.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jtHoraCierre.setEditable(false);
		GridBagConstraints gbc_jtHoraCierre = new GridBagConstraints();
		adjustComponents(gbc_jtHoraCierre,2,8,2,1,0.0,1.0,GridBagConstraints.NORTH);
		con.add(jtHoraCierre, gbc_jtHoraCierre);
				
		JButton btnTerminarturno = new JButton("Terminar turno");
		GridBagConstraints gbc_btnTerminarturno = new GridBagConstraints();
		adjustButton(btnTerminarturno,gbc_btnTerminarturno,con,1,9,4,1,1.0,1.0,GridBagConstraints.NORTH);
		
		buttonHome(fCR,false,new GridBagConstraints(),con,1,10,4,1,1.0,1.0,GridBagConstraints.CENTER);
		
		fCR.pack();
		fCR.setExtendedState(JFrame.MAXIMIZED_BOTH);
		fCR.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fCR.setVisible(true);
		con.setBackground(Color.WHITE);
		return fCR;
	}
}
