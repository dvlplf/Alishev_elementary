package ru.learn.lesson29;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main method");
        Animal animal = new Animal();
        Animal dog = new Dog();
        Animal cat = new Cat();
        Dog dog1 = new Dog();

        animal.eat();
        dog.eat();
        cat.eat();
        dog1.bark();

    }
}
