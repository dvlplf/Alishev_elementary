package ru.learn.lesson45;

import java.io.*;
import java.util.Arrays;

public class ReadObject {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("C:\\projects\\Alishev_elementary\\learn\\src\\ru\\learn\\lesson45\\people.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

            //1 способ
//            int personCount = ois.readInt();
//            Person[] people = new Person[personCount];
//            for(int i = 0; i < personCount; i++) {
//                people[i] = (Person) ois.readObject();
//            }

            // 2 способ
            Person[] people = (Person[]) ois.readObject();

            System.out.println(Arrays.toString(people));
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
