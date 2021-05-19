package consultorioDental;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Font;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class CorteDeCaja extends JFrame {

	private JPanel contentPane;
	private JTextField jtDineroApertura;
	private JTextField jtDineroCierre;
	private JTextField jtSumaTotal;
	private JTextField jtHorraCierre;
	private JTextField jtHoraApertura;
	private JTextField jtUsuario;
	private JTable tbLista;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CorteDeCaja frame = new CorteDeCaja();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CorteDeCaja() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(0, 0,screen.width,screen.height - 30);
		setExtendedState(MAXIMIZED_BOTH);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{201, 224, 59, 176, 139, 339, 233, 0};
		gbl_contentPane.rowHeights = new int[]{87, 52, 31, 73, 29, 31, 40, 29, 31, 40, 29, 36, 37, 29, 36, 40, 37, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lbTitulo = new JLabel("Corte de caja");
		lbTitulo.setFont(new Font("Tahoma", Font.PLAIN, 43));
		GridBagConstraints gbc_lbTitulo = new GridBagConstraints();
		gbc_lbTitulo.anchor = GridBagConstraints.NORTH;
		gbc_lbTitulo.insets = new Insets(0, 0, 5, 5);
		gbc_lbTitulo.gridwidth = 3;
		gbc_lbTitulo.gridx = 1;
		gbc_lbTitulo.gridy = 1;
		contentPane.add(lbTitulo, gbc_lbTitulo);
		
		JLabel lbUsuario = new JLabel("Usuario");
		lbUsuario.setFont(new Font("Tahoma", Font.PLAIN, 24));
		GridBagConstraints gbc_lbUsuario = new GridBagConstraints();
		gbc_lbUsuario.anchor = GridBagConstraints.EAST;
		gbc_lbUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_lbUsuario.gridx = 5;
		gbc_lbUsuario.gridy = 2;
		contentPane.add(lbUsuario, gbc_lbUsuario);
		
		jtUsuario = new JTextField();
		jtUsuario.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jtUsuario.setColumns(10);
		GridBagConstraints gbc_jtUsuario = new GridBagConstraints();
		gbc_jtUsuario.anchor = GridBagConstraints.NORTH;
		gbc_jtUsuario.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtUsuario.insets = new Insets(0, 0, 5, 0);
		gbc_jtUsuario.gridx = 6;
		gbc_jtUsuario.gridy = 2;
		contentPane.add(jtUsuario, gbc_jtUsuario);
		
		JLabel lbDineroApertura = new JLabel("Cantidad de efectivo a la hora de apertura");
		lbDineroApertura.setFont(new Font("Tahoma", Font.PLAIN, 24));
		GridBagConstraints gbc_lbDineroApertura = new GridBagConstraints();
		gbc_lbDineroApertura.anchor = GridBagConstraints.NORTHWEST;
		gbc_lbDineroApertura.insets = new Insets(0, 0, 5, 5);
		gbc_lbDineroApertura.gridwidth = 3;
		gbc_lbDineroApertura.gridx = 1;
		gbc_lbDineroApertura.gridy = 4;
		contentPane.add(lbDineroApertura, gbc_lbDineroApertura);
		
		JLabel lbMovExtraRegistrados = new JLabel("Movimientos extraordinarios registrados");
		lbMovExtraRegistrados.setFont(new Font("Tahoma", Font.PLAIN, 24));
		GridBagConstraints gbc_lbMovExtraRegistrados = new GridBagConstraints();
		gbc_lbMovExtraRegistrados.anchor = GridBagConstraints.NORTHWEST;
		gbc_lbMovExtraRegistrados.insets = new Insets(0, 0, 5, 5);
		gbc_lbMovExtraRegistrados.gridx = 5;
		gbc_lbMovExtraRegistrados.gridy = 4;
		contentPane.add(lbMovExtraRegistrados, gbc_lbMovExtraRegistrados);
		
		jtDineroApertura = new JTextField();
		jtDineroApertura.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jtDineroApertura.setColumns(10);
		GridBagConstraints gbc_jtDineroApertura = new GridBagConstraints();
		gbc_jtDineroApertura.anchor = GridBagConstraints.NORTH;
		gbc_jtDineroApertura.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtDineroApertura.insets = new Insets(0, 0, 5, 5);
		gbc_jtDineroApertura.gridx = 1;
		gbc_jtDineroApertura.gridy = 5;
		contentPane.add(jtDineroApertura, gbc_jtDineroApertura);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.gridheight = 7;
		gbc_scrollPane.gridx = 5;
		gbc_scrollPane.gridy = 5;
		contentPane.add(scrollPane, gbc_scrollPane);
		
		tbLista = new JTable();
		tbLista.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tbLista.setRowHeight(40);//Especificar tamano de fila
		tbLista.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"Fecha", "Monto", "Motivo"
			}
		));
		tbLista.getColumnModel().getColumn(0).setMinWidth(50);
		scrollPane.setViewportView(tbLista);
		
		JLabel lbDineroCierre = new JLabel("Cantidad de efectivo a la hora del cierre");
		lbDineroCierre.setFont(new Font("Tahoma", Font.PLAIN, 24));
		GridBagConstraints gbc_lbDineroCierre = new GridBagConstraints();
		gbc_lbDineroCierre.anchor = GridBagConstraints.NORTHWEST;
		gbc_lbDineroCierre.insets = new Insets(0, 0, 5, 5);
		gbc_lbDineroCierre.gridwidth = 3;
		gbc_lbDineroCierre.gridx = 1;
		gbc_lbDineroCierre.gridy = 7;
		contentPane.add(lbDineroCierre, gbc_lbDineroCierre);
		
		jtDineroCierre = new JTextField();
		jtDineroCierre.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jtDineroCierre.setColumns(10);
		GridBagConstraints gbc_jtDineroCierre = new GridBagConstraints();
		gbc_jtDineroCierre.anchor = GridBagConstraints.NORTH;
		gbc_jtDineroCierre.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtDineroCierre.insets = new Insets(0, 0, 5, 5);
		gbc_jtDineroCierre.gridx = 1;
		gbc_jtDineroCierre.gridy = 8;
		contentPane.add(jtDineroCierre, gbc_jtDineroCierre);
		
		JLabel lbSumaTotal = new JLabel("Suma total de la caja");
		lbSumaTotal.setFont(new Font("Tahoma", Font.PLAIN, 24));
		GridBagConstraints gbc_lbSumaTotal = new GridBagConstraints();
		gbc_lbSumaTotal.anchor = GridBagConstraints.NORTHWEST;
		gbc_lbSumaTotal.insets = new Insets(0, 0, 5, 5);
		gbc_lbSumaTotal.gridx = 1;
		gbc_lbSumaTotal.gridy = 10;
		contentPane.add(lbSumaTotal, gbc_lbSumaTotal);
		
		jtSumaTotal = new JTextField();
		jtSumaTotal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jtSumaTotal.setColumns(10);
		GridBagConstraints gbc_jtSumaTotal = new GridBagConstraints();
		gbc_jtSumaTotal.anchor = GridBagConstraints.NORTH;
		gbc_jtSumaTotal.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtSumaTotal.insets = new Insets(0, 0, 5, 5);
		gbc_jtSumaTotal.gridx = 1;
		gbc_jtSumaTotal.gridy = 11;
		contentPane.add(jtSumaTotal, gbc_jtSumaTotal);
		
		JLabel lbHoraApertura = new JLabel("Hora de apertura");
		lbHoraApertura.setFont(new Font("Tahoma", Font.PLAIN, 24));
		GridBagConstraints gbc_lbHoraApertura = new GridBagConstraints();
		gbc_lbHoraApertura.anchor = GridBagConstraints.NORTHWEST;
		gbc_lbHoraApertura.insets = new Insets(0, 0, 5, 5);
		gbc_lbHoraApertura.gridx = 1;
		gbc_lbHoraApertura.gridy = 13;
		contentPane.add(lbHoraApertura, gbc_lbHoraApertura);
		
		JLabel lbHorraCierre = new JLabel("Hora de cierre");
		lbHorraCierre.setFont(new Font("Tahoma", Font.PLAIN, 24));
		GridBagConstraints gbc_lbHorraCierre = new GridBagConstraints();
		gbc_lbHorraCierre.anchor = GridBagConstraints.NORTHWEST;
		gbc_lbHorraCierre.insets = new Insets(0, 0, 5, 5);
		gbc_lbHorraCierre.gridx = 3;
		gbc_lbHorraCierre.gridy = 13;
		contentPane.add(lbHorraCierre, gbc_lbHorraCierre);
		
		jtHoraApertura = new JTextField();
		jtHoraApertura.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jtHoraApertura.setColumns(10);
		GridBagConstraints gbc_jtHoraApertura = new GridBagConstraints();
		gbc_jtHoraApertura.fill = GridBagConstraints.BOTH;
		gbc_jtHoraApertura.insets = new Insets(0, 0, 5, 5);
		gbc_jtHoraApertura.gridx = 1;
		gbc_jtHoraApertura.gridy = 14;
		contentPane.add(jtHoraApertura, gbc_jtHoraApertura);
		
		jtHorraCierre = new JTextField();
		jtHorraCierre.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jtHorraCierre.setColumns(10);
		GridBagConstraints gbc_jtHorraCierre = new GridBagConstraints();
		gbc_jtHorraCierre.anchor = GridBagConstraints.WEST;
		gbc_jtHorraCierre.fill = GridBagConstraints.BOTH;
		gbc_jtHorraCierre.insets = new Insets(0, 0, 5, 5);
		gbc_jtHorraCierre.gridx = 3;
		gbc_jtHorraCierre.gridy = 14;
		contentPane.add(jtHorraCierre, gbc_jtHorraCierre);
		
		JButton btnAñadirMovExtraordinario = new JButton("A\u00F1adir movimiento extraordinario");
		btnAñadirMovExtraordinario.setFont(new Font("Tahoma", Font.PLAIN, 24));
		GridBagConstraints gbc_btnAñadirMovExtraordinario = new GridBagConstraints();
		gbc_btnAñadirMovExtraordinario.anchor = GridBagConstraints.NORTH;
		gbc_btnAñadirMovExtraordinario.insets = new Insets(0, 0, 5, 5);
		gbc_btnAñadirMovExtraordinario.gridx = 5;
		gbc_btnAñadirMovExtraordinario.gridy = 14;
		contentPane.add(btnAñadirMovExtraordinario, gbc_btnAñadirMovExtraordinario);
		
		JButton btnIniciarTurno = new JButton("Iniciar turno");
		btnIniciarTurno.setFont(new Font("Tahoma", Font.PLAIN, 24));
		GridBagConstraints gbc_btnIniciarTurno = new GridBagConstraints();
		gbc_btnIniciarTurno.anchor = GridBagConstraints.NORTH;
		gbc_btnIniciarTurno.insets = new Insets(0, 0, 0, 5);
		gbc_btnIniciarTurno.gridx = 1;
		gbc_btnIniciarTurno.gridy = 16;
		contentPane.add(btnIniciarTurno, gbc_btnIniciarTurno);
		
		JButton btnHome = new JButton(new ImageIcon("src/img/home.png"));
		btnHome.setPreferredSize(new Dimension(35, 35));
		btnHome.setBorder(new LineBorder(Color.white));
		GridBagConstraints gbc_btnHome = new GridBagConstraints();
		gbc_btnHome.anchor = GridBagConstraints.NORTH;
		gbc_btnHome.insets = new Insets(0, 0, 0, 5);
		gbc_btnHome.gridx = 3;
		gbc_btnHome.gridy = 16;
		contentPane.add(btnHome, gbc_btnHome);
		
		JButton btnTerminarturno = new JButton("Terminar turno");
		btnTerminarturno.setFont(new Font("Tahoma", Font.PLAIN, 24));
		GridBagConstraints gbc_btnTerminarturno = new GridBagConstraints();
		gbc_btnTerminarturno.insets = new Insets(0, 0, 0, 5);
		gbc_btnTerminarturno.gridx = 5;
		gbc_btnTerminarturno.gridy = 16;
		contentPane.add(btnTerminarturno, gbc_btnTerminarturno);
	}
}
