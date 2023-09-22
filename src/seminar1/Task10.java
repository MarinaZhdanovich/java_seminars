package seminar1;
/*
Вычислить n-ое треугольного число(сумма чисел от 1 до n).
Внутри класса Answer напишите метод countNTriangle, который принимает число n и возвращает его n-ое треугольное число.
n = 4 -> 10
n = 5 -> 15
 */
class Answer {
    public int countNTriangle(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++)
            sum +=  i;
        return sum;
    }
}
public class Task10{
    public static void main(String[] args) {
        int n = 0;

        if (args.length == 0) {
            // введите n
            n = 5;
        }
        else{
            n = Integer.parseInt(args[0]);
        }

        // Вывод результата
        Answer ans = new Answer();
        int itresume_res = ans.countNTriangle(n);
        System.out.println(itresume_res);
    }
}
