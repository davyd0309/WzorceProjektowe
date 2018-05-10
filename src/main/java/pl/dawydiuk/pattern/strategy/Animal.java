package pl.dawydiuk.pattern.strategy;

import pl.dawydiuk.pattern.strategy.behavior.Flys;

class Animal {

     String name;
     Flys fly;


    public Animal(Flys fly) {
        this.fly = fly;
    }

    public void setFly(Flys fly) {
        this.fly = fly;
    }
}
