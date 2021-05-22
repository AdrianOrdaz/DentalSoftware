package consultorioDental;

import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBaseDatos_phpMyAdmin {
	
	public static void main(String[]args)
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			DriverManager.getConnection("jdbc:mysql://localhost/consultorio","root","");
			System.out.println("Conexion ok");
			
		} catch (ClassNotFoundException e) {
			System.out.println("Error al cargar el controlador");
			e.printStackTrace();
			// TODO: handle exception
		}catch (SQLException e)
		{
		System.out.println("error en la conexion");	
		e.printStackTrace();
		}
	}
}
