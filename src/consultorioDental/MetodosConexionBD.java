package consultorioDental;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;

import javax.swing.JFrame;

public class MetodosConexionBD extends JFrame
{
	
	protected static void subirFilaCol9(String nomTabla, String col1, String col2, String col3, String col4, String col5, String col6, String col7, String col8, String col9,
			String val1, String val2, String val3, String val4, String val5, String val6, String val7, String val8, String val9)
	{
		ConexionBaseDatos_phpMyAdmin conexion = new ConexionBaseDatos_phpMyAdmin();
		Connection cn = null;
		Statement stm = null;
		ResultSet rs = null;
		
		try {
			cn = conexion.conectar();
			stm = cn.createStatement();
			rs = stm.executeQuery("SELECT * FROM "+nomTabla); //Esta linea me va a traer toda la tabla usuario
			
			//Crear Declaracion (statement)
			Statement uploadStm = cn.createStatement();
			
			//Crear codigo sql
			String upsql = "insert into "+nomTabla
					+"("+col1+", "+col2+", "+col3+", "+col4+", "+col5+", "+col6+", "+col7+", "+col8+", "+col9+")"
					+"values('"+val1+"','"+val2+"','"+val3+"','"+val4+"','"+val5+"','"+val6+"','"+val7+"','"+val8+"','"+val9+"')";
			uploadStm.execute(upsql); //Esto ejecuta el codigo sql en la base de datos
		} catch (SQLException e) {
			e.printStackTrace();
			// TODO: handle exception
		} finally { //finally se usa para cerrar la conexion y por ende, liberar recursos
			try {
				if(rs!=null)
				{
					rs.close();
				}
				
				if(stm!=null)
				{
					stm.close();
				}
				
				if(cn!=null)
				{
					cn.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	protected static void subirFilaCol8(String nomTabla, String col1, String col2, String col3, String col4, String col5, String col6, String col7, String col8,
			String val1, String val2, String val3, String val4, String val5, String val6, String val7, String val8)
	{
		ConexionBaseDatos_phpMyAdmin conexion = new ConexionBaseDatos_phpMyAdmin();
		Connection cn = null;
		Statement stm = null;
		ResultSet rs = null;
		
		try {
			cn = conexion.conectar();
			stm = cn.createStatement();
			rs = stm.executeQuery("SELECT * FROM "+nomTabla); //Esta linea me va a traer toda la tabla usuario
			
			//Crear Declaracion (statement)
			Statement uploadStm = cn.createStatement();
			
			//Crear codigo sql
			String upsql = "insert into "+nomTabla
						+"("+col1+", "+col2+", "+col3+", "+col4+", "+col5+", "+col6+", "+col7+", "+col8+")"
						+"values('"+val1+"','"+val2+"','"+val3+"','"+val4+"','"+val5+"','"+val6+"','"+val7+"','"+val8+"')";
			uploadStm.execute(upsql); //Esto ejecuta el codigo sql en la base de datos
		} catch (SQLException e) {
			e.printStackTrace();
			// TODO: handle exception
		} finally { //finally se usa para cerrar la conexion y por ende, liberar recursos
			try {
				if(rs!=null)
				{
					rs.close();
				}
				
				if(stm!=null)
				{
					stm.close();
				}
				
				if(cn!=null)
				{
					cn.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	protected static void subirFilaCol7(String nomTabla, String col1, String col2, String col3, String col4, String col5, String col6, String col7,
			String val1, String val2, String val3, String val4, String val5, String val6, String val7)
	{
		ConexionBaseDatos_phpMyAdmin conexion = new ConexionBaseDatos_phpMyAdmin();
		Connection cn = null;
		Statement stm = null;
		ResultSet rs = null;
		
		try {
			cn = conexion.conectar();
			stm = cn.createStatement();
			rs = stm.executeQuery("SELECT * FROM "+nomTabla); //Esta linea me va a traer toda la tabla usuario
			
			//Crear Declaracion (statement)
			Statement uploadStm = cn.createStatement();
			
			//Crear codigo sql
			String upsql = "insert into "+nomTabla
						+"("+col1+", "+col2+", "+col3+", "+col4+", "+col5+", "+col6+", "+col7+")"
						+"values('"+val1+"','"+val2+"','"+val3+"','"+val4+"','"+val5+"','"+val6+"','"+val7+"')";
			uploadStm.execute(upsql); //Esto ejecuta el codigo sql en la base de datos
		} catch (SQLException e) {
			e.printStackTrace();
			// TODO: handle exception
		} finally { //finally se usa para cerrar la conexion y por ende, liberar recursos
			try {
				if(rs!=null)
				{
					rs.close();
				}
				
				if(stm!=null)
				{
					stm.close();
				}
				
				if(cn!=null)
				{
					cn.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	protected static void subirFilaCol6(String nomTabla, String col1, String col2, String col3, String col4, String col5, String col6,
			String val1, String val2, String val3, String val4, String val5, String val6)
	{
		ConexionBaseDatos_phpMyAdmin conexion = new ConexionBaseDatos_phpMyAdmin();
		Connection cn = null;
		Statement stm = null;
		ResultSet rs = null;
		
		try {
			cn = conexion.conectar();
			stm = cn.createStatement();
			rs = stm.executeQuery("SELECT * FROM "+nomTabla); //Esta linea me va a traer toda la tabla usuario
			
			//Crear Declaracion (statement)
			Statement uploadStm = cn.createStatement();
			
			//Crear codigo sql
			String upsql = "insert into "+nomTabla
						+"("+col1+", "+col2+", "+col3+", "+col4+", "+col5+", "+col6+")"
						+"values('"+val1+"','"+val2+"','"+val3+"','"+val4+"','"+val5+"','"+val6+"')";
			uploadStm.execute(upsql); //Esto ejecuta el codigo sql en la base de datos
		} catch (SQLException e) {
			e.printStackTrace();
			// TODO: handle exception
		} finally { //finally se usa para cerrar la conexion y por ende, liberar recursos
			try {
				if(rs!=null)
				{
					rs.close();
				}
				
				if(stm!=null)
				{
					stm.close();
				}
				
				if(cn!=null)
				{
					cn.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	protected static void subirFilaCol5(String nomTabla, String col1, String col2, String col3, String col4, String col5,
			String val1, String val2, String val3, String val4, String val5)
	{
		ConexionBaseDatos_phpMyAdmin conexion = new ConexionBaseDatos_phpMyAdmin();
		Connection cn = null;
		Statement stm = null;
		ResultSet rs = null;
		
		try {
			cn = conexion.conectar();
			stm = cn.createStatement();
			rs = stm.executeQuery("SELECT * FROM "+nomTabla); //Esta linea me va a traer toda la tabla usuario
			
			//Crear Declaracion (statement)
			Statement uploadStm = cn.createStatement();
			
			//Crear codigo sql
			String upsql = "insert into "+nomTabla
						+"("+col1+", "+col2+", "+col3+", "+col4+", "+col5+")"
						+"values('"+val1+"','"+val2+"','"+val3+"','"+val4+"','"+val5+"')";
			uploadStm.execute(upsql); //Esto ejecuta el codigo sql en la base de datos
		} catch (SQLException e) {
			e.printStackTrace();
			// TODO: handle exception
		} finally { //finally se usa para cerrar la conexion y por ende, liberar recursos
			try {
				if(rs!=null)
				{
					rs.close();
				}
				
				if(stm!=null)
				{
					stm.close();
				}
				
				if(cn!=null)
				{
					cn.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	protected static void subirFilaCol4(String nomTabla, String col1, String col2, String col3, String col4,
			String val1, String val2, String val3, String val4)
	{
		ConexionBaseDatos_phpMyAdmin conexion = new ConexionBaseDatos_phpMyAdmin();
		Connection cn = null;
		Statement stm = null;
		ResultSet rs = null;
		
		try {
			cn = conexion.conectar();
			stm = cn.createStatement();
			rs = stm.executeQuery("SELECT * FROM "+nomTabla); //Esta linea me va a traer toda la tabla usuario
			
			//Crear Declaracion (statement)
			Statement uploadStm = cn.createStatement();
			
			//Crear codigo sql
			String upsql = "insert into "+nomTabla
						+"("+col1+", "+col2+", "+col3+", "+col4+")"
						+"values('"+val1+"','"+val2+"','"+val3+"','"+val4+"')";
			uploadStm.execute(upsql); //Esto ejecuta el codigo sql en la base de datos
		} catch (SQLException e) {
			e.printStackTrace();
			// TODO: handle exception
		} finally { //finally se usa para cerrar la conexion y por ende, liberar recursos
			try {
				if(rs!=null)
				{
					rs.close();
				}
				
				if(stm!=null)
				{
					stm.close();
				}
				
				if(cn!=null)
				{
					cn.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	protected static void subirFilaCol3(String nomTabla, String col1, String col2, String col3,
			String val1, String val2, String val3)
	{
		ConexionBaseDatos_phpMyAdmin conexion = new ConexionBaseDatos_phpMyAdmin();
		Connection cn = null;
		Statement stm = null;
		ResultSet rs = null;
		
		try {
			cn = conexion.conectar();
			stm = cn.createStatement();
			rs = stm.executeQuery("SELECT * FROM "+nomTabla); //Esta linea me va a traer toda la tabla usuario
			
			//Crear Declaracion (statement)
			Statement uploadStm = cn.createStatement();
			
			//Crear codigo sql
			String upsql = "insert into "+nomTabla
						+"("+col1+", "+col2+", "+col3+")"
						+"values('"+val1+"','"+val2+"','"+val3+"')";
			uploadStm.execute(upsql); //Esto ejecuta el codigo sql en la base de datos
		} catch (SQLException e) {
			e.printStackTrace();
			// TODO: handle exception
		} finally { //finally se usa para cerrar la conexion y por ende, liberar recursos
			try {
				if(rs!=null)
				{
					rs.close();
				}
				
				if(stm!=null)
				{
					stm.close();
				}
				
				if(cn!=null)
				{
					cn.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	
	protected static void modificarBD(String nomTabla, String nomCol, String nomId, String id, String valor)
	{
		ConexionBaseDatos_phpMyAdmin conexion = new ConexionBaseDatos_phpMyAdmin();
		Connection cn = null;
		Statement stm = null;
		ResultSet rs = null;
		
		try {
			cn = conexion.conectar();
			stm = cn.createStatement();
			rs = stm.executeQuery("SELECT * FROM "+nomTabla); //Esta linea me va a traer toda la tabla usuario
			
			//Modificar algun valor de la base de datos..................
			//Crear Declaracion (statement)
			Statement modStm = cn.createStatement();	
			//Crear codigo sql
			String modsql = "Update "+nomTabla
						+" set "+nomCol+" = '"+valor+"'"
						+" where "+nomId+"="+id;
			modStm.execute(modsql); //Esto ejecuta el codigo sql en la base de datos
		} catch (SQLException e) {
			e.printStackTrace();
			// TODO: handle exception
		} finally { //finally se usa para cerrar la conexion y por ende, liberar recursos
			try {
				if(rs!=null)
				{
					rs.close();
				}
				
				if(stm!=null)
				{
					stm.close();
				}
				
				if(cn!=null)
				{
					cn.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	protected static String obtenerString(String nomTabla, int col, int fila)
	{
		int integer=1;
		ConexionBaseDatos_phpMyAdmin conexion = new ConexionBaseDatos_phpMyAdmin();
		Connection cn = null;
		Statement stm = null;
		ResultSet rs = null;
		String returnear = null;
		
		try {
			cn = conexion.conectar();
			stm = cn.createStatement();
			String execute = "SELECT * FROM "+nomTabla;
			rs = stm.executeQuery(execute); //Esta linea me va a traer toda la tabla usuario
			
			
			while(rs.next()) //siempre que haya una fila por mostrar, re.next() va a retornar true y sigue el ciclo
			{
				if(integer==fila)
				{
					returnear = rs.getString(col);
					integer = integer+1;
				}
				else
				{
					integer = integer+1;
				}
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			// TODO: handle exception
		} finally { //finally se usa para cerrar la conexion y por ende, liberar recursos
			try {
				if(rs!=null)
				{
					rs.close();
				}
				
				if(stm!=null)
				{
					stm.close();
				}
				
				if(cn!=null)
				{
					cn.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return returnear;
	}

	protected static String borrarFila(String nomTabla, String nomColumnaId, String numId)
	{
		int integer=1;
		ConexionBaseDatos_phpMyAdmin conexion = new ConexionBaseDatos_phpMyAdmin();
		Connection cn = null;
		Statement stm = null;
		ResultSet rs = null;
		String returnear = null;
		PreparedStatement ps = null;
		try {
			cn = conexion.conectar();
			String delstm = "delete from "+nomTabla+" where "+nomColumnaId+"="+numId;
			//String execute = "SELECT * FROM "+nomTabla;
			ps = cn.prepareStatement(delstm);
			ps.setInt(1,integer);
			ps.executeUpdate(); //Esta linea me va a traer toda la tabla usuario
			
			//Eliminar alguna fila de la tabla de la base de datos.......
			//Crear Declaracion (statement)
			//Statement delStm = cn.createStatement();
			
			//Crear codigo sql
			
			
			//int filaAfectada = delStm.executeUpdate(delstm); //Esto ejecuta el codigo sql en la base de datos
			
		} catch (SQLException e) {
			e.printStackTrace();
			// TODO: handle exception
		} finally { //finally se usa para cerrar la conexion y por ende, liberar recursos
			try {
				if(rs!=null)
				{
					rs.close();
				}
				
				if(stm!=null)
				{
					stm.close();
				}
				
				if(cn!=null)
				{
					cn.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return returnear;
	}
	
}
