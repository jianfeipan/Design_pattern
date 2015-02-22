package prototype;

public class Dog extends Animal{
	public Dog(String name){
		super(name);
	}

	@Override
	public void cry() {
		System.out.println(super.getName() + " : wang wang!");
		
	}

	public Animal makecopye() {
		// TODO Auto-generated method stub
		return new Dog(super.getName());
	}
}
