package behavioral.chainOfResponsibility.desconto;

public class SemDesconto extends Desconto {

	public SemDesconto() {
		super();
	}

	public SemDesconto(Desconto proximo) {
		super(proximo);
	}

	@Override
	public double desconta(Orcamento orgamento) {
		return 0;
	}
}
