package pl.dawydiuk.pattern.prototype;

public class AnimalCloneFactory {


    public Animal getClone(Animal animal){
        return animal.makeCopy();
    }

}
