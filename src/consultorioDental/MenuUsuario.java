package consultorioDental;

import javax.swing.*;
import java.awt.*;

public class MenuUsuario extends metodosDise�o{
	
	public static void main(String[] args) {
		crearMenuUsuario();
	}
	
	private static void  crearMenuUsuario()
	{
		JFrame fMenuU = new JFrame("Consultorio Dental");
		Container con = new Container();
		GridBagConstraints c = new GridBagConstraints();
		con = fMenuU.getContentPane();
		con.setLayout(new GridBagLayout());
		
		JButton btnCerrarSesion = new JButton("Cerrar Sesion");
		btnCerrarSesion.setBackground(new Color(135,206,235));
		btnCerrarSesion.setForeground(Color.WHITE);
		//El metodo adjustButton sirve para acomodar y ajustar un boton en el grid.
		//Checar archivo metodosDise�o
		adjustButton(btnCerrarSesion, c, con, 0, 0, 1, 1, 1.0, 0.0, GridBagConstraints.ABOVE_BASELINE);
	    
		JButton btnSalirPrograma = new JButton("Salir");
		btnSalirPrograma.setBackground(new Color(135,206,235));
		btnSalirPrograma.setForeground(Color.WHITE);
		adjustButton(btnSalirPrograma, c, con, 3, 0, 1, 1, 0.0, 0.0, GridBagConstraints.ABOVE_BASELINE);
		
		JLabel imgLogo = new JLabel();
		ImageIcon logo = new ImageIcon("src/img/logo.png");
		imgLogo.setIcon(logo);
		adjustComponents(c,1,1,2,1,0.0,1.0,GridBagConstraints.CENTER);
		con.add(imgLogo,c);
		c.weightx = 0.0;
		
		JButton btnAgendarCita = new JButton("Agendar Cita");
		adjustButton(btnAgendarCita, c, con, 0, 2, 1, 1, 1.0, 1.0, GridBagConstraints.ABOVE_BASELINE_TRAILING);
		
		JButton btnIr_Agenda = new JButton("Agenda");
		adjustButton(btnIr_Agenda, c, con, 1, 2, 1, 1, 0.0, 1.0, GridBagConstraints.CENTER);
		
		JButton btnCrearRecibo = new JButton("Crear Recibo");
		adjustButton(btnCrearRecibo, c, con, 2, 2, 1, 1, 0.0, 1.0, GridBagConstraints.CENTER);
		
		JButton btnIr_Pacientes = new JButton("Pacientes");
		adjustButton(btnIr_Pacientes, c, con, 3, 2, 1, 1, 0.0, 1.0, GridBagConstraints.ABOVE_BASELINE_LEADING);
		
		JButton btnIr_Dentistas = new JButton("Dentistas");
		adjustButton(btnIr_Dentistas, c, con, 0, 3, 1, 1, 1.0, 0.0, GridBagConstraints.NORTHEAST);
		
		JButton btnIr_Servicios = new JButton("Servicios");
		adjustButton(btnIr_Servicios, c, con, 1, 3, 1, 1, 0.0, 0.0, GridBagConstraints.NORTH);
		
		JButton btnIr_Promociones = new JButton("Promociones");
		adjustButton(btnIr_Promociones, c, con, 2, 3, 1, 1, 0.0, 0.0, GridBagConstraints.NORTH);
		
		JButton btnIr_Inventario = new JButton("Inventario");
		adjustButton(btnIr_Inventario, c, con, 3, 3, 1, 1, 0.0, 0.0, GridBagConstraints.NORTHWEST);
		
		fMenuU.pack();
		fMenuU.setExtendedState(JFrame.MAXIMIZED_BOTH);
		fMenuU.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fMenuU.setVisible(true);
		con.setBackground(Color.WHITE);
	}
	 
}