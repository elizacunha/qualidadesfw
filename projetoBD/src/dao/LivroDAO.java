package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

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
	
	public List<Livro> buscarTodos(){
		Connection conn = null;
		try{
			conn = ConnectionFactory.getConnection();
			Statement stmt = conn.createStatement();
			String sql = "SELECT * FROM Livro";
			ResultSet rs = stmt.executeQuery(sql);
			List<Livro> livros = new ArrayList();
			while(rs.next()) {
				int id = rs.getInt("id");
				String nome = rs.getString("nome");
				String descricao = rs.getString("descricao");
				String autor = rs.getString("autor");
				String editora = rs.getString("editora");
				Livro livro = new Livro(id, nome, descricao, autor, editora);
				livros.add(livro);
			}
			return livros;
		} catch (SQLException e) {
			e.printStackTrace();
			if (conn != null) {
				try{
					conn.close();
				} catch (SQLException el) {
					el.printStackTrace();
				}
			}	
		}	
		return null;
	}
}
