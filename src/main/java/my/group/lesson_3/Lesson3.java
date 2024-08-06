package my.group.lesson_3;

import java.util.Scanner;

/**
 * This is the homework for lesson number 3.
 */
public class Lesson3 {
    /**
     * Ввести с клавиатуры два целых числа.
     * <p>
     * Если Число1 четное, вывести произведение двух чисел (пр.1).
     * <p>
     * Если нет - частное (пр.2).
     * <p>
     * Также если числа равны - вывести надпись Числа равны!
     * @param scanner
     */
    public static void method31(Scanner scanner) {
        System.out.print("input first value: ");
        long arg1 = scanner.nextLong();
        System.out.print("input second value: ");
        long arg2 = scanner.nextLong();

        int value = (int) arg1 % 2;

        switch (value) {
            case 0:
                System.out.printf("result: arg1 * arg2 = %d\n", arg1 * arg2);
                break;
            case 1:
                System.out.printf("result: arg1 / arg2 = %d\n", arg1 / arg2);
                break;
            default:
                break;
        }
        if (arg1 == arg2)
            System.out.println("The numbers are equals.");
    }

    /**
     * Написать программу, которая принимает строку с клавиатуры:
     * <ul>
     *  <li>Если введенная строка равна Hi - вывести в консоль Hello;</li>
     *  <li>Если Bye - Good bye;</li>
     *  <li>Если How are you - How are your doing;</li>
     *  <li>Если любая другая строка - вывести Unknown message.</li>
     * </ul>
     * @param scanner
     */
    public static void method32(Scanner scanner) {
        scanner.nextLine();
        System.out.print("input phrase: ");
        String phrase  = scanner.nextLine();

        switch (phrase) {
            case "Hi":
                System.out.println("Hello");
                break;
            case "By":
                System.out.println("Good buy");
                break;
            default:
                System.out.println("Unknown message. ");
        }
    }

    /**
     * Заведите три переменные типа String. С клавиатуры введите в них вашу фамилию,
     * имя и отчество соответственно. Выведите в консоль ваше ФИО в одну строку.
     * @param scanner
     */
    public static void method33(Scanner scanner) {
        System.out.print("input first name: ");
        String firstName  = scanner.nextLine();
        System.out.print("input second name: ");
        String secondName  = scanner.nextLine();

        System.out.printf("%s %s\n", firstName, secondName);
    }
}
