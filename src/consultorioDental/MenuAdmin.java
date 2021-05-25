package consultorioDental;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuAdmin extends MetodosDiseño implements ActionListener{
	JFrame fMenuA;
	public static void main(String[] args) {
		MenuAdmin ma = new MenuAdmin();
		ma.crearMenuAdmin();
	}
	
	protected JFrame crearMenuAdmin()
	{
		fMenuA = new JFrame("Consultorio Dental");
		Container con = new Container();
		GridBagConstraints c = new GridBagConstraints();
		con = fMenuA.getContentPane();
		con.setLayout(new GridBagLayout());
		
		JButton btnCerrarSesion = new JButton("Cerrar Sesion");
		btnCerrarSesion.setBackground(Color.GRAY);
		btnCerrarSesion.setForeground(Color.WHITE);
		//El metodo adjustButton sirve para acomodar y ajustar un boton en el grid.
		//Checar archivo metodosDiseño
		adjustButton(btnCerrarSesion, c, con, 0, 0, 1, 1, 1.0, 0.0, GridBagConstraints.ABOVE_BASELINE);
		btnCerrarSesion.addActionListener(this);
	    
		JButton btnSalirPrograma = new JButton("Salir");
		btnSalirPrograma.setBackground(Color.GRAY);
		btnSalirPrograma.setForeground(Color.WHITE);
		adjustButton(btnSalirPrograma, c, con, 2, 0, 1, 1, 0.0, 0.0, GridBagConstraints.ABOVE_BASELINE);
		btnSalirPrograma.addActionListener(this);
		
		JLabel imgLogo = new JLabel();
		ImageIcon logo = new ImageIcon("src/img/logo2.jpg");
		imgLogo.setIcon(logo);
		adjustComponents(c,1,1,1,1,0.0,0.0,GridBagConstraints.CENTER);
		con.add(imgLogo,c);
		
		JButton btnAdminCaja = new JButton("Administrar caja");
		c.ipadx = 30;
		adjustButton(btnAdminCaja, c, con, 0, 2, 1, 1, 1.0, 1.0, GridBagConstraints.ABOVE_BASELINE_TRAILING);
		btnAdminCaja.addActionListener(this);
		
		JButton btnGenerarReporte = new JButton("Generar reporte");
		adjustButton(btnGenerarReporte, c, con, 1, 2, 1, 1, 0.0, 1.0, GridBagConstraints.CENTER);
		btnGenerarReporte.addActionListener(this);
		
		JButton btnRealizarCompra = new JButton("Realizar compras");
		adjustButton(btnRealizarCompra, c, con, 2, 2, 1, 1, 0.0, 1.0, GridBagConstraints.ABOVE_BASELINE_LEADING);
		btnRealizarCompra.addActionListener(this);
		
		JButton btnGestionarUsuarios = new JButton("Gestionar usuarios");
		adjustButton(btnGestionarUsuarios, c, con, 1, 3, 1, 1, 1.0, 1.0, GridBagConstraints.NORTHEAST);
		btnGestionarUsuarios.addActionListener(this);
		
		JButton btnControl_Inventario = new JButton("Controlar inventario");
		adjustButton(btnControl_Inventario, c, con, 1, 3, 1, 1, 1.0, 0.0, GridBagConstraints.NORTHWEST);
		btnControl_Inventario.addActionListener(this);
		
		fMenuA.pack();
		fMenuA.setExtendedState(JFrame.MAXIMIZED_BOTH);
		fMenuA.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fMenuA.setVisible(true);
		con.setBackground(Color.WHITE);
		return fMenuA;
	}
	public void actionPerformed(ActionEvent e) {
		switch(e.getActionCommand())
		{
			case "Administrar caja":
				AdministrarCaja ad = new AdministrarCaja();
				ad.CrearGui();
				fMenuA.setVisible(false);
			break;
			case "Gestionar usuarios":
				GestionarUsuario gr = new GestionarUsuario();
				gr.setVisible(true);
				fMenuA.setVisible(false);
			break;
			case "Realizar compras":
				RealizarPedido rp = new RealizarPedido();
				rp.setVisible(true);
				fMenuA.setVisible(false);
			break;
			case "Controlar inventario":
				EntradaSalidaMedicamentos esm = new EntradaSalidaMedicamentos();
				esm.CrearGui();
				fMenuA.setVisible(false);
			break;
			case "Generar reporte":
				Reportes rep = new Reportes();
				rep.CrearGui();
				fMenuA.setVisible(false);
			break;
			case "Salir":
				System.exit(0);
			break;
			case "Cerrar Sesion":
				InicioSesion is = new InicioSesion();
				is.crearIS();
				fMenuA.setVisible(false);
			break;
		}
	}
	 
}
