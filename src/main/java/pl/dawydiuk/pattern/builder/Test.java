package pl.dawydiuk.pattern.builder;

public class Test {

    public static void main(String[] args) {
        RobotBuilder metalRobot = new RobotBuilderMetal();

        System.out.println(metalRobot.showRobotInfo());

        RobotEngineer robotEngineer = new RobotEngineer(metalRobot);
        robotEngineer.makeMetalRobot();


        System.out.println(metalRobot.showRobotInfo());


    }

}
