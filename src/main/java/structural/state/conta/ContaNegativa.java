package structural.state.conta;

public class ContaNegativa extends EstadoConta {

	public ContaNegativa(Conta conta) {
		super(conta);
	}

	@Override
	public void depositar(double quantidade) {
		conta.saldo = conta.saldo + quantidade * 0.95;
		conta.estadoConta = atualizarEstado(conta.saldo);
	}

	@Override
	public void sacar(double quantidade) {
		throw new RuntimeException("Conta com saldo negativo nao pode sofrer saque!");
	}
}
