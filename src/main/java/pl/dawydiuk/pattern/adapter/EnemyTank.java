package pl.dawydiuk.pattern.adapter;

import java.util.Random;

public class EnemyTank implements EnemyAttacker {


    Random random = new Random();

    public void fireWeapon() {
        int attackDamage = random.nextInt(10) + 1;
        System.out.println("Enemy tanks does " + attackDamage + " damage");
    }

    public void driveForward() {
        int movement = random.nextInt(5) + 1;
        System.out.println("Enemy tanks moves " + movement + " spaces");
    }

    public void assignDriver(String driverName) {
        System.out.println(driverName+ " is driving the tank");
    }
}
