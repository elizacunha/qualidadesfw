package view;

import java.sql.Connection;

import conn.ConnectionFactory;
import dao.LivroDAO;
import model.Livro;

public class TesteConnection {
	
	public static void main(String[] args) {
		Connection c = ConnectionFactory.getConnection();
		if (c != null) {
			System.out.println("Conexao OK!");
			Livro l = new Livro("bla", "bla bla bla", "bilubilu", "teteia");
			LivroDAO dao = new LivroDAO();
			dao.salvarLivro(l);
		} else {
			System.out.println("Não conectou!");
		}
	}
}
