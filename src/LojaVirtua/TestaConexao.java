package LojaVirtua;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class TestaConexao {

	public static void main(String[] args) throws SQLException {

//		Connection con = DriverManager.
//				getConnection("jdbc:mysql://localhost:3306/loja_virtual?useTimezone=true&serverTimezone=UTC", "admin", "root");
		
		Connection con = DriverManager.
				getConnection("jdbc:mysql://localhost:3306/loja_virtual?useTimezone=true&serverTimezone=UTC", "admin", "root");

		
		con.close();
	}

}
