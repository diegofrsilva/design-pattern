package strategy.orcamento;

public class ImpostoISS implements Imposto {

	@Override
	public double calcular(Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
	}
}
