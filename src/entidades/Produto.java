package entidades;

public abstract class Produto {
	private String c�digo,nome;
	private double preco;
	
	public Produto(String c�digo, String nome,double preco) {
		super();
		this.c�digo = c�digo;
		this.nome = nome;
		
		this.preco = preco;
	}
	public String getC�digo() {
		return c�digo;
	}
	public void setC�digo(String c�digo) {
		this.c�digo = c�digo;
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
