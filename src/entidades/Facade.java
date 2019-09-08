package entidades;

import java.util.ArrayList;

public class Facade {


	public void registrarcompra(String nome, String cpf, String tipo) {
		Cliente cliente = new Cliente(nome, cpf, tipo);
		System.out.println("Iniciando a sua compra, "+cliente.getNome());
		
	}
	
	public void comprar(Produto produto,String cpf,PagamentoAbstrato pagamento) {
		pagamento.pagar(produto);
	}
	
	public void encerrarCompra() {
		System.out.println("Compra do(s) produtos finalizada");
		
	}
	

}
