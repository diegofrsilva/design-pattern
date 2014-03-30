package behaviohal.observer.nota;

public class AcaoEnviarEmail implements AcaoGeracaoNota {

	@Override
	public void executar(NotaFiscal notaFiscal) {
		System.out.println("Email enviado!");
	}
}
