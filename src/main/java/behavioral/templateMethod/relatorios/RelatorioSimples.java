package behavioral.templateMethod.relatorios;

import java.util.Arrays;
import java.util.List;

public class RelatorioSimples extends Relatorio {

	@Override
	protected void rodape(Banco banco) {
		System.out.println(banco.getTelefone());
	}

	@Override
	protected void corpo(List<Conta> contas) {
		System.out.println();
		System.out.println("Titular \tSaldo");
		for (Conta conta : contas) {
			System.out.println(conta.getTitular() + "\t" + conta.getSaldo());
		}
		System.out.println();
	}

	@Override
	protected void cabebalho(Banco banco) {
		System.out.println(banco.getNome());
	}

	public static void main(String[] args) {
		Banco banco = new Banco("Banco de praça", "Rua SBT", "(00) 0000-0000", "pracaenosssa@banco.com");
		List<Conta> contas = Arrays.asList(new Conta("Fulano de tal", "123456", "78910", 50000), new Conta("Joao da silva", "654321", "10987", 100000));

		System.out.println("Imprimindo relatorio simples...\n");
		new RelatorioSimples().imprimir(banco, contas);

		System.out.println("\nImprimindo relatorio complexo...\n");
		new RelatorioComplexo().imprimir(banco, contas);
	}
}
