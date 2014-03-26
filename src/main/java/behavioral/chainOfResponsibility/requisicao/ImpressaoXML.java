package behavioral.chainOfResponsibility.requisicao;

import java.text.MessageFormat;

public class ImpressaoXML implements ImpressaoConta {

	@Override
	public void imprimir(Conta conta) {
		String template = criarTemplate();
		String xml = MessageFormat.format(template, conta.getNomeTitular(), conta.getSaldo());

		System.out.println("Impressão em XML:");
		System.out.println(xml);
		System.out.println();
	}

	private String criarTemplate() {
		StringBuilder templateXML = new StringBuilder();
		templateXML.append("<xml>\n");
		templateXML.append("\t<nomeTitular>{0}</nomeTitular>\n");
		templateXML.append("\t<saldo>{1}</saldo>\n");
		templateXML.append("</xml>");
		return templateXML.toString();
	}
}
