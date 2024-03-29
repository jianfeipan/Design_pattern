package builder;

public class RobotBuilderTest {
	public static void main(String[] args){
		RobotEngineer R3engineer= new RobotEngineer(new R3RobotBuilder());
		RobotEngineer R4engineer= new RobotEngineer(new R4RobotBuilder());
		
		R3engineer.buildRobot();
		R4engineer.buildRobot();
		
		Robot r3=R3engineer.getRobot();
		Robot r4=R4engineer.getRobot();
		
		r3.sayhello();
		r4.sayhello();
		
	}
}
