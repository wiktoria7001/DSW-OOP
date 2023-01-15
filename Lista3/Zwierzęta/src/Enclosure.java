import java.util.*;

public class Enclosure <T extends Animal>{

    private List<T> animals;


    public Enclosure() { animals = new ArrayList<T>(); }


    public void addAnimal(T animal) { animals.add(animal); }

    public void removeAnimals(T animal) { animals.remove(animal); }

    public int getNumberOfAnimals() { return animals.size(); }

    @Override
    public String toString() {
        return "Enclosure{" +
                "animals=" + animals +
                '}';
    }
}
