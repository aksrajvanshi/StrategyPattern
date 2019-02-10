import behaviorInterface.FlyBehavior;
import behaviorInterface.QuackBehavior;

public class Duck {

	FlyBehavior flyBehv;
	QuackBehavior quackBehv;
	
	
	public void performQuack(){
		flyBehv.fly();
	}
	
	public void performFly(){
		quackBehv.quack();
	}
	
	public void display(){
		
	}
	
}
