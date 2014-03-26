package behavioral.chainOfResponsibility.desconto;

public class DescontoParaMaisDeCincoItens extends Desconto {

	public DescontoParaMaisDeCincoItens(Desconto proximo) {
		super(proximo);
	}

	@Override
	public double desconta(Orcamento orcamento) {
		if (orcamento.getItens().size() > 5) {
			return orcamento.getValor() * 0.1;
		}
		return proximo.desconta(orcamento);
	}
}
