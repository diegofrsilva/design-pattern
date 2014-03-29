package structural.decorator.contas;

import java.util.ArrayList;
import java.util.List;

public abstract class Filtro {

	protected Filtro filtro;

	public Filtro() {
	}

	public Filtro(Filtro filtro) {
		this.filtro = filtro;
	}

	public final List<Conta> filtra(List<Conta> contas) {
		List<Conta> contasFiltradas = filtraContasProximo(contas);
		for (Conta conta : contas) {
			if (deveAdicionar(conta)) {
				contasFiltradas.add(conta);
			}
		}
		return contasFiltradas;
	}

	protected List<Conta> filtraContasProximo(List<Conta> contas) {
		return filtro != null ? filtro.filtra(contas) : new ArrayList<Conta>();
	}

	protected abstract boolean deveAdicionar(Conta conta);
}
