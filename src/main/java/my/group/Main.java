package my.group;

import my.group.lesson_1.Lesson1;
import my.group.lesson_2.Lesson2;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Lesson1.changeAB();
        Lesson1.printName();

        Lesson2.showMathExpression(scanner);
        Lesson2.compExp(scanner);

        scanner.close();
    }
}