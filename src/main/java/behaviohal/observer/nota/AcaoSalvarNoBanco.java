package behaviohal.observer.nota;


public class AcaoSalvarNoBanco implements AcaoGeracaoNota {

	@Override
	public void executar(NotaFiscal notaFiscal) {
		System.out.println("Salvou no banco de dados!");
	}
}
