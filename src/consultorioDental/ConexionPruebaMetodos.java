package consultorioDental;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.table.DefaultTableModel;

public class ConexionPruebaMetodos extends MetodosDiseño {

	public static void main(String[] args) {
		
//		String obtenido = obtenerString("usuarios",3,2);  //funciona
//		System.out.println(obtenido);
//		
//		modificarBD("usuarios", "contr_usu", "id_usu", "2", "hola");
//		
//		obtenido = obtenerString("usuarios",3,2); //funciona
//		System.out.println(obtenido);
		
	//	subirFilaCol5("medicamentos", "id_med", "inv_med", "nom_med", "tipo_med", "pre_med",
			//	"7", "34", "omeprazol", "antidepresivo", "53.50"); //este tambien funciona
		
//		borrarFila("medicamentos", "id_med", "123");
//		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
//		   LocalDateTime now = LocalDateTime.now();  
//		//String id =obtenerUltimo("sesion",1)+1;
//		subirFilaCol3("sesion", "hrI_sesion", "hrF_sesion", "id_usu", dtf.format(now), dtf.format(now), "1");
	//	borrarFila("sesion", "id_sesion", "4");
	//	System.out.println(UltVal("recibo", 1));
		
//		ConexionBaseDatos_phpMyAdmin conexion = new ConexionBaseDatos_phpMyAdmin();
//		Connection cn = null;
//		Statement stm = null;
//		ResultSet rs = null;
//		
//		try {
//			cn = conexion.conectar();
//			stm = cn.createStatement();
//			rs = stm.executeQuery("SELECT * FROM "+nomTabla); //Esta linea me va a traer toda la tabla usuario
//			
//			//Crear Declaracion (statement)
//			Statement uploadStm = cn.createStatement();
//			
//			//Crear codigo sql
//			while(rs.next()) //siempre que haya una fila por mostrar, re.next() va a retornar true y sigue el ciclo
//			{
//				int idUsuario = rs.getInt(1); //el numero indica el valor de la columna
//				String nombreUsuario = rs.getString(2);
//				String contrasena = rs.getString(3);
//				String horario = rs.getString(4);
//				String mail = rs.getString(5);
//				float sueldo = rs.getFloat(6);
//				String direccion = rs.getString(7);
//				String tel = rs.getString(8);
//				System.out.println(idUsuario+" "+nombreUsuario+" "+contrasena+" "+contrasena+" "+horario+" "+mail+" "+sueldo+" "+direccion+" "+tel);
//			}
//			
//		} catch (SQLException e) {
//			e.printStackTrace();
//			// TODO: handle exception
//		} finally { //finally se usa para cerrar la conexion y por ende, liberar recursos
//			try {
//				if(rs!=null)
//				{
//					rs.close();
//				}
//				
//				if(stm!=null)
//				{
//					stm.close();
//				}
//				
//				if(cn!=null)
//				{
//					cn.close();
//				}
//			} catch (Exception e2) {
//				e2.printStackTrace();
//			}
//		}
		
//		if(NumFil("servicios")>2)
//		{
//			for(int i = 1; i<NumFil("servicios"); i++)
//			{
//				int a=i+1;
//				DefaultTableModel model = (DefaultTableModel) tbServicios.getModel();
//				model.addRow(new Object[]{obtenerString("servicios",1,a), obtenerString("servicios",2,a), obtenerString("servicios",3,a)});
//			}
//		}
		
	}
}
		
		
