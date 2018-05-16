package pl.dawydiuk.pattern.decorator;

public class PizzaMaker {


    public static void main(String[] args) {
        Pizza basicPizza = new PlainPizza();

        //System.out.println(basicPizza.getDescription() + " price "+basicPizza.getCost());


        basicPizza = new Mozzarella(basicPizza);

        System.out.println(basicPizza.getDescription() + " price "+basicPizza.getCost());

        basicPizza = new TomatoSouce(basicPizza);


        System.out.println(basicPizza.getDescription() + " price "+basicPizza.getCost());

    }

}
