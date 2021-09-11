package ru.learn.lesson36;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        String separator = File.separator;
        String path = "C:\\projects\\Alishev_elementary\\learn\\src\\ru\\learn\\lesson36\\test2.txt";
        File file = new File(path);

        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();
        String[] numbersStr = line.split(" ");
        int[] numbers = new int[3];
        int counter = 0;
        for(String number: numbersStr) {
            numbers[counter++] = Integer.parseInt(number);
        }
        System.out.println(Arrays.toString(numbers));


    }
}
