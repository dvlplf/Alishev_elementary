package ru.learn.Lesson30;

public class Test {
    public static void main(String[] args) {
        //Преобразуем строку в число в Java: String to int
        //Используем конструктор:

        try {
            Integer i1 = new Integer(10948);
            System.out.println(i1);
        }catch (NumberFormatException e) {
            System.err.println("Неправильный формат строки!");
        }

        //Используем метод valueOf класса Integer:

        String str1 = "1261";
        try {
            Integer i2 = Integer.valueOf(str1);
            System.out.println(i2);
        }catch (NumberFormatException e) {
            System.err.println("Неправильный формат строки!");
        }

        //Применяем метод parseInt:

        int i3 = 0;
        String str2 = "203955";
        try {
            i3 = Integer.parseInt(str2);
            System.out.println(i3);
        } catch (NumberFormatException e) {
            System.err.println("Неправильный формат строки!");
        }


        //Преобразуем строку в число в Java: int ti String

        //1. Преобразование int to String в Java:
        {
            int i = 53;
            String str = Integer.toString(i);
            System.out.println(str);
        }
        //2. Преобразование double to String в Java:
        {
            double i = 31.6e10;

            String str = Double.toString(i);
            System.out.println(str);
        }
        //3. Преобразуем long to String в Java:
        {long  i = 3422222;
        String str = Long.toString(i);
        System.out.println(str);}

        //4. Преобразуем float to String в Java:
        float  i = 3.98f;
        String str = Float.toString(i);
        System.out.println(str);
    }
}
