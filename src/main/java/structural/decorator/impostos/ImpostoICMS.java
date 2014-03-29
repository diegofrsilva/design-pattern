package structural.decorator.impostos;

public class ImpostoICMS extends Imposto {

	public ImpostoICMS(Imposto imposto) {
		super(imposto);
	}

	@Override
	public double calcular(Orcamento orcamento) {
		return orcamento.getValor() * 0.01 + calcularProximoImposto(orcamento);
	}
}