package Zoo;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    List<Animal> animals = new ArrayList<>();

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public List<Animal> getAnimals() {
        return animals;
    }
}