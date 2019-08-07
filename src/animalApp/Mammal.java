package animalApp;

public class Mammal extends AbstractAnimal {
    public Mammal(String name, int discovered) {
        this.name = name;
        this.discovered = discovered;
    }

    @Override
    public String move()
    {
        return "Mammals walk when they move"
    }

    @Override
    public String breath()
    {
        return "Mammals breath using lungs"
    }

    @Override
    public String reproduce()
    {
        return "When mammals reproduce, they have live births"
    }

    @Override
    public String toString()
    {
        return "Mammal{" + "name=" + name + '\'' + ", discovered in " + discovered + "}"
    }

}