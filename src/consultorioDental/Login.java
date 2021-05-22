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

public class Login extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(0, 0,screen.width,screen.height - 30);
		setExtendedState(MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{220, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{142, 0, 123, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lbIniciarSesion = new JLabel("Iniciar Sesion");
		lbIniciarSesion.setFont(new Font("Tahoma", Font.PLAIN, 49));
		GridBagConstraints gbc_lbIniciarSesion = new GridBagConstraints();
		gbc_lbIniciarSesion.insets = new Insets(0, 0, 5, 5);
		gbc_lbIniciarSesion.gridx = 1;
		gbc_lbIniciarSesion.gridy = 1;
		contentPane.add(lbIniciarSesion, gbc_lbIniciarSesion);
		
		JLabel lbUsuario = new JLabel("Usuario");
		lbUsuario.setFont(new Font("Tahoma", Font.PLAIN, 24));
		GridBagConstraints gbc_lbUsuario = new GridBagConstraints();
		gbc_lbUsuario.gridx = 2;
		gbc_lbUsuario.gridy = 3;
		contentPane.add(lbUsuario, gbc_lbUsuario);
	}

}
