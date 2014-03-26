package behavioral.templateMethod.relatorios;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class RelatorioComplexo extends Relatorio {

	@Override
	protected void rodape(Banco banco) {
		System.out.println(banco.getEmail() + " " + new SimpleDateFormat("dd/MM/yyyy").format(new Date()));
	}

	@Override
	protected void corpo(List<Conta> contas) {
		System.out.println();
		System.out.println("Titular \tAgencia \tNumero da conta \tSaldo");
		for (Conta conta : contas) {
			System.out.println(conta.getTitular() + " \t" + conta.getAgencia() + " \t\t" + conta.getNumero() + " \t\t\t" + conta.getSaldo());
		}
		System.out.println();
	}

	@Override
	protected void cabebalho(Banco banco) {
		System.out.println(banco.getNome() + " " + banco.getEndereco() + " " + banco.getTelefone());
	}
}
