package structural.decorator.contas;

import java.util.Arrays;
import java.util.List;

public class TestaFiltro {

	public static void main(String[] args) {
		List<Conta> contas = Arrays.asList(new Conta(150, 5), new Conta(20, 9), new Conta(590, 2), new Conta(150, 3));
		Filtro filtros = new MesCorrente(new SaldoMaiorQue500(new SaldoMenorQue100()));

		List<Conta> filtra = filtros.filtra(contas);
		System.out.println(filtra.size());
	}
}
