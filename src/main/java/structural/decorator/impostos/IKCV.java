package structural.decorator.impostos;

public class IKCV extends ImpostoCondicional {

	public IKCV() {
	}

	public IKCV(Imposto imposto) {
		super(imposto);
	}

	@Override
	public double calcularTaxaMinima(Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
	}

	@Override
	public double calcularTaxaMaxima(Orcamento orcamento) {
		return orcamento.getValor() * 0.1;
	}

	@Override
	public boolean deveCobrarTaxaMaxima(Orcamento orcamento) {
		return orcamento.getValor() > 500 && orcamento.possuiItemComValorSuperiorA(100);
	}
}
