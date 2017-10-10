package view;

import java.util.Scanner;

import dao.LivroDAO;
import model.Livro;

public class BibliotecaView {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int op = -1;
		while (op != 0) {
			System.out.println("Digite 1 para adicionar um livro");
			System.out.println("Digite 2 para listar todos os livros");
			if (op == 1) {
				System.out.print("Digite o nome do livro: ");
				String nome = s.next();
				System.out.print("Digite a descricao do livro: ");
				String descricao = s.next();
				System.out.print("Digite o autor do livro: ");
				String autor = s.next();
				System.out.print("Digite a editora do livro: ");
				String editora = s.next();
				Livro livro = new Livro(nome, descricao, autor, editora);
				LivroDAO dao = new LivroDAO();
				dao.salvarLivro(livro);
			} else if (op == 2) {
				
			}
		}
	}
}
