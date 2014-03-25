package strategy;

/**
 * Concrete strategy
 */
public class NormalBehavior implements RobotBehavior {

	@Override
	public void doSomething() {
		System.out.println("I will be just looking around!! ");
	}
}