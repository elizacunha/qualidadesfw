package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import conn.ConnectionFactory;
import model.Aluno;
import model.Livro;

public class AlunoDAO {
	
	public Aluno salvarAluno(Aluno aluno) {
		Connection conn = null;
		try {
			 conn = ConnectionFactory.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(
					"INSERT INTO livro (nome, ra, cpf, curso, sexo) VALUES (?,?,?,?)");
			pstmt.setString(1, aluno.getNome());
			pstmt.setString(2, aluno.getRa());
			pstmt.setString(3, aluno.getCpf());
			pstmt.setString(4, aluno.getCurso());
			pstmt.setString(4, aluno.getSexo());
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
		return aluno;
		
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
				String ra = rs.getString("ra");
			    String cpf = rs.getString("cpf");
				String curso = rs.getString("curso");
				Livro livro = new Livro();
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
