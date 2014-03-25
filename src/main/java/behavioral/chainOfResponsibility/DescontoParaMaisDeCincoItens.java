package behavioral.chainOfResponsibility;

public class DescontoParaMaisDeCincoItens extends Desconto {

	public DescontoParaMaisDeCincoItens(Desconto proximo) {
		super(proximo);
	}

	@Override
	public double desconta(Orgamento orgamento) {
		if (orgamento.getItens().size() > 0) {
			return orgamento.getValor() * 0.1;
		}
		return proximo.desconta(orgamento);
	}
}
