package ru.learn.lesson33;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        ///// Java 5 /////
        List animals = new ArrayList();
        animals.add("dog");
        animals.add("cat");
        animals.add("animal");
        String animal = (String) animals.get(1);
        System.out.println(animal);

        ///// С появлением дженериков //////
        List<String> animals1 = new ArrayList<String>();
        animals1.add("dog");
        animals1.add("dog1");
        animals1.add("dog2");
        animals1.add("dog3");

        ////// Java 7 /////

        List<String> animals2 = new ArrayList<String>();
        animals2.add("dog");
        animals2.add("dog1");
        animals2.add("dog2");
        animals2.add("dog3");
    }
}
