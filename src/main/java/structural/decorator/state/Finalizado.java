package structural.decorator.state;

public class Finalizado implements EstadoOrcamento {

	@Override
	public void calcularDescontroExtra(Orcamento orcamento) {
		throw new RuntimeException("Nao existe imposto extra para orcamento finalizado");
	}

	@Override
	public void aprovar(Orcamento orcamento) {
		throw new RuntimeException("Transicao de estado invalida!");
	}

	@Override
	public void reprovar(Orcamento orcamento) {
		throw new RuntimeException("Transicao de estado invalida!");
	}

	@Override
	public void finalizar(Orcamento orcamento) {
		throw new RuntimeException("Transicao de estado invalida!");
	}
}