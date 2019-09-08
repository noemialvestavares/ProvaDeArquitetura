package main;

import entidades.Cliente;
import entidades.CompraAPrazoDialogo;
import entidades.Facade;
import entidades.Gerente;
import entidades.Livro;
import entidades.PagamentoAPrazo;
import entidades.PagamentoAbstrato;
import entidades.Produto;

public class Loja {

	public static void main(String[] args) {
		Gerente gerente = new Gerente("Gerente1","11111111111",2000.00);
		Cliente cliente = new Cliente("Noemi","22222222222","Premium");
		Produto produto = new Livro(1,"Um Amor Para Recordar",20.00,"Nicholas Sparks","Drama");

		PagamentoAbstrato pagamento = new CompraAPrazoDialogo(new PagamentoAPrazo());
		Facade fachada = new Facade();
		
		
		fachada.registrarcompra(cliente.getNome(), cliente.getCpf(), cliente.getTipo());
		fachada.comprar(produto, cliente.getCpf(), pagamento);
		fachada.encerrarCompra();
		

	}

}
