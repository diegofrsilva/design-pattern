package structural.decorator.impostos;

public class TesteImpostos {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(500);

		ImpostoICMS icms = new ImpostoICMS(new ImpostoISS());
		double valor = icms.calcular(orcamento);
		System.out.println(valor);
	}
}
