// Abstract classes are blueprints for other classes

package animalApp;

public abstract class AbstractAnimal {
    // fields - values - state
    private static int maxId = 0;
    private int id;
    private String name;
    private int discovered;

    public AbstractAnimal(String name, int discovered) {
        // initial state
        maxId++;
        id = maxId;
        this.name = name;
        this.discovered = discovered;
    }

    public String consume()
    {
        System.out.println("Yum yum eat em up!")
    }

    public abstract String move();

    public abstract String breath();

    public abstract String reproduce();

}