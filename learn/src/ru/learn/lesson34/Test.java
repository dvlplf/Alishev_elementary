package ru.learn.lesson34;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
//        List<Animal> animalList = new ArrayList<>();
//        animalList.add(new Animal(123));
//        animalList.add(new Animal(1));
//        animalList.add(new Animal(12));
//        test(animalList);
//
//        List<Dog> dogList = new ArrayList<>();
//        dogList.add(new Dog());
//        dogList.add(new Dog());
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1000; i >= 100; i -= 123) {
            numbers.add(i);
        }
        //numbers.removeIf(num -> (num > 20 && num < 90));
        //numbers.set(0, 1000);
        // System.out.println(Collections.max(numbers));
        for (int number: numbers) {
            System.out.println(number);
        }
       // System.out.println(numbers.size());
    }

    private static void test(List<? extends Animal> list) {
        for(Animal animal: list) {
            animal.eat();
        }
    }
}
