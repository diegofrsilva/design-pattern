package strategy.robot;

/**
 * Represents the context.
 */
public class Robot {

	public void act(RobotBehavior behavior) {
		behavior.doSomething();
	}

	public static void main(String[] args) {
		Robot robot = new Robot();

		robot.act(new NormalBehavior());
		robot.act(new DefensiveBehavior());
		robot.act(new AgressiveBehavior());
	}
}