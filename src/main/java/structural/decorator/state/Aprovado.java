package structural.decorator.state;

public class Aprovado implements EstadoOrcamento {

	@Override
	public void calcularDescontroExtra(Orcamento orcamento) {
		double valor = orcamento.getValor() * 0.02;
		orcamento.setValor(valor);

		System.out.println(valor);
	}

	@Override
	public void aprovar(Orcamento orcamento) {
		throw new RuntimeException("O orcamento ja esta aprovado");
	}

	@Override
	public void reprovar(Orcamento orcamento) {
		throw new RuntimeException("O orcamento deve ir para finalizado");
	}

	@Override
	public void finalizar(Orcamento orcamento) {
		orcamento.setEstado(new Finalizado());
	}
}