package prototype;

public class PrototypeTest {
	public static void main(String[] args){
		Dog dog1=new Dog("dog1");
		Dog dog2=(Dog)dog1.makecopye();
		dog1.setName("happy");
		dog1.cry();
		dog2.cry();
	}
}
