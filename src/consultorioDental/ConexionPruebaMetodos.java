package consultorioDental;

public class ConexionPruebaMetodos extends MetodosDiseño {

	public static void main(String[] args) {
		
//		String obtenido = obtenerString("usuarios",3,2);  //funciona
//		System.out.println(obtenido);
//		
//		modificarBD("usuarios", "contr_usu", "id_usu", "2", "hola");
//		
//		obtenido = obtenerString("usuarios",3,2); //funciona
//		System.out.println(obtenido);
		
//		subirFilaCol5("medicamentos", "id_med", "inv_med", "nom_med", "tipo_med", "pre_med",
//				"1", "34", "omeprazol", "antidepresivo", "53.50"); //este tambien funciona
		
//		borrarFila("medicamentos", "id_med", "123");
		
		String algo = "medicamentoalgo";
		subirFilaCol5("medicamentos", "id_med", "inv_med", "nom_med", "tipo_med", "pre_med", "2", "50", algo, "antiinflamatorio", "20.99");
	}
}
