package br.com.tt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Sistema {

	private static final String URL = "jdbc:mysql://localhost/aulajava?serverTimezone=UTC";
	private static final String USER = "root";
	private static final String PASSWORD = "";

	public static void main(String[] args) throws SQLException {

		String query = "SELECT * FROM pessoa";

		try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
				Statement stmt = connection.createStatement();
				ResultSet rs = stmt.executeQuery(query);) {
			while (rs.next()) {

				Pessoa pessoa = new Pessoa();
				pessoa.setNome(rs.getString("nome"));
				pessoa.setCpf(rs.getString("cpf"));
				pessoa.setEmail(rs.getString("email"));

				String nome = "Nome: " + rs.getString("nome");
				String cpf = "\nCpf: " + rs.getString("cpf");
				String email = "\nE-mail: " + rs.getString("email");
				System.out.println(nome + cpf + email);
				System.out.println("==============================");

			}

		}

	}

}
