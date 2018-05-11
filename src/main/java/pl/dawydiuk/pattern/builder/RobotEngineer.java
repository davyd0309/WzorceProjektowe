package pl.dawydiuk.pattern.builder;

public class RobotEngineer {


    private RobotBuilder robotBuilder;


    public RobotEngineer(RobotBuilder robotBuilder) {
        this.robotBuilder = robotBuilder;
    }


    public Robot getRobot(){
        return robotBuilder.getRobot();
    }


    public void makeMetalRobot(){
        robotBuilder.buildRobotHead();
        robotBuilder.buildRobotArms();
        robotBuilder.buildRobotLegs();
        robotBuilder.buildRobotTorso();
    }

}
