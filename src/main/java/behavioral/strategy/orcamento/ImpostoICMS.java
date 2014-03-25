package behavioral.strategy.orcamento;

public class ImpostoICMS implements Imposto {

	@Override
	public double calcular(Orcamento orcamento) {
		return (orcamento.getValor() * 0.05) + 50;
	}
}
