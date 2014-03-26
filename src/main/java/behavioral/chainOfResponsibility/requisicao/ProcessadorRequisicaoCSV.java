package behavioral.chainOfResponsibility.requisicao;

public class ProcessadorRequisicaoCSV extends ProcessadorRequisicao {

	public ProcessadorRequisicaoCSV(ProcessadorRequisicao proximo) {
		super(proximo);
	}

	@Override
	public void processar(Conta conta, Requisicao requisicao) {
		if (Formato.CSV.equals(requisicao.getFormato())) {
			conta.imprimir(new ImpressaoCSV());
		} else {
			super.irParaProximo(conta, requisicao);
		}
	}
}
