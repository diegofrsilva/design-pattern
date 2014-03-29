package structural.decorator.impostos;

public class ICPP extends ImpostoCondicional {

	public ICPP() {
	}

	public ICPP(Imposto imposto) {
		super(imposto);
	}

	@Override
	public double calcularTaxaMinima(Orcamento orcamento) {
		return orcamento.getValor() * 0.07;
	}

	@Override
	public double calcularTaxaMaxima(Orcamento orcamento) {
		return orcamento.getValor() * 0.05;
	}

	@Override
	public boolean deveCobrarTaxaMaxima(Orcamento orcamento) {
		return orcamento.getValor() < 500;
	}
}
