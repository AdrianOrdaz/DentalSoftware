package consultorioDental;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuUsuario extends MetodosDiseño implements ActionListener{
	JFrame fMenuU;
	public static void main(String[] args) {
		MenuUsuario mu = new MenuUsuario();
		mu.crearMenuUsuario();
	}
	
	protected void  crearMenuUsuario() 
	{	
		fMenuU = new JFrame("Consultorio Dental");
		Container con = new Container();
		GridBagConstraints c = new GridBagConstraints();
		con = fMenuU.getContentPane();
		con.setLayout(new GridBagLayout());
		
		JButton btnCerrarSesion = new JButton("Cerrar Sesion");
		btnCerrarSesion.setBackground(new Color(135,206,235));
		btnCerrarSesion.setForeground(Color.WHITE);
		//El metodo adjustButton sirve para acomodar y ajustar un boton en el grid.
		//Checar archivo metodosDiseño
		adjustButton(btnCerrarSesion, c, con, 0, 0, 1, 1, 1.0, 0.0, GridBagConstraints.ABOVE_BASELINE);
		btnCerrarSesion.addActionListener(this);
	    
		JButton btnSalirPrograma = new JButton("Salir");
		btnSalirPrograma.setBackground(new Color(135,206,235));
		btnSalirPrograma.setForeground(Color.WHITE);
		adjustButton(btnSalirPrograma, c, con, 3, 0, 1, 1, 0.0, 0.0, GridBagConstraints.ABOVE_BASELINE);
		btnSalirPrograma.addActionListener(this);
		
		JLabel imgLogo = new JLabel();
		ImageIcon logo = new ImageIcon("src/img/logo.png");
		imgLogo.setIcon(logo);
		adjustComponents(c,1,1,2,1,0.0,1.0,GridBagConstraints.CENTER);
		con.add(imgLogo,c);
		
		JButton btnAgendarCita = new JButton("Agendar Cita");
		adjustButton(btnAgendarCita, c, con, 0, 2, 1, 1, 1.0, 1.0, GridBagConstraints.ABOVE_BASELINE_TRAILING);
		btnAgendarCita.addActionListener(this);
		
		JButton btnIr_Agenda = new JButton("Agenda");
		adjustButton(btnIr_Agenda, c, con, 1, 2, 1, 1, 0.0, 1.0, GridBagConstraints.CENTER);
		btnIr_Agenda.addActionListener(this);
		
		JButton btnCrearRecibo = new JButton("Crear Recibo");
		adjustButton(btnCrearRecibo, c, con, 2, 2, 1, 1, 0.0, 1.0, GridBagConstraints.CENTER);
		btnCrearRecibo.addActionListener(this);
		
		JButton btnIr_Pacientes = new JButton("Pacientes");
		adjustButton(btnIr_Pacientes, c, con, 3, 2, 1, 1, 0.0, 1.0, GridBagConstraints.ABOVE_BASELINE_LEADING);
		btnIr_Pacientes.addActionListener(this);
		
		JButton btnIr_Dentistas = new JButton("Dentistas");
		adjustButton(btnIr_Dentistas, c, con, 0, 3, 1, 1, 1.0, 0.0, GridBagConstraints.NORTHEAST);
		btnIr_Dentistas.addActionListener(this);
		
		JButton btnIr_Servicios = new JButton("Servicios");
		adjustButton(btnIr_Servicios, c, con, 1, 3, 1, 1, 0.0, 0.0, GridBagConstraints.NORTH);
		btnIr_Servicios.addActionListener(this);
		
		JButton btnIr_Promociones = new JButton("Promociones");
		adjustButton(btnIr_Promociones, c, con, 2, 3, 1, 1, 0.0, 0.0, GridBagConstraints.NORTH);
		btnIr_Promociones.addActionListener(this);
		
		JButton btnIr_Inventario = new JButton("Inventario");
		adjustButton(btnIr_Inventario, c, con, 3, 3, 1, 1, 0.0, 0.0, GridBagConstraints.NORTHWEST);
		btnIr_Inventario.addActionListener(this);
		
		fMenuU.pack();
		fMenuU.setExtendedState(JFrame.MAXIMIZED_BOTH);
		fMenuU.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fMenuU.setVisible(true);
		con.setBackground(Color.WHITE);
	}
	
	public void actionPerformed(ActionEvent e) 
	{
		switch(e.getActionCommand())
		{
			case "Agendar Cita":
				AgendarCita vac = new AgendarCita();
				vac.crearAC();
				fMenuU.setVisible(false);
			break;
			case "Agenda":
				AgendaVista a = new AgendaVista();
				a.crearfA();
				fMenuU.setVisible(false);
			break;
			case "Crear Recibo":
				Recibo r = new Recibo();
				r.crearGUI();
				fMenuU.setVisible(false);
			break;
			case "Pacientes":
				Pacientes p = new Pacientes();
				p.crearGUI();
				fMenuU.setVisible(false);
			break;
			case "Dentistas":
				Dentistas den = new Dentistas();
				den.crearfD();
				fMenuU.setVisible(false);
			break;
			case "Servicios":
				Servicios ser = new Servicios();
				ser.setVisible(true);
				fMenuU.setVisible(false);
			break;
			case "Promociones":
				Promociones prom = new Promociones();
				prom.setVisible(true);
				fMenuU.setVisible(false);
			break;
			case "Inventario":
				Inventario inv = new Inventario();
				inv.crearInv();
				fMenuU.setVisible(false);
			break;
			case "Salir":
				System.exit(0);
			break;
			case "Cerrar Sesion":
				InicioSesion is = new InicioSesion();
				is.crearIS();
				fMenuU.setVisible(false);
			break;
		}
	}
}
