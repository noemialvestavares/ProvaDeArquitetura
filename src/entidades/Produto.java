package entidades;

public abstract class Produto {
	private String código,nome;
	private double preco;
	
	public Produto(String código, String nome,double preco) {
		super();
		this.código = código;
		this.nome = nome;
		
		this.preco = preco;
	}
	public String getCódigo() {
		return código;
	}
	public void setCódigo(String código) {
		this.código = código;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	

}
