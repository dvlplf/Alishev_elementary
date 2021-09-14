package ru.learn.lesson45;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
        Person person1 = new Person(10, "Dave", "100");
        Person person2 = new Person(11, "Djon", "100");
        Person[] people = {
                new Person(122, "Tom", "100"),
                new Person(222, "Jerry", "100"),
                new Person(322, "Bob", "100"),
                new Person(4, "Jane", "100"),
        };
        try {
            FileOutputStream fos = new FileOutputStream("C:\\projects\\Alishev_elementary\\learn\\src\\ru\\learn\\lesson45\\people.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            // 1 способ
//            oos.writeInt(people.length);
//            for (Person person:people) {
//                oos.writeObject(person);
//            }

            // 2 способ
            oos.writeObject(people);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
