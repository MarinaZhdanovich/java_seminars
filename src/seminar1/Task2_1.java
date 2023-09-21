package seminar1;

import java.time.LocalTime;
import java.util.Scanner;

/*
В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида
"Доброе утро, <Имя>!", если время от 05:00 до 11:59
"Добрый день, <Имя>!", если время от 12:00 до 17:59;
"Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
"Доброй ночи, <Имя>!", если время от 23:00 до 4:59
 */
public class Task2_1 {
    public static void main(String[] args) {
        System.out.println("Введите ваше имя: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        LocalTime currentTime = LocalTime.now();
        if (currentTime.isAfter(LocalTime.of(5, 0)) &&
                currentTime.isBefore(LocalTime.of(11, 59))) {
            System.out.printf("Доброе утро, %s", name);
        } else if (currentTime.isAfter(LocalTime.of(12, 0)) &&
                currentTime.isBefore(LocalTime.of(17, 59))) {
            System.out.printf("Добрый день, %s", name);
        } else if (currentTime.isAfter(LocalTime.of(18, 0)) &&
                currentTime.isBefore(LocalTime.of(22, 59))) {
            System.out.printf("Добрый вечер, %s", name);
        } else {
            System.out.printf("Доброй ночи, %s", name);
        }
    }
}
