package seminar1;

import java.util.Scanner;

/*
Написать программу, которая попросит пользователя ввести <Имя> в консоли.
Получит введенную строку и напечатает в консоль сообщение “Привет, <Имя>!”
*/
public class Task2 {
    public static void main(String[] args) {
        System.out.println("Введите ваше имя: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.printf("Привет, %s%n",name); // %n перенос курсора вниз

    }
}
