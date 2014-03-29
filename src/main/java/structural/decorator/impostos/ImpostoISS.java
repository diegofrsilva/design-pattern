package structural.decorator.impostos;

public class ImpostoISS extends Imposto {

	public ImpostoISS(Imposto imposto) {
		super(imposto);
	}

	public ImpostoISS() {
	}

	@Override
	public double calcular(Orcamento orcamento) {
		return orcamento.getValor() * 0.06 + calcularProximoImposto(orcamento);
	}
}
