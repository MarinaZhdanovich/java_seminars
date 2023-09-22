package seminar1;
/*
Написать алгоритм расчета арифметической прогрессии
 */
public class Task8 {
    public static void main(String[] args) {
        int start = 0;
        int stop = 10;
        int step = 1;
        int sum = 0;
        for (int i = start; i <= stop; i+= step) {
            sum += i;
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(sum);
    }

}
