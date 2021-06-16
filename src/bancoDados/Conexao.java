package bancoDados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

	private static Connection connection;

	public static Connection getConnection() {
		try {
			if (connection == null) {
				connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/livraria", "root", "1234567");
			}

		} catch (SQLException e) {
			e.printStackTrace();
			
		}
		return connection;
	}

	public static void closeConnection() {
		if (connection != null) {
			try {
				connection.close();
				connection = null;
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
