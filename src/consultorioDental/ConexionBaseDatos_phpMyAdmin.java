package consultorioDental;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBaseDatos_phpMyAdmin {
	

	private static final String CONTROLADOR = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost/consultorio";
	private static final String USUARIO = "root";
	private static final String CLAVE = "";
	
	static
	{
		try {
			Class.forName(CONTROLADOR);
			
		} catch (ClassNotFoundException e) {
			System.out.println("Error al cargar el controlador");
			e.printStackTrace();
		}
	}
	
	//el metodo conectar se va a tener que llamar cada vez que tengamos que realizar alguna conexion
	public Connection conectar() {
		Connection conexion = null;
		try {
			//El metodo getConnection nos retorna un objeto Connection y es como la conexion entre 
			//nosotros y la base de datos
			conexion = DriverManager.getConnection(URL,USUARIO,CLAVE);
			System.out.println("Conexion ok");
			
		} catch (SQLException e)
		{
		System.out.println("error en la conexion");	
		e.printStackTrace();
		}
		
		return conexion;
		
	}
}
