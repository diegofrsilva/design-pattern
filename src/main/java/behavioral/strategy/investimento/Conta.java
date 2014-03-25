package behavioral.strategy.investimento;

public class Conta {

	private double saldo;

	public Conta(double saldo) {
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void depositar(double saldo) {
		this.saldo = this.saldo + saldo;
	}
}