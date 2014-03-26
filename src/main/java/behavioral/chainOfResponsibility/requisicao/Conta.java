package behavioral.chainOfResponsibility.requisicao;

public class Conta {
	private String nomeTitular;
	private double saldo;

	public Conta(String nomeTitular, double saldo) {
		this.nomeTitular = nomeTitular;
		this.saldo = saldo;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void imprimir(ImpressaoConta impressaoConta) {
		impressaoConta.imprimir(this);
	}
}