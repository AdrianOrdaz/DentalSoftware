package consultorioDental;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Insets;

public class Reportes extends metodosDiseño {


		private JPanel contentPane;

		public static void main(String[] args) {
			Reportes fg = new Reportes(); //nombre del archivo
			fg.CrearGui();
		}

		private void  CrearGui() {
			JFrame fCR = new JFrame("Administrar Caja");
			Container con = this.getContentPane();
			con = fCR.getContentPane();
			con.setLayout(new GridBagLayout());
			
			fCR.pack();
			fCR.setExtendedState(JFrame.MAXIMIZED_BOTH);
			fCR.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			fCR.setVisible(true);
			con.setBackground(Color.WHITE);
			
		
			GridBagLayout gbl_contentPane = new GridBagLayout();
			gbl_contentPane.columnWidths = new int[]{102, 0, 22, 0, 0, 265, 59, 0, 0};
			gbl_contentPane.rowHeights = new int[]{96, 0, 240, 0, 121, 0, 58, 0, 0};
			gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			con.setLayout(gbl_contentPane);
			
			JLabel lbTitulo = new JLabel("Reportes");
			lbTitulo.setFont(new Font("Tahoma", Font.PLAIN, 55));
			GridBagConstraints gbc_lbTitulo = new GridBagConstraints();
			gbc_lbTitulo.insets = new Insets(0, 0, 5, 5);
			gbc_lbTitulo.gridx = 1;
			gbc_lbTitulo.gridy = 1;
			con.add(lbTitulo, gbc_lbTitulo);
			
			JButton btnReporteVentas = new JButton("Reporte de ventas");
			btnReporteVentas.setFont(new Font("Tahoma", Font.PLAIN, 29));
			GridBagConstraints gbc_btnReporteVentas = new GridBagConstraints();
			gbc_btnReporteVentas.fill = GridBagConstraints.HORIZONTAL;
			gbc_btnReporteVentas.insets = new Insets(0, 0, 5, 5);
			gbc_btnReporteVentas.gridx = 3;
			gbc_btnReporteVentas.gridy = 3;
			con.add(btnReporteVentas, gbc_btnReporteVentas);
			
			JButton btnTransaccion = new JButton("Transaccion");
			btnTransaccion.setFont(new Font("Tahoma", Font.PLAIN, 29));
			GridBagConstraints gbc_btnTransaccion = new GridBagConstraints();
			gbc_btnTransaccion.fill = GridBagConstraints.HORIZONTAL;
			gbc_btnTransaccion.insets = new Insets(0, 0, 5, 5);
			gbc_btnTransaccion.gridx = 5;
			gbc_btnTransaccion.gridy = 3;
			con.add(btnTransaccion, gbc_btnTransaccion);
			
			JButton btnReportePacientes = new JButton("Reporte de pacientes");
			//JButton btnReportePacientes = new JButton("<html>Reporte de<br>pacientes</html");
			btnReportePacientes.setFont(new Font("Tahoma", Font.PLAIN, 29));//boton tenga dos renglones
			GridBagConstraints gbc_btnReportePacientes = new GridBagConstraints();
			gbc_btnReportePacientes.ipady = 8;
			
			gbc_btnReportePacientes.insets = new Insets(0, 0, 5, 5);
			gbc_btnReportePacientes.gridx = 4;
			gbc_btnReportePacientes.gridy = 4;
			con.add(btnReportePacientes, gbc_btnReportePacientes);
			
			JButton btnReporteAsistencia = new JButton("Reporte de asistencia");
			btnReporteAsistencia.setFont(new Font("Tahoma", Font.PLAIN, 29));
			GridBagConstraints gbc_btnReporteAsistencia = new GridBagConstraints();
			gbc_btnReporteAsistencia.fill = GridBagConstraints.HORIZONTAL;
			gbc_btnReporteAsistencia.insets = new Insets(0, 0, 5, 5);
			gbc_btnReporteAsistencia.gridx = 3;
			gbc_btnReporteAsistencia.gridy = 5;
			con.add(btnReporteAsistencia, gbc_btnReporteAsistencia);
			
			JButton btnMovExtra = new JButton("Reporte de eficiencia");
			btnMovExtra.setFont(new Font("Tahoma", Font.PLAIN, 29));
			GridBagConstraints gbc_btnMovExtra = new GridBagConstraints();
			gbc_btnMovExtra.insets = new Insets(0, 0, 5, 5);
			gbc_btnMovExtra.fill = GridBagConstraints.HORIZONTAL;
			gbc_btnMovExtra.gridx = 5;
			gbc_btnMovExtra.gridy = 5;
			con.add(btnMovExtra, gbc_btnMovExtra);
			
			JButton btnHome = new JButton(new ImageIcon("src/img/home.png"));
			btnHome.setPreferredSize(new Dimension(35, 35));
			btnHome.setBorder(new LineBorder(Color.white));
			GridBagConstraints gbc_btnHome = new GridBagConstraints();
			gbc_btnHome.gridx = 7;
			gbc_btnHome.gridy = 7;
			con.add(btnHome, gbc_btnHome);
			
			fCR.revalidate();
			fCR.repaint();
		}

	}
