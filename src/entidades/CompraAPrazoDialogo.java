package entidades;

public class CompraAPrazoDialogo extends PagamentoAbstrato{
	
	public CompraAPrazoDialogo(PagamentoImplementado pagamento) {
		super(pagamento);
	}


	@Override
	public void pagar(Produto produto) {
		pagarCompraTipo(produto);
		
	}

}
