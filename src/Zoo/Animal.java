package Zoo;

import java.util.ArrayList;
import java.util.List;

public class Animal {
    String name;
    int age;
    List<String> food = new ArrayList<>();

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void addFood(String food) {
        this.food.add(food);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<String> getFood() {
        return food;
    }
}