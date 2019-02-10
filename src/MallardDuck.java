import behaviorClasses.FlyWithWings;
import behaviorClasses.QuackingBird;

public class MallardDuck extends Duck {

	MallardDuck(){
		flyBehv = new FlyWithWings();
		quackBehv = new QuackingBird();
	}
	
	@Override
	public void display() {
		System.out.println(" The Wooden Duck will quack as well as fly!");
	}
	
}
