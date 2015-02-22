package stretegy;

public class AnimalTest {
	public static void main(String args[]){
		Animal dog=new Dog("dog1");
		Animal bird=new Bird("bird1");
		
		dog.flytype.fly();
		bird.flytype.fly();
	}

}
