package modelo;

import java.sql.SQLException;
import java.sql.Statement;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.sql.Connection;

public class UsuariosModelo extends Conector {

	public ArrayList<Usuarios> usuarios(){
		
		String sql = "SELECT * FROM usuarios";
		Statement st;
		
		ArrayList<Usuarios> usuarios = new ArrayList<Usuarios>();
		try {
			st = con.createStatement();
			
		} catch (SQLException e) {
			System.out.println("Error en la base de datos");
		}
		
		return null;
		
	}

}
