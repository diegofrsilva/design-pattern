package structural.decorator.impostos;

public class TestaImpostoMuitoAlto {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(500);

		Imposto impostos = new ImpostoMuitoAlto(new ImpostoICMS(new ImpostoISS()));
		double valor = impostos.calcular(orcamento);
		System.out.println(valor);
	}
}
