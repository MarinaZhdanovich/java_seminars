package exceptions_seminar1;

import java.util.Scanner;

/*
Реализуйте метод, принимающий в качестве аргумента целочисленный массив и некоторое
значение. Метод ищет в массиве заданное значение и возвращает его индекс. При этом,
например:
1. если длина массива меньше некоторого заданного минимума, метод возвращает -1, в
качестве кода ошибки.
2. если искомый элемент не найден, метод вернет -2 в качестве кода ошибки.
3. если вместо массива пришел null, метод вернет -3
4. придумайте свои варианты исключительных ситуаций и верните соответствующие
коды ошибок.
Напишите метод, в котором реализуйте взаимодействие с пользователем. То есть, этот
метод запросит искомое число у пользователя, вызовет первый, обработает возвращенное
значение и покажет читаемый результат пользователю. Например, если вернулся -2,
пользователю выведется сообщение: “Искомый элемент не найден”.
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите искомое число: ");
        int number = scanner.nextInt();
        System.out.print("Введите минимальную длину: ");
        int minLength = scanner.nextInt();
        int[] array = {1, 5, 7, 9};

        findElemMessage(array, number, minLength);
    }

    public static int findElem(int[] array, int number, int minLength) {
        if (array == null) {
            return -3; // код ошибки -3: массив равен null
        }
        if (array.length < minLength) {
            return -1; // длина массива меньше заданного
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] == number)
                return i; // нашли искомый элемент, возвращаем индекс
        }
        return -2; // искомый элемент не найден
    }

    public static void findElemMessage(int[] array, int number, int minLength) {
        int result = findElem(array, number, minLength);
        if (result == -1)
            System.out.println("Длина списка меньше минимального");
        else if (result == -2)
            System.out.println("Элемент не найден");
        else if (result == -3)
            System.out.println("Пришел null");
        else
            System.out.println("Индекс искомого элемента: " + result);
    }
}
