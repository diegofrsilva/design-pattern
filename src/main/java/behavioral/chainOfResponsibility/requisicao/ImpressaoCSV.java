package behavioral.chainOfResponsibility.requisicao;


public class ImpressaoCSV implements ImpressaoConta {

	@Override
	public void imprimir(Conta conta) {
		System.out.println("Impressao CSV:\n");
		System.out.println(conta.getNomeTitular() + ";" + conta.getSaldo());
	}
}
