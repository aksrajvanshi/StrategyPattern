package behaviorClasses;

import behaviorInterface.QuackBehavior;

public class NoQuackBird implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println(" This bird does not quack!");

	}

}
