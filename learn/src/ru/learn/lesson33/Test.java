package ru.learn.lesson33;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List animals = new ArrayList();
        animals.add("dog");
        animals.add("cat");
        animals.add("frog");
        animals.add("dog");

        String animal = (String) animals.get(1);
        System.out.println(animal);

        List<String> animals2 = new ArrayList<>();
        animals2.add("dog");
        animals2.add("cat");
        animals2.add("frog");
        animals2.add("dog");
        String animal2 = animals2.get(2);
        System.out.println(animal2);

    }
}
