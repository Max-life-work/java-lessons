package my.group.lesson_2;

import java.util.Scanner;

/**
 * Этот класс реализует домашнее задание урока №2.
 */
public class Lesson2 {
    /**
     * Вывести на экран результат выражения.
     */
    public static void showMathExpression(Scanner scanner) {
        System.out.print("input arg1: ");
        double arg1 = scanner.nextDouble();
        System.out.print("input arg2: ");
        double arg2 = scanner.nextDouble();

        double result = arg1 * arg2 * (arg1 + arg2) / (arg1 * arg1);
        System.out.printf("result: %.2f\n", result);
    }

    /**
     * Сравнение двух выражений
     */
    public static void compExp(Scanner scanner) {
        System.out.print("input arg1: ");
        double arg1 = scanner.nextDouble();
        System.out.print("input arg2: ");
        double arg2 = scanner.nextDouble();

        boolean result = Math.pow(arg1, 3) > Math.pow(arg2, 2);
        System.out.printf("result: %b\n", result);
    }
}
