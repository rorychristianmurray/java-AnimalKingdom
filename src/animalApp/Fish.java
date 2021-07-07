package animalApp;

public class Fish extends AbstractAnimal {
    public Fish(String name, int discovered) {
        super(name, discovered);

    }

    @Override
    public String move() {
        return "swim";
    }

    @Override
    public String breathe() {
        return "gills";
    }

    @Override
    public String reproduce() {
        return "eggs";
    }

    @Override
    public String toString() {
        return "Fish{" + "name=" + name + '\'' + ", discovered in " + discovered + "}";
    }

}
