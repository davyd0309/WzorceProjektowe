package pl.dawydiuk.pattern.decorator;

public class PlainPizza implements Pizza {



    public String getDescription() {
        return "Thin dough";
    }

    public double getCost() {
        return 23;
    }
}
