package pl.dawydiuk.pattern.factory;

public abstract class Enemy {


    private String name;
    private double damage;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }


    public void displayInfo(){
        System.out.println(name + " is on screen. ");
    }

    public void attack(){
        System.out.println("ATTACK: "+ this.name + " --- "+ this.damage);
    }

}
