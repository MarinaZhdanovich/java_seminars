package seminar1;
/*
Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.
 */
public class Task3 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 1, 0, 1, 1, 1};
        int count = 0;
        int maxLength = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                count++;
            } else {
                if (count > maxLength) {
                    maxLength = count;
                }
                count = 0;
            }
        }
        if (count > maxLength) {
            maxLength = count;
        }
        System.out.println(maxLength);
    }
}
