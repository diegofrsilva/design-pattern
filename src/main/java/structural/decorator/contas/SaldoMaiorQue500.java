package structural.decorator.contas;

public class SaldoMaiorQue500 extends Filtro {

	public SaldoMaiorQue500() {
	}

	public SaldoMaiorQue500(Filtro filtro) {
		super(filtro);
	}

	@Override
	protected boolean deveAdicionar(Conta conta) {
		return conta.getSaldo() > 500;
	}
}
