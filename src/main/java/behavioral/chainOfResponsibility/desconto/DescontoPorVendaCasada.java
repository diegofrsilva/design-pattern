package behavioral.chainOfResponsibility.desconto;

public class DescontoPorVendaCasada extends Desconto {

	public DescontoPorVendaCasada(Desconto proximo) {
		super(proximo);
	}

	@Override
	public double desconta(Orcamento orcamento) {
		if (existe("LAPIS", orcamento) && existe("CANETA", orcamento)) {
			return orcamento.getValor() * 0.05;
		}
		return super.proximo.desconta(orcamento);
	}

	private boolean existe(String nomeDoItem, Orcamento orcamento) {
		for (Item item : orcamento.getItens()) {
			if (item.getNome().equals(nomeDoItem))
				return true;
		}
		return false;
	}
}
