package ru.learn.lesson23;

import java.util.Locale;

public class StrBuild {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Hello");

        str.append(" my").append(" world");
        for (int i = 0; i <100; i++) str.append(" ").append(i);
        System.out.println(str.toString());
        for (int i = 0; i <100; i++){
            System.out.println(str.charAt(i));
        }
    }
}
