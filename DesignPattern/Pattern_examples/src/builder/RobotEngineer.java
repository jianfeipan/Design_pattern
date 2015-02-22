package builder;

public class RobotEngineer {
	private RobotBuilder robotbuilder;
	public RobotEngineer(RobotBuilder robotbuilder){
		this.robotbuilder=robotbuilder;			
	}
	
	public void buildRobot(){
		this.robotbuilder.buildRobotArms();
		this.robotbuilder.buildRobotHead();
		this.robotbuilder.buildRobotLegs();
	}
	
	public Robot getRobot(){
		return this.robotbuilder.getRobot();
	}
}
