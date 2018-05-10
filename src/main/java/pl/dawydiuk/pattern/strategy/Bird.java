package pl.dawydiuk.pattern.strategy;

import pl.dawydiuk.pattern.strategy.behavior.Flys;

public class Bird extends Animal{


    public Bird(Flys fly) {
        super(fly);
    }
}
