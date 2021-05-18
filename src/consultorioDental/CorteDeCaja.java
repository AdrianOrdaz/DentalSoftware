package consultorioDental;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Font;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;

public class CorteDeCaja extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

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
		gbl_contentPane.columnWidths = new int[]{85, 225, 49, 186, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{77, 52, 131, 29, 30, 29, 19, 30, 29, 27, 30, 29, 19, 31, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
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
		
		JLabel lbDineroApertura = new JLabel("Cantidad de efectivo a la hora de apertura");
		lbDineroApertura.setFont(new Font("Tahoma", Font.PLAIN, 24));
		GridBagConstraints gbc_lbDineroApertura = new GridBagConstraints();
		gbc_lbDineroApertura.anchor = GridBagConstraints.NORTHWEST;
		gbc_lbDineroApertura.insets = new Insets(0, 0, 5, 5);
		gbc_lbDineroApertura.gridwidth = 3;
		gbc_lbDineroApertura.gridx = 1;
		gbc_lbDineroApertura.gridy = 3;
		contentPane.add(lbDineroApertura, gbc_lbDineroApertura);
		
		JLabel lbMovExtraRegistrados = new JLabel("<html>Movimientos<br>extraordinarios registrados</html");
		lbMovExtraRegistrados.setFont(new Font("Tahoma", Font.PLAIN, 24));
		GridBagConstraints gbc_lbMovExtraRegistrados = new GridBagConstraints();
		gbc_lbMovExtraRegistrados.insets = new Insets(0, 0, 5, 0);
		gbc_lbMovExtraRegistrados.gridx = 5;
		gbc_lbMovExtraRegistrados.gridy = 3;
		contentPane.add(lbMovExtraRegistrados, gbc_lbMovExtraRegistrados);
		
		textField = new JTextField();
		textField.setColumns(10);
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.fill = GridBagConstraints.BOTH;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 4;
		contentPane.add(textField, gbc_textField);
		
		JLabel lbDineroCierre = new JLabel("Cantidad de efectivo a la hora del cierre");
		lbDineroCierre.setFont(new Font("Tahoma", Font.PLAIN, 24));
		GridBagConstraints gbc_lbDineroCierre = new GridBagConstraints();
		gbc_lbDineroCierre.anchor = GridBagConstraints.NORTHWEST;
		gbc_lbDineroCierre.insets = new Insets(0, 0, 5, 5);
		gbc_lbDineroCierre.gridwidth = 3;
		gbc_lbDineroCierre.gridx = 1;
		gbc_lbDineroCierre.gridy = 6;
		contentPane.add(lbDineroCierre, gbc_lbDineroCierre);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.fill = GridBagConstraints.BOTH;
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.gridx = 1;
		gbc_textField_1.gridy = 7;
		contentPane.add(textField_1, gbc_textField_1);
		
		JLabel lbSumaTotal = new JLabel("Suma total de la caja");
		lbSumaTotal.setFont(new Font("Tahoma", Font.PLAIN, 24));
		GridBagConstraints gbc_lbSumaTotal = new GridBagConstraints();
		gbc_lbSumaTotal.anchor = GridBagConstraints.NORTHWEST;
		gbc_lbSumaTotal.insets = new Insets(0, 0, 5, 5);
		gbc_lbSumaTotal.gridx = 1;
		gbc_lbSumaTotal.gridy = 9;
		contentPane.add(lbSumaTotal, gbc_lbSumaTotal);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.fill = GridBagConstraints.BOTH;
		gbc_textField_2.insets = new Insets(0, 0, 5, 5);
		gbc_textField_2.gridx = 1;
		gbc_textField_2.gridy = 10;
		contentPane.add(textField_2, gbc_textField_2);
		
		JLabel lbHoraApertura = new JLabel("Hora de apertura");
		lbHoraApertura.setFont(new Font("Tahoma", Font.PLAIN, 24));
		GridBagConstraints gbc_lbHoraApertura = new GridBagConstraints();
		gbc_lbHoraApertura.anchor = GridBagConstraints.NORTHWEST;
		gbc_lbHoraApertura.insets = new Insets(0, 0, 5, 5);
		gbc_lbHoraApertura.gridx = 1;
		gbc_lbHoraApertura.gridy = 12;
		contentPane.add(lbHoraApertura, gbc_lbHoraApertura);
		
		JLabel lbHorraCierre = new JLabel("Hora de cierre");
		lbHorraCierre.setFont(new Font("Tahoma", Font.PLAIN, 24));
		GridBagConstraints gbc_lbHorraCierre = new GridBagConstraints();
		gbc_lbHorraCierre.anchor = GridBagConstraints.NORTHWEST;
		gbc_lbHorraCierre.insets = new Insets(0, 0, 5, 5);
		gbc_lbHorraCierre.gridx = 3;
		gbc_lbHorraCierre.gridy = 12;
		contentPane.add(lbHorraCierre, gbc_lbHorraCierre);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.fill = GridBagConstraints.BOTH;
		gbc_textField_4.insets = new Insets(0, 0, 5, 5);
		gbc_textField_4.gridx = 1;
		gbc_textField_4.gridy = 13;
		contentPane.add(textField_4, gbc_textField_4);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.insets = new Insets(0, 0, 5, 5);
		gbc_textField_3.fill = GridBagConstraints.BOTH;
		gbc_textField_3.gridx = 3;
		gbc_textField_3.gridy = 13;
		contentPane.add(textField_3, gbc_textField_3);
		
		JButton btnIniciarTurno = new JButton("Iniciar turno");
		btnIniciarTurno.setFont(new Font("Tahoma", Font.PLAIN, 24));
		GridBagConstraints gbc_btnIniciarTurno = new GridBagConstraints();
		gbc_btnIniciarTurno.insets = new Insets(0, 0, 0, 5);
		gbc_btnIniciarTurno.gridx = 1;
		gbc_btnIniciarTurno.gridy = 15;
		contentPane.add(btnIniciarTurno, gbc_btnIniciarTurno);
		
		JButton btnHome = new JButton("Home");
		btnHome.setFont(new Font("Tahoma", Font.PLAIN, 24));
		GridBagConstraints gbc_btnHome = new GridBagConstraints();
		gbc_btnHome.insets = new Insets(0, 0, 0, 5);
		gbc_btnHome.gridx = 3;
		gbc_btnHome.gridy = 15;
		contentPane.add(btnHome, gbc_btnHome);
	}

}
