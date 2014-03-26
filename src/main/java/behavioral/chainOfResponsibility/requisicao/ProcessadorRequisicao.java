package behavioral.chainOfResponsibility.requisicao;

public abstract class ProcessadorRequisicao {

	protected ProcessadorRequisicao proximo;

	public ProcessadorRequisicao(ProcessadorRequisicao proximo) {
		this.proximo = proximo;
	}

	public void irParaProximo(Conta conta, Requisicao requisicao) {
		if (proximo != null) {
			proximo.processar(conta, requisicao);
		} else {
			System.out.println("Corrente finalizada!");
		}
	}

	public abstract void processar(Conta conta, Requisicao requisicao);
}