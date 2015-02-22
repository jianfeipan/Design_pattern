package stretegy;

public interface Flyable {
	public void fly();
}

class Canfly implements Flyable{

	public void fly() {
		System.out.println("I can fly!");		
	}	
}

class Canotfly implements Flyable{

	public void fly() {
		System.out.println("sorry, icannot fly");
	}
	
}
