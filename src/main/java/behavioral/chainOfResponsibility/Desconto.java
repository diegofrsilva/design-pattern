package behavioral.chainOfResponsibility;

public abstract class Desconto {

	protected Desconto proximo;

	public Desconto() {
	}

	public Desconto(Desconto proximo) {
		this.proximo = proximo;
	}

	public abstract double desconta(Orgamento orgamento);
}