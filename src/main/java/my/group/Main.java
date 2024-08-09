package my.group;

import my.group.lesson_1.Lesson1;
import my.group.lesson_2.Lesson2;
import my.group.lesson_3.Lesson3;
import my.group.lesson_4.Lesson4;
import my.group.lesson_5.Lesson5;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        Lesson1.changeAB();
        Lesson1.printName();

        Lesson2.showMathExpression(scanner);
        Lesson2.compExp(scanner);

        Lesson3.task31(scanner);
        Lesson3.task32(scanner);
        Lesson3.task33(scanner);

        Lesson4.task41(scanner);
        Lesson4.task42(scanner);
        Lesson4.task43(scanner);
        Lesson4.task45(scanner);

        Lesson5.task51(scanner);
        Lesson5.task52(scanner);

        scanner.close();
    }
}