package entidades;

import java.util.Date;

public class Comida extends Produto{
	private Date validade, fabricacao;

	public Comida(String c�digo, String nome, double preco, Date validade, Date fabricacao) {
		super(c�digo, nome, preco);
		this.fabricacao=fabricacao;
		this.validade=validade;
	}

	public Date getValidade() {
		return validade;
	}

	public void setValidade(Date validade) {
		this.validade = validade;
	}

	public Date getFabricacao() {
		return fabricacao;
	}

	public void setFabricacao(Date fabricacao) {
		this.fabricacao = fabricacao;
	}
	
	

	

}
