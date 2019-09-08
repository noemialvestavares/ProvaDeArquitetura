package entidades;

public class Livro extends Produto{
	private String autor, genero;

	public Livro(int c�digo, String nome, double preco, String autor, String genero) {
		super(c�digo, nome, preco);
		this.genero=genero;
		this.autor=autor;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	

}
