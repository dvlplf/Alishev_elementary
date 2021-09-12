package ru.learn.lesson37;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//public class Exceptions1 {
//    public static void main(String[] args) {
//        File file = new File("asd");
//        try {
//            Scanner scanner = new Scanner(file);
//        } catch (FileNotFoundException e) {
//            System.out.println("File not found");
//        }
//    }
//}

public class Exceptions1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("asd");
        Scanner scanner = new Scanner(file);
    }
}
