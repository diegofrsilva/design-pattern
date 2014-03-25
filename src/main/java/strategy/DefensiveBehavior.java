package strategy;

/**
 * Concrete strategy
 */
public class DefensiveBehavior implements RobotBehavior {

	@Override
	public void doSomething() {
		System.out.println("I will start my shields and wait for something !!");
	}
}
