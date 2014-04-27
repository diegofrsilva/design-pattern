package behavioral.chainOfResponsibility.desconto;

import java.util.ArrayList;
import java.util.List;

public class Orcamento {

	private List<Item> itens;
	protected double valor;

	public Orcamento(double valor) {
		this.valor = valor;
		this.itens = new ArrayList<>();
	}

	public double getValor() {
		return valor;
	}

	public List<Item> getItens() {
		return itens;
	}

	public void addItem(Item item) {
		this.itens.add(item);
	}
}