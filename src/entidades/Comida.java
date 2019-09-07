package entidades;

import java.util.Date;

public class Comida extends Produto{
	private Date validade, fabricacao;

	public Comida(String código, String nome, double preco, Date validade, Date fabricacao) {
		super(código, nome, preco);
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
