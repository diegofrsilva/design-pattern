package strategy.investimento;

import java.util.Random;

/**
 * "ARROJADO", que tem 20% de chances de retornar 5%, 30% de chances de retornar
 * 3%, e 50% de chances de retornar 0.6%.
 */
public class InvestimentoArrojado implements Investimento {

	@Override
	public double investir(double valor) {
		double chance = new Random().nextDouble();

		if (chance <= 0.2) {
			return valor * 0.05;
		} else if (chance <= 0.3) {
			return valor * 0.03;
		}
		return valor * 0.06;
	}
}
