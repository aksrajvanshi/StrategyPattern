package behaviorClasses;

import behaviorInterface.FlyBehavior;

public class FlyWithWings implements FlyBehavior {

	@Override
	public void fly() {
		
		System.out.println(" This duck will fly!");

	}

}
