package strategy.investimento;

/**
 * "CONSERVADOR", que sempre retorna 0.8% do valor investido;
 */
public class InvestimentoConservador implements Investimento {

	@Override
	public double investir(double valor) {
		return valor * 0.008;
	}
}
