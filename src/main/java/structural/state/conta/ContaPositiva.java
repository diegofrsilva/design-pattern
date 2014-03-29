package structural.state.conta;

public class ContaPositiva extends EstadoConta {

	public ContaPositiva(Conta conta) {
		super(conta);
	}

	@Override
	public void depositar(double quantidade) {
		conta.saldo = conta.saldo + quantidade * 0.98;
		conta.estadoConta = atualizarEstado(conta.saldo);
	}

	@Override
	public void sacar(double quantidade) {
		conta.saldo = conta.saldo - quantidade;
		conta.estadoConta = atualizarEstado(conta.saldo);
	}
}