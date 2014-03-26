package behavioral.chainOfResponsibility.desconto;

public class CalculadorDesconto {

	public double descontar(Orcamento orcamento, Desconto desconto) {
		return desconto.desconta(orcamento);
	}

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(600);

		Desconto semDesconto = new SemDesconto();
		Desconto descontoMaiorQuinhentos = new DescontoValorCompraMaiorQuinhentos(semDesconto);
		Desconto desconto = new DescontoParaMaisDeCincoItens(descontoMaiorQuinhentos);

		CalculadorDesconto calculadorDesconto = new CalculadorDesconto();
		double valorDesconto = calculadorDesconto.descontar(orcamento, desconto);
		System.out.println(valorDesconto);
	}
}