package my.group.lesson_4;

import java.util.Scanner;

/**
 * Домашнее задание для урока №4.
 */
public class Lesson4 {

    /** Рассчитать факториал целого числа. */
    public static void task41(Scanner scanner) {
        System.out.println("Расчет факториала.");
        System.out.print("Введите целое число: ");
        int value = scanner.nextInt();
        int result = 1;
        if (value == 0) {
            System.out.printf("Факториал числа %d равен %d\n", value, result);
            return;
        } else {
            for( int i = 1; i <= value; i++) {
                result *= i;
            }
        }
        System.out.printf("Факториал числа %d равен %d\n", value, result);
    }

    public static void task42(Scanner scanner) {
        System.out.print("Введите целое число: ");
        int value = scanner.nextInt();
        int result = 0;
        for( int i = 0; i <= value; i++) {
            result += i;
        }
        System.out.printf("result: %d\n", result);
    }

    /** метод рисует в консоли прямоугольник. */
    public static void task43(Scanner scanner) {
        System.out.print("Введите ширину: ");
        int width = scanner.nextInt();
        System.out.print("Введите длину: ");
        int height = scanner.nextInt();

        for (int y = 1; y <= height; y++) {
            if (y == 1 || y == height)
                for (int x = 1; x <= width; x++) {
                    if (x == 1)
                        System.out.print(" ");
                    else if (x == width)
                        System.out.println(" ");
                    else
                        System.out.print("-");
                }
            else
                for (int x = 1; x <= width; x++) {
                    if (x == 1)
                        System.out.print("|");
                    else if (x == width)
                        System.out.println("|");
                    else
                        System.out.print(" ");
                }
        }
    }

    public  static void task45(Scanner scanner) {
        int token = 1;
        int value;
        while (true) {
            System.out.print("Введите токен: ");
            value = scanner.nextInt();
            if (value == token)
                break;
            else
                System.out.println("Не угадал");
        }
    }

}
