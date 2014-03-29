package structural.decorator.impostos;

public class ImpostoMuitoAlto extends Imposto {

	public ImpostoMuitoAlto(Imposto imposto) {
		super(imposto);
	}

	@Override
	public double calcular(Orcamento orcamento) {
		return orcamento.getValor() * 0.2 + calcularProximoImposto(orcamento);
	}
}
