package behavioral.chainOfResponsibility.requisicao;

public class ImpressaoPorcentagem implements ImpressaoConta {

	@Override
    public void imprimir(Conta conta) {
		System.out.println("\nImpressão separado por porcentagem:");
		System.out.println(conta.getNomeTitular() + "%" + conta.getSaldo());
    }
}
