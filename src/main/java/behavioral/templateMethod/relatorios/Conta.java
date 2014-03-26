package behavioral.templateMethod.relatorios;

public class Conta {

	private String titular;
	private String agencia;
	private String numero;
	private double saldo;

	public Conta(String titular, String agencia, String numero, double saldo) {
		super();
		this.titular = titular;
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = saldo;
	}

	public String getTitular() {
		return titular;
	}

	public String getAgencia() {
		return agencia;
	}

	public String getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

}
