package behavioral.templateMethod.impostos;

public abstract class ImpostoCondicional implements Imposto {

	@Override
	public double calcular(Orcamento orcamento) {
		if (deveCobrarTaxaMaxima(orcamento)) {
			return calcularTaxaMaxima(orcamento);
		}
		return calcularTaxaMinima(orcamento);
	}

	public abstract double calcularTaxaMinima(Orcamento orcamento);

	public abstract double calcularTaxaMaxima(Orcamento orcamento);

	public abstract boolean deveCobrarTaxaMaxima(Orcamento orcamento);
}
