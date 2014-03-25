package behavioral.chainOfResponsibility;

public class SemDesconto extends Desconto {

	public SemDesconto(Desconto proximo) {
		super(proximo);
	}

	@Override
	public double desconta(Orgamento orgamento) {
		return orgamento.getValor();
	}
}
