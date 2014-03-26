package behavioral.templateMethod.impostos;

public class ICPP extends ImpostoCondicional {

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
