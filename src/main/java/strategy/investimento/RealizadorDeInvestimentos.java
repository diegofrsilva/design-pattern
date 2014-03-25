package strategy.investimento;

public class RealizadorDeInvestimentos {

	public void investir(Conta conta, Investimento investimento) {
		double lucro = investimento.investir(conta.getSaldo());
		conta.depositar(lucro * 0.75);
	}

	public static void main(String[] args) {
		Conta conta = new Conta(50000);

		RealizadorDeInvestimentos realizadorDeInvestimentos = new RealizadorDeInvestimentos();

		realizadorDeInvestimentos.investir(conta, new InvestimentoArrojado());
		realizadorDeInvestimentos.investir(conta, new InvestimentoConservador());
		realizadorDeInvestimentos.investir(conta, new InvestimentoModerado());

		System.out.println("Valor na conta: " + conta.getSaldo());
	}
}