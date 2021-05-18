package consultorioDental;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Font;
import java.awt.Insets;
import javax.swing.JTextField;
import java.awt.Component;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;

public class Transaccion extends JFrame {

	private JPanel contentPane;
	private JTextField jtIdCompra;
	private JTextField jtIdUsuario;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Transaccion frame = new Transaccion();
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
	public Transaccion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(0, 0,screen.width,screen.height - 30);
		setExtendedState(MAXIMIZED_BOTH);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{182, 168, 53, 35, 208, 47, 47, 154, 329, 0};
		gbl_contentPane.rowHeights = new int[]{53, 52, 91, 29, 40, 29, 381, 37, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lbTitulo = new JLabel("Transaccion");
		lbTitulo.setFont(new Font("Tahoma", Font.PLAIN, 43));
		GridBagConstraints gbc_lbTitulo = new GridBagConstraints();
		gbc_lbTitulo.anchor = GridBagConstraints.NORTHWEST;
		gbc_lbTitulo.insets = new Insets(0, 0, 5, 5);
		gbc_lbTitulo.gridwidth = 2;
		gbc_lbTitulo.gridx = 1;
		gbc_lbTitulo.gridy = 1;
		contentPane.add(lbTitulo, gbc_lbTitulo);
		
		JLabel lbIdCompra = new JLabel("Id de la compra");
		lbIdCompra.setFont(new Font("Tahoma", Font.PLAIN, 24));
		GridBagConstraints gbc_lbIdCompra = new GridBagConstraints();
		gbc_lbIdCompra.anchor = GridBagConstraints.NORTHWEST;
		gbc_lbIdCompra.insets = new Insets(0, 0, 5, 5);
		gbc_lbIdCompra.gridx = 1;
		gbc_lbIdCompra.gridy = 3;
		contentPane.add(lbIdCompra, gbc_lbIdCompra);
		
		jtIdCompra = new JTextField();
		jtIdCompra.setMaximumSize(new Dimension(50, 50));
		jtIdCompra.setFont(new Font("Tahoma", Font.PLAIN, 14));
		jtIdCompra.setColumns(10);
		GridBagConstraints gbc_jtIdCompra = new GridBagConstraints();
		gbc_jtIdCompra.fill = GridBagConstraints.BOTH;
		gbc_jtIdCompra.insets = new Insets(0, 0, 5, 5);
		gbc_jtIdCompra.gridwidth = 3;
		gbc_jtIdCompra.gridx = 2;
		gbc_jtIdCompra.gridy = 3;
		contentPane.add(jtIdCompra, gbc_jtIdCompra);
		
		JLabel lbIdUsuario = new JLabel("Id del usuario");
		lbIdUsuario.setFont(new Font("Tahoma", Font.PLAIN, 24));
		GridBagConstraints gbc_lbIdUsuario = new GridBagConstraints();
		gbc_lbIdUsuario.anchor = GridBagConstraints.NORTHWEST;
		gbc_lbIdUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_lbIdUsuario.gridx = 7;
		gbc_lbIdUsuario.gridy = 3;
		contentPane.add(lbIdUsuario, gbc_lbIdUsuario);
		
		jtIdUsuario = new JTextField();
		jtIdUsuario.setMaximumSize(new Dimension(50, 50));
		jtIdUsuario.setFont(new Font("Tahoma", Font.PLAIN, 14));
		jtIdUsuario.setColumns(10);
		GridBagConstraints gbc_jtIdUsuario = new GridBagConstraints();
		gbc_jtIdUsuario.fill = GridBagConstraints.BOTH;
		gbc_jtIdUsuario.insets = new Insets(0, 0, 5, 0);
		gbc_jtIdUsuario.gridx = 8;
		gbc_jtIdUsuario.gridy = 3;
		contentPane.add(jtIdUsuario, gbc_jtIdUsuario);
		
		JLabel lbIdCita = new JLabel("Id de la cita");
		lbIdCita.setFont(new Font("Tahoma", Font.PLAIN, 24));
		GridBagConstraints gbc_lbIdCita = new GridBagConstraints();
		gbc_lbIdCita.anchor = GridBagConstraints.NORTHWEST;
		gbc_lbIdCita.insets = new Insets(0, 0, 5, 5);
		gbc_lbIdCita.gridx = 1;
		gbc_lbIdCita.gridy = 5;
		contentPane.add(lbIdCita, gbc_lbIdCita);
		
		textField = new JTextField();
		textField.setColumns(10);
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.fill = GridBagConstraints.BOTH;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.gridwidth = 3;
		gbc_textField.gridx = 2;
		gbc_textField.gridy = 5;
		contentPane.add(textField, gbc_textField);
		
		JLabel lbPromocion = new JLabel("Promocion");
		lbPromocion.setFont(new Font("Tahoma", Font.PLAIN, 24));
		GridBagConstraints gbc_lbPromocion = new GridBagConstraints();
		gbc_lbPromocion.anchor = GridBagConstraints.NORTHWEST;
		gbc_lbPromocion.insets = new Insets(0, 0, 5, 5);
		gbc_lbPromocion.gridx = 7;
		gbc_lbPromocion.gridy = 5;
		contentPane.add(lbPromocion, gbc_lbPromocion);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.fill = GridBagConstraints.BOTH;
		gbc_textField_1.insets = new Insets(0, 0, 5, 0);
		gbc_textField_1.gridx = 8;
		gbc_textField_1.gridy = 5;
		contentPane.add(textField_1, gbc_textField_1);
		
		JButton btnComprobar = new JButton("Comprobar");
		btnComprobar.setFont(new Font("Tahoma", Font.PLAIN, 24));
		GridBagConstraints gbc_btnComprobar = new GridBagConstraints();
		gbc_btnComprobar.anchor = GridBagConstraints.NORTH;
		gbc_btnComprobar.insets = new Insets(0, 0, 0, 5);
		gbc_btnComprobar.gridx = 1;
		gbc_btnComprobar.gridy = 7;
		contentPane.add(btnComprobar, gbc_btnComprobar);
		
		JButton btnGenerar = new JButton("Generar");
		btnGenerar.setFont(new Font("Tahoma", Font.PLAIN, 24));
		GridBagConstraints gbc_btnGenerar = new GridBagConstraints();
		gbc_btnGenerar.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnGenerar.insets = new Insets(0, 0, 0, 5);
		gbc_btnGenerar.gridx = 4;
		gbc_btnGenerar.gridy = 7;
		contentPane.add(btnGenerar, gbc_btnGenerar);
		
		JButton btnNewButton = new JButton("\u2302");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 24));
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnNewButton.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton.gridx = 5;
		gbc_btnNewButton.gridy = 7;
		contentPane.add(btnNewButton, gbc_btnNewButton);
		
		JButton btnRegresar = new JButton("R");
		btnRegresar.setFont(new Font("Tahoma", Font.PLAIN, 24));
		GridBagConstraints gbc_btnRegresar = new GridBagConstraints();
		gbc_btnRegresar.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnRegresar.insets = new Insets(0, 0, 0, 5);
		gbc_btnRegresar.gridx = 6;
		gbc_btnRegresar.gridy = 7;
		contentPane.add(btnRegresar, gbc_btnRegresar);
		
		JLabel lbTotal = new JLabel("Total ");
		lbTotal.setFont(new Font("Tahoma", Font.PLAIN, 24));
		GridBagConstraints gbc_lbTotal = new GridBagConstraints();
		gbc_lbTotal.anchor = GridBagConstraints.EAST;
		gbc_lbTotal.insets = new Insets(0, 0, 0, 5);
		gbc_lbTotal.gridx = 7;
		gbc_lbTotal.gridy = 7;
		contentPane.add(lbTotal, gbc_lbTotal);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.fill = GridBagConstraints.BOTH;
		gbc_textField_2.gridx = 8;
		gbc_textField_2.gridy = 7;
		contentPane.add(textField_2, gbc_textField_2);
	}

}
