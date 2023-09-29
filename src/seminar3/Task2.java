package seminar3;
/*
Заполнить список десятью случайными числами.
Отсортировать список методом sort() и вывести его на экран.
 */


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
    public class Task2 {
        public static void main(String[] args) {
//            List<Integer> ints = new ArrayList<>(); // коллекции другое имя для переменной
//            Random random = new Random();  // здесь можно оставить имя random
//            for (int i = 0; i < 10; i++) {
//                ints.add(random.nextInt(10));
//            }
//            System.out.println(ints); //:: - обратиться к методу по ссылке и вызвать его, краткий способ вызывать методы
////            ints.sort(Integer::compareTo); //вызывается непосредственно на самом списке ints, потому что он является методом экземпляра класса List.
//            Collections.sort(ints); // метод вызывается статически через класс Collections,
//            System.out.println(ints);
//        }
//    }

            List<String> str = new ArrayList<>();
            str.add("gh");
            str.add("jh");
            str.add("do");
            str.add("sr");
            System.out.println(str);
            str.sort(String::compareTo); //ASCII сравнивает по этим таблицам
            System.out.println(str);
        }
}