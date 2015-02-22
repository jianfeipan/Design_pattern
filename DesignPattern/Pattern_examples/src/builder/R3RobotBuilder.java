package builder;

public class R3RobotBuilder implements RobotBuilder{
	private Robot R3Robot = new Robot();
	public void buildRobotHead() {
		R3Robot.setHead("big head");
		
	}

	public void buildRobotArms() {
		R3Robot.setArms("short arms");
		
	}

	public void buildRobotLegs() {
		R3Robot.setLegs("short legs");
		
	}

	public Robot getRobot() {
		// TODO Auto-generated method stub
		return R3Robot;
	}

}
