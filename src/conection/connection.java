package conection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class connection {
	
	private String url;
	private String usuario;
	private String senha;
	private Connection conn;
	
	public connection(){
		url = "jdbc:postgresql://localhost:5432/Pedidos_db";
		usuario = "postgres";
		senha= "POSTGRES";
		try {
			

			conn = DriverManager.getConnection(url,usuario,senha);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public ResultSet Busca(String sql) {
		try {
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(sql);
			conn.close();
			return rs;
			
			} catch (Exception e) {
			e.printStackTrace();
			return null;
			}
	}
	
	

}
