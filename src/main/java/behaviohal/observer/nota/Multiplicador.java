package behaviohal.observer.nota;

class Multiplicador implements AcaoGeracaoNota {
	private double fator;

	public Multiplicador(double fator) {
		this.fator = fator;
	}

	@Override
	public void executar(NotaFiscal notaFiscal) {
		System.out.println(notaFiscal.getValorBruto() * fator);
	}
}