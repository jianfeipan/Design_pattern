package builder;

public class Robot implements RobotPlan {
	private String head;
	private String arms;
	private String legs;

	public void setHead(String head) {
		this.head = head;
	}

	public void setArms(String arms) {
		this.arms=arms;
	}

	public void setLegs(String legs) {
		this.legs=legs;

	}
	
	public void sayhello(){
		System.out.println("hello, i am a robot,with :");
		System.out.println(head);
		System.out.println(legs);
		System.out.println(arms);
	}

}
