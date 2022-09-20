package Lesson3;

public class HomeWorkApp3 {
    public static void main(String[] args) {
        int [] arr1 = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0}; // array task1
        int [] arr2 = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1}; // array task3
        int [] arr3 = { 1, -3, 2, 4, 14, -7, 10, -5, 9}; // array task6

        System.out.println("Task1:");
        task1(arr1);
        System.out.println("\nTask2:");
        task2(100);
        System.out.println("\nTask3:");
        task3(arr2);
        System.out.println("\nTask4:");
        task4();
        System.out.println("\nTask5:");
        task5(3, 7);
        System.out.println("\nTask6:");
        task6(arr3);

    }

    public static void task1(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
            System.out.print(arr[i] + " ");
        }
    }

    public static void task2(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.print (arr[i] + " ");
        }
    }

    private static void task3(int[] arr) {
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < 6){
                arr[i] *= 2;
            }
            System.out.print(arr[i] + " ");
        }
    }

    private static void task4() {
        int [][] arr = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                }
                if (i + j == 9){
                    arr[i][j] = 1;
                }

                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void task5(int len, int initialValue){
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.print("[" + i + "]" + arr[i] + " ");
        }
    }

    private static void task6(int[] arr) {
        int min = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                min = arr[0];
                max = arr[0];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Минимальное значение = " + min);
        System.out.println("Максималльное значение = " + max);
    }

}
