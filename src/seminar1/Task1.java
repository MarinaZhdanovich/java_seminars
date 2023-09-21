package seminar1;
/*
Настроить проект, вывести в консоль “Hello world!”.
Вывести в консоль системные дату и время.
*/

import java.time.LocalDateTime;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(LocalDateTime.now());
    }
}
