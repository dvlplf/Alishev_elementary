package ru.shild.chapter11.interfaceRunnable;

public class MainTread {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("Текущий поток исполнения: " + t);

        //изменить имя потока исполнения
        t.setName("MyThread");
        System.out.println("После изменения имени потока: " + t);
        try{
            for (int i = 5; i > 0; i--) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e){
            System.out.println("Главный поток исполнения прерван");
        }
    }
}
