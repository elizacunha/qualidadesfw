package model;

public class Livro {

	private int id;
	private String nome;
	private String descricao;
	private String autor;
	private String editora;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public Livro() {
		super();
	}
	public Livro(String nome, String descricao, String autor, String editora) {
		super();
		this.nome = nome;
		this.descricao = descricao;
		this.autor = autor;
		this.editora = editora;
	}
	public Livro(int id, String nome, String descricao, String autor, String editora) {
		super();
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.autor = autor;
		this.editora = editora;
	}
	@Override
	public String toString() {
		return "Livro [id=" + id + ", nome=" + nome + ", descricao=" + descricao + ", autor=" + autor + ", editora="
				+ editora + "]";
	}
	
	
}
