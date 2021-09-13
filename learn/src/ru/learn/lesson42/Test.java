package ru.learn.lesson42;

public class Test {
    public static void main(String[] args) {
        Animal an1 = new Animal(1);
        Animal an2 = new Animal(1);
        Animal an3 = an2;
        System.out.println(an1 == an2);
        System.out.println(an2.equals(an3));
        System.out.println(an1.equals(an2));

    }
}

class Animal {
    private int id;

    public Animal(int id) {
        this.id = id;
    }

    public boolean equals(Object obj) {
        Animal otherAnimal = (Animal) obj;
        return this.id == otherAnimal.id;
    }
}
