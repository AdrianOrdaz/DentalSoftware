package consultorioDental;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

import java.awt.GridBagConstraints;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.JTable;

public class CorteDeCaja extends MetodosDiseño {
	JFrame fCR;
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
		fCR = new JFrame("Corte de caja");
		Container con = this.getContentPane();
		con = fCR.getContentPane();
		con.setLayout(new GridBagLayout());
		
		JLabel lbTitulo = new JLabel("Corte de caja");
		lbTitulo.setFont(new Font("Open Sans", Font.PLAIN, 40));
		GridBagConstraints gbc_lbTitulo = new GridBagConstraints();
		adjustComponents(gbc_lbTitulo,0,0,5,1,1.0,1.0,GridBagConstraints.NORTH);
		con.add(lbTitulo, gbc_lbTitulo);
		
		JLabel lbDineroApertura = new JLabel("Cantidad de efectivo a la hora de apertura");
		lbDineroApertura.setFont(new Font("Tahoma", Font.PLAIN, 24));
		GridBagConstraints gbc_lbDineroApertura = new GridBagConstraints();
		adjustComponents(gbc_lbDineroApertura,0,1,5,1,0.0,0.0,GridBagConstraints.CENTER);
		con.add(lbDineroApertura, gbc_lbDineroApertura);
		
		JLabel lbMovExtraRegistrados = new JLabel("Movimientos extraordinarios registrados");
		lbMovExtraRegistrados.setFont(new Font("Tahoma", Font.PLAIN, 24));
		GridBagConstraints gbc_lbMovExtraRegistrados = new GridBagConstraints();
		adjustComponents(gbc_lbMovExtraRegistrados,3,1,1,1,0.0,0.0,GridBagConstraints.CENTER);
		con.add(lbMovExtraRegistrados, gbc_lbMovExtraRegistrados);
		
		jtDineroApertura = new JTextField();
		jtDineroApertura.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jtDineroApertura.setColumns(10);
		GridBagConstraints gbc_jtDineroApertura = new GridBagConstraints();
		gbc_jtDineroApertura.fill = GridBagConstraints.HORIZONTAL;
		adjustComponents(gbc_jtDineroApertura,0,2,5,1,0.0,0.0,GridBagConstraints.NORTH);
		con.add(jtDineroApertura, gbc_jtDineroApertura);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		adjustComponents(gbc_scrollPane,3,2,1,5,1.0,1.0,GridBagConstraints.NORTH);
		con.add(scrollPane, gbc_scrollPane);
		
		tbLista = new JTable();
		tbLista.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tbLista.setRowHeight(40);//Especificar tamano de fila
		tbLista.setModel(new DefaultTableModel(
			new Object[][] {null},
			new String[] {
				"Fecha", "Monto", "Motivo"
			}
		));
		tbLista.getColumnModel().getColumn(0).setMinWidth(50);
		scrollPane.setViewportView(tbLista);
		
		JLabel lbDineroCierre = new JLabel("Cantidad de efectivo a la hora del cierre");
		lbDineroCierre.setFont(new Font("Tahoma", Font.PLAIN, 24));
		GridBagConstraints gbc_lbDineroCierre = new GridBagConstraints();
		adjustComponents(gbc_lbDineroCierre,0,3,5,1,0.0,0.0,GridBagConstraints.NORTH);
		con.add(lbDineroCierre, gbc_lbDineroCierre);
		
		jtDineroCierre = new JTextField();
		jtDineroCierre.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jtDineroCierre.setColumns(10);
		GridBagConstraints gbc_jtDineroCierre = new GridBagConstraints();
		gbc_jtDineroCierre.fill = GridBagConstraints.HORIZONTAL;
		adjustComponents(gbc_jtDineroCierre,0,4,5,1,0.0,0.0,GridBagConstraints.NORTH);
		con.add(jtDineroCierre, gbc_jtDineroCierre);
		
