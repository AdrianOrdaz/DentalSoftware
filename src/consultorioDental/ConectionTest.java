package consultorioDental;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConectionTest {
	public static void main(String[] args) {
		ConexionBaseDatos_phpMyAdmin conexion = new ConexionBaseDatos_phpMyAdmin();
		Connection cn = null;
		Statement stm = null;
		ResultSet rs = null;
		
		try {
			cn = conexion.conectar();
			stm = cn.createStatement();
			rs = stm.executeQuery("SELECT * FROM usuarios"); //Esta linea me va a traer toda la tabla usuario
			//y este resultado tengo que asignarlo a una variable. Para esto se ocupa la clase Result set
			
			
			//Para subir informacion a la base de datos..................
//			//Crear Declaracion (statement)
//			Statement uploadStm = cn.createStatement();
//			
//			//Crear codigo sql
//			String upsql = "insert into usuarios"
//						+"(id_usu, nom_usu, contr_usu, hor_usu, mail_usu, sldo_usu, dir_usu, tel_usu)"
//						+"values('4','Carlos','456','LMV 6am - 12pm','carlos@gmail.com','5000.23','calle 1','8144568795')";
//			uploadStm.execute(sql); //Esto ejecuta el codigo sql en la base de datos
			//...........................................................
			
			
			//Modificar algun valor de la base de datos..................
			//Crear Declaracion (statement)
//			Statement modStm = cn.createStatement();
//			
//			//Crear codigo sql
//			String modsql = "Update usuarios "
//						+" set nom_usu = 'Alberto Fernando Martinez Ramirez'"
//						+" where id_usu=4";
//			
//			modStm.execute(modsql); //Esto ejecuta el codigo sql en la base de datos
			//...........................................................
			
			
			
//			//Eliminar alguna fila de la tabla de la base de datos.......
//			//Crear Declaracion (statement)
//			Statement delStm = cn.createStatement();
//			
//			//Crear codigo sql
//			String delstm = "delete from usuarios where id_usu='4'";
//			
//			int filaAfectada = delStm.executeUpdate(delstm); //Esto ejecuta el codigo sql en la base de datos
//			//...........................................................
			
			
			
			//ir recorriendo la tabla de usuarios y mostrarlos en la consola
			while(rs.next()) //siempre que haya una fila por mostrar, re.next() va a retornar true y sigue el ciclo
			{
				int idUsuario = rs.getInt(1); //el numero indica el valor de la columna
				String nombreUsuario = rs.getString(2);
				String contrasena = rs.getString(3);
				String horario = rs.getString(4);
				String mail = rs.getString(5);
				float sueldo = rs.getFloat(6);
				String direccion = rs.getString(7);
				String tel = rs.getString(8);
				System.out.println(idUsuario+" "+nombreUsuario+" "+contrasena+" "+contrasena+" "+horario+" "+mail+" "+sueldo+" "+direccion+" "+tel);
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
	}
}

//videos utilizados:
//https://www.youtube.com/watch?v=-f8N4FEQWyY
//https://www.youtube.com/watch?v=i5UG6ACtnEg
//https://www.youtube.com/watch?v=ZSMRmvIUhdE&list=LL&index=5
//https://www.youtube.com/watch?v=UXPrmfNYJHM&list=LL&index=4
//https://www.youtube.com/watch?v=GPleER-tnAk&list=LL&index=5
//https://www.youtube.com/watch?v=2i4t-SL1VsU&list=PLEAQNNR8IlB4R7NfqBY1frapYo97L6fOQ&index=2 no use este pero a lo mejor me hubiera servido
//https://www.youtube.com/watch?v=Q4T7jg0Lv4E&list=PLEAQNNR8IlB4R7NfqBY1frapYo97L6fOQ&index=3
//https://www.youtube.com/watch?v=vwNmYVipzeA&list=PLEAQNNR8IlB4R7NfqBY1frapYo97L6fOQ&index=4
//https://www.youtube.com/watch?v=_KuFESrNgsQ&list=PLEAQNNR8IlB4R7NfqBY1frapYo97L6fOQ&index=5
//https://www.youtube.com/watch?v=JWTpaxkNLW8 lave foranea



