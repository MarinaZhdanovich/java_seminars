package seminar1;

import java.util.Random;

/*
Выкинуть случайное число, сохранить в переменную. Целое число от 0 до 1000
Найти старший значащий бит выпавшего числа
 */
public class Task9 {
    public static void main(String[] args) {
        int num = new Random().nextInt(1001);
        System.out.println(num);
        System.out.println(Integer.toBinaryString(num).length());
        int v = 0;
        while (num != 0) {
            num = num / 2;
            v++;
        }
        System.out.println(v);
    }
}


