import behaviorClasses.NoFlyClass;
import behaviorClasses.NoQuackBird;

public class WoodenDuck extends Duck{
	
	WoodenDuck(){
		flyBehv = new NoFlyClass();
		quackBehv = new NoQuackBird();
	}
	
	@Override
	public void display() {
		
		System.out.println(" The Wooden Duck doesn't quack and fly!");
	}

}
