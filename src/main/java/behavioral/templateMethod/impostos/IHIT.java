package behavioral.templateMethod.impostos;

public class IHIT extends ImpostoCondicional {

	@Override
	public double calcularTaxaMinima(Orcamento orcamento) {
		return orcamento.getValor() * 0.01 * orcamento.getItens().size();
	}

	@Override
	public double calcularTaxaMaxima(Orcamento orcamento) {
		return orcamento.getValor() * 0.13 + 100;
	}

	@Override
	public boolean deveCobrarTaxaMaxima(Orcamento orcamento) {
		return orcamento.possuiItensComOMesmoNome(orcamento);
	}
}
