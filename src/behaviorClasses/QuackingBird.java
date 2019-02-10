package behaviorClasses;

import behaviorInterface.QuackBehavior;

public class QuackingBird implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println(" Quacking bird here! ");
		
	}

}
