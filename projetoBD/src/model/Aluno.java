package model;

public class Aluno {
	private int id;
	private String nome;
	private int ra;
	private String cpf;
	private String curso;
	private String Sexo;
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
	public String getRa() {
		return ra;
	}
	public void setRa(String ra) {
		this.ra = ra;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String getSexo() {
		return Sexo;
	}
	public void setSexo(String sexo) {
		Sexo = sexo;
	}
	public Aluno(int id, String nome, String ra, String cpf, String curso, String sexo) {
		super();
		this.id = id;
		this.nome = nome;
		this.ra = ra;
		this.cpf = cpf;
		this.curso = curso;
		Sexo = sexo;
	}
	public Aluno(String nome, String ra, String cpf, String curso, String sexo) {
		super();
		this.nome = nome;
		this.ra = ra;
		this.cpf = cpf;
		this.curso = curso;
		Sexo = sexo;
	}
	public Aluno() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Aluno [id=" + id + ", nome=" + nome + ", ra=" + ra + ", cpf=" + cpf + ", curso=" + curso + ", Sexo="
				+ Sexo + "]";
	}
	
	
	

}
