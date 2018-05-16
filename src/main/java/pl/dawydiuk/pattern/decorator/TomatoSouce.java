package pl.dawydiuk.pattern.decorator;

public class TomatoSouce extends ToppingDecorator{


    public TomatoSouce(Pizza pizza) {
        super(pizza);

        System.out.println("Adding Souce");

    }

    @Override
    public String getDescription() {
        return pizza.getDescription()+",Tomato Souce";
    }

    @Override
    public double getCost() {
        return pizza.getCost()+5;
    }

}
