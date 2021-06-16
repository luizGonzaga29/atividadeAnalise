package bancoDados;



import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import interfaceUsuario.BooksEntity;

public class BooksBD {

	/*private static Connection connection;

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

	public void closeConnection() {
		if (connection != null) {
			try {
				connection.close();
				connection = null;
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}*/

	public void inserir(BooksEntity booksEntity)  {

		try {
			
				//Conexao.connection = getConnection();
				String sql = "INSERT INTO books(id, title, author, price, qty) VALUES(?,?,?,?,?)";
				PreparedStatement pstm = Conexao.getConnection().prepareStatement(sql);
				pstm.setInt(1, booksEntity.getId());
				pstm.setString(2, booksEntity.getTitle());
				pstm.setString(3, booksEntity.getAuthor());
				pstm.setFloat(4, booksEntity.getPrice());
				pstm.setInt(5, booksEntity.getQty());
				pstm.execute();
				Conexao.closeConnection();
				pstm.close();
			
		} catch (SQLException e) {
			System.out.println("Error inserir " + e.getMessage());
		}
	}

	public BooksEntity verificarSeExisteLivro(int id)  {
		BooksEntity be = null;
		try {
			//connection = getConnection();
			String sql = "SELECT * FROM books WHERE id = " + id;
			PreparedStatement pstm = Conexao.getConnection().prepareStatement(sql);
			ResultSet rs = pstm.executeQuery();
			if(rs.next()) {
				be = new BooksEntity(rs.getInt("id"), rs.getString("title"), rs.getString("author"),
						rs.getFloat("price"), rs.getInt("qty"));
				
			}
			rs.close();
			pstm.close();
			Conexao.closeConnection();
		}catch (SQLException e ) {
			System.out.println("Error verificarSeExisteId " + e.getMessage());
		}
		return be;
	}
}
