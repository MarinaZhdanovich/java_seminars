package seminar3;
/*
Напишите функцию removeEvenNumbers, которая принимала бы произвольный список целых чисел,
удаляла бы из него четные числа и выводила список без четных чисел.
Напишите свой код в методе removeEvenNumbers класса Answer. Метод removeEvenNumbers принимает на вход один параметр:

Integer[] arr - список целых чисел
arr = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
removeEvenNumbers(arr);

// [1, 3, 5, 7, 9]

arr = new Integer[]{2, 4, 6, 8};
removeEvenNumbers(arr);

// []
 */

import java.util.Arrays;
import java.util.ArrayList;

class Answers {
    public static void removeEvenNumbers(Integer[] arr) {
//        ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(arr)); //Arrays.asList преобразует массив в список
//        list1.removeIf(x -> x % 2 == 0); // удалит четные, лямбда-выражение
//        System.out.println(list1);
//    }

        ArrayList<Integer> ints = new ArrayList<>(Arrays.asList(arr));
        for (int i = 0; i < ints.size(); i++) {
            if (ints.get(i) % 2 == 0) {
                ints.remove(i); //это может вызвать сдвиг оставшихся элементов влево
                i--; // чтобы следующая итерация цикла рассмотрела следующий элемент после удаления.
            }
        }
        System.out.println(ints);
    }
}
// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Task8 {
    public static void main(String[] args) {
        Integer[] arr = {};

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            arr = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        } else {
            arr = Arrays.stream(args[0].split(", "))
                    .map(Integer::parseInt)
                    .toArray(Integer[]::new);
        }

        Answers ans = new Answers();
        ans.removeEvenNumbers(arr);
    }
}

