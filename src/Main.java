import Zoo.*;

import java.util.List;

class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        Elephant elephant = new Elephant("Elephant", 5);
        elephant.addFood("hay");

        Wolf wolf = new Wolf("Wolf", 10);
        wolf.addFood("meat");

        Lion lion = new Lion("Lion", 15);
        lion.addFood("meat");

        Jaguar jaguar = new Jaguar("Jaguar", 13);
        jaguar.addFood("meat");


        zoo.addAnimal(elephant);
        zoo.addAnimal(wolf);
        zoo.addAnimal(lion);
        zoo.addAnimal(jaguar);

        List<Animal> animals = zoo.getAnimals();

        for (Animal animal : animals) {
            System.out.println("Name: " + animal.getName());
            System.out.println("Age: " + animal.getAge());
            System.out.println("Food: " + animal.getFood());
            System.out.println();
        }
    }
}