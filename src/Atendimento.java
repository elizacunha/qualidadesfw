
public class Atendimento {
	
	private int id;
	private String titulo;
	private String mensagem;
	private Atendente atendente;
	private Cliente cliente;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	public Atendente getAtendente() {
		return atendente;
	}
	public void setAtendente(Atendente atendente) {
		this.atendente = atendente;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Atendimento(int id, String titulo, String mensagem, Atendente atendente, Cliente cliente) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.mensagem = mensagem;
		this.atendente = atendente;
		this.cliente = cliente;
	}
	public Atendimento() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
