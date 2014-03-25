package behavioral.strategy.robot;

/**
 * Concrete strategy
 */
public class AgressiveBehavior implements RobotBehavior {

	@Override
	public void doSomething() {
		System.out.println("I will destroy everythig hahaha!!");
	}
}
