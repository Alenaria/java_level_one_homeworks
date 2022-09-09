package Lesson1;

import java.util.concurrent.ThreadLocalRandom;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords ();

        checkSumSigh ();

        printColor();

        compareNumbers();

    }

    private static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    private static void checkSumSigh() {
        int varA = ThreadLocalRandom.current().nextInt(-3, 10);
        int varB = ThreadLocalRandom.current().nextInt(-2, 15);
        int result = (varA + varB);

        System.out.println("varA = " + varA);
        System.out.println("varB = " + varB);
        System.out.println("result = " + result);

        if (result >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
    private static void printColor() {
        int value = ThreadLocalRandom.current().nextInt(-20, 150);

        System.out.println("Value = " + value);
        if (value <= 0){
            System.out.println("Красный");
        } else if (value < 100){
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    private static void compareNumbers() {
        int varA = ThreadLocalRandom.current().nextInt(-1, 6);
        int varB = ThreadLocalRandom.current().nextInt(-1, 6);

        System.out.println("varA = " + varA);
        System.out.println("varB = " + varB);

        if (varA >= varB){
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
    }

}
