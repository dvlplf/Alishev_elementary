package ru.learn.lesson45;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
        Person person1 = new Person(10, "Dave");
        Person person2 = new Person(11, "Djon");
        try {
            FileOutputStream fos = new FileOutputStream("C:\\projects\\Alishev_elementary\\learn\\src\\ru\\learn\\lesson45\\people.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(person1);
            oos.writeObject(person2);

            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
