package seminar1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
Во фразе "Добро пожаловать на курс по Java" переставить слова в обратном порядке.
 */
public class Task5 {
    public static void main(String[] args) {
        String str = "Добро пожаловать на курс по Java";
        System.out.println(str);
        String[] array = str.split(" ");
        System.out.println(Arrays.toString(array));
//        for (int i = array.length-1; i >= 0; i--) {
//            System.out.print(array[i] + " ");
//        }
        List<String> strings = Arrays.asList(array);
        Collections.reverse(strings);
        System.out.println(strings);
    }
}

