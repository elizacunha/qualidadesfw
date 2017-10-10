package dao;

import java.util.Date;

import model.Aluno;
import model.Livro;

public class locacaoDAO {
	
	private int id;
	private Date dataLocacao;
	private Aluno aluno;
	private Livro livro;
	public int getId() {
		return id;
	}
	public Date getDataLocacao() {
		return dataLocacao;
	}
	public void setDataLocacao(Date dataLocacao) {
		this.dataLocacao = dataLocacao;
	}
	public Aluno getAluno() {
		return aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	public Livro getLivro() {
		return livro;
	}
	public void setLivro(Livro livro) {
		this.livro = livro;
	}
	public void setId(int id) {
		this.id = id;
	}
	public locacaoDAO(int id, Date dataLocacao, Aluno aluno, Livro livro) {
		super();
		this.id = id;
		this.dataLocacao = dataLocacao;
		this.aluno = aluno;
		this.livro = livro;
	}
	public locacaoDAO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	
}
