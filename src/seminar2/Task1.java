package seminar2;
/*
Дано четное число N (>0) и строки c1 и c2, которые следует учитывать как 1 символ.
Написать метод, который вернет строку длины N*2,
которая состоит из чередующихся последовательностей c1 и c2, начиная с c1.
 */
public class Task1 {
    public static void main(String[] args) {
        System.out.println(getRepeatStr(4));
    }

    public static String getRepeatStr(int n) {
        String c1 = "c1";
        String c2 = "c2";
        if (n % 2 != 0) throw new IllegalArgumentException("n - нечетное число");

        StringBuilder result = new StringBuilder(); // для построения длинных строк, чтобы не использовать конкатенацию (низкая производительность)
        for (int i = 0; i < n; i++) {
            result.append(c1);
            result.append(c2);
        }
        return result.toString();

//        return (c1 + c2).repeat(n); // используем метод repeat (c1 + с2 = 2 символа, поэтому повторяем просто n раз)
    }
}







