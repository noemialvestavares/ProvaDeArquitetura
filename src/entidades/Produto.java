package entidades;

public abstract class Produto {
	private String nome;
	private int codigo;
	private double preco;
	
	public Produto(int c�digo, String nome,double preco) {
		super();
		this.codigo = c�digo;
		this.nome = nome;
		
		this.preco = preco;
	}
	public int getC�digo() {
		return codigo;
	}
	public void setC�digo(int c�digo) {
		this.codigo = c�digo;
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
