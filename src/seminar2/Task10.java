package seminar2;
/*
Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

Напишите свой код в методе sort класса BubbleSort. Метод sort принимает на вход один параметр:

int[] arr - числовой массив

После каждой итерации, ваш код должен делать запись в лог-файл
 'log.txt' в формате год-месяц-день час:минуты {массив на данной итерации}.
 */

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.text.SimpleDateFormat;
import java.util.Date;

class BubbleSort {
    private static File log; // объявление переменной log типа File, private - доступна только внутри класса, static - принадлежащит классу, а не экземпляру объекта
    private static FileWriter fileWriter; //объявление переменной fileWriter типа FileWriter

    public static void sort(int[] mas) {
        try {
            log = new File("log.txt"); //новый объект log типа File, который представляет файл "log.txt", не создает файл на диске
            log.createNewFile(); //создает файл на диске, если он не существует. Если файл уже существует, метод ничего не делает.
            fileWriter = new FileWriter(log); //создается объект fileWriter типа FileWriter, который будет использоваться для записи данных в файл log
            bubbleSort(mas); // вызывается метод сортировки пузырьком

        } catch (IOException e) { // ошибка ввода-вывода (невозможно создать файл)
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close(); // закрывается fileWriter
            } catch (IOException e) {
                e.printStackTrace(); //выводит информацию об исключении (exception) или ошибке,
                // включая тип исключения, сообщение об ошибке и стек вызовов (трассировку стека) в консоль
            }
        }
    }

    private static int[] bubbleSort(int[] mas) {
        boolean isSorted = false;
        int temp;

        while (!isSorted) { // внешний цикл выполняется пока массив не отсортирован
            isSorted = true; //в начале каждой итерации цикла предполагается, что массив отсортирован.
            for (int i = 0; i < mas.length - 1; i++) {
                if (mas[i] > mas[i + 1]) {
                    isSorted = false; //если внутри цикла происходит хотя бы один обмен элементов, цикл продолжает выполнение

                    temp = mas[i];
                    mas[i] = mas[i + 1];
                    mas[i + 1] = temp;
                }
            }
            logStep(Arrays.toString(mas)); //после каждой итерации вызывается метод logStep, который записывает текущее состояние массива в виде строки в лог-файл.
        }
        return mas;
    }


    public static void logStep(String note) {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm"); //создается объект SimpleDateFormat
            String timestamp = dateFormat.format(new Date()); //строка в ней сохраняется текущая временная метка в указанном формате
            fileWriter.write(timestamp + " " + note + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
public class Task10{
    public static void main(String[] args) {
        int[] arr = {};

        if (args.length == 0) {
            arr = new int[]{9, 3, 4, 8, 2, 5, 7, 1, 6, 10};
        }
        else{
            arr = Arrays.stream(args[0].split(", "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        BubbleSort ans = new BubbleSort();
        ans.sort(arr);

        try (BufferedReader br = new BufferedReader(new FileReader("log.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}