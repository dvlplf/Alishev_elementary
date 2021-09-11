package ru.learn.lesson35;

public class Test {
    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.eat();
        //1
        Animal animal1 = new OtherAnimal();
        animal1.eat();
        //2 Anonim class
        Animal animal2 = new Animal() {
            public void eat() {
                System.out.println("Anonim animal eat");
            }
        };
        animal2.eat();
        //interface
        AbleToEat ableToEat = new AbleToEat() {
            @Override
            public void eat() {
                System.out.println("This able to eat");
            }
        };
        ableToEat.eat();
        ableToEat.eat();
        ableToEat.eat();
    }
}

class Animal {
    public void eat () {
        System.out.println("Animal eat");
    }
}

class OtherAnimal extends Animal {
    public void eat() {
        System.out.println("Other animal eat");
    }
}

interface AbleToEat {
    public void eat();
}

