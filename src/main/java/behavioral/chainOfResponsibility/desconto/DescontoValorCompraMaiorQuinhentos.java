package behavioral.chainOfResponsibility.desconto;

public class DescontoValorCompraMaiorQuinhentos extends Desconto {

	public DescontoValorCompraMaiorQuinhentos(Desconto proximo) {
		super(proximo);
	}

	@Override
	public double desconta(Orcamento orcamento) {
		double valor = orcamento.getValor();
		if (valor > 500) {
			return valor * 0.07;
		}
		return proximo.desconta(orcamento);
	}
}
