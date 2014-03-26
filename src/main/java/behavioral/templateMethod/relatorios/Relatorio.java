package behavioral.templateMethod.relatorios;

import java.util.List;

public abstract class Relatorio {

	public void imprimir(Banco banco, List<Conta> contas) {
		cabebalho(banco);
		corpo(contas);
		rodape(banco);
	}

	protected abstract void rodape(Banco banco);

	protected abstract void corpo(List<Conta> contas);

	protected abstract void cabebalho(Banco banco);
}
