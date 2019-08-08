package animalApp;

public class Fish extends AbstractAnimal {
    public Fish(String name, int discovered) {
        super(name, discovered)

    }

    @Override
    public String move()
    {
        return "Fish swim to get around"
    }

    @Override
    public String breath()
    {
        return "Fish use gills to breathe"
    }

    @Override
    public String reproduce()
    {
        return "Fish lay eggs to reproduce"
    }

    @Override
    public String toString()
    {
        return "Fish{" + "name=" + name + '\'' + ", discovered in " + discovered + "}"
    }

}
