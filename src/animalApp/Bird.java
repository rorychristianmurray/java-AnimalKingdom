package animalApp;

public class Bird extends AbstractAnimal {

    public Bird(String name, int discovered) {
        super(name, discovered);

    }

    @Override
    public String move() {
        return "fly";
    }

    @Override
    public String breathe() {
        return "lungs";
    }

    @Override
    public String reproduce() {
        return "lay eggs";
    }

    @Override
    public String toString() {
        return "Bird{" + "name=" + name + '\'' + ", discovered in " + discovered + "}";
    }

}