package pl.dawydiuk.pattern.factory;

public class EnemyFactory {


   public Enemy makeEnemy(String enemyType){
       Enemy enemy = null;

       if(enemyType.equals("R")) enemy = new Robot();
       if(enemyType.equals("M")) return new Monster();
       if(enemyType.equals("S")) return new Soldier();
       return enemy;
   }


}
