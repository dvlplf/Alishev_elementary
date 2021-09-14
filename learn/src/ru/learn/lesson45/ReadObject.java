package ru.learn.lesson45;

import java.io.*;

public class ReadObject {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("C:\\projects\\Alishev_elementary\\learn\\src\\ru\\learn\\lesson45\\people.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Person person1 = (Person) ois.readObject();
            Person person2  = (Person) ois.readObject();

            System.out.println(person1);
            System.out.println(person2);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
