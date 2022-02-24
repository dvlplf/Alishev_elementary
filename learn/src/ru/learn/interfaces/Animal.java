package ru.learn.interfaces;
import ru.learn.interfaces.Animal;

public class Animal implements Info {
    public int id;

    public Animal(int id) {
        this.id = id;
    }

    public void sleep () {
        System.out.println("Im sleeping");
    }

    @Override
    public void showInfo() {
        System.out.println("Id is " + this.id);
    }
}
