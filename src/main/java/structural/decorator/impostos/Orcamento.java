package structural.decorator.impostos;

import java.util.ArrayList;
import java.util.List;

import behavioral.chainOfResponsibility.desconto.Item;

public class Orcamento {

	private List<Item> itens;
	public double valor;

	public Orcamento(double valor) {
		this.valor = valor;
		this.itens = new ArrayList<>();
	}

	public double getValor() {
		return valor;
	}

	public double calcularImposto(Imposto imposto) {
		return imposto.calcular(this);
	}

	public boolean possuiItemComValorSuperiorA(double valor) {
		for (Item item : itens) {
			if (item.getValor() > valor) {
				return Boolean.TRUE;
			}
		}
		return Boolean.FALSE;
	}
}
