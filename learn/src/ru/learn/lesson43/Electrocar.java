package ru.learn.lesson43;

public class Electrocar {
    private int id;

    public Electrocar(int id) {
        this.id = id;
    }

    //вложенные не статический класс
    private class Motor {
        public void startMotor() {
            System.out.println("Motro " + id + " starting");
        }
    }
    //вложенный статический класс
    public static class Battery{
        public void charge() {
            System.out.println("Battery is charging.");
        }
    }

    public  void start() {
        Motor motor = new Motor();
        motor.startMotor();
        System.out.println("Electrocar " + id + " is starting.");
    }
}
