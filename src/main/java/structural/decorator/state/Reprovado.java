package structural.decorator.state;

public class Reprovado implements EstadoOrcamento {

	@Override
	public void calcularDescontroExtra(Orcamento orcamento) {
		throw new RuntimeException("Sem desconto extra para orcamento reprovado!");
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
