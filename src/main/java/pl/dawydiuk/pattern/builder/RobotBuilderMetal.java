package pl.dawydiuk.pattern.builder;

public class RobotBuilderMetal implements RobotBuilder {


    private Robot robot;


    public RobotBuilderMetal() {
        this.robot = new Robot();
    }

    public void buildRobotHead() {
        robot.setRobotHead("Metal head");
    }

    public void buildRobotTorso() {
        robot.setRobotTorso("Metal torso");
    }

    public void buildRobotArms() {
        robot.setRobotArms("Metal arms");
    }

    public void buildRobotLegs() {
        robot.setRobotLegs("Metal legs");
    }

    public Robot getRobot() {
        return robot;
    }

    public String showRobotInfo() {
        return "Robot - "+robot.getRobotHead()+"--"+robot.getRobotTorso()+"--"+robot.getRobotArms()+"--"+robot.getRobotLegs();
    }
}
