package creational.builder.nota;


public class TestaNotas {

	public static void main(String[] args) {
		NotaFiscal notaFiscal = new NotaFiscalBuilder()
			.com(new ItemDaNota("Item 1", 200))
			.com(new ItemDaNota("Item 2", 300))
			.comCNPJ("123456")
			.comObservacoes("Nota qualquer")
			.comRazaoSocial("Empresa teste")
			.criar();
		
		System.out.println(notaFiscal.getValorBruto());
		System.out.println(notaFiscal.getImpostos());
	}
}
