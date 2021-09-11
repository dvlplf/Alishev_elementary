package ru.learn.lesson34;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Animal> animalList = new ArrayList<>();
        animalList.add(new Animal(123));
        animalList.add(new Animal(1));
        animalList.add(new Animal(12));
        test(animalList);

        List<Dog> dogList = new ArrayList<>();
        dogList.add(new Dog());
        dogList.add(new Dog());

    }

    private static void test(List<? extends Animal> list) {
        for(Animal animal: list) {
            animal.eat();
        }
    }
}
