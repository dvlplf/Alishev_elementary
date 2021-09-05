package ru.learn.interfaces;

public class Test {
    public static void main(String[] args) {
        Person person1 = new Person("Bob");
        Animal animal1 = new Animal(11);
//        person1.sayHello();
//        person1.showInfo();
//        animal1.sleep();
//        animal1.showInfo();
        Info info = new Person("Dave");
        Info info1 = new Animal(123);
        info.showInfo();
        info1.showInfo();

    }
}
