package pl.dawydiuk.pattern.adapter;

public class Test {


    public static void main(String[] args) {
        EnemyTank enemyTank = new EnemyTank();
        EnemyRobot enemyRobot = new EnemyRobot();
        EnemyAttacker robotAdapter = new EnemyRobotAdapter(enemyRobot);

        System.out.println("ROBOT");
        enemyRobot.reactToHuman("Poul");
        enemyRobot.walksForward();
        enemyRobot.punchWithHands();

        System.out.println("Tank");
        enemyTank.assignDriver("Poul");
        enemyTank.driveForward();
        enemyTank.fireWeapon();

        System.out.println("The robot with adapter");
        robotAdapter.assignDriver("Mark");
        robotAdapter.driveForward();
        robotAdapter.fireWeapon();


    }

}
