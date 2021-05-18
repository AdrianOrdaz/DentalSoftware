package consultorioDental;

import javax.swing.*;
import java.awt.*;

public class MenuAdmin extends metodosDiseņo{
	
	public static void main(String[] args) {
		MenuAdmin ma = new MenuAdmin();
		ma.crearMenuAdmin();
	}
	
	protected void crearMenuAdmin()
	{
		JFrame fMenuA = new JFrame("Consultorio Dental");
		Container con = new Container();
		GridBagConstraints c = new GridBagConstraints();
		con = fMenuA.getContentPane();
		con.setLayout(new GridBagLayout());
		
		JButton btnCerrarSesion = new JButton("Cerrar Sesion");
		btnCerrarSesion.setBackground(Color.GRAY);
		btnCerrarSesion.setForeground(Color.WHITE);
		//El metodo adjustButton sirve para acomodar y ajustar un boton en el grid.
		//Checar archivo metodosDiseņo
		adjustButton(btnCerrarSesion, c, con, 0, 0, 1, 1, 1.0, 0.0, GridBagConstraints.ABOVE_BASELINE);
	    
		JButton btnSalirPrograma = new JButton("Salir");
		btnSalirPrograma.setBackground(Color.GRAY);
		btnSalirPrograma.setForeground(Color.WHITE);
		adjustButton(btnSalirPrograma, c, con, 2, 0, 1, 1, 0.0, 0.0, GridBagConstraints.ABOVE_BASELINE);
		
		JLabel imgLogo = new JLabel();
		ImageIcon logo = new ImageIcon("src/img/logo2.jpg");
		imgLogo.setIcon(logo);
		adjustComponents(c,1,1,1,1,0.0,0.0,GridBagConstraints.CENTER);
		con.add(imgLogo,c);
		
		JButton btnAdminCaja = new JButton("Administrar caja");
		c.ipadx = 30;
		adjustButton(btnAdminCaja, c, con, 0, 2, 1, 1, 1.0, 1.0, GridBagConstraints.ABOVE_BASELINE_TRAILING);
		
		JButton btnGenerarReporte = new JButton("Generar reporte");
		adjustButton(btnGenerarReporte, c, con, 1, 2, 1, 1, 0.0, 1.0, GridBagConstraints.CENTER);
		
		JButton btnRealizarCompra = new JButton("Realizar compras");
		adjustButton(btnRealizarCompra, c, con, 2, 2, 1, 1, 0.0, 1.0, GridBagConstraints.ABOVE_BASELINE_LEADING);
		
		JButton btnGestionarUsuarios = new JButton("Gestionar usuarios");
		adjustButton(btnGestionarUsuarios, c, con, 0, 3, 1, 1, 1.0, 1.0, GridBagConstraints.NORTHEAST);
		
		JButton btnGestionarSueldos = new JButton("Gestionar sueldos");
		adjustButton(btnGestionarSueldos, c, con, 1, 3, 1, 1, 0.0, 1.0, GridBagConstraints.NORTH);
		
		JButton btnControl_Inventario = new JButton("Controlar inventario");
		adjustButton(btnControl_Inventario, c, con, 2, 3, 1, 1, 1.0, 0.0, GridBagConstraints.NORTHWEST);
		
		fMenuA.pack();
		fMenuA.setExtendedState(JFrame.MAXIMIZED_BOTH);
		fMenuA.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fMenuA.setVisible(true);
		con.setBackground(Color.WHITE);
	}
	 
}
