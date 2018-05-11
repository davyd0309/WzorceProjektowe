package pl.dawydiuk.pattern.prototype;

public class Dog implements Animal {

    public Dog() {
        System.out.println("Dog is made !");
    }

    public Animal makeCopy() {

        System.out.println("Dog is being made !");

        Dog dog = null;

        try {
            dog = (Dog) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return dog;
    }


    @Override
    public String toString() {
        return "Dog{IS MY HERO}";
    }
}
