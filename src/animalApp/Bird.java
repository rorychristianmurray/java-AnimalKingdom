package animalApp;

public class Bird extends AbstractAnimal {

    public Bird(String name, int discovered) {
        super(name, discovered)

    }

    @Override
    public String move()
    {
        return "Birds flying high, you know how I feel"
    }

    @Override
    public String breath()
    {
        return "Birds breath with lungs"
    }

    @Override
    public String reproduce()
    {
        return "Birds lay eggs to reproduce"
    }

    @Override
    public String toString()
    {
        return "Bird{" + "name=" + name + '\'' + ", discovered in " + discovered + "}"
    }

}