package pl.dawydiuk.pattern.decorator;

public class Mozzarella extends ToppingDecorator{


    public Mozzarella(Pizza pizza) {
        super(pizza);

        System.out.println("Adding Moz");
    }

    @Override
    public String getDescription() {
        return pizza.getDescription()+",Mozzarella";
    }

    @Override
    public double getCost() {
        return pizza.getCost()+12;
    }
}
