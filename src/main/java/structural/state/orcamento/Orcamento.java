package structural.state.orcamento;

public class Orcamento {

	private double valor;
	private EstadoOrcamento estado;
	private Boolean descontoCalculado;

	public Orcamento(double valor) {
		this.valor = valor;
		this.estado = new EmAprovacao();
		this.descontoCalculado = Boolean.FALSE;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public double getValor() {
		return valor;
	}

	public void setEstado(EstadoOrcamento estado) {
		this.estado = estado;
	}

	public void aprovar() {
		estado.aprovar(this);
	}

	public void reprovar() {
		estado.reprovar(this);
	}

	public void finalizar() {
		estado.finalizar(this);
	}

	public void calcularDescontroExtra() {
		if (descontoCalculado) {
			throw new RuntimeException("Imposto jah calculado!");
		}
		this.descontoCalculado = Boolean.TRUE;
		this.estado.calcularDescontroExtra(this);
	}
}