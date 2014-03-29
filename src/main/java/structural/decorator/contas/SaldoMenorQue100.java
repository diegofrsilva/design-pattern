package structural.decorator.contas;

public class SaldoMenorQue100 extends Filtro {

	public SaldoMenorQue100() {
	}

	public SaldoMenorQue100(Filtro filtro) {
		super(filtro);
	}

	@Override
	protected boolean deveAdicionar(Conta conta) {
		return conta.getSaldo() < 100;
	}
}
