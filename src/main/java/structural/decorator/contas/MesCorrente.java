package structural.decorator.contas;

import java.util.Calendar;

public class MesCorrente extends Filtro {

	public MesCorrente() {
	}

	public MesCorrente(Filtro filtro) {
		super(filtro);
	}

	@Override
	protected boolean deveAdicionar(Conta conta) {
		return (conta.getMes() == (Calendar.getInstance().get(Calendar.MONTH) + 1));
	}
}