		JLabel lbSumaTotal = new JLabel("Suma total de la caja");
		lbSumaTotal.setFont(new Font("Tahoma", Font.PLAIN, 24));
		GridBagConstraints gbc_lbSumaTotal = new GridBagConstraints();
		adjustComponents(gbc_lbSumaTotal,0,5,5,1,0.0,0.0,GridBagConstraints.NORTH);
		con.add(lbSumaTotal, gbc_lbSumaTotal);
		
		jtSumaTotal = new JTextField();
		jtSumaTotal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jtSumaTotal.setColumns(10);
		GridBagConstraints gbc_jtSumaTotal = new GridBagConstraints();
		gbc_jtSumaTotal.fill = GridBagConstraints.HORIZONTAL;
		adjustComponents(gbc_jtSumaTotal,0,6,5,1,1.0,0.0,GridBagConstraints.NORTH);
		con.add(jtSumaTotal, gbc_jtSumaTotal);
		
		JLabel lbHoraApertura = new JLabel("Hora de apertura");
		lbHoraApertura.setFont(new Font("Tahoma", Font.PLAIN, 24));
		GridBagConstraints gbc_lbHoraApertura = new GridBagConstraints();
		adjustComponents(gbc_lbHoraApertura,4,7,5,1,1.0,0.0,GridBagConstraints.SOUTHWEST);
		con.add(lbHoraApertura, gbc_lbHoraApertura);
		
		JLabel lbHoraCierre = new JLabel("Hora de cierre");
		lbHoraCierre.setFont(new Font("Tahoma", Font.PLAIN, 24));
		GridBagConstraints gbc_lbHoraCierre = new GridBagConstraints();
		adjustComponents(gbc_lbHoraCierre,1,7,1,1,0.0,0.0,GridBagConstraints.SOUTH);
		con.add(lbHoraCierre, gbc_lbHoraCierre);
		
		jtHoraApertura = new JTextField();
		jtHoraApertura.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jtHoraApertura.setColumns(10);
		jtHoraApertura.setEditable(false);
		GridBagConstraints gbc_jtHoraApertura = new GridBagConstraints();
		adjustComponents(gbc_jtHoraApertura,0,8,5,1,1.0,0.0,GridBagConstraints.NORTHWEST);
		con.add(jtHoraApertura, gbc_jtHoraApertura);
		
		jtHoraCierre = new JTextField();
		jtHoraCierre.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jtHoraCierre.setColumns(10);
		jtHoraCierre.setEditable(false);
		GridBagConstraints gbc_jtHoraCierre = new GridBagConstraints();
		adjustComponents(gbc_jtHoraCierre,1,8,1,1,0.0,0.0,GridBagConstraints.NORTHWEST);
		con.add(jtHoraCierre, gbc_jtHoraCierre);
		
		JButton btnAñadirMovExtraordinario = new JButton("A\u00F1adir movimiento extraordinario");
		GridBagConstraints gbc_btnAñadirMovExtraordinario = new GridBagConstraints();
		gbc_btnAñadirMovExtraordinario.ipadx = 130;
		adjustButton(btnAñadirMovExtraordinario,gbc_btnAñadirMovExtraordinario,con,3,8,1,1,0.0,0.0,GridBagConstraints.CENTER);
		
		JButton btnTerminarturno = new JButton("Terminar turno");
		GridBagConstraints gbc_btnTerminarturno = new GridBagConstraints();
		adjustButton(btnTerminarturno,gbc_btnTerminarturno,con,0,7,5,1,0.0,0.0,GridBagConstraints.NORTH);
		
		buttonHome(fCR,false,new GridBagConstraints(),con,4,9,1,1,0.0,0.0,GridBagConstraints.CENTER);
		
		fCR.pack();
		fCR.setExtendedState(JFrame.MAXIMIZED_BOTH);
		fCR.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fCR.setVisible(true);
		con.setBackground(Color.WHITE);
		return fCR;
	}
}