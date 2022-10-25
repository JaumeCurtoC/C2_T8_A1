package ex3;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CrearDB {
	public void crearDB() {
		Connection c = AppMain.connection;
		try {
			String query = "DROP DATABASE IF EXISTS almacenamiento";
			Statement st = c.createStatement();
			st.executeUpdate(query);
			
			query = "CREATE DATABASE almacenamiento";
			st.executeUpdate(query);
			
			String querydb = "USE almacenamiento;";
			Statement stdb = c.createStatement();
			stdb.executeUpdate(querydb);
			
			System.out.println("Base de datos creada.");
		}catch(SQLException ex) {
			System.out.println("No se ha podido crear la base de datos.");
			Logger.getLogger(AppMain.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
}
