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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Reportes extends MetodosDiseño {
<<<<<<< HEAD

=======
		JFrame fCR;
>>>>>>> refs/heads/MetodosBD
		public static void main(String[] args) {
			Reportes fg = new Reportes(); //nombre del archivo
			fg.CrearGui();
		}

<<<<<<< HEAD
		protected void  CrearGui() {
			JFrame fCR = new JFrame("Administrar Caja");
=======
		protected JFrame  CrearGui() {
			fCR = new JFrame("Generar Reporte de...");
>>>>>>> refs/heads/MetodosBD
			Container con = this.getContentPane();
			con = fCR.getContentPane();
			con.setLayout(new GridBagLayout());
			GridBagConstraints c = new GridBagConstraints();
			
			JLabel lbTitulo = new JLabel("Reportes");
			lbTitulo.setFont(new Font("Open Sans", Font.PLAIN, 40));
			adjustComponents(c,0,0,5,1,1.0,0.0,GridBagConstraints.NORTH);
			con.add(lbTitulo,c);
			
			c.fill = GridBagConstraints.BOTH;
			JButton btnReporteVentas = new JButton("Reporte de ventas");
			adjustButton(btnReporteVentas,c,con,0,1,1,1,1.0,1.0,GridBagConstraints.CENTER);
			
			JButton btnTransaccion = new JButton("Transaccion");
			adjustButton(btnTransaccion,c,con,1,1,1,1,0.0,1.0,GridBagConstraints.CENTER);
			
			JButton btnReportePacientes = new JButton("Reporte de pacientes");
			adjustButton(btnReportePacientes,c,con,2,1,1,1,0.0,1.0,GridBagConstraints.CENTER);
			
			JButton btnReporteAsistencia = new JButton("Reporte de asistencia");
			adjustButton(btnReporteAsistencia,c,con,3,1,1,1,0.0,1.0,GridBagConstraints.CENTER);
			
			JButton btnMovExtra = new JButton("Reporte de eficiencia");
			adjustButton(btnMovExtra,c,con,4,1,1,1,0.0,1.0,GridBagConstraints.CENTER);
			
			c.fill = GridBagConstraints.NONE;
			buttonHome(fCR,false,c,con,0,2,5,1,1.0,1.0,GridBagConstraints.CENTER);
			
			fCR.pack();
			fCR.setExtendedState(JFrame.MAXIMIZED_BOTH);
			fCR.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			fCR.setVisible(true);
			con.setBackground(Color.WHITE);
<<<<<<< HEAD
			
		
			GridBagLayout gbl_contentPane = new GridBagLayout();
			gbl_contentPane.columnWidths = new int[]{102, 0, 22, 330, 330, 330, 59, 0, 0};
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
			adjustButton(btnReporteVentas, gbc_btnReporteVentas, con, 3, 3, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER);
			btnReporteVentas.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					//Recibo rb = new Recibo();
					//rb.crearGUI();				Generar reportes
					//fCR.setVisible(false);
				}
			});
			
			JButton btnTransaccion = new JButton("Transaccion");
			btnTransaccion.setFont(new Font("Tahoma", Font.PLAIN, 29));
			GridBagConstraints gbc_btnTransaccion = new GridBagConstraints();
			gbc_btnTransaccion.fill = GridBagConstraints.HORIZONTAL;
			adjustButton(btnTransaccion, gbc_btnTransaccion, con, 5, 3, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER);
			btnTransaccion.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					//Recibo rb = new Recibo();
					//rb.crearGUI();				Generar reportes
					//fCR.setVisible(false);
				}
			});
			
			JButton btnReportePacientes = new JButton("Reporte de pacientes");
			//JButton btnReportePacientes = new JButton("<html>Reporte de<br>pacientes</html");
			btnReportePacientes.setFont(new Font("Tahoma", Font.PLAIN, 29));
			GridBagConstraints gbc_btnReportePacientes = new GridBagConstraints();
			gbc_btnReportePacientes.fill = GridBagConstraints.HORIZONTAL;
			adjustButton(btnReportePacientes, gbc_btnReportePacientes, con, 4, 4, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER);
			btnReportePacientes.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					//Recibo rb = new Recibo();
					//rb.crearGUI();				Generar reportes
					//fCR.setVisible(false);
				}
			});
			
			
			JButton btnReporteAsistencia = new JButton("Reporte de asistencia");
			btnReporteAsistencia.setFont(new Font("Tahoma", Font.PLAIN, 29));
			GridBagConstraints gbc_btnReporteAsistencia = new GridBagConstraints();
			gbc_btnReporteAsistencia.fill = GridBagConstraints.HORIZONTAL;
			adjustButton(btnReporteAsistencia, gbc_btnReporteAsistencia, con, 3, 5, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER);
			btnReporteAsistencia.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					//Recibo rb = new Recibo();
					//rb.crearGUI();				Generar reportes
					//fCR.setVisible(false);
				}
			});
			
			JButton btnMovExtra = new JButton("Reporte de asistencia");
			btnMovExtra.setFont(new Font("Tahoma", Font.PLAIN, 29));
			GridBagConstraints gbc_btnMovExtra = new GridBagConstraints();
			gbc_btnMovExtra.fill = GridBagConstraints.HORIZONTAL;
			adjustButton(btnMovExtra, gbc_btnMovExtra, con, 5, 5, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER);
			btnMovExtra.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					//Recibo rb = new Recibo();
					//rb.crearGUI();				Generar reportes
					//fCR.setVisible(false);
				}
			});
			
			
			buttonHome(fCR,false,new GridBagConstraints(),con,7,7,1,1,0.0,0.0,GridBagConstraints.CENTER);
			
			fCR.revalidate();
			fCR.repaint();
=======
			return fCR;
>>>>>>> refs/heads/MetodosBD
		}

	}
