package behavioral.chainOfResponsibility;

public class DescontoValorCompraMaiorQuinhentos extends Desconto {

	public DescontoValorCompraMaiorQuinhentos(Desconto proximo) {
		super(proximo);
	}

	@Override
	public double desconta(Orgamento orgamento) {
		// TODO Auto-generated method stub
		return 0;
	}
}
