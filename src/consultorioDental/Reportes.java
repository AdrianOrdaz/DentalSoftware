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

public class Reportes extends MetodosDiseño {
		JFrame fCR;
		public static void main(String[] args) {
			Reportes fg = new Reportes(); //nombre del archivo
			fg.CrearGui();
		}

		protected JFrame  CrearGui() {
			fCR = new JFrame("Generar Reporte de...");
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
			return fCR;
		}

	}
