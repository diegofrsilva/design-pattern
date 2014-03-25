package behavioral.chainOfResponsibility;

import java.util.ArrayList;
import java.util.List;

public class Orgamento {

	private List<Item> itens;
	private double valor;

	public Orgamento() {
		this.itens = new ArrayList<>();
	}

	public Orgamento(double valor) {
		this.valor = valor;
	}

	public double getValor() {
		return valor;
	}

	public List<Item> getItens() {
		return itens;
	}
}