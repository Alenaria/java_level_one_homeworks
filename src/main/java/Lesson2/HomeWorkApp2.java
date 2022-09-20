package Lesson2;

import java.util.concurrent.ThreadLocalRandom;

public class HomeWorkApp2 {
    public static void main(String[] args) {
        System.out.println(task1(ThreadLocalRandom.current().nextInt(-10, 10), ThreadLocalRandom.current().nextInt(-10, 10)));

        task2 ();

        System.out.println(task3(ThreadLocalRandom.current().nextInt(-3, 6)));

        task4("Alena", 7);

        System.out.println(task5(ThreadLocalRandom.current().nextInt(0, 2023)));

    }

    public static boolean task1(int a, int b) {
        int sum = a + b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("sum = " + sum);

        if (sum >= 10 && sum <=20) {
            return true;
        }
        else {
            return false;
        }
    }

    private static void task2() {
        int varA = ThreadLocalRandom.current().nextInt(-10, 10);

        System.out.println("varA = " + varA);

        if (varA >= 0) {
            System.out.println("Положительное");
        }else {
            System.out.println("Отрицательное");
        }
    }

    private static boolean task3(int a) {

        System.out.println("a = " + a);

        if (a < 0){
            return true;
        }else {
            return false;
        }
    }

    private static void task4(String alena, int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(alena);
        }

    }

    private static boolean task5(int year) {
        System.out.println("year = " + year);

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            return true;
        }else {
            return false;
        }
    }

}


