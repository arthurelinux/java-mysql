package LojaVirtua;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ListaProdutos {
	
	public static void main(String[] args) throws SQLException {

//		Connection con = DriverManager.
//				getConnection("jdbc:mysql://localhost:3306/loja_virtual?useTimezone=true&serverTimezone=UTC", "admin", "root");
		
		Connection con = DriverManager.
				getConnection("jdbc:mysql://localhost:3306/loja_virtual?useTimezone=true&serverTimezone=UTC", "admin", "root");
		Statement stm  = con.createStatement();
		
		 stm.execute("SELECT * FROM produto");
		// boolean resultados = stm.execute("SELECT * FROM produto");
		// System.out.println(resultados);
		 ResultSet rst = stm.getResultSet();
		
		while( rst.next()) {
			Integer id = rst.getInt("ID");
			System.out.println(id);
			String nome = rst.getString("nome");
			System.out.println(nome);
			String descricao = rst.getString("descricao");
			System.out.println(descricao);
			
		}
		
		//stm.execute("INSERT INTO produto (nome, descricao) values ('celular', 'nokia tijolão')");

		con.close();
	}

}
