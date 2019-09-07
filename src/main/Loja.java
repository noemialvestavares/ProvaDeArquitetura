package main;

import entidades.CompraAPrazoDialogo;
import entidades.CompraAVistaDialogo;
import entidades.Gerente;
import entidades.Livro;
import entidades.PagamentoAPrazo;
import entidades.PagamentoAVista;
import entidades.PagamentoAbstrato;
import entidades.Pessoa;
import entidades.Produto;

public class Loja {

	public static void main(String[] args) {
		Pessoa gerente = new Gerente("Gerente1","11111111111",2000.00);
		Produto produto = new Livro("1","Um Amor Para Recordar",20.00,"Nicholas Sparks","Drama");
		PagamentoAbstrato pagamento = new CompraAPrazoDialogo(new PagamentoAPrazo());
		pagamento.pagarCompraTipo(produto);
		

	}

}
