package pl.dawydiuk.pattern.prototype;

public class Test {

    public static void main(String[] args) {
        AnimalCloneFactory factory = new AnimalCloneFactory();

        Sheep sally = new Sheep();
        Sheep cloneSally = (Sheep) factory.getClone(sally);

        System.out.println(sally);
        System.out.println(cloneSally);

        System.out.println("Sally hashcode --- " + System.identityHashCode(sally));
        System.out.println("Clone Sally hashcode ---" + System.identityHashCode(cloneSally));
    }

}
