package my.group.lesson_1;

/**
 * Этот класс реализует домашнее задание урока №1.
 */
public class Lesson1 {

    /** Метод присваивает переменной a значение переменной b и наоборот. */
    public static void changeAB() {
        System.out.println("Присвоить переменной a значение переменной b и наоборот.");
        int a = 25;
        int b = 50;

        System.out.println("до замены:");
        System.out.println("a: " + a + ", b: " + b);

        int c = a;
        a = b;
        b = c;
        System.out.println("после замены:");
        System.out.println("a: " + a + ", b: " + b);
    }
    /** Вывод имени на печать */
    public static void printName() {
       /*
       String name = """
                        M
                        a
                        x""";

        String name = "M\na\nx\n";
        System.out.println(name);
        */
        char ch1 = 'M';
        char ch2 = 'a';
        char ch3 = 'x';
        System.out.print(ch1);
        System.out.print('\n');
        System.out.print(ch2);
        System.out.print('\n');
        System.out.print(ch3);
        System.out.print('\n');

        System.out.print(ch1);
        System.out.print(ch2);
        System.out.print(ch3);
        System.out.print('\n');

        System.out.println("" + ch1 + ch2 + ch3);
    }
}
