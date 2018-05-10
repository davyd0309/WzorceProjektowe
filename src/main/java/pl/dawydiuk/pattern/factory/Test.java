package pl.dawydiuk.pattern.factory;

import java.util.Scanner;

public class Test {


    public static void main(String[] args) {

        EnemyFactory enemyFactory = new EnemyFactory();
        Scanner scanner = new Scanner(System.in);
        Enemy enemy = null;
        String input = "";
        do {
            System.out.println("What type of enemy do you want ? (R/M/S)");
            if (scanner.hasNextLine()) {
                input = scanner.nextLine();
                enemy = enemyFactory.makeEnemy(input);

            }

            doAllStuff(enemy);

        } while (!input.equals("STOP"));
    }


    private static void doAllStuff(Enemy enemy) {
        if(enemy!=null){
            enemy.displayInfo();
            enemy.attack();
        }
    }


}
