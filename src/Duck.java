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
	
	public void setFlyBehavior(FlyBehavior flyBehavior){
		flyBehv = flyBehavior;
	}
	
	public void setQuackBehavior(QuackBehavior quackBehavior){
		quackBehv = quackBehavior;
	}
	
	public void display(){
		
	}
	
}
