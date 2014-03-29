package structural.decorator.contas;

public class Conta {

	private double saldo;
	private int mes;

	public Conta(double saldo, int mes) {
		this.saldo = saldo;
		this.mes = mes;
	}

	public double getSaldo() {
		return saldo;
	}

	public int getMes() {
		return mes;
	}
}
