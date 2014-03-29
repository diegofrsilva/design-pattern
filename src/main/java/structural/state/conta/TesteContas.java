package structural.state.conta;

public class TesteContas {

	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.depositar(500);
		conta.sacar(501);
		conta.sacar(1);
	}
}
