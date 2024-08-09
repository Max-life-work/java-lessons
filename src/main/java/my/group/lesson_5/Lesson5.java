package my.group.lesson_5;

import java.util.Scanner;

/**
 * Homework for lesson #5.
 */
public class Lesson5 {

    /** Print name */
    public  static void task51(Scanner scanner) {
        char[] name = {'M', 'a', 'x'};
        for(char value: name) {
            System.out.print(value);
        }
    }

    public  static void task52(Scanner scanner) {
        int[] array = new int[3];
        System.out.print("\n");
        for(int i = 0; i <array.length; i++) {
            System.out.print("Input value: ");
            array[i] = scanner.nextInt();
        }
        for(int i = 0; i <array.length; i++) {
            if (i == 0)
                System.out.printf("result: %d\n", array[i] + array[array.length - 1]);
            else
                System.out.printf("result: %d\n", array[i] + array[i - 1]);
        }
    }
}
