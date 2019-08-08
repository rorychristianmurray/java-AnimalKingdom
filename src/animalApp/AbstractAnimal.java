// Abstract classes are blueprints for other classes

package animalApp;

public abstract class AbstractAnimal {
    // fields - values - state
    protected static int maxId = 0;
    protected int id;
    protected String name;
    protected int discovered;

    // constructor
    public AbstractAnimal(String name, int discovered) {
        // initial state
        maxId++;
        id = maxId;
        this.name = name;
        this.discovered = discovered;
    }

    public String consume() {
        return "Yum yum eat em up!";
    }

    // abstract class methods
    public abstract String move();

    public abstract String breath();

    public abstract String reproduce();

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDiscovered() {
        return discovered;
    }

    public void setDiscovered(int discovered) {
        this.discovered = discovered;
    }

}