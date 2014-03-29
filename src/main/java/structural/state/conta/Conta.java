package structural.state.conta;

public class Conta {

	protected double saldo;
	protected EstadoConta estadoConta;

	public Conta() {
		this.saldo = 0;
		this.estadoConta = new ContaPositiva(this);
	}

	public void depositar(double quantidade) {
		estadoConta.depositar(quantidade);
	}

	public void sacar(double quantidade) {
		estadoConta.sacar(quantidade);
	}
}