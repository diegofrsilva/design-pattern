package structural.state.conta;

public abstract class EstadoConta {

	protected Conta conta;

	public EstadoConta(Conta conta) {
		this.conta = conta;
	}

	public abstract void depositar(double quantidade);

	public abstract void sacar(double quantidade);

	protected EstadoConta atualizarEstado(double saldo) {
		// Considerando 0 como "positivo"
		return saldo >= 0 ? new ContaPositiva(conta) : new ContaNegativa(conta);
	}
}
