package Lesson1;

public class Main {
    //Задание 1

    public static void main(String[] args) {

    }

    //Задание 2
    public static void homeWork(String[] args) {

        int a = 1;
        System.out.println("Целочисленная перменная: " + a);
        double b = 1.2;
        System.out.println("Переменная с плавающей запятой: " + b);
        float c = 1.234f;
        System.out.println("Переменная с плавающей запятой: " + c);
        char d = 'd';
        System.out.println("Символьная переменная:  " + d);
        boolean e = true;//логическая переменная
        String str = "Hello,world!";
        System.out.println("Переменная строковая:  " + str);
    }

    //Задание 3
    public static void exp(int a, int b, int c, int d) {
        int result = a * (b + (c / d));
        return;
    }

    //Задание 4
    public static void twoNumbers(String[] args) {
        int a = 3;
        int b = 10;
        int res = a + b;
        if (res <= 10) {
            System.out.println("False");
        } else if (res >= 20) {
            System.out.println("False");
        } else {
            System.out.println("True");
        }
    }

    //Задание 5
    public static void numbers(String[] args) {
        int a = 1;
        if (a >= 0) {
            System.out.println("Число " + a + " положительное!");
        } else {
            System.out.println("Число " + a + " отрицательное!");
        }
    }

    //Задание 6
    public static boolean negNumber(int a) {
        if (a < 0) {
            return true;
        } else {
            return false;
        }

    }

    //Задание 7
    public static void enterName(String[] n) {
        System.out.println("Привет, " + n + "!");
    }

    //Задание 8
    public static void visYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Год високосный");
        } else {
            System.out.println("Год не високосный");
        }
    }
}

