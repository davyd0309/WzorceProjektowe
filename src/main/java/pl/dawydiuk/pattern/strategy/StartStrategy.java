package pl.dawydiuk.pattern.strategy;

import pl.dawydiuk.pattern.strategy.behavior.CanFly;
import pl.dawydiuk.pattern.strategy.behavior.CantFly;

public class StartStrategy {


    public static void main(String[] args) {
        Animal dog = new Dog(new CantFly());
        Animal bird = new Bird(new CanFly());


        System.out.println(dog.fly.fly());
        System.out.println(bird.fly.fly());
    }


}
