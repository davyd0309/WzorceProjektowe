package pl.dawydiuk.pattern.adapter;

public class EnemyRobotAdapter implements EnemyAttacker {


    EnemyRobot enemyRobot;

    public EnemyRobotAdapter(EnemyRobot enemyRobot) {
        this.enemyRobot = enemyRobot;
    }

    public void fireWeapon() {
        enemyRobot.punchWithHands();
    }

    public void driveForward() {
        enemyRobot.walksForward();
    }

    public void assignDriver(String driverName) {
        enemyRobot.reactToHuman(driverName);
    }
}
