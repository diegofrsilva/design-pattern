package structural.decorator.state;

public class EmAprovacao implements EstadoOrcamento {

	@Override
	public void calcularDescontroExtra(Orcamento orcamento) {
		double valor = orcamento.getValor() * 0.05;
		orcamento.setValor(valor);

		System.out.println(valor);
	}

	@Override
	public void aprovar(Orcamento orcamento) {
		orcamento.setEstado(new Aprovado());
	}

	@Override
	public void reprovar(Orcamento orcamento) {
		orcamento.setEstado(new Reprovado());
	}

	@Override
	public void finalizar(Orcamento orcamento) {
		throw new RuntimeException("Orcamento nao pode ir diretamente para finalizado");
	}
}
