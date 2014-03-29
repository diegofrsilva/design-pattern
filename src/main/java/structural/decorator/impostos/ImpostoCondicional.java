package structural.decorator.impostos;

public abstract class ImpostoCondicional extends Imposto {

	public ImpostoCondicional() {
	}

	public ImpostoCondicional(Imposto imposto) {
		super(imposto);
	}

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
