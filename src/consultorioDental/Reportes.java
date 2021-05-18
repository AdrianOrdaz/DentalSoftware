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
import javax.swing.JButton;
import java.awt.Insets;
import javax.swing.SwingConstants;

public class Reportes extends JFrame {


		private JPanel contentPane;

		/**
		 * Launch the application.
		 */
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						Reportes frame = new Reportes();
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
		public Reportes() {
			Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
			setBounds(0, 0,screen.width,screen.height - 30);
			setExtendedState(MAXIMIZED_BOTH); //Hace fullscreen https://www.eclipse.org/forums/index.php/t/236548/
			
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			GridBagLayout gbl_contentPane = new GridBagLayout();
			gbl_contentPane.columnWidths = new int[]{128, 0, 156, 298, 0, 0, 0};
			gbl_contentPane.rowHeights = new int[]{96, 0, 233, 0, 121, 0, 0};
			gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			contentPane.setLayout(gbl_contentPane);
			
			JLabel lbTitulo = new JLabel("Reportes");
			lbTitulo.setFont(new Font("Tahoma", Font.PLAIN, 39));
			GridBagConstraints gbc_lbTitulo = new GridBagConstraints();
			gbc_lbTitulo.insets = new Insets(0, 0, 5, 5);
			gbc_lbTitulo.gridx = 1;
			gbc_lbTitulo.gridy = 1;
			contentPane.add(lbTitulo, gbc_lbTitulo);
			
			JButton btnReporteVentas = new JButton("Reporte de ventas");
			btnReporteVentas.setFont(new Font("Tahoma", Font.PLAIN, 29));
			GridBagConstraints gbc_btnReporteVentas = new GridBagConstraints();
			gbc_btnReporteVentas.insets = new Insets(0, 0, 5, 5);
			gbc_btnReporteVentas.gridx = 3;
			gbc_btnReporteVentas.gridy = 3;
			contentPane.add(btnReporteVentas, gbc_btnReporteVentas);
			
			JButton btnTransaccion = new JButton("Transaccion");
			btnTransaccion.setFont(new Font("Tahoma", Font.PLAIN, 29));
			GridBagConstraints gbc_btnTransaccion = new GridBagConstraints();
			gbc_btnTransaccion.insets = new Insets(0, 0, 5, 0);
			gbc_btnTransaccion.gridx = 5;
			gbc_btnTransaccion.gridy = 3;
			contentPane.add(btnTransaccion, gbc_btnTransaccion);
			
			JButton btnReportePacientes = new JButton("<html>Reporte de<br>pacientes</html");
			btnReportePacientes.setFont(new Font("Tahoma", Font.PLAIN, 29));//boton tenga dos renglones
			GridBagConstraints gbc_btnReportePacientes = new GridBagConstraints();
			gbc_btnReportePacientes.insets = new Insets(0, 0, 5, 5);
			gbc_btnReportePacientes.gridx = 4;
			gbc_btnReportePacientes.gridy = 4;
			contentPane.add(btnReportePacientes, gbc_btnReportePacientes);
			
			JButton btnReporteAsistencia = new JButton("Reporte de asistencia");
			btnReporteAsistencia.setFont(new Font("Tahoma", Font.PLAIN, 29));
			GridBagConstraints gbc_btnReporteAsistencia = new GridBagConstraints();
			gbc_btnReporteAsistencia.insets = new Insets(0, 0, 0, 5);
			gbc_btnReporteAsistencia.gridx = 3;
			gbc_btnReporteAsistencia.gridy = 5;
			contentPane.add(btnReporteAsistencia, gbc_btnReporteAsistencia);
			
			JButton btnMovExtra = new JButton("<html>Reporte de<br>eficiencia</html");
			btnMovExtra.setFont(new Font("Tahoma", Font.PLAIN, 26));
			GridBagConstraints gbc_btnMovExtra = new GridBagConstraints();
			gbc_btnMovExtra.gridx = 5;
			gbc_btnMovExtra.gridy = 5;
			contentPane.add(btnMovExtra, gbc_btnMovExtra);
		}

	}
