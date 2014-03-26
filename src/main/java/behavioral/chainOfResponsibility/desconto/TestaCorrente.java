package behavioral.chainOfResponsibility.desconto;

public class TestaCorrente {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(19);
		orcamento.addItem(new Item("LAPIS", 2));
		orcamento.addItem(new Item("CANETA", 2));
		orcamento.addItem(new Item("CADERNO", 15));

		Desconto semDesconto = new SemDesconto();
		Desconto descontoPorVendaCasada = new DescontoPorVendaCasada(semDesconto);
		Desconto descontoMaiorQuinhentos = new DescontoValorCompraMaiorQuinhentos(descontoPorVendaCasada);
		Desconto desconto = new DescontoParaMaisDeCincoItens(descontoMaiorQuinhentos);

		double valorDesconto = desconto.desconta(orcamento);
		System.out.println(valorDesconto);
	}
}
