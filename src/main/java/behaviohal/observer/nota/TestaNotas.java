package behaviohal.observer.nota;


public class TestaNotas {

	public static void main(String[] args) {
		NotaFiscalBuilder builder = new NotaFiscalBuilder();
		builder.adicionarAcao(new AcaoEnviarEmail());
		builder.adicionarAcao(new Multiplicador(2));
		builder.adicionarAcao(new AcaoSalvarNoBanco());

		NotaFiscal notaFiscal = builder
			.com(new ItemDaNota("Item 1", 200))
			.com(new ItemDaNota("Item 2", 300))
			.comCNPJ("123456")
			.comObservacoes("Nota qualquer")
			.comRazaoSocial("Empresa teste")
			.criar();
		
		System.out.println(notaFiscal.getValorBruto());
	}
}
