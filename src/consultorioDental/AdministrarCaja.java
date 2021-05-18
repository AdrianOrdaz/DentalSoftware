package consultorioDental;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Insets;

public class AdministrarCaja extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdministrarCaja frame = new AdministrarCaja();
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
	public AdministrarCaja() {
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(0, 0,screen.width,screen.height - 30);
		setExtendedState(MAXIMIZED_BOTH); //Hace fullscreen https://www.eclipse.org/forums/index.php/t/236548/
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{128, 0, 0, 298, 0, 0};
		gbl_contentPane.rowHeights = new int[]{96, 0, 325, 0, 121, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lbTitulo = new JLabel("Administrar caja");
		lbTitulo.setFont(new Font("Tahoma", Font.PLAIN, 39));
		GridBagConstraints gbc_lbTitulo = new GridBagConstraints();
		gbc_lbTitulo.insets = new Insets(0, 0, 5, 5);
		gbc_lbTitulo.gridx = 1;
		gbc_lbTitulo.gridy = 1;
		contentPane.add(lbTitulo, gbc_lbTitulo);
		
		JButton btnGenerarRecibo = new JButton("Generar recibo");
		btnGenerarRecibo.setFont(new Font("Tahoma", Font.PLAIN, 29));
		GridBagConstraints gbc_btnGenerarRecibo = new GridBagConstraints();
		gbc_btnGenerarRecibo.insets = new Insets(0, 0, 5, 5);
		gbc_btnGenerarRecibo.gridx = 2;
		gbc_btnGenerarRecibo.gridy = 3;
		contentPane.add(btnGenerarRecibo, gbc_btnGenerarRecibo);
		
		JButton btnTransaccion = new JButton("Transaccion");
		btnTransaccion.setFont(new Font("Tahoma", Font.PLAIN, 29));
		GridBagConstraints gbc_btnTransaccion = new GridBagConstraints();
		gbc_btnTransaccion.insets = new Insets(0, 0, 5, 0);
		gbc_btnTransaccion.gridx = 4;
		gbc_btnTransaccion.gridy = 3;
		contentPane.add(btnTransaccion, gbc_btnTransaccion);
		
		JButton btnCorteCaja = new JButton("Corte de caja");
		btnCorteCaja.setFont(new Font("Tahoma", Font.PLAIN, 29));
		GridBagConstraints gbc_btnCorteCaja = new GridBagConstraints();
		gbc_btnCorteCaja.insets = new Insets(0, 0, 0, 5);
		gbc_btnCorteCaja.gridx = 2;
		gbc_btnCorteCaja.gridy = 5;
		contentPane.add(btnCorteCaja, gbc_btnCorteCaja);
		
		JButton btnMovExtra = new JButton("<html>Movimiento<br>extraordinario</html");
		//btnMovExtra.setHorizontalAlignment(SwingConstants.RIGHT);
		btnMovExtra.setFont(new Font("Tahoma", Font.PLAIN, 29));
		GridBagConstraints gbc_btnMovExtra = new GridBagConstraints();
		gbc_btnMovExtra.gridx = 4;
		gbc_btnMovExtra.gridy = 5;
		contentPane.add(btnMovExtra, gbc_btnMovExtra);
	}

}
