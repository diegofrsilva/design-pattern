package behavioral.strategy.orcamento;

public class Orcamento {

	public double valor;

	public Orcamento(double valor) {
		this.valor = valor;
	}

	public double getValor() {
		return valor;
	}

	public double calcularImposto(Imposto imposto) {
		return imposto.calcular(this);
	}
}
