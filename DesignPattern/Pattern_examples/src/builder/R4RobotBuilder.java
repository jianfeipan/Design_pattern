package builder;

public class R4RobotBuilder implements RobotBuilder{
	private Robot R4Robot=new Robot();
	public void buildRobotHead() {
		R4Robot.setHead("small head");
		
	}

	public void buildRobotArms() {
		R4Robot.setArms("long arms");
		
	}

	public void buildRobotLegs() {
		R4Robot.setLegs("long legs");
		
	}

	public Robot getRobot() {
		// TODO Auto-generated method stub
		return R4Robot;
	}

}
