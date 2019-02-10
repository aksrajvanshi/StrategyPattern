import behaviorClasses.NoFlyClass;
import behaviorClasses.NoQuackBird;

public class WoodenDuck extends Duck{
	
	WoodenDuck(){
		setFlyBehavior(new NoFlyClass());
		setQuackBehavior(new NoQuackBird());
	}
	
	@Override
	public void display() {
		
		System.out.println(" The Wooden Duck doesn't quack and fly!");
	}

}
