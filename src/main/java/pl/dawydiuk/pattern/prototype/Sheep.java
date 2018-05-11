package pl.dawydiuk.pattern.prototype;

public class Sheep implements Animal {

    public Sheep() {
        System.out.println("Sheep is made !");
    }

    public Animal makeCopy() {

        System.out.println("Sheep is being made !");

        Sheep sheep = null;

        try {
            sheep = (Sheep) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return sheep;
    }


    @Override
    public String toString() {
        return "Sheep{IS MY HERO}";
    }
}
