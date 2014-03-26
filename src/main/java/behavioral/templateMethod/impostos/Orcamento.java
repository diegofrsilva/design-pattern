package behavioral.templateMethod.impostos;

import java.util.Arrays;
import java.util.List;

import behavioral.chainOfResponsibility.desconto.Item;

public class Orcamento {

	private List<Item> itens;
	private double valor;

	public Orcamento(double valor, List<Item> itens) {
		this.valor = valor;
		this.itens = itens;
	}

	public double getValor() {
		return valor;
	}

	public List<Item> getItens() {
		return itens;
	}

	public boolean possuiItemComValorSuperiorA(double valor) {
		for (Item item : itens) {
			if (item.getValor() > valor) {
				return Boolean.TRUE;
			}
		}
		return Boolean.FALSE;
	}

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(900, Arrays.asList(new Item(
				"LAPIS", 1), new Item("LAPIS", 2)));

		double icpp = new ICPP().calcular(orcamento);
		double ikcv = new IKCV().calcular(orcamento);
		double ihit = new IHIT().calcular(orcamento);

		System.out.println("ICPP: " + icpp);
		System.out.println("IKCV: " + ikcv);
		System.out.println("IHIT: " + ihit);
	}

	public boolean possuiItensComOMesmoNome(Orcamento orcamento) {
		if (itens.size() > 0) {
			for (int i = 0; i < itens.size(); i++) {
				Item itemAtual = itens.get(i);

				for (int j = i + 1; j < itens.size(); j++) {
					Item itemProximo = itens.get(j);

					if (itemAtual.getNome().equals(itemProximo.getNome())) {
						return Boolean.TRUE;
					}
				}
			}
		}
		return Boolean.FALSE;
	}
}
