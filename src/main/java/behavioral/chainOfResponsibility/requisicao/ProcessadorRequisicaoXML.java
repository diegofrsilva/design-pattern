package behavioral.chainOfResponsibility.requisicao;

public class ProcessadorRequisicaoXML extends ProcessadorRequisicao {

	public ProcessadorRequisicaoXML(ProcessadorRequisicao proximo) {
		super(proximo);
	}

	@Override
	public void processar(Conta conta, Requisicao requisicao) {
		if (Formato.XML.equals(requisicao.getFormato())) {
			conta.imprimir(new ImpressaoXML());
		} else {
			super.irParaProximo(conta, requisicao);
		}
	}
}