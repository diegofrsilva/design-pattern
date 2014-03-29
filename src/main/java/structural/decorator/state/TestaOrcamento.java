package structural.decorator.state;

public class TestaOrcamento {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(200);

		orcamento.calcularDescontroExtra();

		orcamento.aprovar();

		orcamento.calcularDescontroExtra();

		orcamento.finalizar();
	}
}
