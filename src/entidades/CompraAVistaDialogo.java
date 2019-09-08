package entidades;

public class CompraAVistaDialogo extends PagamentoAbstrato{

	public CompraAVistaDialogo(PagamentoImplementado pagamento) {
		super(pagamento);
	}


	@Override
	public void pagar(Produto produto) {
		pagarCompraTipo(produto);
		
	}

	

}
