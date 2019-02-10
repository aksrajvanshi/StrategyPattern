package behaviorClasses;

import behaviorInterface.FlyBehavior;

public class NoFlyClass implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println(" this duck doesn't fly!");
		
	}

}
