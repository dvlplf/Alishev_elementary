package ru.learn.lesson44;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\projects\\Alishev_elementary\\learn\\src\\ru\\learn\\lesson44\\test.txt");
        PrintWriter pw = new PrintWriter(file);
        pw.println("Test 1");
        pw.println("Test 1");
        pw.println("Test 1");

        pw.close();

    }
}
