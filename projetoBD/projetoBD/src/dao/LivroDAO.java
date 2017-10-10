package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import conn.ConnectionFactory;
import model.Livro;

public class LivroDAO {

	public Livro salvarLivro(Livro livro) {
		Connection conn = null;
		try {
			 conn = ConnectionFactory.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(
					"INSERT INTO livro (nome,descricao,autor,editora) VALUES (?,?,?,?)");
			pstmt.setString(1, livro.getNome());
			pstmt.setString(2, livro.getDescricao());
			pstmt.setString(3, livro.getAutor());
			pstmt.setString(4, livro.getEditora());
			pstmt.execute();
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		}
		
		return livro;
	}
	
}
