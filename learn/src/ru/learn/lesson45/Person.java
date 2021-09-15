package ru.learn.lesson45;

import java.io.Serial;
import java.io.Serializable;

public class Person implements Serializable {
    @Serial
    private static final long serialVersionUID = -4284510300511687700L;
    private int id;
    private String name;
    private transient String techValue = "1000";

    public Person (int id, String name, String techValue) {
        this.id = id;
        this.name = name;
        this.techValue = techValue;
    }

    public int getId () {
        return id;
    }

    public String getName () {
        return name;
    }

    public String toString() {
        return id + ": " + name + " - " + techValue;
    }

}
