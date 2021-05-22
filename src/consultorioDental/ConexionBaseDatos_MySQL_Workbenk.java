package consultorioDental;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class ConexionBaseDatos_MySQL_Workbenk {
	
	private static final String CONTROLADOR = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3307/cd_ejemplo";
	private static final String USUARIO = "root";
	private static final String CLAVE = "rngVp5Xt";
	
	public Connection conectar() {
		Connection conexion = null;
		try {
			Class.forName(CONTROLADOR);
			//El metodo getConnection nos retorna un objeto Connection y es como la conexion entre 
			//nosotros y la base de datos
			conexion = DriverManager.getConnection(URL,USUARIO,CLAVE);
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
		
		return conexion;
		
	}
	
		public static void main(String[]args)
		{
			ConexionBaseDatos_MySQL_Workbenk xd = new ConexionBaseDatos_MySQL_Workbenk(); 
			xd.conectar();
		}

	}
