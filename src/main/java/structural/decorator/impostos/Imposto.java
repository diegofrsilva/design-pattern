package structural.decorator.impostos;

public abstract class Imposto {

	protected Imposto imposto;

	public Imposto() {
	}

	public Imposto(Imposto imposto) {
		this.imposto = imposto;
	}

	public abstract double calcular(Orcamento orcamento);

	protected double calcularProximoImposto(Orcamento orcamento) {
		return imposto != null ? imposto.calcular(orcamento) : 0;
	}
}