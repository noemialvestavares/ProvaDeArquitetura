package entidades;

public abstract class Produto {
	private String nome;
	private int codigo;
	private double preco;
	
	public Produto(int código, String nome,double preco) {
		super();
		this.codigo = código;
		this.nome = nome;
		
		this.preco = preco;
	}
	public int getCódigo() {
		return codigo;
	}
	public void setCódigo(int código) {
		this.codigo = código;
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
