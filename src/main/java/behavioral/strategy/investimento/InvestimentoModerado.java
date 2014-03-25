package behavioral.strategy.investimento;

import java.util.Random;

/**
 * "MODERADO", que tem 50% de chances de retornar 2.5%, e 50% de chances de
 * retornar 0.7%;
 */
public class InvestimentoModerado implements Investimento {

	@Override
	public double investir(double valor) {
		boolean escolhido = new Random().nextDouble() > 0.50;
		return escolhido ? valor * 0.025 : valor * 0.007;
	}
}