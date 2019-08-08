// Abstract classes are blueprints for other classes

package animalApp;

public abstract class AbstractAnimal {
    // fields - values - state
    private static int maxId = 0;
    private int id;
    private String name;
    private int discovered;

    // constructor
    public AbstractAnimal(String name, int discovered) {
        // initial state
        maxId++;
        id = maxId;
        this.name = name;
        this.discovered = discovered;
    }

    public void consume() {
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