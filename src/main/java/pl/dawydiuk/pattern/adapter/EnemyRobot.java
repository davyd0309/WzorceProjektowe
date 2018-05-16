package pl.dawydiuk.pattern.adapter;

import java.util.Random;

public class EnemyRobot {

    Random random = new Random();

    public void punchWithHands() {
        int attackDamage = random.nextInt(10) + 1;
        System.out.println("Enemy robot does " + attackDamage + " with it hands");
    }

    public void walksForward() {
        int movement = random.nextInt(5) + 1;
        System.out.println("Enemy tanks walk " + movement + " spaces");
    }

    public void reactToHuman(String driverName) {

        System.out.println("Enemy robot goes next "+driverName);
    }

}
