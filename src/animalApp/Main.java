package animalApp;

import java.util.*;

public class Main {

    public static void printAnimals(ArrayList<AbstractAnimal> rorysAnimals, CheckAnimal checker) {
        // For each one of the items ('a') of type AbstractAnimal in the ArrayList
        // rorysAnimals
        for (AbstractAnimal a : rorysAnimals) {
            // if a is true
            if (checker.check(a)) {
                System.out.println(a.getName() + " " + a.getId());
            }
        }
    }

    public static void main(String[] args) {

        // Create mammals

        Mammal panda = new Mammal("Panda", 1869);
        Mammal zebra = new Mammal("Zebra", 1778);
        Mammal koala = new Mammal("Koala", 1816);
        Mammal sloth = new Mammal("Sloth", 1804);
        Mammal armadillo = new Mammal("Armadillo", 1758);
        Mammal raccoon = new Mammal("Raccoon", 1758);
        Mammal bigfoot = new Mammal("Bigfoot", 2021);

        // Create birds

        Bird pigeon = new Bird("le Pigeon", 1837);
        Bird peacock = new Bird("Peacock", 1821);
        Bird toucan = new Bird("Toucan Sam", 1758);
        Bird parrot = new Bird("Parrot", 1824);
        Bird swan = new Bird("Swan", 1758);

        // Create fish

        Fish salmon = new Fish("Salmon", 1758);
        Fish catfish = new Fish("Catfish", 1817);
        Fish perch = new Fish("Perch", 1758);

        // Combine classes and add to list

        ArrayList<AbstractAnimal> rorysAnimals = new ArrayList<AbstractAnimal>();

        rorysAnimals.add(panda);
        rorysAnimals.add(zebra);
        rorysAnimals.add(koala);
        rorysAnimals.add(sloth);
        rorysAnimals.add(armadillo);
        rorysAnimals.add(raccoon);
        rorysAnimals.add(bigfoot);
        rorysAnimals.add(pigeon);
        rorysAnimals.add(peacock);
        rorysAnimals.add(toucan);
        rorysAnimals.add(parrot);
        rorysAnimals.add(swan);
        rorysAnimals.add(salmon);
        rorysAnimals.add(catfish);
        rorysAnimals.add(perch);

        // Filtering

        System.out.println("***Lambda Expressions Comin' At Ya ***");
        System.out.println();
        System.out.println();

        System.out.println("Sort animals in descending order by year named");
        System.out.println();
        rorysAnimals.sort((a1, a2) -> a2.getDiscovered() - a1.getDiscovered());
        System.out.println(rorysAnimals);
        System.out.println();
        System.out.println();

        System.out.println("List all animals alphabetically");
        System.out.println();
        rorysAnimals.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        System.out.println(rorysAnimals);
        System.out.println();
        System.out.println();

        System.out.println("List all animals ordered by movement style");
        System.out.println();
        rorysAnimals.sort((a1, a2) -> a1.move().compareToIgnoreCase(a2.move()));
        rorysAnimals.forEach(a -> System.out.println("Animal: " + a.getName() + "Moves " + a.move()));
        System.out.println();
        System.out.println();

        System.out.println("List only lung breathing animals");
        System.out.println();
        printAnimals(rorysAnimals, a -> a.breathe() == "lungs");
        System.out.println();
        System.out.println();

        System.out.println("List only lung breathing animals named in 1758");
        System.out.println();
        printAnimals(rorysAnimals, a -> a.breathe() == "lungs" && a.getDiscovered() == 1758);
        System.out.println();
        System.out.println();

        System.out.println("List only egg laying animals with lungs");
        System.out.println();
        printAnimals(rorysAnimals, a -> a.breathe() == "lungs" && a.reproduce() == "lay eggs");
        System.out.println();
        System.out.println();

        System.out.println("List alphabetically only animals named in 1758");
        System.out.println();
        rorysAnimals.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        printAnimals(rorysAnimals, a -> a.getDiscovered() == 1758);
        System.out.println();
        System.out.println();

        System.out.println("List mammals alphabetically");
        System.out.println();
        rorysAnimals.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        printAnimals(rorysAnimals, a -> (a instanceof Mammal));
        System.out.println();
        System.out.println();

    }
}