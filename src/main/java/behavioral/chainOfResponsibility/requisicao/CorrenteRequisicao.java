package behavioral.chainOfResponsibility.requisicao;

public class CorrenteRequisicao {

	public void processar(Conta conta, Requisicao requisicao) {
		ProcessadorRequisicaoXML processadorRequisicaoXML = criarCorrente();
		processadorRequisicaoXML.processar(conta, requisicao);
	}

	private ProcessadorRequisicaoXML criarCorrente() {
		ProcessadorRequisicaoPorcentagem processadorRequisicaoPorcentagem = new ProcessadorRequisicaoPorcentagem(null);
		ProcessadorRequisicaoCSV processadorRequisicaoCSV = new ProcessadorRequisicaoCSV(processadorRequisicaoPorcentagem);
		ProcessadorRequisicaoXML processadorRequisicaoXML = new ProcessadorRequisicaoXML(processadorRequisicaoCSV);
		return processadorRequisicaoXML;
	}

	public static void main(String[] args) {
		Conta conta = new Conta("Diego Farias", 50000);
		Requisicao requisicaoXML = new Requisicao(Formato.XML);
		Requisicao requisicaoCSV = new Requisicao(Formato.CSV);
		Requisicao requisicaoPorcento = new Requisicao(Formato.PORCENTO);

		CorrenteRequisicao correnteRequisicao = new CorrenteRequisicao();
		correnteRequisicao.processar(conta, requisicaoXML);
		correnteRequisicao.processar(conta, requisicaoCSV);
		correnteRequisicao.processar(conta, requisicaoPorcento);
	}
}
