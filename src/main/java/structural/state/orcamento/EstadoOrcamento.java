package structural.state.orcamento;

public interface EstadoOrcamento {

	public void calcularDescontroExtra(Orcamento orcamento);

	public void aprovar(Orcamento orcamento);

	public void reprovar(Orcamento orcamento);

	public void finalizar(Orcamento orcamento);
}
