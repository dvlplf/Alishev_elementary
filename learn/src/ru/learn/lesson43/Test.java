package ru.learn.lesson43;

import java.util.Base64;

public class Test {
    public static void main(String[] args) {
        Electrocar car1 = new Electrocar(43);
        car1.start();
        Electrocar.Battery battery = new Electrocar.Battery();
        battery.charge();
    }
}
