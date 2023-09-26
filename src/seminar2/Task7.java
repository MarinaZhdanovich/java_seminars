package seminar2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Задать две строки. Найти все вхождения первой строки во вторую.
Вывести в консоль количество и индексы начала.
 */
public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первую строку: ");
        String str1 = scanner.nextLine();
        System.out.print("Введите вторую строку: ");
        String str2 = scanner.nextLine();

        List<Integer> index = new ArrayList<>(); // список для хранения индексов и счетчик вхождений
        int count = 0;

        int start = -1; // будет обновляться начальная позиция
        while (true) {
            start = str2.indexOf(str1, start + 1);  //indexOf возвращает индекс первого вхождения
            // принимает подстроку, которую ищем и начальную позицию. Если подстрока не найдена возвращает -1.
            if (start == -1) {
                break;
            }
            index.add(start);
            count++;
        }
        System.out.println("Количество вхождений: " + count);
        System.out.println("Индексы начала вхождений: " + index);
    }
}
