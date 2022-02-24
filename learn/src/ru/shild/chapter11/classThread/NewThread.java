package ru.shild.chapter11.classThread;

public class NewThread extends Thread {
    NewThread(){
        //создать новый поток исполнения
        super("Демонстрационный поток");
        System.out.println("Дочерний поток: " + this);
        start(); // запустить поток на исполнение
    }

    // Точка входа во второй поток исполнения

    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Дочерний поток: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Дочерний поток прерван");
        }
        System.out.println("Дочерний поток завершен");
    }
}

class ExtendThread {
    public static void main(String[] args) {
        new NewThread(); // создать новый поток исполнения
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Главный поток: " + i);
                Thread.sleep(1000);
            }
        } catch(InterruptedException e) {
            System.out.println("Главный поток прерван");
        }
        System.out.println("Главный поток завершен");
    }
}