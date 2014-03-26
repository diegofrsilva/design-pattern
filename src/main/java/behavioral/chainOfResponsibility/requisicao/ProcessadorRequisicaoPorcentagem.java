package behavioral.chainOfResponsibility.requisicao;

public class ProcessadorRequisicaoPorcentagem extends ProcessadorRequisicao {

	public ProcessadorRequisicaoPorcentagem(ProcessadorRequisicao proximo) {
		super(proximo);
	}

	@Override
	public void processar(Conta conta, Requisicao requisicao) {
		if (Formato.PORCENTO.equals(requisicao.getFormato())) {
			conta.imprimir(new ImpressaoPorcentagem());
		} else {
			super.irParaProximo(conta, requisicao);
		}
	}
}
